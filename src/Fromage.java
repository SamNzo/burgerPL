public class Fromage extends Accompagnement {
    public enum TFromage {
        CHEDDAR, CHEVRE
    }
    private TFromage type;
    static public int nMax=1;
    static public int nMin=1;

    public Fromage(TFromage type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fromage{" +
                "type=" + type +
                '}';
    }

    public TFromage getType() {
        return type;
    }

    public void setType(TFromage type) {
        this.type = type;
    }

}
