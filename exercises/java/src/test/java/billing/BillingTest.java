package billing;

import org.junit.Test;

import static billing.CustomerType.DEALER;
import static billing.CustomerType.PRIVATE;
import static org.assertj.core.api.Assertions.assertThat;

public class BillingTest {

    Billing billing = new Billing();
    Double billAmount;

    @Test
    public void dealerWithOneAdNoProducts() {
        Customer customer = new Customer(DEALER, 1, 0);

        billAmount = billing.generateBill(customer);

        assertThat(billAmount).isEqualTo(50.0);
    }

    @Test
    public void dealerWithOneAdOneProduct() {
        Customer customer = new Customer(DEALER, 1, 1);

        billAmount = billing.generateBill(customer);

        assertThat(billAmount).isEqualTo(60.0);
    }

    @Test
    public void dealerWith20AdsOneProduct() {
        Customer customer = new Customer(DEALER, 20, 1);

        billAmount = billing.generateBill(customer);

        assertThat(billAmount).isEqualTo(1200.0);
    }

    @Test
    public void privateSellerWith3AdsNoProducts() {
        Customer customer = new Customer(PRIVATE, 3, 0);

        billAmount = billing.generateBill(customer);

        assertThat(billAmount).isEqualTo(60.0);
    }

    @Test
    public void privateSeller1Ad1Product() {
        Customer customer = new Customer(PRIVATE, 1, 1);

        billAmount = billing.generateBill(customer);

        assertThat(billAmount).isEqualTo(30.0);
    }
}