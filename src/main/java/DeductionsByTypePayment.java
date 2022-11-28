import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("DeductionsByTypePayment")
public class DeductionsByTypePayment {
    @XStreamAlias("Type")
    private String Type;
    @XStreamAlias("DeliveryDocumentUID")
    private String DeliveryDocumentUID;
    @XStreamAlias("IncomeTypeCode")
    private String incomeTypeCode;
    @XStreamAlias("PersonInfo")
    private PersonInfo personInfo;
    @XStreamAlias("amounts")
    private Amounts amounts;
    @XStreamAlias("PurposePayment")
    private PurposePayment purposePayment;
    @XStreamAlias("Recoverer")
    private Recoverer recoverer;

}
