package nyc.esteban.android.buttley13.game.view;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import nyc.esteban.android.buttley13.game.controller.MainThread;

/**
 * Created by sscsis on 1/7/15.
 */
public class GameCanvas extends SurfaceView implements SurfaceHolder.Callback {

    MainThread thread;



    public GameCanvas(Context context) {
        super(context);
        getHolder().addCallback(this);
        setFocusable(true);

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        thread = new MainThread(getHolder(), this);
        thread.setRunning(true);
        thread.start();


    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {



    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    int loopcolor = 0;
    boolean colors = false;
    public void render(Canvas canvas) {


    }

    public void update() {


    }


}
