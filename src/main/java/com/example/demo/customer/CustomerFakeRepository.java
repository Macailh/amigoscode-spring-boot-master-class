package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "hola123"),
                new Customer(2L, "Jamila Ahomand", "qwerty")
        );
    }
}
