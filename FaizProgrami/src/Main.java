import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Faiz Uygulaması (Yıllık Faiz %6'dır) *****");

        int anapara,vade;

        System.out.print("Yatırmak istediğiniz miktar: ");
        anapara = scanner.nextInt();
        System.out.print("Kaç yıl vadeliye yatıracaksınız: ");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faiz = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplampara = (toplampara * faiz) + toplampara;

            System.out.println(i + " . yıl sonunda toplam para: " + toplampara);
        }
    }
}
