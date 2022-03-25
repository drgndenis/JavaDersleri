import java.util.Scanner;

public class Main {
    // Metot tanımlaması
    public static int toplama(int a, int b){
        return (a+b);
    }

    public static int toplama(int a, int b,int c) {
        return (a+b+c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplama işlemini kaç sayı ile yapacaksınız (2 veya 3): ");
        int secim = scanner.nextInt();

        // Kullanıcının 2 seçmesi
        if (secim == 2) {
            System.out.print("Birinci sayı: ");
            int numf = scanner.nextInt();
            System.out.print("İkinci sayı: ");
            int nums = scanner.nextInt();

            System.out.println("Girdiğiniz sayıların toplamı: " + toplama(numf,nums));
        }
        // kullanıcının 3 seçmesi
        else if (secim == 3) {
            System.out.print("Birinci sayı: ");
            int numf = scanner.nextInt();
            System.out.print("İkinci sayı: ");
            int nums = scanner.nextInt();
            System.out.print("Üçüncü sayı: ");
            int numt = scanner.nextInt();

            System.out.println("Girdiğiniz sayıların toplamı: " + toplama(numf,nums,numt));
        }
        // belirlenen değerler dışında seçim yapılması
        else {
            System.out.println("Yanlış seçim yaptınız!");
        }
    }
}
