package org.example;
//Exercise: interfaces
 //      define a Java superclass CollegePerson that has:
 //      3 attributes (name, surname and a numeric collegeId)
 //      a method goToCollege that prints all the CollegePerson attributes

public  class CollegePerson {
    protected String name;
    protected String surname;
    protected int collegeId;

    public CollegePerson(String name, String surname, int collegeId){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege(){
        System.out.println("The name of " + getClass().getSimpleName() + " is " + name + " " + surname + " and the collegeId is " + collegeId);
  //                                                      ^
  //                                                      |
                            //ho trovato un metodo per far si che mi dava il nome della sottoclasse
    }


}