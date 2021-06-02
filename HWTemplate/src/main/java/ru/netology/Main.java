package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son1 = person1.newChildBuilder()
                .setName("Антошка")
                .setAge(10)
                .build();
        System.out.println("У " + person1 + " есть сын, " + son1);

        Person person2 = new PersonBuilder()
                .setName("Антон")
                .setSurname("Абрамов")
                .setAge(43)
                .setAddress("Нью-Йорк")
                .build();
        Person son2 = person2.newChildBuilder()
                .setName("Олег")
                .setAge(17)
                .build();
        System.out.println("У " + person2 + " есть сын, " + son2);

        person1.happyBirthday();
        son1.happyBirthday();
        person2.happyBirthday();
        son2.happyBirthday();

        son2.setAddress("Вашингтон");
        System.out.println(son2.getName() + " " + son2.getSurname() + " Сменил место жительства. Новые данные:\n" + son2);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}