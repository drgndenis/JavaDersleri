public class Yazilimci extends Calisan{
    private String programlama_dilleri;

    public Yazilimci(String isim, String soyad, String departman, int yas, int maas, String programlama_dilleri) {
        super(isim, soyad, departman, yas, maas);
        this.programlama_dilleri = programlama_dilleri;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(getIsim() + " 'in bildiği Programlama Dilleri: " + programlama_dilleri);
    }

    public void formatAt() {
        System.out.println(getIsim() + " bilgisayara format atıyor...");
    }
}
