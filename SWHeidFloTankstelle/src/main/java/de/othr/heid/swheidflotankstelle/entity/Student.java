/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.othr.heid.swheidflotankstelle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id 
    private long matrikelNr;
    private String vorname; 
    private String nachname;
    
    
    //leerer Konstruktor ist wichtig!
    public Student() {
    }    
    
    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public long getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(long matrikelNr) {
        this.matrikelNr = matrikelNr;
    }
    

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    
}
