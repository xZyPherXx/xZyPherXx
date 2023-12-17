
public class LoanCar {

    private float price , downPaynment, installment , interestRate;

    public LoanCar(float car , float down , float month , float rate) {

        setCarPrice(car);
        setDownPayment(down);
        setInstallment(month);
        setInterestRate(rate);
    }

    public void setCarPrice(float car) {

        this.price = car;
    }
    
    public void setDownPayment(float down) {

        this.downPaynment= down;
    }

    public void setInstallment(float month) {

        this.installment = month;
    }
    
    public void setInterestRate(float rate) {

        this.interestRate = rate;
    }

    public float getCarPrice() {

        return this.price;
    }

    public float getDownPayment() {

        return this.downPaynment;
    }

    public float getInstallment() {

        return this.installment;
    }

    public float getInterestRate() {

        return this.interestRate;
    }

    public float downPaynment() {

        return getCarPrice() * (getDownPayment() / 100);
    }

    public float finance() {

        return getCarPrice() - downPaynment();
    }

    public float interestRate() {

        return getInterestRate() / 12;
    }

    public float interestAmount() {

        return finance() * (interestRate() / 100) * getInstallment();
    }

    public float net() {

        return finance() + interestAmount();
    }

    public float installment() {

        return net() / getInstallment();
    }

}