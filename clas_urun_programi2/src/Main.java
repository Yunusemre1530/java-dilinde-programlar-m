public class Main {
    public static void main(String[] args){
        urun esya=new urun();
        esya.setAd("laptob");
        esya.setFiyat(14500);
        esya.setId(985242121);
        esya.setRenk("beyaz");
        urun_yonetimi yonetim=new urun_yonetimi();
        yonetim.ekle(esya);
        System.out.println(esya.getKod());
    }
}
