import java.util.Scanner;
import java.util.Random;

public class Main {

    private static void test() {
        int floorsCount = Controller.floorsQuantity;
        Random gen = new Random();
        int a, b;
        for (int i = 0; i < 15; i++) {
            a=gen.nextInt(floorsCount);
            b=gen.nextInt(floorsCount);
            System.out.println("From "+a+" to "+b);
            ElevatorCall call = new ElevatorCall(a, b);
            call.submitCall();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Controller controller = Controller.shared;
        Thread thread = new Thread(controller);
        thread.start();

        int choice;

        Scanner input = new Scanner(System.in);
        test();
        int a = 1;
    }
}