import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);
        boss.setTypeDefence("AttackTheMore");

        System.out.println("Boss health: " + boss.getHealth()
                + " Boss Damage: " + boss.getDamage() + " Boss type Deference: " + boss.getTypeDefence());
        createHeroes();
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 300, "Strong Man");
        Hero hero2 = new Hero(290, 100, "Spider Man");
        Hero hero3 = new Hero(200, 74);

        Hero[] heroes = {hero1, hero2, hero3};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Hero health " + heroes[i].getHealth()
                    + " Hero damage: " + heroes[i].getDamage() +
                    " Hero SuperPower: " + heroes[i].getSuperPower());
        }
        return heroes;
    }
}