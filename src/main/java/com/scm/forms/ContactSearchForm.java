package com.scm.forms;

public class ContactSearchForm {

    private String field;
    private String value;

    public ContactSearchForm() {
    }

    public String getField() {
        return field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "ContactSearchForm{" +
                "field='" + field + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
