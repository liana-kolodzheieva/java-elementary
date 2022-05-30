package com.hillel.homework.homework12;

public class Killer {
    public static void main(String[] args) {
        Gun gun = new Gun();
        Attacker vasily = new Attacker(true);
        Attacker hookah = new Attacker(false);
        BodyGuard anonymous = new Boxer(gun);
        anonymous.saveClientLife(hookah);

    }
}
