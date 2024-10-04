package builder;

import factory.Warrior;
import factory.WarriorType;

public class Garrison {
    public Warrior createSoldier(WarriorType type) {
        return switch(type) {
            case FOOT_SOLDIER -> Director.createWarrior(new FootSoldierBuilder());
            case HORSEMAN -> Director.createWarrior(new HorsemanBuilder());
            case ARCHER -> Director.createWarrior(new ArcherBuilder());
        };
    }
}
