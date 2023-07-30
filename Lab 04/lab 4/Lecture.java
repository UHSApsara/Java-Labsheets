
package com.mycompany.personmain;


public class Lecture extends Person{
    
    private String programme;

    // Constructor
    public Lecture(String name, int id, String programme) {
        super(name, id);
        this.programme = programme;
    }

    // Getter and Setter for programme
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}


