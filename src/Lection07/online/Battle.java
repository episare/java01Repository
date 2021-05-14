package Lection07.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 12.05.2021
 */

public class Battle {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {
        LightSoldier lightSoldier = new LightSoldier("LightSoldier", 15, 25f, 100f);
        DarkSoldier darkSoldier = new DarkSoldier("DarkSoldier", 20, 5f, 150f);

        lightSoldier.attack(lightSoldier);

        while (!lightSoldier.isDeadHero() || !darkSoldier.isDeadHero()) {
            System.out.println("*** Round " + round + " ***");
            System.out.println(lightSoldier.getMeInfo());
            System.out.println(darkSoldier.getMeInfo());

            lightSoldier.attack(darkSoldier);

            if (darkSoldier.isDeadHero()) {
                System.out.println(lightSoldier.getName() + " win!");
                break;
            }

            darkSoldier.attack(lightSoldier);

            if (lightSoldier.isDeadHero()) {
                System.out.println(darkSoldier.getName() + " win!");
                break;
            }

            round++;

            Thread.sleep(3000);
        }
    }
}
