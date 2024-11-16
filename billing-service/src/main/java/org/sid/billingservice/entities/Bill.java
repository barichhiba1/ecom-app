package org.sid.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Customer;

import java.util.Date;
import java.util.List;
@Entity @NoArgsConstructor @AllArgsConstructor @Builder

public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Long id;
    private Date billDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    @Transient
    private Customer customer;
}
