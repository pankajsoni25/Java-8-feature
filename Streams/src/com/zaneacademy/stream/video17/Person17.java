package com.zaneacademy.stream.video17;

/**
 * @author pankaj
 */
public class Person17 {

    public Person17() {

    }

    public Person17(String name, String country) {
        this.name = name;
        this.country = country;
    }
/*
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String name;
    private String country;

    @Override
    public int hashCode(){
        return (country+ name).hashCode();
    }

    @Override
    public boolean equals(Person17 person17){
        if(this.name.equals(person17.getName()) && this.country.equals(person17.getCountry())){
            return true;
        }
        return false;
    }


}
