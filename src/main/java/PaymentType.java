import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("PaymentType")
public class PaymentType {
    @XStreamAlias("StringCode")
    private String stringCode;
    @XStreamAlias("PaymentName")
    private String paymentName;
    @XStreamAlias("ExpenseCode")
    private String expenseCode;
}
