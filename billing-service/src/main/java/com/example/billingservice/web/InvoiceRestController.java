package com.example.billingservice.web;

import com.example.billingservice.dtos.InvoiceRequestDTO;
import com.example.billingservice.dtos.InvoiceResponseDTO;
import com.example.billingservice.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api")
@RestController
public class InvoiceRestController {
    private InvoiceService invoiceService;

    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    //methode pour recuperer toutes les factures :
    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> getInvoices(){
        return invoiceService.getInvoices();
    }
    //methode pour recuperer la facture par son id :
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO getInvoice(@PathVariable(name = "id") String id){
        return invoiceService.getInvoice(id);
    }

    //methode pour recupérer la liste des facuture d'un customer donné :
    @GetMapping(path = "/invoicesByCustomer/{customerId}")
    public List<InvoiceResponseDTO> getInvoicesByCustomer(@PathVariable(name = "customerId") String customerId){
        return invoiceService.getInvoicesByCustomerId(customerId);
    }
    //methode pour ajouter une facture :
    @PostMapping(path = "/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.save(invoiceRequestDTO);
    }
    //methode pour supprimer une facture :
    @DeleteMapping(path = "/invoices/{id}")
    public void delete(@PathVariable String id){
        invoiceService.delete(id);
    }
    //methode to update invoice :
    @PutMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO update(@PathVariable String id, @RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.updateInvoice(id,invoiceRequestDTO);
    }
    //method to return the generated error message by exceptions classes :
    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHandler(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
