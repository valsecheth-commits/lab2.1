package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
@RequiredArgsConstructor
public class Scene  {

    private final List<Shape> objects;

    void draw() {
        for (Shape shape : getObjects()) {
            shape.draw();
        }
    }
}
