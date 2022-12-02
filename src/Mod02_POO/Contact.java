package Mod02_POO;


import java.util.ArrayList;
import java.util.List;

public class Contact {
    private final Person person;
    private List<Phone> phones = new ArrayList<>();
    private String email;
    private String knowFrom;
    public Contact(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public String getEmail() {
        return email;
    }

    public String getKnowFrom() {
        return knowFrom;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKnowFrom(String knowFrom) {
        this.knowFrom = knowFrom;
    }
}
