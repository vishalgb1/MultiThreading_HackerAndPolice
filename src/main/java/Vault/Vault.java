package Vault;

public class Vault {
    private int password;

    public Vault(int password) {
        this.password = password;
    }

    public int getVault() {
        return password;

    }

    public boolean getCorrectPassword(int password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.password == password;
    }
}