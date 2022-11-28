import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("PurposePayment")
public class PurposePayment {
    @XStreamAlias("RetentionType")
    private String retentionType;
    @XStreamAlias("DocumentName")
    private String documentName;
    @XStreamAlias("DocumentNumber")
    private String documentNumber;
    @XStreamAlias("Date")
    private String date;
}
