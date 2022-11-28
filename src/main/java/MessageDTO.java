import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("Message")
public class MessageDTO {
    @XStreamAlias("Main")
    private Main main;
    @XStreamAlias("Division")
    private Division division;
    @XStreamAlias("Information")
    private Information information;
    @XStreamAlias("RecipientDetails")
    private RecipientDetails recipientDetails;
    @XStreamAlias("RecipientBankDetails")
    private RecipientBankDetails recipientBankDetails;
    @XStreamAlias("Table")
    private Table table;
}
