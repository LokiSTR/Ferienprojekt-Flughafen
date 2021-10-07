public class Terminal {
    //Deklaration des Arrays
    static Airline[] _airlines;

    //Deklaration der Klassenvariablen
    String _name;
    Airline _airline;

    //Konstruktor
    public Terminal(String name){
        this.setName(name);
    }

    //Setter
    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    public void setName(String name) {
        this._name = name;
    }

    //Getter
    public Airline getAirline() {
        return _airline;
    }
    public String getName() {
        return _name;
    }

    //Ermöglicht das Array
    public static Airline[] getAllAirlines(){
        return _airlines;
    }
}
