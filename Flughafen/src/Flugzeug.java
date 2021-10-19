public class Flugzeug {
    //Deklaration der Klassenvariablen
    String _nummer;
    String _hersteller;
    Airline _name;
    int _maxPassagiere;


    //Konstruktor
    public Flugzeug(String hersteller, String nummer, Airline name){
        this.setHersteller(hersteller);
        this.setNummer(nummer);
        this.setName(name);
    }

    //Setter
    public void setNummer(String nummer) {
        this._nummer = nummer;
    }
    public void setHersteller(String hersteller) {
        this._hersteller = hersteller;
    }
    public void setName(Airline name) {
        this._name = name;
    }
    public void setMaxPassagiere(int maxPassagiere) {
        this._maxPassagiere = maxPassagiere;
    }
    

    //Getter
    public String getNummer() {
        return _nummer;
    }
    public String getHersteller() {
        return _hersteller;
    }
    public Airline getName() {
        return _name;
    }
    public int getMaxPassagiere() {
        return _maxPassagiere;
    }
}
