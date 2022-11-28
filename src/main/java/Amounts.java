import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("amounts")
public class Amounts {
    @XStreamAlias("RetentionTotal")
    private String retentionTotal;
    @XStreamAlias("Postage")
    private String postage;
    @XStreamAlias("DeliveryCost")
    private String deliveryCost;
}
