package com.example.billingservice.repositories;

import com.example.billingservice.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, String> {
    //recupérer les factures d'un client par son id :
    public List<Invoice> findByCustomerId(String customerId);
}
