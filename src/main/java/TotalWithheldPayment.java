import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("TotalWithheldPayment")
public class TotalWithheldPayment {
    @XStreamAlias("AmountRetentionAll")
    private String amountRetentionAll;
    @XStreamAlias("Postage")
    private String postage;
    @XStreamAlias("DeliveryCost")
    private String deliveryCost;
}
