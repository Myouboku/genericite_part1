package com.genericite;
public class Paire<type> {
    private type premier;
    private type deuxieme;

    public Paire() {
        premier = null;
        deuxieme = null;
    }

    public Paire(type premier, type deuxieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
    }

    public type getPremier() {
        return premier;
    }

    public type getDeuxieme() {
        return deuxieme;
    }

    public void setPremier(type premier) {
        this.premier = premier;
    }

    public void setDeuxieme(type deuxieme) {
        this.deuxieme = deuxieme;
    }
}
