package org.example.HW6;

public class JavaDeveloper extends Employee {
    public JavaDeveloper(String name) {
        super(name);
       }

        @Override
        public String Position () {
            return "Java Developer";
        }

        @Override
        public String Seniority () {
            return "Senior";
        }


}

