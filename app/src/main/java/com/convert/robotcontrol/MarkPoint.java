package com.convert.robotcontrol;

import android.graphics.Point;

public class MarkPoint {
    public Point mPos;
    public String mName;

    public MarkPoint() {}

    public MarkPoint(Point pos, String name) {
        this.mPos = pos;
        this.mName = name;
    }

    public MarkPoint(MarkPoint src) {
        this.mPos = src.mPos;
        this.mName = src.mName;
    }


}
