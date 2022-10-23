package com.example.billingservice.service;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.dtos.InvoiceResponseDTO;
import com.example.billingservice.entities.Customer;
import com.example.billingservice.entities.Invoice;

import java.util.List;

public interface InvoiceService {
     List<InvoiceResponseDTO> getInvoices();
     InvoiceResponseDTO save(InvoiceRequestDTO invoiceRequestDTO);
     InvoiceResponseDTO getInvoice(String id);
     List<InvoiceResponseDTO> getInvoicesByCustomerId(String customerId);
     void delete(String id);
     InvoiceResponseDTO updateInvoice(String idInvoice, InvoiceRequestDTO invoiceRequestDTO);
}
