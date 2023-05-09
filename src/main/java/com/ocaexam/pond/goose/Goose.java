package com.ocaexam.pond.goose;

import com.ocaexam.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim(){
        Bird other = new Goose();
        //other.floatInWater();

    }
}
