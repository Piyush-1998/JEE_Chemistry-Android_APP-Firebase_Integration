package com.pm161998.jeechemistry;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import hotchemi.android.rate.AppRate;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import maes.tech.intentanim.CustomIntent;

/* loaded from: classes.dex */
public class dashboard extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    Button btn_book;
    Button btn_cheatbook;
    Button btn_flt;
    Button btn_formula;
    Button btn_mock;
    Button btn_physics;
    Button btn_question;
    Button btn_syllabus;
    InterstitialAd mInterstitialAd;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_dashboard);
        this.btn_syllabus = (Button) findViewById(R.id.buttonSyllabus);
        this.btn_formula = (Button) findViewById(R.id.buttonFormula);
        this.btn_cheatbook = (Button) findViewById(R.id.buttonCheat);
        this.btn_book = (Button) findViewById(R.id.buttonBook);
        this.btn_question = (Button) findViewById(R.id.buttonQuestion);
        this.btn_physics = (Button) findViewById(R.id.buttonPhysics);
        this.btn_mock = (Button) findViewById(R.id.buttonMock);
        this.btn_flt = (Button) findViewById(R.id.buttonFlt);
        MobileAds.initialize(this, "ca-app-pub-9421094793250690/2902505447");
        new AdRequest.Builder().build();
        prepareAd();
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() { // from class: com.pm161998.jeechemistry.dashboard.1
            @Override // java.lang.Runnable
            public void run() {
                Log.i("hello", "world");
                dashboard.this.runOnUiThread(new Runnable() { // from class: com.pm161998.jeechemistry.dashboard.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (dashboard.this.mInterstitialAd.isLoaded()) {
                            dashboard.this.mInterstitialAd.show();
                        } else {
                            Log.d("TAG", " Interstitial not loaded");
                        }
                        dashboard.this.prepareAd();
                    }
                });
            }
        }, 200L, 200L, TimeUnit.SECONDS);
        checkConnection();
        AppRate.with(this).setInstallDays(1).setLaunchTimes(3).setRemindInterval(2).monitor();
        AppRate.showRateDialogIfMeetsConditions(this);
        AppRate.with(this).clearAgreeShowDialog();
        this.btn_syllabus.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), Syllabus_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "left-to-right");
            }
        });
        this.btn_formula.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), formula_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "right-to-left");
            }
        });
        this.btn_cheatbook.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), CheatBook_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "bottom-to-up");
            }
        });
        this.btn_book.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), Books_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "up-to-bottom");
            }
        });
        this.btn_question.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), Questions_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "bottom-to-up");
            }
        });
        this.btn_physics.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), Chemistry_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "up-to-bottom");
            }
        });
        this.btn_mock.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), MockTest_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "right-to-left");
            }
        });
        this.btn_flt.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeechemistry.dashboard.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dashboard.this.startActivity(new Intent(dashboard.this.getApplicationContext(), flt_view_pdf_opener.class));
                CustomIntent.customType(dashboard.this, "left-to-right");
            }
        });
    }

    public void prepareAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId("ca-app-pub-9421094793250690/2902505447");
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void checkConnection() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                StyleableToast.makeText(this, "You are online!!", R.style.positivexampleToast).show();
            }
            if (activeNetworkInfo.getType() == 0) {
                StyleableToast.makeText(this, "You are online!!", R.style.positivexampleToast).show();
                return;
            }
            return;
        }
        StyleableToast.makeText(this, "Oops!! No Internet Connection", R.style.negativexampleToast).show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.backPressedTime + 2000 > System.currentTimeMillis()) {
            this.backToast.cancel();
            super.onBackPressed();
            return;
        }
        Toast makeText = Toast.makeText(getBaseContext(), "Press back again to exit", 0);
        this.backToast = makeText;
        makeText.show();
        this.backPressedTime = System.currentTimeMillis();
    }
}
