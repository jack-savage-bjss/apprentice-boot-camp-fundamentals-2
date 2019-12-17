package checkout;

import java.util.ArrayList;
import java.util.List;

class Checkout {
    private int total;
    private int numberOfA = 0;
    private int numberOfB = 0;
    public List<Offer> currentOffers = new ArrayList<>();
    private Receipt receipt = new Receipt();

    {
        currentOffers.add(new Offer(5,30));
    }

    void scan(String sku) {
        if ("A".equals(sku)) {
            total += 50;
            if (++numberOfA % 5 == 0) {
                total -= 30;
            }
            receipt.scannedA();
        } else if ("B".equals(sku)) {
            total += 30;
            if (++numberOfB % 2 == 0) {
                total -= 15;
            }
            receipt.scannedB();
        } else if ("C".equals(sku)) {
            total += 20;
            receipt.scannedC();
        } else if ("D".equals(sku)) {
            total += 15;
            receipt.scannedD();
        }
    }

    int total() {
        return total;
    }

    String receipt() {
        return receipt.text();
    }
}
