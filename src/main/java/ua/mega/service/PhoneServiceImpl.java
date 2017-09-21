package ua.mega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mega.dao.PhoneDao;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDao dao;

    @Override
    public void createNewPhone(Phone phone) {
        dao.create(phone);
    }

    @Override
    public Phone getPhone(int id) {
        return dao.get(id);
    }

    @Override
    public Phone getPhoneByCustomer(Customer customer) {
        return dao.getByCustomer(customer);
    }

    @Override
    public List<Phone> getAllPhones() {
        return dao.getAll();
    }

    @Override
    public void deletePhone(int id) {
        dao.delete(id);
    }
}
