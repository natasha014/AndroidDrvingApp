package com.ewrt1b.drivingtest;

import android.view.SurfaceHolder;

/**
 * Created by Natasha Thakur on 5/18/2017.
 */

public class MainThread extends Thread {
    private int FPS =30;
    private double averageFPS;
    private SurfaceHolder surfaceHolder;
    private GamePanel gamePanel;
    private boolean running;
}
