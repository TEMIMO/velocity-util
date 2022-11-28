import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XStreamAlias("Information")
public class Information {
    @XStreamAlias("OrganizationName")
    private String organizationName;
    @XStreamAlias("OrganizationPostalAddress")
    private String organizationPostalAddress;
    @XStreamAlias("PayoutCode")
    private String payoutCode;
    @XStreamAlias("IncomeTypeCode")
    private String incomeTypeCode;
    @XStreamAlias("KBKIncome")
    private String kBKIncome;
    @XStreamAlias("TypeOperation")
    private String typeOperation;
    @XStreamAlias("PaymentDate")
    private String paymentDate;
    @XStreamAlias("DeliveryDate")
    private String deliveryDate;
    @XStreamAlias("MonetaryUnit")
    private String monetaryUnit;
    @XStreamAlias("MonetaryUnitCodeOKEI")
    private String monetaryUnitCodeOKEI;
    @XStreamAlias("MethodTransferringFunds")
    private String methodTransferringFunds;
}
