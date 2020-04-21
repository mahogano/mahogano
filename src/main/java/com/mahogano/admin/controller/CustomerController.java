package com.mahogano.admin.controller;

import com.mahogano.core.magento.entity.CustomerEntity;
import com.mahogano.core.magento.repository.CustomerEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerEntityRepository customerEntityRepository;

    @Autowired
    public void setCustomerEntityRepository(CustomerEntityRepository customerEntityRepository) {
        this.customerEntityRepository = customerEntityRepository;
    }

    @GetMapping(value = "/admin/customer")
    public String customerList(Model model) {
        List<CustomerEntity> customers = customerEntityRepository.findAll();
        model.addAttribute("customers", customers);
        return "admin/customer-list";
    }

    @GetMapping(value = "/admin/customer/{id}")
    public String customerView(Model model, @PathVariable Integer id) {
        CustomerEntity customer = customerEntityRepository.find(id);
        model.addAttribute("customer", customer);
        return "admin/customer-view";
    }

}
