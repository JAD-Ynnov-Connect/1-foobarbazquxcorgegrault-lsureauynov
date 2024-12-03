package com.jad;

public class Corge {

    private Foo foo;

    public Corge(final Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() : Foo {
        return this.foo;
    }

    public void setFoo(final Foo foo) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
