public class Main {
    public static void main(String[] args){
    Baselogger[] baselogger = new Baselogger[]{new Databaselogger(),new Filelogger(),new Emaillogger(),new Consolelogger()};
    for (Baselogger baselogger1:baselogger){
        baselogger1.log("log mesaji");
    }
    CustomerManager customerManager=new CustomerManager(new Filelogger());
    customerManager.Ekle();
    }
}
