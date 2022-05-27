import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        System.out.println("Harf giriniz: ");
        String harf=giris.next();
        switch (harf){
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Girilen harf kalın harftir");
                break;
            default:
                System.out.println("Girilen harf ince harftir");
        }
    }
}
