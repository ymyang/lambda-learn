package org.example.dsl;

import java.util.Stack;

public class BoundExpectation {

    private Object value;

    public BoundExpectation(Object value) {
        this.value = value;
    }

    public boolean isEmpty() {
        boolean empty = false;
        if (this.value instanceof Stack) {
            empty = ((Stack) value).isEmpty();
        } else {
            empty = this.value == null;
        }
        if (empty) {
            System.out.println();
        } else {
            System.out.println("[not empty]");
        }
        return empty;
    }

    public boolean isEqualTo(Object obj) {
        boolean equal = this.value.equals(obj);
        if (equal) {
            System.out.println();
        } else {
            System.out.println("[expected: " + obj + " but was: " + this.value + "]");
        }
        return equal;
    }
}
