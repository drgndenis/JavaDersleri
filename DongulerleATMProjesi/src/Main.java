import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        System.out.println("***** Alkbank ATM'sine Hoş Geldiniz *****");
        // Ekrana yazdıracağımız islemler
        String islemler = "1. Bakiye Görüntüleme\n"
                + "2. Para çekme\n"
                + "3. Para yatırma\n"
                + "Çıkış yapmak için q tuşuna basınız.";
        System.out.println(islemler);

        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            // Kulanıcının işlem seçimi
            String secim = scanner.nextLine();

            /* String ifadelerde karşılaştırma yaparken == ifadesi kullanılmaz, bunun yerine equals kullanılır.
            equals değerleri karşılaştırırken, String bir ifade de == kullandığımız zaman o String ifadelerin bellekte
            nerede bulunduğunu kıyaslıyor.
            */
            if (secim.equals("q")) {
                System.out.println("İşlem sonlandırılıyor..");
                break;
            }
            else if (secim.equals("1")) {
                System.out.println("Hesabınızda bulunan bakiye: " + bakiye);
            }
            else if (secim.equals("2")) {
                System.out.print("Hesabınızdan çekmek istediğiniz miktar: ");
                int miktar = scanner.nextInt();
                scanner.nextLine();

                // Girilen miktar bakiyeden büyük olursa
                if (miktar > bakiye) {
                    System.out.println("Yeterli bakiyeniz bulunmamaktadır. Lütfen bakiyenizi kontrol ediniz..");
                }
                else {
                    // Girilen miktarın bakiyeden azaltılması
                    bakiye -= miktar;
                    System.out.println("Çekme işlemi başarılı bir şekilde gerçekleşti, hesap bakiyenizi kontrol ediniz..");
                }
            }
            else if (secim.equals("3")) {
                System.out.print("Hesabınıza yatırmak istediğiniz miktar: ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                // Yatırılan miktarın bakiyeye eklenmesi
                bakiye += miktar;
                System.out.println("Hesap bakiyeniz güncellenmiştir, bakiye görüntüleme kısmındna kontrol edebilirsiniz..");
            }
            else {
                System.out.println("Yanlış giriş yaptınız, lütfen tekrar deneyiniz.");
            }
        }
    }
}
