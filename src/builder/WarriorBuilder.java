package builder;

import java.util.Random;

public interface WarriorBuilder {
    WarriorBuilder joinArmy();
    WarriorBuilder takeWeapon();
    WarriorBuilder completeWeaponTraining();
    factory.Warrior build();

    default int generateStrength() {
        return new Random().nextInt(32, 43);
    }
}
