import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        kitap book= new kitap();
        System.out.println("kitabin adini giriniz: ");
        book.kitap_adi= giris.next();
        System.out.println("kitabin turunu giriniz: ");
        book.kitap_turu=giris.next();
        System.out.println("kitabin sayfa sayisini giriniz: ");
        book.sayfa_sayisi=giris.nextInt();
        System.out.println("yazarin adinini giriniz: ");
        book.yazar_adi=giris.next();
        System.out.println("Kitabin adi: "+ book.kitap_adi+"\nKitabin turu: "+ book.kitap_turu);
        System.out.println("Kitabin sayfa sayisi: "+ book.sayfa_sayisi +"\nKitabin yazarinin adi: "+ book.yazar_adi);
    }
}
