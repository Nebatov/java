package edu.ntu.nebatov.lab3.model.impl;

import edu.ntu.nebatov.lab3.model.Human;

public abstract class BaseUnitImpl {
    protected String name;
    protected Human head;

    public BaseUnitImpl(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }
}
