package ru.netology;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        age++;
        System.out.println(getName() + ", с " + age + "-м днём рождения!");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                " Возраст: " + getAge() +
                " Город: " + getAddress();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setAddress(getAddress())
                .setSurname(getSurname());
    }
}