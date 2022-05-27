import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi= giris.nextInt();
        int toplam=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+ " sayisi mukemmel sayidir ");
        }
        else {
            System.out.println(sayi+ " sayisi mukemmel sayi degildir ");
        }
    }
}
