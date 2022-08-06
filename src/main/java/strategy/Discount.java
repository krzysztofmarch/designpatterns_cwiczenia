package strategy;

import java.math.BigDecimal;

public interface Discount {
    BigDecimal calculateDiscount(BigDecimal price);
}
