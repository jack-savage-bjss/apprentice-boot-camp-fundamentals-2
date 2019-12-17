package billing;

import static billing.CustomerType.*;

public class Billing {
    private Double baseCostPerAdForDealer = 50.0;
    private Double baseCostPerAdForPrivateSeller = 20.0;
    private Double costPerProductPerAd = 10.0;

    public Double generateBill(Customer customer) {
        Double bill = 0.0;
        CustomerType customerType = customer.getCustomerType();
        Integer numOfAds = customer.getNumberOfAds();
        Integer numOfProducts = customer.getNumberOfProducts();

        bill += (numOfProducts * numOfAds * costPerProductPerAd);
        if(customerType.equals(DEALER)) {
            bill += (numOfAds * baseCostPerAdForDealer);
            return bill;
        }
        bill += (numOfAds * baseCostPerAdForPrivateSeller);
        return bill;
    }
}