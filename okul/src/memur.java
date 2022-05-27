public class memur extends calisan {
    private String Departman;
    private int Mesai;

    public void calis(){
     System.out.println("memur calisiyor");
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        this.Departman = departman;
    }

    public int getMesai() {
        return Mesai;
    }

    public void setMesai(int mesai) {
        this.Mesai = mesai;
    }
    public int maashesapla(){
        return getYevmiye()*30;
    }
}
