import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@XStreamAlias("Payments")
public class Payments {
    @XStreamAlias("PaymentType")
    private PaymentType paymentType;
    @XStreamImplicit(itemFieldName = "DeductionsByTypePayment")
    private List deductionsByTypePayment = new ArrayList();
    @XStreamAlias("TotalWithheldPayment")
    private TotalWithheldPayment totalWithheldPayment;
}
