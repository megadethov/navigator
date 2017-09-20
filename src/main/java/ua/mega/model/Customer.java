package ua.mega.model;

public class Customer {
    private String name;
    private String patronymic;
    private String surname;
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
}
