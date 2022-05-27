public class taksi{
    private String marka;
    private int yil;
    private int agirlik;
    private int model;

    private int id;
    private int hiz;
    public taksi(){

    }
    public taksi(String marka,int yil,int agirlik,int model){
        this.setMarka(marka);
        this.setYil(yil);
        this.setAgirlik(agirlik);
        this.setModel(model);
    }


    public String getMarka() {

        return this.marka;
    }

    public void setMarka(String marka) {

        this.marka = marka;
    }
    public void setHiz(int hiz){

        this.hiz=hiz;
    }
    public int getHiz(){

        return this.hiz;
    }
    public int getYil()
    {
        return this.yil;
    }

    public void setYil(int yil)
    {
        this.yil = yil;
    }

    public int getAgirlik() {

        return this.agirlik;
    }

    public void setAgirlik(int agirlik) {

        this.agirlik = agirlik;
    }

    public int getModel() {

        return this.model;
    }

    public void setModel(int model) {

        this.model = model;
    }

    public int getId() {

        return this.getModel()+ this.yil;
    }
    public void yazdir(String tür, int sayi){

        System.out.println(sayi+ "."+tür+" MARKASI "+this.getMarka()+" ARACIN YILI "+ this.getYil()+" ARACIN AGIRLIGI "+ this.getAgirlik()+
                "ARACIN MODELI"+ this.getModel()+" ARACIN HIZI "+ this.getHiz());
    }
}
