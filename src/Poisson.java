public class Poisson extends Garniture{
    public enum TPoisson {
        POISSON_PANE
    }
    private TPoisson type;
    static public int nMax=1;
    static public int nMin=1;

    public Poisson(TPoisson type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Poisson{" +
                "type=" + type +
                '}';
    }

    public TPoisson getType() {
        return type;
    }

    public void setType(TPoisson type) {
        this.type = type;
    }

}
