import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("Main")
public class Main {
    @XStreamAlias("IdSendingPackage")
    private String idSendingPackage;
    @XStreamAlias("IdApp")
    private String idApp;
    @XStreamAlias("IncludedInArrayFlag")
    private String includedInArrayFlag;
    @XStreamAlias("IdArray")
    private String idArray;
    @XStreamAlias("PrintFormLink")
    private String printFormLink;
    @XStreamAlias("IsMirFlag")
    private String isMirFlag;
    @XStreamAlias("AppNumberAccountingPolicy")
    private String appNumberAccountingPolicy;
    @XStreamAlias("Number")
    private String number;
    @XStreamAlias("AppCompletionDate")
    private String appCompletionDate;
    @XStreamAlias("Month")
    private String month;
    @XStreamAlias("Quarter")
    private String quarter;
    @XStreamAlias("Year")
    private String year;
    @XStreamAlias("KFD")
    private String kFD;

}
