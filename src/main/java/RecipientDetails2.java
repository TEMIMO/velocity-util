import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("RecipientDetails")
public class RecipientDetails2 {
    @XStreamAlias("INN")
    private String iNN;
    @XStreamAlias("KPP")
    private String kPP;
    @XStreamAlias("BankAccountNumber")
    private String bankAccountNumber;
}
