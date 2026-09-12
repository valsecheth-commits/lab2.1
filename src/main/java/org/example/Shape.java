package org.example;

public abstract class Shape {
    String color;

    abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
}
