package org.example;

//     considering that a professor is a CollegePeorson that can teach, define a subclass Professor that:
//     implements the right interface and overrides the abstract method with an informative message
//     has an attribute of type String called teachingSubject
//     has a constructor that takes 4 params (name, surname, id, subject) and assigns their values to the right attributes
class Professor extends CollegePerson implements TeachingPerson {
    protected String teachingSubject;

    public Professor(String name, String surname, int id, String subject) {
        super(name, surname, id);
        teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching " + teachingSubject);
    }
}
