package org.bank.demo;

public class Demo {
    public static void main(String[] args) {
        Client client1 = new Client("test", 1000);
        Client client2 = new Client("test", 500);
        Bank bank = new Bank("demo bank", 100_000);
        Credit credit1 = bank.getCredit(client1, 100);
        System.out.println("Credit is " + credit1.isSuccess());
        Credit credit2 = bank.getCredit(client2, 100);
        System.out.println("Credit is " + credit2.isSuccess());
    }
}
