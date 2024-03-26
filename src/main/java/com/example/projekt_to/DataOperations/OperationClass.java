package com.example.projekt_to.DataOperations;

import com.example.projekt_to.Statemant.SetStatemant;
import com.example.projekt_to.Statemant.WhereStatemant;

import java.util.ArrayList;
import java.util.List;

public class OperationClass {
    private String tableName;
    private List<String> columnName;

    private List<WhereStatemant> whereStatemant;
    private List<SetStatemant> setStatemant;

    public OperationClass() {
        this.columnName = new ArrayList<>();
        this.whereStatemant=new ArrayList<>();
        this.setStatemant=new ArrayList<>();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    protected void addColumn(String nazwa){
        this.columnName.add(nazwa);
    }

    public List<String> getColumnName() {
        return columnName;
    }

    public String getColumnsString() {
        String returnetString="";
        for(int i=0;i<columnName.size()-1;i++)
            returnetString += getColumnName().get(i) + ", ";
        returnetString += getColumnName().get(getColumnName().size()-1);
        return returnetString;
    }

    public String getWhereString() {
        String returnetString=" where ";
        for (int i = 0; i < whereStatemant.size() - 1; i++)
            returnetString += whereStatemant.get(i).toString() + " and ";
        returnetString += whereStatemant.get(whereStatemant.size() - 1).toString();
        return returnetString;
    }

    public String getSetString() {
        String returnetString=" set ";
        for (int i = 0; i < setStatemant.size() - 1; i++)
            returnetString += setStatemant.get(i).toString() + ", ";
        returnetString += setStatemant.get(setStatemant.size() - 1).toString();
        return returnetString;
    }

    public List<WhereStatemant> getWhereStatemant() {
        return whereStatemant;
    }
    public List<SetStatemant> getSetStatemant() {
        return setStatemant;
    }

    public void addWhere(String Column,String Sign, String value) {
        whereStatemant.add(new WhereStatemant(Column,value,Sign));
    }
    public void addSet(String Column, String value) {
        setStatemant.add(new SetStatemant(Column,value));
    }
}
