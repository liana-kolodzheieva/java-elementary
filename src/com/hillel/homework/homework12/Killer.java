package com.hillel.homework.homework12;

public class Killer {
    public static void main(String[] args) {
        Attacker vasily = new Attacker(true);
        Attacker hookah = new Attacker(false);
        BodyGuard vitalii = new Boxer();
        vitalii.saveClientLife(vasily);
        vitalii.saveClientLife(hookah);


    }
}
