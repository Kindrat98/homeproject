package app.database.controllers;


import app.database.entity.Customers;
import app.database.repo.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomersController {

    @Autowired
    private CustomersRepository customersRepository;

    @GetMapping
    public List<Customers> getAll(){
        return customersRepository.findAll();
    }

    @GetMapping("/orderAllByName")
    public List<Customers> getUsersOrderByName(){
        return customersRepository.findAll();
    }

    @GetMapping("/orderAllById")
    public List<Customers> getUsersOrderByNumber(){
        return customersRepository.findAll();
    }
}
