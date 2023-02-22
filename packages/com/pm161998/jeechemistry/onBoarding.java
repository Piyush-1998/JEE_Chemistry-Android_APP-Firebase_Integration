package com.pm161998.jeechemistry;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class onBoarding extends AppCompatActivity {
    Animation animation;
    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() { // from class: com.pm161998.jeechemistry.onBoarding.1
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            onBoarding.this.addDots(i);
            onBoarding.this.currentPos = i;
            if (i == 0) {
                onBoarding.this.letsGetStarted.setVisibility(4);
            } else if (i == 1) {
                onBoarding.this.letsGetStarted.setVisibility(4);
            } else if (i == 2) {
                onBoarding.this.letsGetStarted.setVisibility(4);
            } else {
                onBoarding onboarding = onBoarding.this;
                onboarding.animation = AnimationUtils.loadAnimation(onboarding, R.anim.bottom_anim);
                onBoarding.this.letsGetStarted.setAnimation(onBoarding.this.animation);
                onBoarding.this.letsGetStarted.setVisibility(0);
            }
        }
    };
    int currentPos;
    TextView[] dots;
    LinearLayout dotsLayout;
    Button letsGetStarted;
    SliderAdapter sliderAdapter;
    ViewPager viewPager;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_on_boarding);
        this.viewPager = (ViewPager) findViewById(R.id.slider);
        this.dotsLayout = (LinearLayout) findViewById(R.id.dots);
        this.letsGetStarted = (Button) findViewById(R.id.get_started_btn);
        SliderAdapter sliderAdapter = new SliderAdapter(this);
        this.sliderAdapter = sliderAdapter;
        this.viewPager.setAdapter(sliderAdapter);
        addDots(0);
        this.viewPager.addOnPageChangeListener(this.changeListener);
    }

    public void skip(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    public void next(View view) {
        this.viewPager.setCurrentItem(this.currentPos + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDots(int i) {
        TextView[] textViewArr;
        this.dots = new TextView[4];
        this.dotsLayout.removeAllViews();
        int i2 = 0;
        while (true) {
            textViewArr = this.dots;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = new TextView(this);
            this.dots[i2].setText(Html.fromHtml("&#8226"));
            this.dots[i2].setTextSize(35.0f);
            this.dotsLayout.addView(this.dots[i2]);
            i2++;
        }
        if (textViewArr.length > 0) {
            textViewArr[i].setTextColor(getResources().getColor(R.color.colorDots));
        }
    }
}
