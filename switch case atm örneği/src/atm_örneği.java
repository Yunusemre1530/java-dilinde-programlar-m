import java.util.Scanner;


public class atm_�rne�i {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Bakiye=8000;
	System.out.println("1- Bakiye sorgulama");
	System.out.println("2- Para �ekme");
	System.out.println("3- Para yat�rma");
	System.out.println("4- havale yapma");
	System.out.println("i�lem se�iniz");
	int islem=scan.nextInt();
	switch(islem){
	case 1:
		System.out.println("Bakiyeniz: "+ Bakiye);
		break;
	case 2:
		System.out.println("Ka� para �ekeceksiniz?");
		int para=scan.nextInt();
		if(para>Bakiye){
			System.out.println("i�lem ger�ekle�medi");
		}
		else{
			Bakiye-=para;
			System.out.println("i�lem ba�ar�l�... Bakiyeniz: "+ Bakiye);
			}
		break;
	case 3:
		System.out.println("ka� para yat�racaks�n�z?");
		int para1=scan.nextInt();
		Bakiye+=para1;
		System.out.println("i�lem ba�ar�l� Bakiyeniz: "+ Bakiye);
		break;
	
	case 4:
		System.out.println("Havale etmek istedi�iniz tutar");
		int para2=scan.nextInt();
		if(para2>Bakiye){
			System.out.println("i�lem ger�ekle�medi");
		}
		else{
			Bakiye-=para2;
			System.out.println("i�lem ba�ar�l� Bakiyeniz: "+ Bakiye);
			}
		break;
		default:
			System.out.println("Ge�ersiz i�lem..");
			
	}

}
}
