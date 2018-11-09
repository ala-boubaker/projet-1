package com.aladino.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {


    public static void main(String[] args) {

        //Toujours notre 25 D�cembre 2018 a 13H37

        LocalDate ldt = LocalDate.of(2018, Month.DECEMBER, 25);

        

        //Le prochain samedi

        LocalDate prochainSamedi = ldt.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

        System.out.println(prochainSamedi);

        

        //Le troisi�me mardi du mois suivant

        //On ajoute un mois � notre date

        ldt = ldt.plus(1, ChronoUnit.MONTHS);

        //On en cr�er une nouvelle au premier jour du mois

        LocalDate ldt2 = LocalDate.of(ldt.getYear(), ldt.getMonth(), 1);

        //On avance de trois mardi

        LocalDate troisiemeMardi = ldt2 .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))

                                        .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))

                                        .with(TemporalAdjusters.next(DayOfWeek.TUESDAY));

        System.out.println(troisiemeMardi);

        

    }


}