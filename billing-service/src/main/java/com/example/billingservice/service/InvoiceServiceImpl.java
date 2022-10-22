package com.example.billingservice.service;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.dtos.InvoiceResponseDTO;
import com.example.billingservice.entities.Customer;
import com.example.billingservice.entities.Invoice;
import com.example.billingservice.mappers.InvoiceMapper;
import com.example.billingservice.openfeigh.CustomerServiceRestClient;
import com.example.billingservice.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceMapper invoiceMapper;
    private CustomerServiceRestClient customerServiceRestClient;
    private InvoiceRepository invoiceRepository;
    public InvoiceServiceImpl(InvoiceMapper invoiceMapper,InvoiceRepository invoiceRepository,CustomerServiceRestClient customerServiceRestClient){
    this.invoiceMapper=invoiceMapper;
    this.invoiceRepository=invoiceRepository;
    this.customerServiceRestClient=customerServiceRestClient;
    }

    @Override
    public InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO) {
        Invoice invoice= invoiceMapper.fromInvoiceRequestDTO(invoiceRequestDTO);
        invoice.setId(UUID.randomUUID().toString());
        invoice.setDate(new Date());
        Invoice savedInvoice =invoiceRepository.save(invoice);
        return invoiceMapper.fromInvoice(savedInvoice);
    }

    @Override
    public InvoiceResponseDTO getInvoice(String invoiceId) {
        Invoice invoice=invoiceRepository.findById(invoiceId).get();
        //recuperer le customer depuis le service customer :
        Customer customer=customerServiceRestClient.getCustomer(invoice.getCustomerId());
        invoice.setCustomer(customer);
        return invoiceMapper.fromInvoice(invoice);
    }

    @Override
    public List<InvoiceResponseDTO> getInvoicesByCustomerId(String customerId) {
        List<Invoice> invoicesBycustomerId=invoiceRepository.findByCustomerId(customerId);
        List<InvoiceResponseDTO> invoiceResponseDTOS=invoicesBycustomerId.stream().map(inv->{
            return invoiceMapper.fromInvoice(inv);
        }).collect(Collectors.toList());
        return invoiceResponseDTOS;
    }

    @Override
    public void delete(String id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public InvoiceResponseDTO updateInvoice(String idInvoice,InvoiceRequestDTO invoiceRequestDTO) {
     Invoice invoice=invoiceRepository.findById(idInvoice).get();
     invoice.setAmount(invoiceRequestDTO.getAmount());
     invoice.setCustomerId(invoiceRequestDTO.getCustomerId());
     invoiceRepository.save(invoice);
        return invoiceMapper.fromInvoice(invoice);
    }
}
