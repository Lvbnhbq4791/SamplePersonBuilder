public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    private boolean ageInput;

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
        this.ageInput = true;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || age < 0) {
            throw new IllegalArgumentException("Фамилия и Имя обязательны, Возраст не должен быть отрицательным");
        }
        Person person;
        if (!ageInput) person = new Person(name, surname);
        else person = new Person(name, surname, age);
        if (address != null) person.setAddress(address);
        return person;
    }
}
