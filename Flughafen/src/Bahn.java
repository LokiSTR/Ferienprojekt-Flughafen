public class Bahn {
    //Deklaration der Klassenvariablen
    String _name;
    
    //Konstruktor
    public Bahn (String name){
        this.setName(name);
    }

    //Setter
    public void setName(String name) {
        this._name = name;
    }
    
    //Getter
    public String getName() {
        return _name;
    }
}
