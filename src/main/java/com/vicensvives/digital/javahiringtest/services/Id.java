package com.vicensvives.digital.javahiringtest.services;

import java.util.Objects;
import java.util.UUID;

public abstract class Id {

    private final String value;

    protected Id() {
        value = UUID.randomUUID().toString();
    }

    public Id(String value) {
        Objects.requireNonNull(value, "value of id can't be null");
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Id)) {
            return false;
        }

        Id id = (Id) obj;

        return value.equals(id.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }
}
