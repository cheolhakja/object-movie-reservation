package object.discount;

import object.Screening;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening);
}
