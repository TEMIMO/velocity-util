import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("Recoverer")
public class Recoverer {
    @XStreamAlias("Name")
    private String name;
    @XStreamAlias("Snils")
    private String snils;
    @XStreamAlias("UID")
    private String uID;
    @XStreamAlias("PostAddress")
    private String postAddress;
    @XStreamAlias("AccountNumber")
    private String accountNumber;
    @XStreamAlias("MIRcard")
    private MIRcard mIRcard;
    @XStreamAlias("RecipientDetails")
    private RecipientDetails2 recipientDetails;
}
