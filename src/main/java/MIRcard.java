import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MIRcard {
    @XStreamAlias("DateBirth")
    private String dateBirth;
    @XStreamAlias("Number")
    private String number;
    @XStreamAlias("PaymentTypeCode")
    private String paymentTypeCode;
}
