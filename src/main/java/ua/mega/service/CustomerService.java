package ua.mega.service;

import ua.mega.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer createNewCustomer(Customer customer);

    Customer getCustomer(int id);

    List<Customer> getAllCustomers();

    void deleteCustomer(int id);
}
