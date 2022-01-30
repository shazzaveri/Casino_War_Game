package model;

public class PersonBuilder {
    private static final String DEFAULT_NAME = "";
    private static final int DEFAULT_AGE = 0;
    private static final char DEFAULT_GENDER = 'Z';

    private Person person;

    public PersonBuilder() {
        person = initPerson();
    }

    public PersonBuilder setMyName(String myName) {
        person.setMyName(myName);
        return this;
    }

    public Person build() {
        return person;
    }

    private Person initPerson() {
        Person person = new Person();

        // init both
        person.setMyName(DEFAULT_NAME);
        person.setMyAge(DEFAULT_AGE);
        //myGender = DEFAULT_GENDER; // unknown gender

        return person;
    }


    public PersonBuilder setMyAge(int age) {
        person.setMyAge(age);
        return this;
    }
}
