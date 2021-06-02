package ru.netology;

public class PersonBuilder {
    public String name;
    public String surname;
    public int age = -1;
    public String address;
    public Person newPerson;

    public PersonBuilder() {
        newPerson = new Person(this);
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        Person newPerson = new Person(this);
        String errorMassage = "";
        boolean hasError = false;

        if (newPerson.getName() == null) {
            hasError = true;
            errorMassage += "\nНе указано имя!";
        }
        if (newPerson.getName() == null) {
            hasError = true;
            errorMassage += "\nНе указана фамилия!";
        }
        if (!newPerson.hasAge()) {
            hasError = true;
            errorMassage += "\nНе указан возраст!";
        }
        if (!newPerson.hasAddress()) {
            hasError = true;
            errorMassage += "\nНе указан адрес!";
        }
        if (newPerson.getAge() < -1 || newPerson.getAge() > 120) {
            throw new IllegalArgumentException("\nНекорректно указан возраст!");
        }
        if (hasError) {
            throw new IllegalStateException(errorMassage);

        }

        return newPerson;
    }


}