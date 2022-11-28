import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("RecipientDetails")
public class RecipientDetails {
    @XStreamAlias("Type")
    private String type;
    @XStreamAlias("OrganizationName")
    private String organizationName;
    @XStreamAlias("OrganizationPostalAddress")
    private String organizationPostalAddress;
    @XStreamAlias("INN")
    private String iNN;
    @XStreamAlias("KPP")
    private String kPP;
    @XStreamAlias("OKTMO")
    private String oKTMO;
    @XStreamAlias("BankAccountNumber")
    private String bankAccountNumber;
}
