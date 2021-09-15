package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private Integer amount;

    Money(Integer amount) {
        this.amount = amount;
    }
}
