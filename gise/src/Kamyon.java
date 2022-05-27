public class Kamyon extends taksi {
    public Kamyon(){

    }
    public Kamyon(String marka,int yil,int agirlik,int model){
        super(marka,yil,agirlik,model);
    }

    public int cezahesapla(){
        if (super.getHiz()>90){
            return (super.getAgirlik()*4/10)+(super.getHiz()*6/10);
        }
        else {
           return 0;
        }
    }
}
