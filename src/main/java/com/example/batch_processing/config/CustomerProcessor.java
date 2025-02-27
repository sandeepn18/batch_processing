package com.example.batch_processing.config;

import com.example.batch_processing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("United States")){
            return customer;
        }
        else{
            return null;
        }

    }
}
