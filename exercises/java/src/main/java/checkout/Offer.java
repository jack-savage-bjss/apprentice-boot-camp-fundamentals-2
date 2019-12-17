package checkout;

public class Offer {

    private Integer multipleAppliedTo;
    private Integer discountAmount;

    public Offer(Integer multipleAppliedTo, Integer discountAmount) {
        this.multipleAppliedTo = multipleAppliedTo;
        this.discountAmount = discountAmount;
    }

    public Integer getDiscountValue() {
        return discountAmount;
    }

    public Integer getMultipleAppliedTo() {
        return multipleAppliedTo;
    }


}
