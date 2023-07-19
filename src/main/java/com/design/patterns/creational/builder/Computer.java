package com.design.patterns.creational.builder;

public class Computer {

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbC;
    private boolean hasGigabitWifi;

    public HDD getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public void setRamSize(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public boolean isHasUsbC() {
        return hasUsbC;
    }

    public void setHasUsbC(boolean hasUsbC) {
        this.hasUsbC = hasUsbC;
    }

    public boolean isHasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "diskSize=" + diskSize +
                ", ramSize=" + ramSize +
                ", hasUsbC=" + hasUsbC +
                ", hasGigabitWifi=" + hasGigabitWifi +
                '}';
    }

    // Telescoping Constructors

    public Computer(HDD diskSize, RAM ramSize, boolean hasUsbC, boolean hasGigabitWifi) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
        this.hasUsbC = hasUsbC;
        this.hasGigabitWifi = hasGigabitWifi;
    }

    public Computer(HDD diskSize, RAM ramSize, boolean hasUsbC) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
        this.hasUsbC = hasUsbC;
    }

    public Computer(HDD diskSize, RAM ramSize) {
        this.diskSize = diskSize;
        this.ramSize = ramSize;
    }

    public Computer() {
    }

    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbC;
        private boolean hasGigabitWifi;

        public ComputerBuilder() {

        }

        public ComputerBuilder addDiskSize(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder addRamSize(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder hasUsbC(boolean hasUsbC) {
            this.hasUsbC = hasUsbC;
            return this;
        }

        public ComputerBuilder hasGigabitWifi(boolean hasGigabitWifi) {
            this.hasGigabitWifi = hasGigabitWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public Computer(ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasUsbC = builder.hasUsbC;
        this.hasGigabitWifi = builder.hasGigabitWifi;
    }

}
