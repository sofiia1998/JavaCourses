package com.epam.courses.principles;
import java.time.LocalDate;
import java.time.ZoneId;


public interface AgeOfTheStudent {

    default int findDifference(int year, int month, int day) {
        LocalDate start = LocalDate.of(year, month, day) ;
        LocalDate stop = LocalDate.now( ZoneId.of( "Europe/Paris" ) );
        long years = java.time.temporal.ChronoUnit.YEARS.between( start , stop );
        return (int) years;
    }

}
