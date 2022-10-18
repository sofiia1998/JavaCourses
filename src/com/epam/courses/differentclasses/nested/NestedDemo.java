package com.epam.courses.differentclasses.nested;

import com.epam.courses.differentclasses.nested.Automobile;

public class NestedDemo {

    public static void main(String[] args) {
        Automobile automobile1 = new Automobile(1, "BMW", 50000);
        Automobile automobile2 = new Automobile(1, "Mercedes", 10000);
        Automobile automobile3 = new Automobile(1, "Audi", 5000);

        Automobile.EngineCriteria address = automobile1.new EngineCriteria("Petrol", 5, 1.8, "Air-cooled");
        System.out.println(address);

        Automobile.Checkup checkup = new Automobile.Checkup();

        checkup.checkUp(automobile1);
        checkup.checkUp(automobile2);
        checkup.checkUp(automobile3);
    }
}
