package com.microservices.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long customerId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String mobileNumber;

    public void update(Customer customer) {
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.mobileNumber = customer.getMobileNumber();
    }
}
