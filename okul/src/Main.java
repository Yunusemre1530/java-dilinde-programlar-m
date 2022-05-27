import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("Akademisyan günlük ücreti ne kadar");
        int akademisyen_yev=giris.nextInt();
        System.out.println("memur günlük ücreti ne kadar");
        int memur_yev=giris.nextInt();
        System.out.println("Asistan günlük ücreti ne kadar");
        int asisyan_yev=giris.nextInt();
        System.out.println("Ogretmen günlük ücreti ne kadar");
        int ogretmen_yev=giris.nextInt();
        System.out.println("Guvenlik gorevlisi günlük ücreti ne kadar");
        int guvenlik_yev=giris.nextInt();
        System.out.println("Bilgi islem günlük ücreti ne kadar");
        int bilgiislem_yev=giris.nextInt();
        System.out.println("Kac Akademisyen vardir");
        int akademisyen_sayi=giris.nextInt();
        System.out.println("Kac Memur vardir");
        int memur_sayi=giris.nextInt();
        System.out.println("Kac Asistan vardir");
        int asisyan_sayi=giris.nextInt();
        System.out.println("Kac Ogretmen vardir ");
        int ogretmen_sayii=giris.nextInt();
        System.out.println("Kac Guvenlik gorevlisi vardir");
        int guvenlik_sayi=giris.nextInt();
        System.out.println("Kac Bilgi islem vardir");
        int bilgiislem_sayi=giris.nextInt();
        akademisyen akademisyen[]=new akademisyen[akademisyen_sayi];
        for (int i=0;i<akademisyen_sayi;i++){
            akademisyen[i]= new akademisyen();

        }


    }
}