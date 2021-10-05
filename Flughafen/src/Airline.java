public class Airline {
    //Deklaration der Arrays
    static Flugzeug[] _flugzeuge;
    static Fluglinie[] _fluglinien;

    //Deklaration der Klassenvariablen
    String _name;
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;

    //Setter
    public void setFluglinie(Fluglinie fluglinie) {
        this._fluglinie = fluglinie;
    }
    public void setFlugzeug(Flugzeug flugzeug) {
        this._flugzeug = flugzeug;
    }
    public void setName(String name) {
        this._name = name;
    }

    //Getter
    public Fluglinie getFluglinie() {
        return _fluglinie;
    }
    public Flugzeug getFlugzeug() {
        return _flugzeug;
    }
    public String getName() {
        return _name;
    }

    //Ermöglicht die Arrays
    public static Flugzeug[] getAllFlugzeuge(){
        return _flugzeuge;
    }
    public static Fluglinie[] getAlFluglinien(){
        return _fluglinien;
    }
}