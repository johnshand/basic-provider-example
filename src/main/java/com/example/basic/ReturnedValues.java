package com.example.basic;

import java.util.List;

public class ReturnedValues {
    private String someString;
    private int someInt;
    private List<String> someArray;

    public ReturnedValues(String someString, int someInt, List<String> someArray) {
        this.someString = someString;
        this.someInt = someInt;
        this.someArray = someArray;
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

    public List<String> getSomeArray() {
        return someArray;
    }

    public void setSomeArray(List<String> someArray) {
        this.someArray = someArray;
    }

    @Override
    public String toString() {
        return "ReturnedValues{" +
                "someString='" + someString + '\'' +
                ", someInt=" + someInt +
                ", someArray=" + someArray +
                '}';
    }
}
