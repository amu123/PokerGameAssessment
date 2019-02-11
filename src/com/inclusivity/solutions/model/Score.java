package com.inclusivity.solutions.model;

import java.util.Arrays;

/**
 * Created by amukelani.g.mathye on 2019/02/11.
 */
public class Score {

    private final int weight;
    private final String name;
    private final String[] hand;

    public Score(String n, int w, String[] h) {
        weight = w;
        name = n;
        hand = h != null ? h.clone() : h;
    }

    @Override
    public String toString() {
        return Arrays.toString(hand) + " " + name;
    }
}
