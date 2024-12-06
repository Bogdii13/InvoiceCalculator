public class PriceCalculator {
    private PrincingStrategy princingStrategy;

    public PriceCalculator(PrincingStrategy princingStrategy) {
        this.princingStrategy = princingStrategy;
    }

    public double calculateFinalPrice(double amount){
        return princingStrategy.calculate(amount);
    }
}
