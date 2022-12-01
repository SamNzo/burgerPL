import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class UsineBurger {
    private static final SecureRandom random = new SecureRandom();
    Random r = new Random();

    public UsineBurger() {}

    /**
     * Récupération d'une valeur aléatoire de l'énumération de la classe donnée en paramètre
     *
     * @param clazz classe contenant l'énumération
     * @return      valeur de l'énumération
     **/
    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

    /**
     * Construction d'un burger aléatoire
     **/
    public Burger makeRandomBurger() {
        Pain pain = makeRandomPain();
        ArrayList<Garniture> garnitures = makeRandomGarniture();
        ArrayList<Accompagnement> accompagnements = makeRandomAccompagnement();
        return new Burger(pain, garnitures, accompagnements);
    }

    /**
     * Création d'un pain de type aléatoire
     **/
    public Pain makeRandomPain() {
        /* Création d'un pain de type aléatoire */
        return new Pain(randomEnum(Pain.TPain.class));
    }

    /**
     * Création d'une liste de garnitures aléatoires
     **/
    public ArrayList<Garniture> makeRandomGarniture() {
        /* Liste des garnitures */
        ArrayList<Garniture> garnitures = new ArrayList<Garniture>();
        /* Nombre de garnitures */
        int randomRange = (r.nextInt(Garniture.nMax) + Garniture.nMin);
        for (int i=0; i<randomRange; i++) {
            /* Sélection d'un type de garniture aléatoirement */
            Garniture.TGarniture gar = randomEnum(Garniture.TGarniture.class);
            /* Cas ou la garniture est de la viande */
            if (gar == Garniture.TGarniture.VIANDE) {
                /* Nombre de viandes */
                int randomRangeViande = (r.nextInt(Viande.nMax) + Viande.nMin);
                for (int j = 0; j < randomRangeViande; j++) {
                    Viande garniture = new Viande(randomEnum(Viande.TViande.class));
                    if (garniture.getType() == Viande.TViande.BOEUF) {
                        /* Sélection d'un type de cuisson aléatoirement */
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
     * Création d'une liste d'accompagnements aléatoires'
     **/
    public ArrayList<Accompagnement> makeRandomAccompagnement() {
        /* Liste des accompagnements */
        ArrayList<Accompagnement> accompagnements = new ArrayList<Accompagnement>();
        /* Nombre d'accompagnements */
        int randomRange = (r.nextInt(Accompagnement.nMax) + Accompagnement.nMin);
        System.out.println("Nombre d'accompagnements: " + randomRange);
        for (int i=0; i<randomRange; i++) {
            /* Sélection d'un type d'accompagnement aléatoirement */
            Accompagnement.TAccompagnement acc = randomEnum(Accompagnement.TAccompagnement.class);
            /* Cas ou l'accompagnement est un légume */
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
