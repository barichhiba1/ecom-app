package org.sid.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Product;

@Entity @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private Long productId;
    @ManyToOne
    private Bill bill;
    private  int quantity;
    private double price ;
    private double discount;
    @Transient
    private Product product;
}
