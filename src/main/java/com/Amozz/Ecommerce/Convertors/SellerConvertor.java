package com.Amozz.Ecommerce.Convertors;

import com.Amozz.Ecommerce.Model.Seller;
import com.Amozz.Ecommerce.RequestDTO.SellerRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SellerConvertor {
    public static Seller SellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){
        return Seller.builder()
                .name(sellerRequestDto.getName())
                .email(sellerRequestDto.getEmail())
                .mobNo(sellerRequestDto.getMobNo())
                .panNo(sellerRequestDto.getPanNo())
                .build();
    }
}
