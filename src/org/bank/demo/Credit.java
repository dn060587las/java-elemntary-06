package org.bank.demo;

public class Credit {

    private boolean success;

    private Client owner;

    public Credit(boolean success, Client owner) {
        this.success = success;
        this.owner = owner;
    }

    public boolean isSuccess() {
        return success;
    }

    public Client getOwner() {
        return owner;
    }
}
