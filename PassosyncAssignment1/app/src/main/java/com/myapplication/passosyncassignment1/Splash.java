package com.myapplication.passosyncassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.myapplication.passosyncassignment1.databinding.ActivitySplashBinding;

public class Splash extends AppCompatActivity {

  private static final int TIMER = 1000;
  private ActivitySplashBinding binding;
  private Handler handler;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
    handler = new Handler();

    zoomIn();
  }

  private void zoomIn() {
    Animation animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
    binding.imgLogo.startAnimation(animation);
    animation.setAnimationListener(new Animation.AnimationListener() {
      @Override
      public void onAnimationStart(Animation animation) {

      }

      @Override
      public void onAnimationEnd(Animation animation) {
        startLoginActivity();
      }

      @Override
      public void onAnimationRepeat(Animation animation) {

      }
    });
  }

  private void startLoginActivity() {
    handler.postDelayed(() -> {
      startActivity(new Intent(getApplicationContext(), MainActivity.class));
      finish();
    }, TIMER);

  }
}