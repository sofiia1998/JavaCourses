package com.epam.courses.differentclasses.nested;

public class Automobile {
    public int id;
    public String name;
    public int kilometrage;

    public Automobile() {
    }

    public Automobile(int id, String name, int kilometrage) {
        this.id = id;
        this.name = name;
        this.kilometrage = kilometrage;
    }

    public class EngineCriteria {
        String fuelType;
        int cylindres;
        double volume;
        String coolingMethods;

        public EngineCriteria() {
        }

        public EngineCriteria(String fuelType, int cylindres, double volume, String coolingMethods) {
            this.fuelType = fuelType;
            this.cylindres = cylindres;
            this.volume = volume;
            this.coolingMethods = coolingMethods;
        }

        @Override
        public String toString() {
            return "EngineCriteria{" +
                    "fuelType='" + fuelType + '\'' +
                    ", cylindres=" + cylindres +
                    ", volume=" + volume +
                    ", coolingMethods='" + coolingMethods + '\'' +
                    '}';
        }
    }

    public static class Checkup {
        public void checkUp(Automobile automobile) {
            if (automobile.name.equals("BMW") || automobile.name.equals("Mercedes")) {
                System.out.println("This is a luxury brand");
            } else {
                System.out.println("Nice car");
            }
        }
    }
}