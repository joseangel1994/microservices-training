package com.microservices.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{

    @Id
    @Column
    private Long accountNumber;

    @Column
    private String accountType;

    @Column
    private String branchAddress;

    @Column
    private Long customerId;

    public void update(Accounts account) {
        this.accountType = account.getAccountType();
        this.branchAddress = account.getBranchAddress();
    }
}
