import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@XStreamAlias("Table")
public class Table {
    @XStreamImplicit(itemFieldName = "Payments")
    private List payments = new ArrayList();
    @XStreamAlias("AmountRetentionTotal")
    private String amountRetentionTotal;
    @XStreamAlias("PostageTotal")
    private String postageTotal;
    @XStreamAlias("DeliveryCostTotal")
    private String deliveryCostTotal;
}
