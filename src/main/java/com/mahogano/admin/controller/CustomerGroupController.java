package com.mahogano.admin.controller;

import com.mahogano.core.magento.entity.CustomerGroup;
import com.mahogano.core.magento.repository.CustomerGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CustomerGroupController {

    private CustomerGroupRepository customerGroupRepository;

    @Autowired
    public void setCustomerGroupRepository(CustomerGroupRepository customerGroupRepository) {
        this.customerGroupRepository = customerGroupRepository;
    }

    @GetMapping(value = "/admin/customer-group")
    public String customerGroupList(Model model) {
        List<CustomerGroup> customerGroups = customerGroupRepository.findAll();
        model.addAttribute("customerGroups", customerGroups);
        return "admin/customer-group-list";
    }

    @GetMapping(value = "/admin/customer-group/{id}")
    public String customerGroupView(Model model, @PathVariable Integer id) {
        CustomerGroup customerGroup = customerGroupRepository.find(id);
        model.addAttribute("customerGroup", customerGroup);
        return "admin/customer-group-view";
    }

}
