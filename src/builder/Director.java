package builder;

import factory.Warrior;

public class Director {
    public static Warrior createWarrior(WarriorBuilder builder) {
        return builder
                .joinArmy()
                .takeWeapon()
                .completeWeaponTraining()
                .build();
    }
}
