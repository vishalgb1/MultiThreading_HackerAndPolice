package Random;

import Controller.MainClass;

import java.util.Random;

public class CustomRandomValue {
    private int max_Password;

    public CustomRandomValue(int max_Password) {
        this.max_Password = max_Password;
    }

    public int giveRandomValue() {
        Random random = new Random();
        return random.nextInt(max_Password);

    }

}