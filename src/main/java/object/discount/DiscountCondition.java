package object.discount;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening);
}
