package ua.mega.model;

public class Phone {
    private String number;
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
}
