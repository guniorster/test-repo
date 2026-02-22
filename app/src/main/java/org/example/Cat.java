package org.example;

import org.w3c.dom.ls.LSOutput;

public class Cat {
    public int getName() {
        return name;
    }

    public void setName(int name) {
        if (name >= 0) {
        this.name = name; }
        else {
            System.out.println("Ви не можете їхати нижче 0!");
        }
    }
    private int name;

    String solo = "6654654";
}
