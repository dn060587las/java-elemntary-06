package org.bank.demo;

public class Client {

    private String name;

    private double sallary;

    public Client(String name, double sallary) {
        this.name = name;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }


}
