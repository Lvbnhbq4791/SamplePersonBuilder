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
        if (age < 0) throw new IllegalArgumentException("Возраст не может быть отрицательным");
        this.age = age;
        this.ageInput = true;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null ) {
            throw new IllegalStateException("Фамилия и Имя обязательны");
        }
        Person person;
        if (!ageInput) person = new Person(name, surname);
        else person = new Person(name, surname, age);
        if (address != null) person.setAddress(address);
        return person;
    }
}
