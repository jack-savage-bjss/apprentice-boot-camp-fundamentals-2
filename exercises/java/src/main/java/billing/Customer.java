package billing;

public class Customer {
    private CustomerType customerType;
    private Integer numberOfAds;
    private Integer numberOfProducts;

    public Customer(CustomerType customerType, Integer numberOfAds, Integer numberOfProducts) {
        this.customerType = customerType;
        this.numberOfAds = numberOfAds;
        this.numberOfProducts = numberOfProducts;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Integer getNumberOfAds() {
        return numberOfAds;
    }

    public Integer getNumberOfProducts() {
        return numberOfProducts;
    }
}
