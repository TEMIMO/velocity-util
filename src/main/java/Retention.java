import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("retention")
public class Retention {

    @XStreamAlias("rtntnKind")
    private String rtntnKind;
    @XStreamAlias("rtntnInfo")
    private String rtntnInfo;
    @XStreamAlias("rtntnSum")
    private String rtntnSum;

    public String getRtntnKind() {
        return rtntnKind;
    }

    public void setRtntnKind(String rtntnKind) {
        this.rtntnKind = rtntnKind;
    }

    public String getRtntnInfo() {
        return rtntnInfo;
    }

    public void setRtntnInfo(String rtntnInfo) {
        this.rtntnInfo = rtntnInfo;
    }

    public String getRtntnSum() {
        return rtntnSum;
    }

    public void setRtntnSum(String rtntnSum) {
        this.rtntnSum = rtntnSum;
    }
}

