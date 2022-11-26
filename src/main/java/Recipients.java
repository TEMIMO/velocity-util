import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("recipients")
public class Recipients {

    @XStreamImplicit(itemFieldName = "recipient")
    private List recipient = new ArrayList();

    public List getRecipient() {
        return recipient;
    }

    public void setRecipient(List recipient) {
        this.recipient = recipient;
    }
}


