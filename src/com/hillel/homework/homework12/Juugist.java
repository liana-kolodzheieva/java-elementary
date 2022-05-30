package com.hillel.homework.homework12;

public class Juugist extends BodyGuard{
    public Gun gun;

    public Juugist() {
        this.gun = new Gun();
    }

    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("I use jujitsu and I'll take your head off");


    }
}
