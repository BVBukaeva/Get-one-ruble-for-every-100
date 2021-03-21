public class OneRuble {
    public static void main(String[] args) {
       long on_account = 100;
       long replenishment_amount = 1100;
       long bonus_amount=0;
       if(replenishment_amount>1000){
           bonus_amount=replenishment_amount/100;
       }
       long total = on_account+replenishment_amount+bonus_amount;
        System.out.println(total);
    }
}
