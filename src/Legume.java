public class Legume extends Accompagnement {
    public enum TLegume {
        SALADE, TOMATE, OIGNON
    }
    private TLegume type;
    static public int nMax=3;
    static public int nMin=1;

    public Legume(TLegume type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Legume{" +
                "type=" + type +
                '}';
    }

    public TLegume getType() {
        return type;
    }

    public void setType(TLegume type) {
        this.type = type;
    }

}
