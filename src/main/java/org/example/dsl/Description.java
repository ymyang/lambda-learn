package org.example.dsl;

public final class Description {

    public Description(String name) {
        System.out.println(name);
    }



    public void should(String description, Specification specification) {
        try {
            System.out.print("\tshould " + description);
            Expect expect = new Expect();
            specification.specifyBehaviour(expect);
        } catch (AssertionError cause) {
        } catch (Throwable cause) {

        }
    }
}
