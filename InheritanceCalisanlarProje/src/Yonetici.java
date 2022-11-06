public class Yonetici extends Calisan{
    private int kadro_calisanlari;

    public Yonetici(String isim, String soyad, String departman, int yas, int maas, int kadro_calisanlari) {
        super(isim, soyad, departman, yas, maas);
        this.kadro_calisanlari = kadro_calisanlari;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı: " + kadro_calisanlari);
    }

    public void zamYap(int zam_miktari) {
        System.out.println(getIsim() + " çalışanlara " + zam_miktari + " ₺ kadar zam yaptı");
    }
}
