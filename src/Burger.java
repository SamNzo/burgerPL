import java.util.ArrayList;

public class Burger {
    private Pain pain;
    private ArrayList<Garniture> garnitures;
    private ArrayList<Accompagnement> accompagnements;

    public Burger(Pain pain, ArrayList<Garniture> garnitures, ArrayList<Accompagnement> accompagnements) {
        this.pain = pain;
        this.garnitures = garnitures;
        this.accompagnements = accompagnements;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "pain=" + pain +
                ", garniture=" + garnitures +
                ", accompagnements=" + accompagnements +
                '}';
    }

    public Pain getPain() {
        return pain;
    }

    public void setPain(Pain pain) {
        this.pain = pain;
    }

    public ArrayList<Garniture> getGarniture() {
        return garnitures;
    }

    public void setGarniture(ArrayList<Garniture> garniture) {
        this.garnitures = garniture;
    }

    public ArrayList<Accompagnement> getAccompagnement() {
        return accompagnements;
    }

    public void setAccompagnements(ArrayList<Accompagnement> accompagnements) {
        this.accompagnements = accompagnements;
    }
}
