package com.zaneacademy.stream.video15;

/**
 * @author pankaj
 */
public class Person {

    public Person() {

    }

    public Person(String id, String country) {
        this.id = id;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String id;
    private String country;


}
