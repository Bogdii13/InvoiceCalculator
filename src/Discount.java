public class Discount implements PrincingStrategy{

//aplication discount

    private double discount;
    public Discount(double discount) {
        this.discount = discount;
    }



    @Override
    public double calculate(double amount) {
        return amount-discount;
    }
}
