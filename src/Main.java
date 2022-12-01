public class Main {
    public static void main(String[] args) {

        UsineBurger usine = new UsineBurger();
        Burger burger = usine.makeRandomBurger();

        System.out.println(burger);
    }
}
