package ua.mega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.dao.PhoneDao;
import ua.mega.model.Customer;
import ua.mega.model.Phone;

import java.util.List;

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDao dao;

    @Override
    public Phone createNewPhone(Phone phone) {
       return dao.create(phone);
    }

    @Override
    public Phone getPhone(int id) {
        return dao.get(id);
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
