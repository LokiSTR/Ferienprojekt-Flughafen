public class Flug{
    //Übergabe der Klassenvariablen in Flug
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;
    Bahn _bahn;
    //Arraydeklaration
    //static Pilot[] _pilot;
    //static Passagier[]  _passagier;
    //Stringvarible
    String _startzeit;


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

   /* //
    public static Pilot[] App.getALLPilot(){
        return _pilot;
    }
    public static Passagier[] getALLTerminal(){
        return _terminal;
    }*/

    public Flug(Flugzeug flugzeug, Fluglinie fluglinie, Bahn bahn, String startzeit){
        this.setFlugzeug(flugzeug);
        this.setFluglinie(fluglinie);
        this.setBahn(bahn);
        this.setStartzeit(startzeit);
    }
}