import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Verileri veritabanından çekmediğimiz için değişken olarak kod içine tanımlıyoruz ve karşılaştırmayı böyle yapıyoruz
        String kullanici = "Denis";
        int sifre = 1234;
        int hak = 3;

        System.out.println("Kullanıcı Giriş Sistemine Hoş Geldiniz");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kullanıcı adını giriniz: ");
            String k_kullanici = scanner.nextLine();
            System.out.print("Şifreyi giriniz: ");
            int s_sifre = scanner.nextInt();

            // Kullanıcıdan alınan değişkenler ile kod içindeki değişkenlerin karşılaştırılması
            if (kullanici.equals(k_kullanici) && sifre == s_sifre) {
                System.out.println("Giriş başarılı bir şekilde gerçekleşti");
                break;
            }
            // Kullanıcı adı yanlış şifre doğruysa
            else if (!kullanici.equals(k_kullanici) && sifre == s_sifre) {
                System.out.println("Kullanıcı adını yanlış girdiniz, lütfen tekrar deneyiniz...");
                hak -= 1;
            }
            // Kullanıcı adı doğru şifre yanlışsa
            else if (kullanici.equals(k_kullanici)) {
                System.out.println("Şifreyi yanlış girdiniz, lütfen tekrar deneyiniz...");
                hak -= 1;
            }
            // Kullanıcı adı ve şifre yanlışsa
            else {
                System.out.println("Kullanıcı adını ve şifreyi yanlış girdiniz, lütfen tekrar deneyiniz...");
                hak -= 1;
            }
            // 3 defa yanlış giriş yapıldığında hak adındaki değişekn 0'a eşit oluyor ve aşağıdaki if bloğu çalışıyor
            if (hak == 0) {
                System.out.println("Çok fazla yanlış giriş yaptınız, sistemden çıkılıyor...");
                // kullanıcının daha fazla giriş yapmak için hakkı kalmadığından break; komutu ile programı sonlandırıyoruz.
                break;
            }
        }
    }
}
