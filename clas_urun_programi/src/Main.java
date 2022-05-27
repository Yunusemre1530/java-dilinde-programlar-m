public class Main {
    public static void main(String[] args){
        urun esya=new urun();
        esya.ad="laptob";
        esya.fiyat=14500;
        esya.id=1;
        esya.renk="beyaz";
        urun_yonetimi yonetim=new urun_yonetimi();
        yonetim.ekle(esya);
    }
}
