import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("retentions")
public class Retentions {

    @XStreamImplicit(itemFieldName = "retention")
    private List retention = new ArrayList();

    public List getRetention() {
        return retention;
    }

    public void setRetention(List retention) {
        this.retention = retention;
    }
}

