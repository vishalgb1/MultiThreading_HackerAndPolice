package Controller;

import Hacker.HackerImpl.AscendingHackerThread;
import Hacker.HackerImpl.DescendingHackerThread;
import Police.PoliceThread;
import Random.CustomRandomValue;
import Vault.Vault;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static final int max_Password = 99;

    public static void main(String[] args) {
        CustomRandomValue customRandomValue = new CustomRandomValue(max_Password);
        int radomValue = customRandomValue.giveRandomValue();
        Vault vault = new Vault(radomValue);

        System.out.println("radomValue = " + radomValue);

        List<Thread> threadList = new ArrayList<>();

        threadList.add(new AscendingHackerThread(vault, max_Password));
        threadList.add(new DescendingHackerThread(vault, max_Password));

        threadList.add(new PoliceThread());

        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).start();
        }

    }
}