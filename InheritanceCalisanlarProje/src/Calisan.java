public class Calisan {
    private String isim;
    private String soyad;
    private String departman;
    private int yas;
    private int maas;

    public Calisan(String isim, String soyad, String departman, int yas, int maas) {
        this.isim = isim;
        this.soyad = soyad;
        this.departman = departman;
        this.yas = yas;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Çalıştığı departman: " + departman);
        System.out.println("Maaş: " + maas);
    }
}
