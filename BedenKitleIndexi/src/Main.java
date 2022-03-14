import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****Beden Kitle İndex Bulma Uygulaması*****");

        System.out.print("Kilonuz: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuz (1,72 şeklinde giriniz): ");
        double boy = scanner.nextDouble();

        // Beden kitle indeksi bulma
        double bki = kilo / (boy * boy);
        System.out.println("Beden Kitle İndeksiniz: " + bki);
    }
}
