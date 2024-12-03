package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    private Bar bar;
    private Qux qux;
    private List<Grault> graults= new ArrayList<>();
    private Corge corge = null;
    private List<Baz> bazs = new ArrayList<>();

    public Foo(final Bar bar) {
        this.bar = bar;
        this.qux = new Qux(this);
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {

        return bazs;
    }

    public void addBaz(final Baz baz) {
        bazs.add(baz);
    }

    public Qux getQux() {
        return this.qux;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    public void addGrault() {
        Grault grault = new Grault(this);
        graults.add(grault);
    }

    public Corge getCorge() {
        return corge;
    }

    public void setCorge(final Corge firstCorge) {
        if (this.corge == firstCorge) {
            return;
        }

        if (this.corge != null) {
            Corge oldCorge = this.corge;
            this.corge = null;
            oldCorge.setFoo(null);
        }

        this.corge = firstCorge;
        if (firstCorge != null && firstCorge.getFoo() != this) {
            firstCorge.setFoo(this);
        }
    }
}
