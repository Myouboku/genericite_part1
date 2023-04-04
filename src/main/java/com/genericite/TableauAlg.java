package com.genericite;
public class TableauAlg {
    public static Paire<String> minmax(String[] chaines) {
        if (chaines.length == 0)
            return null;
        String min = chaines[0];
        String max = chaines[0];

        for (String chaine : chaines) {
            if (min.compareTo(chaine) < 0)
                min = chaine;
            if (max.compareTo(chaine) > 0)
                max = chaine;
        }
        return new Paire<String>(min, max);
    }
}
