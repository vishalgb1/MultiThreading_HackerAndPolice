package Police;

public class PoliceThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Police arriving in " + i + "seconds.");
        }
        System.out.println("Game over for Hackers.");
        System.exit(0);
    }
}