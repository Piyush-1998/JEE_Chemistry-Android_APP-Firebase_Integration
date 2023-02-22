package com.pm161998.jeechemistry;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;
    SharedPreferences OnBoardingScreen;
    Animation bottomAnim;
    ImageView image;
    TextView logo;
    TextView slogan;
    Animation topAnim;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_main);
        this.topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        this.bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
        this.image = (ImageView) findViewById(R.id.imageView);
        this.logo = (TextView) findViewById(R.id.textView);
        this.slogan = (TextView) findViewById(R.id.textView2);
        this.image.setAnimation(this.topAnim);
        this.logo.setAnimation(this.bottomAnim);
        this.slogan.setAnimation(this.bottomAnim);
        new Handler().postDelayed(new Runnable() { // from class: com.pm161998.jeechemistry.MainActivity.1
            @Override // java.lang.Runnable
            public void run() {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.OnBoardingScreen = mainActivity.getSharedPreferences("OnBoardingScreen", 0);
                if (MainActivity.this.OnBoardingScreen.getBoolean("firstTime", true)) {
                    SharedPreferences.Editor edit = MainActivity.this.OnBoardingScreen.edit();
                    edit.putBoolean("firstTime", false);
                    edit.commit();
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), onBoarding.class));
                    MainActivity.this.finish();
                    return;
                }
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), dashboard.class));
                MainActivity.this.finish();
            }
        }, SPLASH_SCREEN);
    }
}
