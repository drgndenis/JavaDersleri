import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*-* Dik Üçgenin Hipotenüsünü Bulma *-*");

        System.out.print("1. dik kenarı giriniz: ");
        int birinciKenar = scanner.nextInt();
        System.out.print("2. dik kenarı giriniz: ");
        int ikinciKenar = scanner.nextInt();

        double hipotenus = Math.sqrt(ikinciKenar * ikinciKenar + birinciKenar * birinciKenar);
        System.out.println("Hipotenüs: " + hipotenus);
    }
}
