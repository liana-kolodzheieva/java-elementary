package com.hillel.homework.homework12;

public abstract class BodyGuard {
    Gun gun;
    abstract void applyMartialArts(Attacker attacker);

    void shoot(Attacker attacker) {
        gun.shoot(attacker);
    }

    void saveClientLife(Attacker attacker) {
        if (attacker.hasGun())
            shoot(attacker);
        else
            applyMartialArts(attacker);
    }

}
