public class Rechteck extends Figur {


    double length;
    double width;


    public Rechteck(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double flaeche() {
        return this.length * this.width ;
    }
    @Override
    double umfang() {
        return 2* this.length + 2* this.width;
    }
    @Override
    void output() {
        System.out.println("Rechteck mit Länge "+this.length+"und Breite "+this.width+" : Fläche -> "+flaeche()+", Umfang -> "+umfang());
    }
}
