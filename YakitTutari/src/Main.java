import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gittiğiniz Yola Göre Yakıt Ödeme Tutarı Hesaplama Uygulaması");

        System.out.print("Yaptığınız yolu km cinsinden giriniz: ");
        int km = scanner.nextInt();
        System.out.print("Aracınızın km başına ne kadar yakıt tükettiğini giriniz: ");
        double yakit = scanner.nextDouble();

        double tutar = km * yakit;
        System.out.println("Ödemeniz gereken tutar: " + tutar + " ₺'dir");
    }
}
