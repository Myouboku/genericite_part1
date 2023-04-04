package com.genericite;

public final class App {
    public static void main(String[] args) {
        String[] phrase = { "Marie", "possède", "un", "chat", "qui", "s'appelle", "Médor" };
        Paire<String> minmax = TableauAlg.minmax(phrase);
        System.out.println("Min : " + minmax.getPremier());
        System.out.println("Max : " + minmax.getDeuxieme());
    }
}
