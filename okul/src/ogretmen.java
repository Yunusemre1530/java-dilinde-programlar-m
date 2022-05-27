public class ogretmen extends akademisyen {
    String unvan;
    public void toplantilaragir(){
      System.out.println("Ogretmen toplantiya girdi");
    }
    public void sinavlarioku(){
     System.out.println("Ogretmen sinavlari okuyor");
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
