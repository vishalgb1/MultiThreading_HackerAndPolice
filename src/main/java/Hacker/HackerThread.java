package Hacker;

import Vault.Vault;

public abstract class HackerThread extends Thread {
    public Vault vault;
    public int max_Password;

    public HackerThread(Vault vault, int max_Password) {
        this.vault = vault;
        this.max_Password = max_Password;
        this.setName(this.getClass().getSimpleName());
        this.setPriority(Thread.MAX_PRIORITY);
    }

    public int getMax_Password() {
        return max_Password;
    }
}