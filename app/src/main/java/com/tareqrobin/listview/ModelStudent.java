package com.tareqrobin.listview;

public class ModelStudent {
    String name;
    int roll;
    String section;

    public ModelStudent(String name, int roll, String section) {
        this.name = name;
        this.roll = roll;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getSection() {
        return section;
    }
}
