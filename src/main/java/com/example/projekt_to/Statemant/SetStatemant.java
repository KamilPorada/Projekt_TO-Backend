package com.example.projekt_to.Statemant;

public class SetStatemant extends Statemant {
    public SetStatemant(String columnName, String value) {
        super();
        setColumnName(columnName);
        setValue(value);
        setSign("=");
    }
    @Override
    public String toString() {
        return  getString();
    }
}