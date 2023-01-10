import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tham số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào tham số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào tham số c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("delta = " + quadraticEquation.getDiscriminant());

        if (quadraticEquation.getA() == 0) {
            if (quadraticEquation.getB() == 0) {
                if (quadraticEquation.getC() == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else  {
                System.out.println("Phương trình có nghiệm là: "
                        + -c/ b);
            }
        } else {
            if (quadraticEquation.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có 1 nghiệm là: "
                        + (-quadraticEquation.getB()/ (2* quadraticEquation.getA())));
            } else {
                System.out.println("Phương trình có 2 nghiệm là: "
                        + ((-quadraticEquation.getB() + Math.sqrt(quadraticEquation.getDiscriminant()))/
                        (2* quadraticEquation.getA())) + " và "
                        + ((-quadraticEquation.getB() - Math.sqrt(quadraticEquation.getDiscriminant()))/
                        (2* quadraticEquation.getA())));
            }
        }
    }
}