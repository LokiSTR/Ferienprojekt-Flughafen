public class Flug{
    //Übergabe der Klassenvariablen in Flug
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;
    Bahn _bahn;
    //Arraydeklaration
    Pilot[] _pilot;
    Passagier[]  _passagier;
    //Stringvarible
    String _startzeit;

    public void addPassagier(Passagier p){
        _passagier[0] = p;
    }

    //Getter (STRG + Leerzeichen = get eingeben)
    //Getter für String
    public String getStartzeit(){
        return _startzeit;
    }
    //Getter für Klassenvariablen
    public Flugzeug getFlugzeug(){
        return _flugzeug;
    }
    public Fluglinie getFluglinie(){
        return _fluglinie;
    }
    public Bahn getBahn(){
        return _bahn;
    }
    public Passagier[] getPassagier() {
        return _passagier;
    }
    public Pilot[] getPilot() {
        return _pilot;
    }
    //Setter (STRG + Leerzeichen = set eingeben)
    //Setter für String
    public void setStartzeit(String startzeit){
        _startzeit = startzeit;
    }
    //Setter für Klassenvariablen
    public void setFlugzeug(Flugzeug flugzeug){
        this._flugzeug = flugzeug;
    }
    public void setFluglinie(Fluglinie fluglinie){
        this._fluglinie = fluglinie;
    }
    public void setBahn(Bahn _bahn) {
        this._bahn = _bahn;
    }
    public void setPassagier(Passagier[] passagier) {
        this._passagier = passagier;
    }
    public void setPilot(Pilot[] pilot) {
        this._pilot = pilot;
    }

    public Flug(Flugzeug flugzeug, Fluglinie fluglinie, Bahn bahn, Passagier[] passagier, Pilot[] pilot, String startzeit){
        this.setFlugzeug(flugzeug);
        this.setFluglinie(fluglinie);
        this.setBahn(bahn);
        this.setPassagier(passagier);
        this.setPilot(pilot);
        this.setStartzeit(startzeit);
    }
}