package com.aladino.date;

import java.time.ZoneId;
import java.util.Map;

public class TestZone {


    public static void main(String[] args) {

        Map<String, String> maps = ZoneId.SHORT_IDS;

        maps.values().stream().forEach((x) -> {System.out.println(x + " -- " + ZoneId.of(x).getRules());});

        

        //Et conna�tre notre fuseau

        System.out.println("");

        System.out.println("Fuseau horaire courant : "+ZoneId.systemDefault());

        System.out.println("R�gle appliquer aux heures : " + ZoneId.systemDefault().getRules());

    }

}