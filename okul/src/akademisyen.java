public class akademisyen extends calisan{
    private String bolum;
    private String gorev;
    private String dersler;

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public String getDersler() {
        return dersler;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
