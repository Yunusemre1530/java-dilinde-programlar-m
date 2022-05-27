public class kamyonet extends taksi{
    public kamyonet(){
        
    }
 public kamyonet(String marka,int yil,int agirlik,int model){
     super(marka,yil,agirlik,model);
 }
 public int cezahesapla(){
     if (super.getHiz()>100){
         return (super.getAgirlik()*6/10)+(super.getHiz()*4/10);
     }
     else {
         return 0;
     }
   }
}

