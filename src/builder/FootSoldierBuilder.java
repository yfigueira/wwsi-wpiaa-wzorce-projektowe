package builder;

import factory.FootSoldier;
import factory.Warrior;

public class FootSoldierBuilder implements WarriorBuilder {

    private final Warrior footSoldier;

    public FootSoldierBuilder() {
        this.footSoldier = new FootSoldier(0);
    }

    @Override
    public WarriorBuilder joinArmy() {
        System.out.println("Foot soldier joined the army");
        return this;
    }

    @Override
    public WarriorBuilder takeWeapon() {
        System.out.println("Foot soldier took sword");
        return this;
    }

    @Override
    public WarriorBuilder completeWeaponTraining() {
        System.out.println("Foot soldier completed training with sword");
        this.footSoldier.setStrength(generateStrength());
        return this;
    }

    @Override
    public Warrior build() {
        return this.footSoldier;
    }
}
