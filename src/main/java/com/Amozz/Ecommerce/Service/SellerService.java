package com.Amozz.Ecommerce.Service;

import com.Amozz.Ecommerce.Convertors.SellerConvertor;
import com.Amozz.Ecommerce.Model.Seller;
import com.Amozz.Ecommerce.Repository.SellerRepository;
import com.Amozz.Ecommerce.RequestDTO.SellerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepo;

    public String addSeller(SellerRequestDto sellerRequestDto){

        Seller seller = SellerConvertor.SellerRequestDtoToSeller(sellerRequestDto);
        sellerRepo.save(seller);

        return "Congrats! Now you can sell on Chine Market !!!";
    }
}

