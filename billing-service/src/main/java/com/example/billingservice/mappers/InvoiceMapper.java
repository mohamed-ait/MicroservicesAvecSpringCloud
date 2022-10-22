package com.example.billingservice.mappers;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.dtos.InvoiceResponseDTO;
import com.example.billingservice.entities.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    public Invoice fromInvoiceRequestDTO(InvoiceRequestDTO invoiceRequestDTO);
    public InvoiceResponseDTO fromInvoice(Invoice invoice);
}
