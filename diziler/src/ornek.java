public class ornek {
    public static void main(String[] args){
        double[] sayilar={1.9,1.7,5.7,9.8};
        double toplam=0;
        double max=sayilar[0];
        for (double number:sayilar){
            toplam+=number;
            if (number>max){
                max=number;
            }
            System.out.println(number);
        }
        System.out.println("Ondalikli sayilarin toplami "+ toplam);
        System.out.println("Ondalikli sayilarin en büyüğü "+ max);
    }
}
