package com.jbueno.incomes.dto;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Wallet {

    private Long id;
    private String name;

}
