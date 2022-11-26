import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("payments")
public class Payments {

    @XStreamImplicit(itemFieldName = "payment")
    private List payment = new ArrayList();

    public List getPayment() {
        return payment;
    }

    public void setPayment(List payment) {
        this.payment = payment;
    }
}


