package ua.mega;

import ua.mega.model.Customer;

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

        Customer customer = new Customer("name1", "patronymic1", "surname");
        em.persist(customer);

        tx.commit();
        em.close();
        emf.close();
    }
}
