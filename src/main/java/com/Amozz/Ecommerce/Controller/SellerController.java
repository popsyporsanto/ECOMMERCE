package com.Amozz.Ecommerce.Controller;

import com.Amozz.Ecommerce.Model.Seller;
import com.Amozz.Ecommerce.RequestDTO.SellerRequestDto;
import com.Amozz.Ecommerce.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/add")
    public String addSeller(@RequestBody SellerRequestDto sellerRequestDto){
        return sellerService.addSeller(sellerRequestDto);
    }


}
