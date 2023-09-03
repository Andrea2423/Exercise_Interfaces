package org.example;

//      considering that an assistant is a CollegePerson that can learn and teach, define a subclass Assistant that:
//      implements the right interfaces and overrides the abstract methods with informative messages
//      has an attribute of type boolean called isGoingToBeAPhD
//      has a constructor that takes 4 params (name, surname, id, willBeAPhD) and assigns their values to the right attributes
class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {

    protected boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        super(name, surname, id);
        isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Yes, that's " + isGoingToBeAPhD + ", I could teach your classroom next year.");

    }

    @Override
    public void studyAtHome() {
        System.out.println("I'm studying to obtain a Ph.D.");
    }
}
