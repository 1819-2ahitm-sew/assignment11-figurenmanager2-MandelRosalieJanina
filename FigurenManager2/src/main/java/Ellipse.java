public class Ellipse extends Figur {

    double hauptAchse;
    double  nebenAchse;



    public Ellipse(double  hauptachse,double  nebenachse){
        this.hauptAchse = hauptachse;
        this.nebenAchse = nebenachse;

    }

    @Override
    double flaeche() {
        return Math.PI * hauptAchse *nebenAchse;
    }
    @Override
    double umfang() {
        return Math.PI * (hauptAchse + nebenAchse) * ( 1 + 3 *((hauptAchse - nebenAchse) / (hauptAchse + nebenAchse)
                * (hauptAchse - nebenAchse) / (hauptAchse + nebenAchse)) / (10 + Math.sqrt(4 - 3 * ((hauptAchse - nebenAchse)
                / (hauptAchse + nebenAchse) * (hauptAchse - nebenAchse) / (hauptAchse + nebenAchse)))));
    }
    @Override
    void output() {
        System.out.println("Ellipse mit Hauptachse "+this.hauptAchse+" und Nebenachse "+this.nebenAchse+": Fläche -> "+flaeche()+", Umfang "+umfang());
    }
}
