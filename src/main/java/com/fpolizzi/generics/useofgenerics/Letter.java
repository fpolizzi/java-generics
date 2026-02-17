package com.fpolizzi.generics.useofgenerics;

/**
 * Created by fpolizzi on 14.02.26
 */
public class Letter {

    private final String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    public String get() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
