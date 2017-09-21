package ua.mega;

import ua.mega.model.Customer;
import ua.mega.model.Phone;
import ua.mega.model.PhoneType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("derby");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Phone phone = new Phone("111-11-111-11", PhoneType.HOME, "lalala");
        Customer customer = new Customer("name1", "patronymic1", "surname", phone);
        em.persist(customer);

        tx.commit();
        em.close();
        emf.close();
    }
}
