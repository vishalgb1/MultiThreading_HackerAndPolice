package Hacker.HackerImpl;

import Hacker.HackerThread;
import Vault.Vault;
import Controller.MainClass;

public class AscendingHackerThread extends HackerThread {

    public AscendingHackerThread(Vault vault, int max_Password) {

        super(vault, max_Password);
        System.out.println("Ascending Thread started" + vault.getVault());
    }

    @Override
    public void run() {
        for (int i = 0; i < this.getMax_Password(); i++) {
            if (vault.getCorrectPassword(i)) {
                System.out.println("Ascending Thread guessed the password = " + i);
                System.exit(0);
            }
        }

    }
}