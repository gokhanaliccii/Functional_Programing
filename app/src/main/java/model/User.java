package model;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof User)) {
            return super.equals(obj);
        }

        boolean equals = true;

        User src = (User) obj;
        equals &= src.name.equals(name);
        equals &= src.surname.equals(surname);

        return equals;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}