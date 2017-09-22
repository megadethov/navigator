package ua.mega.dao;

import ua.mega.model.Customer;

import java.util.List;

public interface CustomerDao {

    Customer create(Customer customer);

    Customer get(int id);

    List<Customer> getAll();

    void delete(int id);

}
