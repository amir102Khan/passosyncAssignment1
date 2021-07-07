package com.myapplication.passosyncassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.myapplication.passosyncassignment1.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {

  private ActivitySignUpBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
    bounce();
    binding.tvLogin.setOnClickListener(view -> onBackPressed());

    binding.btnSignUp.setOnClickListener(
        view -> startActivity(new Intent(getApplicationContext(), HomeScreen.class)));
  }

  private void bounce() {
    Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
    binding.img.startAnimation(animation);
  }
}
