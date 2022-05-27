import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("kac kamyon gecti");
        int kamyon_sayi= giris.nextInt();
        System.out.println("kac kamyonetgecti");
        int kamyonet_sayi= giris.nextInt();
           kamyonet[] Kamyonet= new kamyonet[kamyonet_sayi];
        int sayi;
        String kelime;
        for (int i=0;i<kamyonet_sayi;i++){
            System.out.println(i+1+". Kamyonetin markasinin yilini agirligini ve modelini giriniz");
            Kamyonet[i]=new kamyonet();
            Kamyonet[i].setMarka(giris.next());
            Kamyonet[i].setYil(giris.nextInt());
            Kamyonet[i].setAgirlik(giris.nextInt());
            Kamyonet[i].setModel(giris.nextInt());
            System.out.println(i+1+". kamyonetin hizini giriniz");
            Kamyonet[i].setHiz(giris.nextInt());

        }
        Kamyon kamyon[]=new Kamyon[kamyon_sayi];
        for (int i=0;i<kamyon_sayi;i++){
            System.out.println(i+1+". Kamyonun markasinin yilini agirligini ve modelini giriniz");
            kamyon[i]=new Kamyon();
            kamyon[i].setMarka(giris.next());
            kamyon[i].setYil(giris.nextInt());
            kamyon[i].setAgirlik(giris.nextInt());
            kamyon[i].setModel(giris.nextInt());
            System.out.println(i+1+". kamyonun hizini giriniz");
            kamyon[i].setHiz(giris.nextInt());
        }
        taksi taksi=new taksi();
        int ceza=0;
        for (int i=0;i<kamyon_sayi;i++){
            kamyon[i].yazdir("kamyonun",i+1);
        }
        for (int i=0;i<kamyonet_sayi;i++){
            Kamyonet[i].yazdir("kamyonetin",i+1);
        }
        for (kamyonet kucukarac:Kamyonet){
            ceza+=kucukarac.cezahesapla();
        }
        for (Kamyon buyukarac:kamyon){
            ceza+= buyukarac.cezahesapla();
        }
        System.out.println("Bugunku toplam ceza "+ ceza);
    }

}