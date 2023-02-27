package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/v2/customers")
@RestController
public class CustomerControllerV2 {
    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers() {
        return List.of(new Customer(1L, "v2", "v2", "email@email.com"));
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer) {
        System.out.println("POST REQUEST... ");
        System.out.println(customer);
    }
    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("UPDATE REQUEST... ");
        System.out.println(customer);
    }

    @DeleteMapping("{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("DELETE REQUEST... ");
        System.out.println(id);
    }
}
