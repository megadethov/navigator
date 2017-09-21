package ua.mega.service;

import ua.mega.model.Customer;

import java.util.List;

public interface CustomerService {

    void createNewCustomer(Customer customer);

    void getCustomer(int id);

    List<Customer> getAllCustomers();

    void deleteCustomer(int id);
}
