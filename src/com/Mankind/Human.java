package com.Mankind;

public abstract class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    private void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        } else if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        } else
            this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        } else if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
