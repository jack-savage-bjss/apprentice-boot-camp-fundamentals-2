package checkout;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OfferTest {

    @Test
    public void returnsCorrectDiscountValue() {
        Offer offer = new Offer(5, 30);

        Integer result = offer.getDiscountValue();

        assertThat(result).isEqualTo(30);
    }

    @Test
    public void returnsCorrectMultipleAppliedToValue() {
        Offer offer = new Offer(5, 30);

        Integer result = offer.getMultipleAppliedTo();

        assertThat(result).isEqualTo(5);
    }
}