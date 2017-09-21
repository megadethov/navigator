package ua.mega.dao;

import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public interface PhoneDao {

    void create(Phone phone);

    Phone get(int id);

    Phone getByCustomer(Customer customer);

    List<Phone> getAll();

    void delete(int id);

}
