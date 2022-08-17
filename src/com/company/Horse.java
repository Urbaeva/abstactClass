package com.company;

public class Horse extends AbstractAnimal{
    private double weight;
    private int age;
    private String color;
    private String gender;
    private String nickName;

    public Horse(String nickName, int age, String color, double weight, String gender){
        this.nickName = nickName;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public void voice(){
        System.out.println("The horse says: aaa aaa");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getNickName() {
        return nickName;
    }
}
