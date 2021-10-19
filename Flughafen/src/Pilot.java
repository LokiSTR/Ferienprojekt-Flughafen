public class Pilot {
    //Deklaration der Klassenvariablen
    String _vorname;
    String _nachname;
    static int _maxPiloten = 6;

    
    //Konstruktor
    public Pilot(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
    }

    //Setter
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    /*public void setMaxPiloten(int maxPiloten) {
        this._maxPiloten = maxPiloten;
    }*/

    //Getter
    public String getVorname() {
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public static int getMaxPiloten() {
        return _maxPiloten = 8;
    }
}
