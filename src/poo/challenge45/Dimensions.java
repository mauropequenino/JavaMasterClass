package poo.challenge45;

import java.awt.*;

public class Dimensions extends Resolution{
    private int depth;

    public Dimensions(int width, int hieght, int depth) {
        super(width, hieght);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }
}
