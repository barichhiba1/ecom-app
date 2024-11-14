package org.sid.customerservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private  String name;

    private String email;
    @JsonProperty("name") // Assure-toi que le champ `name` est bien sérialisé
    public String getName() {
        return name;
    }
}
