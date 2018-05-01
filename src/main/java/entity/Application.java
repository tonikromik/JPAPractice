package entity;

import javax.persistence.*;


@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sum;
    private String creditState;
    private String currency;

    @OneToOne
    private Client client;

    public Application() {
    }

    public Application(int sum, String creditState, String currency) {
        this.sum = sum;
        this.creditState = creditState;
        this.currency = currency;
    }

    public Application(int sum, String creditState, String currency, Client client) {
        this.sum = sum;
        this.creditState = creditState;
        this.currency = currency;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCreditState() {
        return creditState;
    }

    public void setCreditState(String creditState) {
        this.creditState = creditState;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", sum=" + sum +
                ", creditState='" + creditState + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
