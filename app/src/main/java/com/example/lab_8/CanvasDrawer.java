package com.example.lab_8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;

public class CanvasDrawer extends View {

    Paint paint;
    Rect rect;

    public CanvasDrawer(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(4);

        canvas.drawRect(0, 0, canvas.getWidth()/4, canvas.getHeight()/4, paint);
    }
}
