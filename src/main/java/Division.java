import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("Division")
public class Division {
    @XStreamAlias("TEName")
    private String tEName;
    @XStreamAlias("KTOPFR")
    private String kTOPFR;
    @XStreamAlias("Subdivision")
    private String subdivision;
    @XStreamAlias("KSP")
    private String kSP;
    @XStreamAlias("FIOHeadTE")
    private String fIOHeadTE;
    @XStreamAlias("PositionHeadTE")
    private String positionHeadTE;
    @XStreamAlias("FIOHeadSP")
    private String fIOHeadSP;
    @XStreamAlias("PositionHeadSP")
    private String positionHeadSP;
    @XStreamAlias("FIOPerformer")
    private String fIOPerformer;
    @XStreamAlias("PositionPerformer")
    private String positionPerformer;
    @XStreamAlias("Telephone")
    private String telephone;
}
