import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class UsineBurger {
    private static final SecureRandom random = new SecureRandom();
    Random r = new Random();

    public UsineBurger() {}

    /**
     * R�cup�ration d'une valeur al�atoire de l'�num�ration de la classe donn�e en param�tre
     *
     * @param clazz classe contenant l'�num�ration
     * @return      valeur de l'�num�ration
     **/
    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    /**
     * Construction d'un burger al�atoire
     **/
    public Burger makeRandomBurger() {
        Pain pain = makeRandomPain();
        ArrayList<Garniture> garnitures = makeRandomGarniture();
        ArrayList<Accompagnement> accompagnements = makeRandomAccompagnement();
        return new Burger(pain, garnitures, accompagnements);
    }

    /**
     * Cr�ation d'un pain de type al�atoire
     **/
    public Pain makeRandomPain() {
        /* Cr�ation d'un pain de type al�atoire */
        return new Pain(randomEnum(Pain.TPain.class));
    }

    /**
     * Cr�ation d'une liste de garnitures al�atoires
     **/
    public ArrayList<Garniture> makeRandomGarniture() {
        /* Liste des garnitures */
        ArrayList<Garniture> garnitures = new ArrayList<Garniture>();
        /* Nombre de garnitures */
        int randomRange = (r.nextInt(Garniture.nMax) + Garniture.nMin);
        for (int i=0; i<randomRange; i++) {
            /* S�lection d'un type de garniture al�atoirement */
            Garniture.TGarniture gar = randomEnum(Garniture.TGarniture.class);
            /* Cas ou la garniture est de la viande */
            if (gar == Garniture.TGarniture.VIANDE) {
                /* Nombre de viandes */
                int randomRangeViande = (r.nextInt(Viande.nMax) + Viande.nMin);
                for (int j = 0; j < randomRangeViande; j++) {
                    Viande garniture = new Viande(randomEnum(Viande.TViande.class));
                    if (garniture.getType() == Viande.TViande.BOEUF) {
                        /* S�lection d'un type de cuisson al�atoirement */
                        Viande.TViande.TCuisson cui = randomEnum(Viande.TViande.TCuisson.class);
                        garniture.setCuisson(cui);
                    }
                    garnitures.add(garniture);
                }
            }
            /* Cas ou la garniture est du poisson */
            else if (gar == Garniture.TGarniture.POISSON) {
                /* Nombre de poissons */
                int randomRangePoisson = (r.nextInt(Poisson.nMax) + Poisson.nMin);
                for (int j = 0; j < randomRangePoisson; j++) {
                    Poisson garniture = new Poisson(randomEnum(Poisson.TPoisson.class));
                    garnitures.add(garniture);
                }
            }
        }
        return garnitures;
    }

    /**
     * Cr�ation d'une liste d'accompagnements al�atoires'
     **/
    public ArrayList<Accompagnement> makeRandomAccompagnement() {
        /* Liste des accompagnements */
        ArrayList<Accompagnement> accompagnements = new ArrayList<Accompagnement>();
        /* Nombre d'accompagnements */
        int randomRange = (r.nextInt(Accompagnement.nMax) + Accompagnement.nMin);
        System.out.println("Nombre d'accompagnements: " + randomRange);
        for (int i=0; i<randomRange; i++) {
            /* S�lection d'un type d'accompagnement al�atoirement */
            Accompagnement.TAccompagnement acc = randomEnum(Accompagnement.TAccompagnement.class);
            /* Cas ou l'accompagnement est un l�gume */
            if (acc == Accompagnement.TAccompagnement.LEGUME) {
                Accompagnement accompagnement = new Legume(randomEnum(Legume.TLegume.class));
                accompagnements.add(accompagnement);
            }
            /* Cas ou l'accompagnement est un fromage */
            else if (acc == Accompagnement.TAccompagnement.FROMAGE) {
                Accompagnement accompagnement = new Fromage(randomEnum(Fromage.TFromage.class));
                accompagnements.add(accompagnement);
            }
            /* Cas ou l'accompagnement est une sauce */
            else if (acc == Accompagnement.TAccompagnement.SAUCE) {
                Accompagnement accompagnement = new Sauce(randomEnum(Sauce.TSauce.class));
                accompagnements.add(accompagnement);
            }
        }
        return accompagnements;
    }
}
