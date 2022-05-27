import java.util.Scanner;


public class atm_örneði {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int Bakiye=8000;
	System.out.println("1- Bakiye sorgulama");
	System.out.println("2- Para çekme");
	System.out.println("3- Para yatýrma");
	System.out.println("4- havale yapma");
	System.out.println("iþlem seçiniz");
	int islem=scan.nextInt();
	switch(islem){
	case 1:
		System.out.println("Bakiyeniz: "+ Bakiye);
		break;
	case 2:
		System.out.println("Kaç para çekeceksiniz?");
		int para=scan.nextInt();
		if(para>Bakiye){
			System.out.println("iþlem gerçekleþmedi");
		}
		else{
			Bakiye-=para;
			System.out.println("iþlem baþarýlý... Bakiyeniz: "+ Bakiye);
			}
		break;
	case 3:
		System.out.println("kaç para yatýracaksýnýz?");
		int para1=scan.nextInt();
		Bakiye+=para1;
		System.out.println("iþlem baþarýlý Bakiyeniz: "+ Bakiye);
		break;
	
	case 4:
		System.out.println("Havale etmek istediðiniz tutar");
		int para2=scan.nextInt();
		if(para2>Bakiye){
			System.out.println("iþlem gerçekleþmedi");
		}
		else{
			Bakiye-=para2;
			System.out.println("iþlem baþarýlý Bakiyeniz: "+ Bakiye);
			}
		break;
		default:
			System.out.println("Geçersiz iþlem..");
			
	}

}
}
