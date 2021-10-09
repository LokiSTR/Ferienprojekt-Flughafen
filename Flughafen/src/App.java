public class App {
    
    //Deklaration der Arrays + Klassenvariabe
    static Airline[] _airline;
    static Bahn[] _bahn;
    static Flughafen[] _flughafen;
    static Fluglinie[] _fluglinie;
    static Flugzeug[] _flugzeug;
    static Passagier[] _passagier;
    static Pilot[] _pilot;
    static Terminal[] _terminal;
    String _startzeit;


    //Main-Methode als Einstiegspunkt des Programms
    public static void main(String[] args) throws Exception {
        
        //Demodaten

        //Deklaration der Länge der Arrays
        _airline = new Airline[25];
        //Initialisierung der einzelnen Eigenschaften der Arrays
        _airline [0] = new Airline("Lufthansa");
        _airline [1] = new Airline("Condor");
        _airline [2] = new Airline("Holgerson Airlines");
        _airline [3] = new Airline("Oxford Airlines");
        _airline [4] = new Airline("Ryanair");

        _bahn = new Bahn[10];
        _bahn [0] = new Bahn("NS");
        _bahn [1] = new Bahn("WO");

        _flughafen = new Flughafen[5];
        _flughafen[0] = new Flughafen("Hamburg Airport", "Hamburg");

        _fluglinie = new Fluglinie[50];
        _fluglinie[0] = new Fluglinie("Hamburg - Berlin", _airline[1]);
        _fluglinie[1] = new Fluglinie("Washington DC - Hamburg", _airline[3]);
        _fluglinie[2] = new Fluglinie("Peking - Hamburg", _airline[4]);
        _fluglinie[3] = new Fluglinie("Hamburg - München", _airline[2]);
        _fluglinie[4] = new Fluglinie("Madagaskar - Hamburg", _airline[0]);

        _flugzeug = new Flugzeug[20];
        _flugzeug[0] = new Flugzeug("Airbus", "12", _airline[1]);
        _flugzeug[1] = new Flugzeug("Boeing", "89", _airline[4]);
        _flugzeug[2] = new Flugzeug("British Aerospace", "73", _airline[2]);
        _flugzeug[3] = new Flugzeug("Fokker", "51", _airline[0]);
        _flugzeug[4] = new Flugzeug("Lockhead", "2", _airline[0]);
        _flugzeug[5] = new Flugzeug("Tupolw PSC", "66", _airline[1]);
           
        _passagier = new Passagier[150];
        _passagier[0] = new Passagier("Reiner", "Schmidt");
        _passagier[1] = new Passagier("Matilda", "Schmidt");
        _passagier[2] = new Passagier("Jonas", "Schmidt");
        _passagier[3] = new Passagier("Mathea", "Schmidt");
        _passagier[4] = new Passagier("Norbert", "Müller");
        _passagier[5] = new Passagier("Maria-Katerina", "Müller");
        _passagier[6] = new Passagier("Maximilian", "Müller");
        _passagier[7] = new Passagier("Julian", "Schlosser");
        _passagier[8] = new Passagier("Hulio", "Schlosser");

        _pilot = new Pilot[20];
        _pilot[0] = new Pilot("Abdul", "Abudallah");
        _pilot[1] = new Pilot("Ibrahim", "Jasalame");
        _pilot[2] = new Pilot("Günther", "Jauch");
        _pilot[3] = new Pilot("Leonardo", "Dexter");
        _pilot[4] = new Pilot("Loki", "Stormbringer");
        _pilot[5] = new Pilot("Sarah", "Schatte");

        _terminal = new Terminal[15];
        _terminal[0] = new Terminal("(1) Tarek");
        _terminal[1] = new Terminal("(2) Oktavian");
        _terminal[3] = new Terminal("(3) Brutus");
        _terminal[4] = new Terminal("(4) Titus");
        _terminal[5] = new Terminal("(5) Ceasar");

        //Neues Objekt aus der Klasse Menu wird erstellt
        Menu menu = new Menu();
        //Methode wird durch Punktnotation am Objekt aufgerufen
        menu.startMenu();
    }

    //Übernommen aus dem Projekt AutohausSchmidt
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a :array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i = i+1;
        }
    } 

    //Mit AddObject Methode
    public static void addAirline(Airline airline){
        addObject(airline, getALLAirline());
    }
    public static void addBahn(Bahn bahn){
        addObject(bahn, getALLBahn());
    }
    public static void addFlughafen(Flughafen flughafen){
        addObject(flughafen, getALLFlughafen());
    }
    public static void addFluglinie(Fluglinie fluglinie){
        addObject(fluglinie, getALLFluglinie());
    }
    public static void addFlugzeug(Flugzeug flugzeug){
        addObject(flugzeug, getALLFlugzeug());
    }
    public static void addPassagier(Passagier passagier){
        addObject(passagier, getALLPassagier());
    }
    public static void addPilot(Pilot pilot){
        addObject(pilot, getALLPilot());
    }
    public static void addTerminal(Terminal terminal){
        addObject(terminal, getALLTerminal());
    }


    //Rückgabemethode, d.h. die Arrays vom jeweiligen Typen werden zurückgegeben => ermöglicht die arrays
    public static Airline[] getALLAirline(){
        return _airline;
    }
    public static Bahn[] getALLBahn(){
        return _bahn;
    }
    public static Flughafen[] getALLFlughafen(){
        return _flughafen;
    }
    public static Fluglinie[] getALLFluglinie(){
        return _fluglinie;
    }
    public static Flugzeug[] getALLFlugzeug(){
        return _flugzeug;
    }
    public static Passagier[] getALLPassagier(){
        return _passagier;
    }
    public static Pilot[] getALLPilot(){
        return _pilot;
    }
    public static Terminal[] getALLTerminal(){
        return _terminal;
    }


    //Setter
    public void setStartzeit(String startzeit){
        this._startzeit = startzeit;
    }
    //Getter
    public String getStartzeit() {
        return _startzeit;
    }   

}