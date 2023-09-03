package org.example;

//      considering that a student is a CollegePerson that can learn, define a subclass Student that:
//      implements the right interface and overrides the abstract method with an informative message
//      has an attribute academicYear of type int
//      has a constructor that takes 4 params (name, surname, id, year) and assigns their values to the right attributes
class Student extends CollegePerson implements LearningPerson {
    protected int academicYear;

    public Student(String name, String surname, int id, int year) {
        super(name, surname, id);
        academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Yes mom, I'm studying... ");
    }
}

