package com.example.drawingpsychologicaltest;

import android.graphics.Path;

public class FingerPath {
    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWideth;
    public Path path;

    public FingerPath(int color, boolean emboss, boolean blur, int strokeWideth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWideth = strokeWideth;
        this.path = path;
    }
}
