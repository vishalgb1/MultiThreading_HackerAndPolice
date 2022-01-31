package Hacker.HackerImpl;

import Hacker.HackerThread;
import Vault.Vault;

public class DescendingHackerThread extends HackerThread {

    public DescendingHackerThread(Vault vault, int max_Password) {
        super(vault, max_Password);
        System.out.println("Descending Thread started");
    }

    @Override
    public void run() {
        for (int i = this.getMax_Password(); i >= 0; i--) {
            if (vault.getCorrectPassword(i)) {
                System.out.println("Descending Thread guessed the password = " + i);
                System.exit(0);
            }
        }

    }
}