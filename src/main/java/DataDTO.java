import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.math.BigDecimal;

// Можно написать DTO собственной XML и привести сразу к типу класса без Entry Converterа
// (21 строка VelocityConvertera)
@XStreamAlias("payreg")
public class DataDTO {
    @XStreamAlias("payregNum")
    private String payregNum;
    @XStreamAlias("deliveryOrg")
    private String deliveryOrg;
    @XStreamAlias("month")
    private String month;
    @XStreamAlias("year")
    private BigDecimal year;
    @XStreamAlias("tofName")
    private String tofName;
    @XStreamAlias("agreementNum")
    private String agreementNum;
    @XStreamAlias("agreementDate")
    public String agreementDate;
    @XStreamAlias("payregType")
    private String payregType;
    @XStreamAlias("payregDate")
    public String payregDate;
    @XStreamAlias("paymentOrderNum")
    private String paymentOrderNum;
    @XStreamAlias("paymentOrderDate")
    public String paymentOrderDate;
    @XStreamAlias("totalSum")
    private Double totalSum;
    @XStreamAlias("count")
    private Long count;
    @XStreamAlias("tofHeadPosition")
    private String tofHeadPosition;
    @XStreamAlias("tofHeadFio")
    private String tofHeadFio;
    @XStreamAlias("departmentHeadPosition")
    private String departmentHeadPosition;
    @XStreamAlias("departmentHeadFio")
    private String departmentHeadFio;

    @XStreamAlias("recipients")
    private Recipients recipients;


    public String getPayregNum() {
        return payregNum;
    }

    public void setPayregNum(String payregNum) {
        this.payregNum = payregNum;
    }

    public String getDeliveryOrg() {
        return deliveryOrg;
    }

    public void setDeliveryOrg(String deliveryOrg) {
        this.deliveryOrg = deliveryOrg;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getYear() {
        return year;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    public String getTofName() {
        return tofName;
    }

    public void setTofName(String tofName) {
        this.tofName = tofName;
    }

    public String getAgreementNum() {
        return agreementNum;
    }

    public void setAgreementNum(String agreementNum) {
        this.agreementNum = agreementNum;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getPayregType() {
        return payregType;
    }

    public void setPayregType(String payregType) {
        this.payregType = payregType;
    }

    public String getPayregDate() {
        return payregDate;
    }

    public void setPayregDate(String payregDate) {
        this.payregDate = payregDate;
    }

    public String getPaymentOrderNum() {
        return paymentOrderNum;
    }

    public void setPaymentOrderNum(String paymentOrderNum) {
        this.paymentOrderNum = paymentOrderNum;
    }

    public String getPaymentOrderDate() {
        return paymentOrderDate;
    }

    public void setPaymentOrderDate(String paymentOrderDate) {
        this.paymentOrderDate = paymentOrderDate;
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Double totalSum) {
        this.totalSum = totalSum;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getTofHeadPosition() {
        return tofHeadPosition;
    }

    public void setTofHeadPosition(String tofHeadPosition) {
        this.tofHeadPosition = tofHeadPosition;
    }

    public String getTofHeadFio() {
        return tofHeadFio;
    }

    public void setTofHeadFio(String tofHeadFio) {
        this.tofHeadFio = tofHeadFio;
    }

    public String getDepartmentHeadPosition() {
        return departmentHeadPosition;
    }

    public void setDepartmentHeadPosition(String departmentHeadPosition) {
        this.departmentHeadPosition = departmentHeadPosition;
    }

    public String getDepartmentHeadFio() {
        return departmentHeadFio;
    }

    public void setDepartmentHeadFio(String departmentHeadFio) {
        this.departmentHeadFio = departmentHeadFio;
    }

    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }
}

