import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi=giris.nextInt();
        boolean kontrol=true;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                kontrol=false;
            }
        }
        if(kontrol==false){
            System.out.println(sayi+ " sayisi Asal degildir");
        }
        else {
            System.out.println(sayi+ " sayisi Asaldir");
        }
    }
}
