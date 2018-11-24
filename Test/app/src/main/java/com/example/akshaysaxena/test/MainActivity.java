package com.example.akshaysaxena.test;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{
    private ConstraintLayout cl;
    cl = (ConstraintLayout) findViewById(R.id.clayout) {
        cl =
                (ConstraintLayout)findViewById(R.id.clayout);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        message1 = (TextView) findViewById(R.id.message);
        this.gestureDetector = new GestureDetectorCompat(this, this);
        gestureDetector.setOnDoubleTapListener(this);



        Button changebutton = (Button) findViewById((R.id.changeb));
        final EditText editText = (EditText) findViewById((R.id.editText));
        final EditText editText2 = (EditText) findViewById((R.id.editText2));

        changebutton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView changetextview = (TextView) findViewById(R.id.message);
                        changetextview.setText("Good job");

                        TextView changetextview2 = (TextView) findViewById(R.id.textView2);
                        Editable password = editText2.getText();
                        if(password.equals("Hello")) {
                            changetextview2.setText("Hello " + editText.getText());
                        }
                        else
                            changetextview2.setText("Incorrect password");
                        //changetextview2.setText(password);
                    }}

        );
    }


    private TextView message1;
    private GestureDetectorCompat gestureDetector;

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        message1.setText("onSingleTapConfirmed");
        ConstraintLayout clayer = new ConstraintLayout(this);

        cl.setBackgroundColor(Color.YELLOW);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        message1.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        message1.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        message1.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        message1.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        message1.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        message1.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        message1.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        message1.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
