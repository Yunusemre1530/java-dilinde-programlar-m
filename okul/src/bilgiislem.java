public class bilgiislem extends memur {
    private String gorev;
    public void tarama(){
        System.out.println("Taranıyor");
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
