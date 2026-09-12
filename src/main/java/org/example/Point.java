package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("point")
@Scope("prototype")
@RequiredArgsConstructor
public class Point extends Shape {

    private final Coords coords;

    @Override
    void draw() {
        System.out.println("Point: " + getX() + " " + getY() + " Color: " + getColor());
    }

    @Value("${point.x}")
    public void setX(Long x) {
        coords.x = x;
    }

    @Value("${point.y}")
    public void setY(Long y) {
        coords.y = y;
    }

    Long getX() {
        return coords.x;
    }

    Long getY() {
        return coords.y;
    }

    @Value("${point.color}")
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
