public class Sauce extends Accompagnement {
    public enum TSauce {
        KETCHUP, MAYONNAISE, BARBECUE, BLANCHE
    }
    private TSauce type;
    static public int nMax=4;
    static public int nMin=1;

    public Sauce(TSauce type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "type=" + type +
                '}';
    }

    public TSauce getType() {
        return type;
    }

    public void setType(TSauce type) {
        this.type = type;
    }

}
