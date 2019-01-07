package com.example.basic;

import java.util.List;

public class ReturnedValues {
    private String someString;
    private int someInt;
    private List<String> array;

    public ReturnedValues(String someString, int someInt, List<String> array) {
        this.someString = someString;
        this.someInt = someInt;
        this.array = array;
    }

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ReturnedValues{" +
                "someString='" + someString + '\'' +
                ", someInt=" + someInt +
                ", array=" + array +
                '}';
    }
}
