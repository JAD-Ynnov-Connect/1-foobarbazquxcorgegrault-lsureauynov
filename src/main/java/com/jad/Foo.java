package com.jad;

import java.util.List;

public class Foo {

    private Bar bar;
    private Baz[] bazs;
    private Qux qux;
    private Qux qux;
    private Grault[] graults;


    public Foo(final Bar bar) {
        this.bar = bar;
        this.bazs = new Baz[];
        this.graults = new Grault[];
        this.qux = new Qux();
    }

    public Bar getBar() {

        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Baz> getBazs() {

        throw new UnsupportedOperationException("Not implemented yet");

    }

    public void addBaz(final Baz baz) {

        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Qux getQux() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public List<Grault> getGraults() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void addGrault() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Corge getCorge() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setCorge(final Corge firstCorge) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
