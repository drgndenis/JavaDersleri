import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sizden toplamda 3 tane sayı girmeniz istenecektir, daha sonra bu 3 sayıdan en büyüğü bulunacak");

        System.out.print("Birinci sayı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("İkinci sayı giriniz: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü sayı giriniz: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("En büyük sayı: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("En büyük sayı: " + b);
        }
        else {
            System.out.println("En büyük sayı: " + c);
        }
    }
}
