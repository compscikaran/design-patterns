package com.design.patterns.creational.builder;

public class Demo {

    /**
     * Handles complex constructors
     * Large number of parameters
     * Enforce immutability if required e.g. StringBuilder, DocumentBuilder, LocaleBuilder
     * Flexibility over having multiple constructors with different combinations of parameters
     * Negates the need for exposed setters
     * Using static inner classes usually but can be implemented as a separate class
     * Hence can intergrate easily into legacy code
     * Usually used when objects being constructed are immutable
     * Adds a little bit of complexity
     * No interface required
     *
     * @param args
     */
    public static void main(String[] args) {

        // Setters
        Computer comp = new Computer();
        comp.setDiskSize(HDD.DEFAULT);
        comp.setRamSize(RAM.UPGRADED);
        comp.setHasUsbC(true);
        System.out.println(comp);

        // Telescoping constructors
        Computer comp2 = new Computer(HDD.UPGRADED, RAM.DEFAULT, true);
        System.out.println(comp2);

        // Builder
        Computer comp3 = new Computer.ComputerBuilder()
                            .addDiskSize(HDD.MAX)
                            .addRamSize(RAM.DEFAULT)
                            .hasGigabitWifi(true)
                            .build();
        System.out.println(comp3);
    }
}
