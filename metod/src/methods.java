
public class methods {
	public static void ogrenci(String i,double d){
		System.out.println(i+" isimli ��rencinin puan� "+d);
	}
	public static void ogrenci(double yas){
		System.out.println("isimsiz ��rencinin puan� "+yas);
	}
	public static void main(String[] args) {
	ogrenci("yunus",3.60);
	ogrenci(3.48);

	}

}
