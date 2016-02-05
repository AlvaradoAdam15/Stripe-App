package adam.dam2.iesebre.com.stripeapp.interfaces;

public interface PaymentForm {
    public String getCardNumber();
    public String getCvc();
    public Integer getExpMonth();
    public Integer getExpYear();
    public String getCurrency();
}
