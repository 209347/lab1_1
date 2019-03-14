package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Objects;

public class Discount {

    private String cause;

    private Money amount;

    Discount(Money amount, String cause) {
        this.cause = cause;
        this.amount = amount;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Discount discount = (Discount) o;
        return Objects.equals(cause, discount.cause) && Objects.equals(amount, discount.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cause, amount);
    }
}
