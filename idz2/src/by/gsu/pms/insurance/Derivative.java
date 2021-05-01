package by.gsu.pms.insurance;

import by.gsu.pms.client.Client;

public class Derivative {
    AbstractInsurance insurance;
    Client client;

    public Derivative(Client client, AbstractInsurance insurance) {
        this.client = client;
        this.insurance = insurance;
    }

    public AbstractInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(AbstractInsurance insurance) {
        this.insurance = insurance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return this.client + ";" + this.insurance;
    }
}
