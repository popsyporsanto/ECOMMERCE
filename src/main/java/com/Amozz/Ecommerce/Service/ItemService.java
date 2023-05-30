package com.Amozz.Ecommerce.Service;

import com.Amozz.Ecommerce.Exception.ProductNotFoundException;
import com.Amozz.Ecommerce.Model.Item;
import com.Amozz.Ecommerce.Model.Product;
import com.Amozz.Ecommerce.Repository.ProductRepository;
import com.Amozz.Ecommerce.ResponseDTO.ItemResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
    public class ItemService {

        @Autowired
        ProductRepository productRepository;

        public ItemResponseDto viewItem(int productId) throws ProductNotFoundException {

            Product product;
            try{
                product = productRepository.findById(productId).get();
            }
            catch (Exception e){
                throw new ProductNotFoundException("Sorry! Invalid product id.");
            }

            Item item = Item.builder()
                    .requiredQuantity(0)
                    .product(product)
                    .build();

            // map item to product
            product.setItem(item);

            // save both item and product
            productRepository.save(product);

            // prepare the response dto
            ItemResponseDto itemResponseDto = ItemResponseDto.builder()
                    .productName(product.getProductName())
                    .price(product.getPrice())
                    .productCategory(product.getProductCategory())
                    .productStatus(product.getProductStatus())
                    .build();

            return itemResponseDto;
        }
    }


