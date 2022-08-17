package com.company;

public class Farm {
    private String address;
    private String ownerName;

    Cow[] cows = new Cow[5];
    Sheep[] sheeps = new Sheep[3];
    Horse[] horses = new Horse[2];

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public String getAddress() {
        return address;
    }

    public String getOwnerName() {
        return ownerName;
    }
}