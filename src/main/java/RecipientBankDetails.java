import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("RecipientBankDetails")
public class RecipientBankDetails {
    @XStreamAlias("Name")
    private String name;
    @XStreamAlias("BIC")
    private String bIC;
    @XStreamAlias("AccountNumber")
    private String accountNumber;
}
