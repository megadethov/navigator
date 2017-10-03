package ua.mega.service;

import ua.mega.model.Phone;

public interface PhoneService {

    void updatePhone(Phone phone);

    Phone getPhone(int id);
}
