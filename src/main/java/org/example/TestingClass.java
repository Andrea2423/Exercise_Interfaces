package org.example;
//      define a Java testing class where you:

public class TestingClass {
    public static void main(String[] args) {
//      create 3 objects, 1 for each subclass type
        Student student1 = new Student("Luca", "Modigliani", 400, 2023);
        Professor professor1 = new Professor("Ahmed", "Harroui", 190, "Computer Science");
        Assistant assistant1 = new Assistant("Rafael", "Santos", 11, true);
//      invoke the goToCollege() method for each of the newly created objects
        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();
//      invoke the implemented methods from interfaces (1 for Student, 1 for Professor and 2 for Assistant)
        student1.studyAtHome();
        professor1.teachToOtherPeople();
        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();
    }
}
