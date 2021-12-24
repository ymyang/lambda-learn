package org.example.dsl;

public final class Expect {

    public BoundExpectation that(Object value){
        return new BoundExpectation(value);
    }
}
