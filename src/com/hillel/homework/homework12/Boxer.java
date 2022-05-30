package com.hillel.homework.homework12;

public class Boxer extends BodyGuard{
    public Gun gun;

    public Boxer() {
        this.gun = new  Gun();
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("I use box and I'll take your head off");
    }
}
