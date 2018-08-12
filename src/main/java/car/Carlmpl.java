package car;

public class Carlmpl implements Car {
    private  String company;

    public Carlmpl(String company) {

        this.company = company;

    }

    public void parent() {

        System.out.println("Hi I am Car");

    }

    public Car getFiat() {


        return new Carlmpl("Fiat");
    }

    @Override
    public String toString() {

        return company;
    }
}
