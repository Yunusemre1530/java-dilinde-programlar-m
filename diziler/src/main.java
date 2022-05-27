public class main {
    public static void main(String[] args){
        String[] ogrenci = new String[3];
        ogrenci[0]="yunus emre";
        ogrenci[1]="fatma";
        ogrenci[2]="zehra-yasemim";
        for (int i=0;i< ogrenci.length;i++){
            System.out.println(i+1+ ". ogrenci "+ ogrenci[i]);
        }
        System.out.println("-----------------");
        for(String ogrenciler:ogrenci){
            System.out.println(ogrenciler);
        }
    }
}
