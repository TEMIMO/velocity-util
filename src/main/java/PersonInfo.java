import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XStreamAlias("PersonInfo")
public class PersonInfo {
    @XStreamAlias("FIO")
    private String fIO;
    @XStreamAlias("Snils")
    private String snils;
    @XStreamAlias("INN")
    private String iNN;

}
