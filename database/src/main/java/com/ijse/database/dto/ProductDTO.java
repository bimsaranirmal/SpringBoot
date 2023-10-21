package com.ijse.database.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String name;
    private Double price;
    private Integer quantity;
    private Long categoryId;
}
