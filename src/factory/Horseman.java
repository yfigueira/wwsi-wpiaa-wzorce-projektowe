package factory;

public class Horseman extends Warrior {
    public Horseman(int strength) {
        super(strength);
    }

    @Override
    public String getWeapon() {
        return "Spear";
    }
}
