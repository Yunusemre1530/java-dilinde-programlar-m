public class calisan {
    private String ad;
    private String soyad;
    private String eposta;
    private float saat;

    private int yevmiye;

    public float cikis(int zaman){
        return getSaat();
    }
    public void giris(int zaman){
        setSaat(zaman);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        if(eposta.contains("@") || eposta.endsWith(".com")){
            System.out.println("hatalı e posta girisi");
        }
        else
        this.eposta = eposta;
    }

    public float getSaat() {
        return saat;
    }

    public void setSaat(float saat) {
        if (saat<00 || saat>24){
            System.out.println("lutfen doğru saati giriniz");
        }
        else
            this.saat = saat;
    }

    public int getYevmiye() {
        return yevmiye;
    }

    public void setYevmiye(int yevmiye) {
        this.yevmiye = yevmiye;
    }
}
