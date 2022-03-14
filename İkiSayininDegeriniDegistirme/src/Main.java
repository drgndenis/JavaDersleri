import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Bu programı biraz oyunlaştırmak istedim, program normalde 22. satırdaki kod ile son bulabilir.

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları alma
        System.out.print("Birinci sayıyı giriniz: ");
        int first = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int second = scanner.nextInt();

        // Sayıların yerlerini degistirmek için oluşturulan int veri tipindeki değişken
        int gecici = first;
        first = second;
        second = gecici;
        // dummy kullanımı
        scanner.nextLine();

        System.out.println("Girdiğiniz ilk sayı: " + first + " ikinci sayı: " + second);
        // Sayıların doğruluğunu kullanıcı tarafından doğrulanması
        System.out.print("Girilen işlem doğru mu? (e/h) ");
        String islem = scanner.nextLine();

        // döngü true olduğu müddetçe while içindekiler ekrana yazılmaya devam edecek (her hangi bir durdurma komutu ile karşılaşmazsa
        while (true){
            // Kullanıcı son sorulan soruda e değerini girdiyse
            if (islem.equals("e")) {
                System.out.println("Tamamdır bir sorun yok :)");
                // break komutu ile birlikte if bloğunun içinden çıkıyoruz ve böylelikle while döngüsü sonlanıp program duruyor.
                break;
            }
            // Kullanıcı son sorulan soruda h değerini girdiyse
            else if (islem.equals("h")){
                System.out.println("Anlaşılan bir sorun var hemen düzeltiyorum....");

                /* Kullanıcıdan girilen ilk sayının int veri tipindeki second adındaki değişkenin olup olmadığı soruluyor
                Burada önemli olan durum biz first ve second adında kullanıcıdan aldığımız değerleri değiştirmiştik.
                Bu yüzden kullanıcıdan aldığımız ilk değer yani first adındaki değişkene 15, seconda ise 20 girdiysek
                yerleri değiştiğinden dolayı int first = 20, second = 15 olmuş oluyor. Aşağıda ise
                kullanıcıya ilk girdiği sayının 15 olup olmadığı soruluyor
                */
                System.out.print("Girdiğin ilk sayı: " + second + " mı? (e/h) ");
                String secenek = scanner.nextLine();

                // Kullanıcı sorulan soruya e yanıtı verdiğinde aşağıdaki if bloğu çalışır
                if (secenek.equals("e")) {
                    System.out.println("O zaman girdiğin ilk sayı: " + first + " ikinci sayı: " + second);
                }
                // Kullanıcı sorulan soruya h yanıtı verdiğinde aşağıdaki if else bloğu çalışır
                else if (secenek.equals("h")) {
                    System.out.println("Düzeltmeleri hemen yapıyorum...");
                    // Ekranda 2 saniyelik bekleme süresi
                    Thread.sleep(2000);

                    /* Burada kullanıcının sırası ile sayıları girdiği gibi kullanıcıya gösteriliyor ve sırasının
                    doğru olup olmadığı soruluyor
                     */
                    System.out.print("Girdiğin ilk sayı: " + second + " ikinci sayı: " + first + " doğru mu?(e/h) ");
                    String secenek2 = scanner.nextLine();

                    if (secenek2.equals("e")){
                        System.out.println("Sonunda doğru cevaba ulaştık :)");
                        break;
                    }
                    // doğru değerler verildiği halde kullanıcı h ifadesini girerse program burada son buluyor :)
                    else if (secenek2.equals("h")) {
                        System.out.println("Ciddi olamazsın...");
                        Thread.sleep(2000);
                        System.out.println("Bugün fazlası ile yoruldum sonra tekrar deneyilim... ZzZzZzZzZzZz");
                        break;
                    }
                    // Kullanıcının e ve h ifadeleri dışında bir değer girdiğinde çalışacak blok
                    else {
                        System.out.println("Yanlış değer girdin!");
                    }
                }
                else {
                    System.out.println("Yanlış bir değer girdin!");
                }
            }
            else {
                System.out.println("Yanlış değer girdin!");
            }
        }
    }
}
