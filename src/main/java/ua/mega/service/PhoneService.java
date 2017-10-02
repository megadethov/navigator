package ua.mega.service;

import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

public interface PhoneService {

    void updatePhone(Phone phone);

    Phone getPhone(int id);
}
