import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Vize notunuz: ");
        int vize1 = scanner.nextInt();
        System.out.print("2. Vize notunuz: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notunuz: ");
        int finnal = scanner.nextInt();

        double ort = ((vize1 *  0.30) + (vize2 * 0.30) + (finnal * 0.40));

        if (ort >= 90) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: AA");
        }
        else if (ort >= 85) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: BA");
        }
        else if (ort >= 80) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: BB");
        }
        else if (ort >= 75) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: CB");
        }
        else if (ort >= 70) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: CC");
        }
        else if (ort >= 65) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: DC");
        }
        else if (ort >= 60) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: DD");
        }
        else if (ort >= 55) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: FD");
        }
        else if (ort < 55) {
            System.out.println("Ortalamanız: " + ort + " Harf notunuz: FF");
        }
    }
}
