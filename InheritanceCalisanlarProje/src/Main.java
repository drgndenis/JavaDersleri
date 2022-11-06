import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Superclass and SubClass Project");
        System.out.println("********************************");
        System.out.println("--------------------------------");

        String islemler = "İşlemler...\n"
                + "1. Yazılımcı işlemleri\n"
                + "2. Yönetici işlemleri\n"
                + "Çıkış için q tuşuna basınız..";

        while (true) {
            System.out.println("********************************");
            System.out.println(islemler);
            System.out.println("********************************");

            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Sistemden çıkılıyor....");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Denis","Dragan","IT",24,9700,"Java,Python,C#,Flutter");

                String yazilimci_islemleri = "1. Format at\n"
                        + "2. Bilgileri Göster\n"
                        + "Yazılımcı işlemlerinden çıkmak için q tuşuna basınız";
                System.out.println(yazilimci_islemleri);

                while (true) {
                    System.out.print("Bir işlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkış yapılıyor..");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        yazilimci.formatAt();
                    }
                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz...");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Beyza","Gezer","Database Manager",21,13750,12);

                String yonetici_islemleri = "1. Zam yap\n"
                        + "2. Bilgileri Göster\n"
                        + "Yönetici işlemlerinden çıkış yapmak için q tuşuna basınız";
                System.out.println(yonetici_islemleri);

                while (true) {
                    System.out.print("Bir işlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkış yapılıyor..");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Zam miktarı: ");
                        int zam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                    }
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz...");
                    }
                }
            }
            else {
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz...");
            }
        }
    }
}