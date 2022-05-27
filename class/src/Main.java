import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        dörtislem islem= new dörtislem();
        System.out.println("iki sayi giriniz ");
        int sayi1=giris.nextInt();
        int sayi2=giris.nextInt();
        System.out.println(sayi1+ " + " + sayi2+"="+ islem.topla(sayi1,sayi2));
        System.out.println(sayi1+ " / " + sayi2+"="+ islem.bol(sayi1,sayi2));
        System.out.println(sayi1+ " - " + sayi2+"="+ islem.cikar(sayi1,sayi2));
        System.out.println(sayi1+ " * " + sayi2+"="+ islem.carp(sayi1,sayi2));
    }
}
