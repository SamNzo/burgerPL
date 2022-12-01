public class Viande extends Garniture {
    public enum TViande {
        BACON, BOEUF , POULET;
        enum TCuisson {
            BLEU, SAIGNANT, A_POINT
        }
    }
    private TViande type;
    private TViande.TCuisson cuisson;
    static public int nMax=1;
    static public int nMin=1;

    public Viande(TViande type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (type == TViande.BOEUF) {
            return "Viande{" +
                    "type=" + type +
                    ", cuisson=" + cuisson +
                    '}';
        }
        else {
            return "Viande{" +
                    "type=" + type +
                    '}';
        }
    }

    public TViande getType() {
        return type;
    }

    public void setType(TViande type) {
        this.type = type;
    }

    public TViande.TCuisson getCuisson() {
        return cuisson;
    }

    public void setCuisson(TViande.TCuisson cuisson) {
        this.cuisson = cuisson;
    }
}
