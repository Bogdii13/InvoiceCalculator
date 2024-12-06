public class Main {
    public static void main(String[] args) {
        //create a invoice with Builder Pattern
        Invoice invoice = new Invoice.InvoiceBuilder()
                .addItem("Laptop", 4000)
                .addItem("Mouse", 250)
                .addItem("Monitor", 1000)
                .addItem("Keyboard", 300)
                .build();

        System.out.println(invoice);

        //calculate the proice with Strategy Pattern
        PriceCalculator calculator = new PriceCalculator(new TVA(19));
        double finalPriceWithTVA = calculator.calculateFinalPrice(5550);
        System.out.println("Price with TVA: " + finalPriceWithTVA + " RON");

        calculator = new PriceCalculator(new Discount(500));
        double finalPriceWithDiscount = calculator.calculateFinalPrice(5550);
        System.out.println("Price with Discount: " + finalPriceWithDiscount + " RON");




    }
}