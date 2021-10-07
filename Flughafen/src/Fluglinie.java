public class Fluglinie {
    //Deklaration des Arrays
    static Airline[] _airline;

    //Deklaration der Klassenvariablen
    String _fluglinienname;
    Airline _name;

    //Konstruktor
    public Fluglinie(String fluglinienname, Airline name){
        this.setFlugliniename(fluglinienname);
        this.setName(name);
    }

    //Setter
    public void setFlugliniename(String fluglinienname) {
        this._fluglinienname = fluglinienname;
    }
    public void setName(Airline name) {
        this._name = name;
    }

    //Getter
    public String getFlugliniename() {
        return _fluglinienname;
    }
    public Airline getName() {
        return _name;
    }

    //Ermöglicht das Array
    public static Airline[] getAllAirlines(){
        return _airline;
    }
}
