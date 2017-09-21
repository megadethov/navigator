package ua.mega.service;

import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public interface PhoneService {

    void createNewPhone(Phone phone);

    Phone getPhone(int id);

    Phone getPhoneByCustomer(Customer customer);

    List<Phone> getAllPhones();

    void deletePhone(int id);
}