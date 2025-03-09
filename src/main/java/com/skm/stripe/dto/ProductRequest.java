package com.skm.stripe.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private Long amount;
    private String currency;
    private String name;
    private Long quantity;
}
