package com.myapplication.passosyncassignment1;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import com.myapplication.passosyncassignment1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding mainBinding;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    bounce();

    mainBinding.tvCreateAccount.setOnClickListener(
        view -> startActivity(new Intent(getApplicationContext(), SignUp.class)));

    mainBinding.btnLogin.setOnClickListener(
        view -> startActivity(new Intent(getApplicationContext(), HomeScreen.class)));
  }

  private void bounce() {
    Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
    mainBinding.img.startAnimation(animation);
  }
}