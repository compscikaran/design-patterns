package com.design.patterns.behavioral.memento;

public class Demo {

    /**
     * Restore object to previous state
     * Externalize internal state
     * Undo / Rollback functionality
     * Shields complex internal implementation
     * e.g. java.util.Date, java.io.Serializable
     * Expensive in memory if memento is large copy of the originator's data
     * Memento is used to capture state and each state is independent
     * Similar to command but emphasis is on history and state rather than the request
     *
     * @param args
     */
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();
        emp.setName("Karan");
        emp.setAddress("Delhi");
        emp.setPhone("12345");
        caretaker.save(emp);

        emp.setPhone("56789");
        caretaker.save(emp);

        emp.setPhone("00000");
        caretaker.revert(emp);
        System.out.println(emp);
        caretaker.revert(emp);
        System.out.println(emp);
    }
}
