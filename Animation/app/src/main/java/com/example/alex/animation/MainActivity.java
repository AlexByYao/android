package com.example.alex.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View mView4Animation;
    private View mtv4Alpha;
    private View mtv4Scale;
    private View mtv4Translate;
    private View mtv4Rotate;
    private View mtv4Set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mView4Animation = findViewById(R.id.animation);
        mtv4Alpha = (TextView)findViewById(R.id.alpha);
        mtv4Scale = (TextView)findViewById(R.id.scale);
        mtv4Translate = (TextView)findViewById(R.id.translate);
        mtv4Rotate = (TextView)findViewById(R.id.rotate);
        mtv4Set = (TextView)findViewById(R.id.set);
        mtv4Alpha.setOnClickListener(this);
        mtv4Scale.setOnClickListener(this);
        mtv4Translate.setOnClickListener(this);
        mtv4Rotate.setOnClickListener(this);
        mtv4Set.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.alpha: {
                onAlphaTextClick();
                break;
            }
            case R.id.scale: {
                onScaleTextClick();
                break;
            }
            case R.id.translate: {
                onTranslateTextClick();
                break;
            }
            case R.id.rotate: {
                onRotateTextClick();
                break;
            }
            case R.id.set: {
                onSetTextClick();
                break;
            }
            default:
                break;
        }
    }

    //两种方法加载动画效果，1.xml, 2.代码
    private void onAlphaTextClick() {
        //xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        //code
//        Animation animation = new AlphaAnimation(0.0f, 1.0f);
//        animation.setDuration(2000);
//        animation.setRepeatMode(Animation.REVERSE);
//        animation.setFillAfter(true);
//        animation.setRepeatCount(10);
        //
        animation.setAnimationListener(mAnimationListener);
        mView4Animation.setVisibility(View.VISIBLE);
        mView4Animation.startAnimation(animation);
    }

    private void onScaleTextClick() {
        //xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        //code
        //以中心为缩放点
        //Animation animation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        //以view左上角，X轴增加100px，Y轴增加200px，为缩放点，由初始状态缩小一倍
        //Animation animation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 100.0f, 200.0f);
        //以view左上角为缩放点，由初始状态缩小一倍
        //Animation animation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f);
        //animation.setDuration(1500);
        //animation.setRepeatMode(Animation.REVERSE);
        //animation.setRepeatCount(-1);
        //animation.setFillBefore(true);
        //
        animation.setAnimationListener(mAnimationListener);
        mView4Animation.setVisibility(View.VISIBLE);
        mView4Animation.startAnimation(animation);
    }

    private void onTranslateTextClick() {
        //xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        //code
//        Animation animation = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, 0.7f, Animation.RELATIVE_TO_PARENT, 0.0f,
//                Animation.RELATIVE_TO_PARENT, 1.0f, Animation.RELATIVE_TO_PARENT, 0.0f);
//        animation.setDuration(2000);
//        animation.setRepeatMode(Animation.REVERSE);
//        animation.setRepeatCount(-1);
//        animation.setFillBefore(true);
        //
        animation.setAnimationListener(mAnimationListener);
        mView4Animation.setVisibility(View.VISIBLE);
        mView4Animation.startAnimation(animation);
    }

    private void onRotateTextClick() {
        //xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        //code
//        Animation animation = new RotateAnimation( 359.0f, 0.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        animation.setDuration(1000);
//        animation.setRepeatMode(Animation.REVERSE);
//        animation.setRepeatCount(-1);
//        animation.setFillBefore(true);
        //
        animation.setAnimationListener(mAnimationListener);
        mView4Animation.setVisibility(View.VISIBLE);
        mView4Animation.startAnimation(animation);
    }

    private void onSetTextClick() {
        //xml
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.set);
        //code
//        Animation animation = new RotateAnimation( 359.0f, 0.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        animation.setDuration(1000);
//        animation.setRepeatMode(Animation.REVERSE);
//        animation.setRepeatCount(-1);
//        animation.setFillBefore(true);
        //
        animation.setAnimationListener(mAnimationListener);
        mView4Animation.setVisibility(View.VISIBLE);
        mView4Animation.startAnimation(animation);
    }

    private Animation.AnimationListener mAnimationListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            mView4Animation.setVisibility(View.GONE);
            mView4Animation.clearAnimation();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
}
