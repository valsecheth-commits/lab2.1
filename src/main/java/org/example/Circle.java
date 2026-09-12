package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("circle")
@Scope("prototype")
public class Circle extends Shape {
    @Setter
    @Getter
    @Value("${circle.radius}")
    int radius;

    private Coords center;

    void draw() {
        System.out.println("Circle coords" + " center: (" +  getX() + ", " + getY() + "). radius: " + getRadius() + ". Color: " + getColor());
    }
    public Circle() {
    }

    @Autowired
    public Circle(Coords center, @Value("${circle.radius}") int radius) {
        this.center = center;
        setRadius(radius);
    }

    @Value("${circle.x}")
    public void setX(Long x) {
        center.x = x;
    }

    @Value("${circle.y}")
    public void setY(Long y) {
        center.y = y;
    }

    public Long getX() {
        return center.x;
    }

    public Long getY() {
        return center.y;
    }

    @Value("${circle.color}")
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
