package Mod02_POO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Contact> contactBook = new ArrayList<>();

        Contact contatoDavi = new Contact(new Person("Davi", "Garcia"));

        Phone daviCellphone = new Phone(PhoneType.CELLPHONE, "+55", "27", "99955-7438");

        contatoDavi.addPhone(daviCellphone);

        contatoDavi.setEmail("davigs@hotmail.com");

        contatoDavi.getPhones().forEach(phone -> System.out.println(phone.getNumber()));

        System.out.println(contatoDavi.getPhones().stream().map(phone ->
            phone.getCountryCode() + phone.getRegionCode() + phone.getNumber()
        ).collect(Collectors.toList()));

        contatoDavi.getPhones().forEach(phone -> System.out.println(phone.getNumber()));

        contatoDavi.getPhones().forEach();
    }

//    public static void addContact (Contact contact, List<Contact> contactList) {
//        contactList.add(new Contact(new Person()))
//    }

//    pesquisar sobre strng builder
//    pesquisar sobre stream

//
}