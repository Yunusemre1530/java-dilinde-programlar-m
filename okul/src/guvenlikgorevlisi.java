public class guvenlikgorevlisi extends memur {
    private String belge;
    public void nobet(){
      System.out.println("Guvennlik gorevlisi gorev yerinde");
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
