public class Flughafen {
    //Deklaration der Arrays
    static Terminal[] _terminal;
    static Bahn[] _bahn;

     //Deklaration der Klassenvariablen
    String _name;
    String _standort;

    //Constructor
    public Flughafen(String name, String standort){
        this.setName(name);
        this.setStandort(standort);
    }

    //Setter
    public void setName(String name) {
        this._name = name;
    }
    public void setStandort(String standort) {
        this._standort = standort;
    }

    //Getter
    public String getName() {
        return _name;
    }
    public String getStandort() {
        return _standort;
    }

    //Ermöglicht die Arrays
    public static Terminal[] getAllTerminals(){
        return _terminal;
    }
    public static Bahn[] getAllBahnen(){
        return _bahn;
    }

/*
    //Eine generelle Methode, damit man weniger redundanten Code hat. In den Zeilen danach muss man nur das zugehörige Objekt deklarieren
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array){
            //wenn die stelle im array null ist kann man dort ein neues objekt erstellen
            if(a == null){
                array[i] = ele;
                //damit man nicht ein objekt 8 mal erzeugt
                break;
            }
            //wird erhöht
            i++;
        }
    }

    public static void addTerminal(Terminal terminal){
        addObject(terminal, getAllTerminals);
    }

    public static void addBahn(Bahn bahn){
        addObject(bahn, getAllBahnen)
    }
*/


}
