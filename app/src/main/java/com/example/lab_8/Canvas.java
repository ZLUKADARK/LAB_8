package com.example.lab_8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class Canvas extends AppCompatActivity {

    CanvasDrawer canvasDrawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        canvasDrawer = new CanvasDrawer(this);
        canvasDrawer.setBackgroundColor(Color.WHITE);
        setContentView(canvasDrawer);
    }
}