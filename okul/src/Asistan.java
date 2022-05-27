public class Asistan extends akademisyen {
    private String YuksekLisans;
    public void lablaragir(){
     System.out.println("Asistan laba girdi");
    }
    public void quizlerioku(){
        System.out.println("Asitan quizleri okuyor");
    }

    public String getYuksekLisans() {
        return YuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        YuksekLisans = yuksekLisans;
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
