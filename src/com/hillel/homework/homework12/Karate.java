package com.hillel.homework.homework12;

public class Karate extends BodyGuard{
    public Gun gun;

    public Karate() {
        this.gun = new Gun();
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("I use karate and I'll take your head off");
    }
}
