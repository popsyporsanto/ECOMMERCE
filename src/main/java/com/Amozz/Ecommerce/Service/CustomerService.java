package com.Amozz.Ecommerce.Service;

import com.Amozz.Ecommerce.Convertors.CustomerConvertor;
import com.Amozz.Ecommerce.Model.Cart;
import com.Amozz.Ecommerce.Model.Customer;
import com.Amozz.Ecommerce.Repository.CustomerRepository;
import com.Amozz.Ecommerce.RequestDTO.CustomerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {

        @Autowired
        CustomerRepository customerRepository;

        public String addCustomer(CustomerRequestDto customerRequestDto) {
            Customer customer = CustomerConvertor.CustomerRequestDtoToCustomer(customerRequestDto);

            // allocate a cart to customer
            Cart cart = new Cart();
            cart.setCartTotal(0);
            cart.setCustomer(customer);

            // set cart in customer
            customer.setCart(cart);

            customerRepository.save(customer);
            return "Congrats !! Welcome to China Market.";
        }
    }

