import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private List<String> items;
    private double total;

    public static class InvoiceBuilder {
        private List<String> items = new ArrayList<>();
        private double total;

        public InvoiceBuilder addItem (String item, double price) {
            items.add(item + " - " + price + " RON");
            total+=price;
            return this;
        }

        public Invoice build() {
            return new Invoice(this);
        }

    }


    //constructor private
    private Invoice(InvoiceBuilder builder) {
        this.items = builder.items;
        this.total = builder.total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "items=" + items +
                ", total=" + total +
                '}';
    }
}
