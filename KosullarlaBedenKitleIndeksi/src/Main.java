import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Beden Kitle İndexi Hesaplama Programı ******");

        System.out.print("Kilonuz: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuz (Örn; 1,72 şeklinde giriniz): ");
        double boy = scanner.nextDouble();

        // Beden Kitle İndeksi hesaplaması: Kilo / Boy * Boy
        double bki = kilo / (boy * boy);

        if (bki <  18.5) {
            System.out.println("Olmanız gerekenden daha zayıfsınız..");
        }
        else if (bki < 25) {
            System.out.println("İdeal kilodasınız..");
        }
        else if (bki < 30) {
            System.out.println("Fazla kilolusunuz..");
        }
        else if (bki >= 30) {
            System.out.print("Obez, zayıflamanız gerekiyor..");
        }
        else {
            System.out.print("Hatalı giriş yaptınız...");
        }
    }
}
