package org.bank.demo;

public class Bank {

    private String name;

    private double capital;

    public Bank(String name, double capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Credit getCredit(Client client, double money) {
        if (client.getSallary() >= 1000) {
            Credit credit = new Credit(true, client);
            this.capital -= money;
            return credit;
        } else {
            Credit credit = new Credit(false, client);
            return credit;
        }
    }
}
