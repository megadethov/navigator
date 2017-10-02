package ua.mega.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name="Customer.getAll", query="select customer from Customer customer")
})

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String patronymic;
    private String surname;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "phone_id")
    private Phone phone;

    public Customer() {
    }

    public Customer(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public Customer(String name, String patronymic, String surname, Phone phone) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (surname != null ? !surname.equals(customer.surname) : customer.surname != null) return false;
        return phone != null ? phone.equals(customer.phone) : customer.phone == null;
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
