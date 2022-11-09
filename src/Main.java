import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StopWatch sWatch = new StopWatch();

        System.out.println("You can press 1 and then enter to start the stop watch");
        int a = sc.nextInt();
        while (a != 1) {
            System.out.println("Enter wrong button. Please enter again");
            a = sc.nextInt();
        }
        sWatch.start();

        System.out.println("Wait 'til you want to press 2 and then enter to stop the stop watch");
        int b = sc.nextInt();
        while (b != 2) {
            System.out.println("Enter wrong button. Please enter again");
            b = sc.nextInt();
        }
        sWatch.stop();

        System.out.println("The time is: " + (sWatch.getElapsedTime() / 1000) + " seconds");
    }
}