package model;

import constants.AppConstants;

import java.time.LocalDate;

public class Person {
    private static int idCount=1;
    private int id;
    private String name;
    private LocalDate dayOfBirth;
    private String address;
    private double height;
    private double weight;

    public Person() {
    }

    public Person(String name, LocalDate dayOfBirth, String address, double height, double weight) {
        this.id = idCount++;
        setName(name);
        setDayOfBirth(dayOfBirth);
        setaddress(address);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.trim().isEmpty() || name.length() > AppConstants.NAME_MAX_LENGTH){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaddress() {
        return address;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        if(dayOfBirth==null||dayOfBirth.isBefore(AppConstants.MIN_YEAR)){
            throw new IllegalArgumentException("Invalid day of birth");
        }
        this.dayOfBirth = dayOfBirth;
    }

    public void setaddress(String address) {
        if(address.length() > AppConstants.ADDRESS_MAX_LENGTH){
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }



    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if(height < AppConstants.MIN_HEIGHT || height>AppConstants.MAX_HEIGHT){
            throw new IllegalArgumentException("Invalid height");
        }
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if(weight<AppConstants.MIN_WEIGHT || weight>AppConstants.MAX_WEIGHT){
            throw new IllegalArgumentException("Invalid weight");
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
