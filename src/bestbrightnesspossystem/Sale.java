
package bestbrightnesspossystem;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private int saleId;
    private double totalAmount;
    private double amountTendered;
    private double changeGiven;
    private String paymentMethod;
    private List<SaleItem> items = new ArrayList<>();

    public Sale() {
    }

    public Sale(double totalAmount, double amountTendered, double changeGiven, String paymentMethod) {
        this.totalAmount = totalAmount;
        this.amountTendered = amountTendered;
        this.changeGiven = changeGiven;
        this.paymentMethod = paymentMethod;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAmountTendered() {
        return amountTendered;
    }

    public void setAmountTendered(double amountTendered) {
        this.amountTendered = amountTendered;
    }

    public double getChangeGiven() {
        return changeGiven;
    }

    public void setChangeGiven(double changeGiven) {
        this.changeGiven = changeGiven;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<SaleItem> getItems() {
        return items;
    }

    public void addItem(SaleItem item) {
        items.add(item);
    } 
}
