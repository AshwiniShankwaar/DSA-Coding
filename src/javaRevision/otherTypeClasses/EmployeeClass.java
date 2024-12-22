package javaRevision.otherTypeClasses;

import java.util.ArrayList;

public class EmployeeClass {
    public static void main(String[] args) {
        ArrayList<Emplyee> employees = new ArrayList<Emplyee>();
        employees.add(new Emplyee("Ashwini","owner"));
        employees.add(new Emplyee("Puja","head"));
        employees.add(new Emplyee("Nitu","founder"));

        for (Emplyee employee : employees) {
            System.out.println(employee.name());
        }

    }
}
