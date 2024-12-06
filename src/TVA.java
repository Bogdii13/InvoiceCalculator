public class TVA  implements PrincingStrategy{

    //apliation TVA

    private double rate;
    public TVA(double rate){
        this.rate = rate;
    }


    @Override
    public double calculate(double amount) {
        return amount + (amount * rate/100);
    }
}
