package com.mycompany.speakerobj;
public class SpeakerObj 
{

    public static void main(String[] args) 
    {
        Politician p=new Politician();
        Priest pr=new Priest();
        Lecturer l=new Lecturer();
        p.speak();
        pr.speak();
        l.speak();
    }
}
