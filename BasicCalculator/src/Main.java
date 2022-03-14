import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator *-*");
        int calc;

        System.out.print("Enter a number: ");
        int numberf = scanner.nextInt();
        System.out.print("Enter a number: ");
        int numbers = scanner.nextInt();
        scanner.nextLine();

        String secim = "1. Toplama\n"
                + "2. Çıkarma\n"
                + "3. Çarpma\n"
                + "4. Bölme\n";
        System.out.println(secim);

        System.out.print("Bir işlem seçiniz: ");
        String islem = scanner.nextLine();

        if (islem.equals("1")) {
            calc = numberf + numbers;
            System.out.println("Girdiğiniz sayıların toplamı: " + calc);
        }
        else if (islem.equals("2")) {
            calc = numberf - numbers;
            System.out.println("Girdiğiniz sayıların farkı: " + calc);
        }
        else if (islem.equals("3")) {
            calc = numberf * numbers;
            System.out.println("Girdiğiniz sayıların çarpımı: " + calc);
        }
        else if (islem.equals("4")) {
            if (numberf < numbers) {
                System.out.println("Girdiğiniz ilk sayı ikinci sayıdan küçük olamaz!");
            }
            else if (numbers <= 0) {
                System.out.println("Girdiğiniz sayılardan bir tanesi bile 0'dan küçük ya da 0'a eşit olamaz!!");
            }
            else {
                calc = numberf / numbers;
                System.out.println("Girdiğiniz sayıların bölümü: " + calc);
            }
        }
        else {
            System.out.println("Yanlış giriş yaptınız!");
        }
    }
}
