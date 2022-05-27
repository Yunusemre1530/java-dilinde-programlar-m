public class CustomerManager {
    private Baselogger logger;
    public CustomerManager(Baselogger logger){
        this.logger=logger;
    }
    public void Ekle(){
        System.out.println("musteri eklendi");
        this.logger.log("log mesaji");
    }

}
