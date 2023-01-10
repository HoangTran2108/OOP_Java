import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Fan: " + fan);

        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println("Fan1: " + fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println("Fan2: " + fan2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Trạng thái on/off:");
        String input = scanner.nextLine();
        if(input.equals("on")) {
            System.out.println("Fan 1 is on");
        } else if (input.equals("off")) {
            System.out.println("Fan 2 fan is off");
        }
    }
}