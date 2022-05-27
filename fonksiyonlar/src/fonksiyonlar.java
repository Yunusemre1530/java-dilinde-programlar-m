
public class fonksiyonlar {
	public static void faktoriyel(int a){ 
		int carpim=1;
		while(a>1){
			carpim=carpim*a;
			a--;
		}
		System.out.println("sonuc= "+ carpim);
	}

	public static void main(String[] args) {
		faktoriyel(10);

	}

}
