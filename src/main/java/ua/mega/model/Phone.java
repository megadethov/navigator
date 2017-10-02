package ua.mega.model;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name="Phone.getAll", query="select phone from Phone as phone")
})

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String number;


    @Enumerated(EnumType.STRING)
    @Column(name = "phone_type")
    private PhoneType phoneType;

    private String description;

    public Phone() {
    }

    public Phone(String number) {
        this.number = number;
    }

    public Phone(String number, PhoneType phoneType, String description) {
        this.number = number;
        this.phoneType = phoneType;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (id != phone.id) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
        if (phoneType != phone.phoneType) return false;
        return description != null ? description.equals(phone.description) : phone.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (phoneType != null ? phoneType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
