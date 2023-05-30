package com.Amozz.Ecommerce.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerRequestDto {

    private String name;

    private String mobNo;

    private String email;

    private String panNo;

}
