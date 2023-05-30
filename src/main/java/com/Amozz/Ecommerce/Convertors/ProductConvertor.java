package com.Amozz.Ecommerce.Convertors;

import com.Amozz.Ecommerce.Enum.ProductStatus;
import com.Amozz.Ecommerce.Model.Product;
import com.Amozz.Ecommerce.RequestDTO.ProductRequestDto;
import com.Amozz.Ecommerce.ResponseDTO.ProductResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductConvertor {

    public static Product productRequestDtotoProduct(ProductRequestDto productRequestDto){

        return Product.builder()
                .ProductName(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .quantity(productRequestDto.getQuantity())
                .productCategory(productRequestDto.getProductCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponseDto productToProductResponseDto(Product product){

        return ProductResponseDto.builder()
                .productName(product.getProductName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .productStatus(product.getProductStatus())
                .build();

    }
}
