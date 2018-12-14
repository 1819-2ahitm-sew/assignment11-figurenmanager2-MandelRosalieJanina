public class Quadrat extends Figur {

    double length;


    public Quadrat(double length){
        this.length = length;

    }
    @Override
    double flaeche() {

        return this.length * this.length;
    }
    @Override
    double umfang() {
        return 4 * length;
    }
    @Override
    void output() {
        System.out.println("Quadrat mit Seitenlänge "+this.length+": Fläche -> "+flaeche()+", Umfang -> "+umfang());
    }
}
