package com.design.patterns.structural.composite;

public class Demo {

    /**
     * Components represent a part of a system
     * Compose objects into tree structure
     * Same ops can be applied on individual as on composites
     * E.g. JSF, AWT Components
     * Components are of two parts - Leaf or Composite
     * Can oversimplify system
     * Difficult to restrict and sometimes require run time checks for unsupported operations
     * Implementation can be possible costly
     * Composite != Composition
     *
     * @param args
     */
    public static void main(String[] args) {

        MenuComposite mainMenu = new MenuComposite("Main", "/main");
        MenuLeaf safetyMenuItem = new MenuLeaf("Safety", "/safety");
        mainMenu.add(safetyMenuItem);
        MenuComposite claimsSubMenu = new MenuComposite("Claims", "/claims");
        mainMenu.add(claimsSubMenu);
        MenuLeaf personalClaimsMenu = new MenuLeaf("Personal Claim", "/claims/personal");
        claimsSubMenu.add(personalClaimsMenu);
        MenuLeaf vehicleClaimsMenu = new MenuLeaf("Vehicle Claim", "/claims/vehicle");
        claimsSubMenu.add(vehicleClaimsMenu);
        System.out.println(mainMenu.toString());

        MenuLeaf testException = new MenuLeaf("Exception Test", "/test");
        personalClaimsMenu.add(testException);
    }
}
