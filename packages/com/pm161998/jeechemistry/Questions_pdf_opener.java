package com.pm161998.jeechemistry;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class Questions_pdf_opener extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private PDFView pdfView;
    private TextView text1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_questions_pdf_opener);
        this.pdfView = (PDFView) findViewById(R.id.pdfView);
        this.text1 = (TextView) findViewById(R.id.text1);
        String stringExtra = getIntent().getStringExtra("pdfFileName");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.progressBar2);
        checkConnection();
        if (stringExtra.equals("1.1 Theory")) {
            this.database.getReference("1:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.1
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("1.2 Simple_Exercise")) {
            this.database.getReference("1:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.2
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("1.3 Detailed_Solutions")) {
            this.database.getReference("1:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.3
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("1.4 Self_Evaluation-Test")) {
            this.database.getReference("1:4 Self_Evaluation-Test").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.4
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("2.1 Theory")) {
            this.database.getReference("2:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.5
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("2.2 Simple_Exercise")) {
            this.database.getReference("2:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.6
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("2.3 Detailed_Solutions")) {
            this.database.getReference("2:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.7
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("2.4 Self_Evaluation-Test")) {
            this.database.getReference("2:4 Self_Evaluation-Test").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.8
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("3.1 Theory")) {
            this.database.getReference("3:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.9
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("3.2 Simple_Exercise")) {
            this.database.getReference("3:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.10
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("3.3 Detailed_Solutions")) {
            this.database.getReference("3:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.11
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("3.4 Self_Evaluation-Test")) {
            this.database.getReference("3:4 Self_Evaluation-Test").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.12
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("4.1 Theory")) {
            this.database.getReference("4:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.13
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("4.2 Simple_Exercise")) {
            this.database.getReference("4:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.14
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("4.3 Detailed_Solutions")) {
            this.database.getReference("4:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.15
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("4.4 Self_Evaluation-Test")) {
            this.database.getReference("4:4 Self_Evaluation-Test").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.16
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("5.1 Theory")) {
            this.database.getReference("5:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.17
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("5.2 Simple_Exercise")) {
            this.database.getReference("5:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.18
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("5.3 Detailed_Solutions")) {
            this.database.getReference("5:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.19
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("5.4 Self_Evaluation-Tests")) {
            this.database.getReference("5:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.20
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("6.1 Theory")) {
            this.database.getReference("6:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.21
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("6.2 Simple_Exercise")) {
            this.database.getReference("6:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.22
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("6.3 Detailed_Solutions")) {
            this.database.getReference("6:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.23
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("6.4 Self_Evaluation-Tests")) {
            this.database.getReference("6:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.24
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("7.1 Theory")) {
            this.database.getReference("7:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.25
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("7.2 Simple_Exercise")) {
            this.database.getReference("7:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.26
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("7.3 Detailed_Solutions")) {
            this.database.getReference("7:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.27
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("7.4 Self_Evaluation-Tests")) {
            this.database.getReference("7:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.28
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("8.1 Theory")) {
            this.database.getReference("8:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.29
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("8.2 Simple_Exercise")) {
            this.database.getReference("8:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.30
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("8.3 Detailed_Solutions")) {
            this.database.getReference("8:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.31
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("8.4 Self_Evaluation-Tests")) {
            this.database.getReference("8:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.32
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("9.1 Theory")) {
            this.database.getReference("9:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.33
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("9.2 Simple_Exercise")) {
            this.database.getReference("9:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.34
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("9.3 Detailed_Solutions")) {
            this.database.getReference("9:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.35
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("9.4 Self_Evaluation-Tests")) {
            this.database.getReference("9:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.36
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("10.1 Theory")) {
            this.database.getReference("10:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.37
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("10.2 Simple_Exercise")) {
            this.database.getReference("10:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.38
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("10.3 Detailed_Solutions")) {
            this.database.getReference("10:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.39
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("10.4 Self_Evaluation-Tests")) {
            this.database.getReference("10:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.40
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("11.1 Theory")) {
            this.database.getReference("11:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.41
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("11.2 Simple_Exercise")) {
            this.database.getReference("11:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.42
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("11.3 Detailed_Solutions")) {
            this.database.getReference("11:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.43
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("11.4 Self_Evaluation-Tests")) {
            this.database.getReference("11:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.44
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("12.1 Theory")) {
            this.database.getReference("12:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.45
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("12.2 Simple_Exercise")) {
            this.database.getReference("12:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.46
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("12.3 Detailed_Solutions")) {
            this.database.getReference("12:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.47
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("12.4 Self_Evaluation-Tests")) {
            this.database.getReference("12:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.48
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("13.1 Theory")) {
            this.database.getReference("13:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.49
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("13.2 Simple_Exercise")) {
            this.database.getReference("13:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.50
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("13.3 Detailed_Solutions")) {
            this.database.getReference("13:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.51
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("13.4 Self_Evaluation-Tests")) {
            this.database.getReference("13:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.52
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("14.1 Theory")) {
            this.database.getReference("14:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.53
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("14.2 Simple_Exercise")) {
            this.database.getReference("14:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.54
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("14.3 Detailed_Solutions")) {
            this.database.getReference("14:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.55
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("14.4 Self_Evaluation-Tests")) {
            this.database.getReference("14:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.56
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("15.1 Theory")) {
            this.database.getReference("15:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.57
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("15.2 Simple_Exercise")) {
            this.database.getReference("15:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.58
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("15.3 Detailed_Solutions")) {
            this.database.getReference("15:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.59
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("15.4 Self_Evaluation-Tests")) {
            this.database.getReference("15:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.60
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("16.1 Theory")) {
            this.database.getReference("16:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.61
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("16.2 Simple_Exercise")) {
            this.database.getReference("16:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.62
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("16.3 Detailed_Solutions")) {
            this.database.getReference("16:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.63
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("16.4 Self_Evaluation-Tests")) {
            this.database.getReference("16:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.64
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("17.1 Theory")) {
            this.database.getReference("17:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.65
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("17.2 Simple_Exercise")) {
            this.database.getReference("17:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.66
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("17.3 Detailed_Solutions")) {
            this.database.getReference("17:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.67
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("17.4 Self_Evaluation-Tests")) {
            this.database.getReference("17:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.68
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.1 Theory - 1")) {
            this.database.getReference("18:1 Theory - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.69
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.2 Theory - 2")) {
            this.database.getReference("18:2 Theory - 2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.70
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.3 Theory - 3")) {
            this.database.getReference("18:3 Theory - 3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.71
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.4 Theory - 4")) {
            this.database.getReference("18:4 Theory - 4").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.72
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.5 Simple_Exercise - 1")) {
            this.database.getReference("18:5 Simple_Exercise - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.73
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.6 Simple_Exercise - 2")) {
            this.database.getReference("18:6 Simple_Exercise - 2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.74
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.7 Simple_Exercise - 3")) {
            this.database.getReference("18:7 Simple_Exercise - 3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.75
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.8 Detailed_Solutions")) {
            this.database.getReference("18:8 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.76
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("18.9 Self_Evaluation-Tests")) {
            this.database.getReference("18:9 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.77
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("19.1 Theory")) {
            this.database.getReference("19:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.78
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("19.2 Simple_Exercise - 1")) {
            this.database.getReference("19:2 Simple_Exercise - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.79
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("19.3 Simple_Exercise - 2")) {
            this.database.getReference("19:3 Simple_Exercise - 2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.80
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("19.4 Detailed_Solutions")) {
            this.database.getReference("19:4 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.81
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("19.5 Self_Evaluation-Tests")) {
            this.database.getReference("19:5 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.82
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("20.1 Theory")) {
            this.database.getReference("20:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.83
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("20.2 Simple_Exercise")) {
            this.database.getReference("20:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.84
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("20.3 Detailed_Solutions")) {
            this.database.getReference("20:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.85
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("20.4 Self_Evaluation-Tests")) {
            this.database.getReference("20:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.86
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("21.1 Theory")) {
            this.database.getReference("21:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.87
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("21.2 Simple_Exercise")) {
            this.database.getReference("21:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.88
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("21.3 Detailed_Solutions")) {
            this.database.getReference("21:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.89
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("21.4 Self_Evaluation-Tests")) {
            this.database.getReference("21:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.90
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("22.1 Theory")) {
            this.database.getReference("22:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.91
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("22.2 Simple_Exercise")) {
            this.database.getReference("22:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.92
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("22.3 Detailed_Solutions")) {
            this.database.getReference("22:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.93
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("22.4 Self_Evaluation-Tests")) {
            this.database.getReference("22:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.94
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("23.1 Theory - 1")) {
            this.database.getReference("23:1 Theory - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.95
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("23.2 Theory - 2")) {
            this.database.getReference("23:2 Theory - 2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.96
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("23.3 Simple_Exercise")) {
            this.database.getReference("23:3 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.97
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("23.4 Detailed_Solutions")) {
            this.database.getReference("23:4 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.98
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("23.5 Self_Evaluation-Tests")) {
            this.database.getReference("23:5 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.99
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("24.1 Theory")) {
            this.database.getReference("24:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.100
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("24.2 Simple_Exercise")) {
            this.database.getReference("24:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.101
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("24.3 Detailed_Solutions")) {
            this.database.getReference("24:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.102
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("24.4 Self_Evaluation-Tests")) {
            this.database.getReference("24:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.103
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("25.1 Theory - 1")) {
            this.database.getReference("25:1 Theory - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.104
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("25.2 Simple_Exercise")) {
            this.database.getReference("25:3 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.105
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("25.3 Detailed_Solutions")) {
            this.database.getReference("25:4 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.106
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("25.4 Self_Evaluation-Tests")) {
            this.database.getReference("25:5 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.107
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("26.1 Theory")) {
            this.database.getReference("26:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.108
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("26.2 Simple_Exercise")) {
            this.database.getReference("26:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.109
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("26.3 Detailed_Solutions")) {
            this.database.getReference("26:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.110
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("26.4 Self_Evaluation-Tests")) {
            this.database.getReference("26:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.111
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("27.1 Theory")) {
            this.database.getReference("27:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.112
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("27.2 Simple_Exercise")) {
            this.database.getReference("27:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.113
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("27.3 Detailed_Solutions")) {
            this.database.getReference("27:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.114
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("27.4 Self_Evaluation-Tests")) {
            this.database.getReference("27:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.115
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("28.1 Theory")) {
            this.database.getReference("28:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.116
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("28.2 Simple_Exercise")) {
            this.database.getReference("28:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.117
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("28.3 Detailed_Solutions")) {
            this.database.getReference("28:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.118
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("28.4 Self_Evaluation-Tests")) {
            this.database.getReference("28:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.119
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("29.1 Theory - 1")) {
            this.database.getReference("29:1 Theory - 1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.120
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("29.2 Theory - 2")) {
            this.database.getReference("29:2 Theory - 2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.121
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("29.3 Simple_Exercise")) {
            this.database.getReference("29:3 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.122
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("29.4 Detailed_Solutions")) {
            this.database.getReference("29:4 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.123
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("29.5 Self_Evaluation-Tests")) {
            this.database.getReference("29:5 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.124
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("30.1 Theory")) {
            this.database.getReference("30:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.125
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("30.2 Simple_Exercise")) {
            this.database.getReference("30:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.126
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("30.3 Detailed_Solutions")) {
            this.database.getReference("30:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.127
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("30.4 Self_Evaluation-Tests")) {
            this.database.getReference("30:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.128
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("31.1 Theory")) {
            this.database.getReference("31:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.129
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("31.2 Simple_Exercise")) {
            this.database.getReference("31:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.130
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("31.3 Detailed_Solutions")) {
            this.database.getReference("31:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.131
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("31.4 Self_Evaluation-Tests")) {
            this.database.getReference("31:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.132
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("32.1 Theory")) {
            this.database.getReference("32:1 Theory").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.133
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("32.2 Simple_Exercise")) {
            this.database.getReference("32:2 Simple_Exercise").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.134
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("32.3 Detailed_Solutions")) {
            this.database.getReference("32:3 Detailed_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.135
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("32.4 Self_Evaluation-Tests")) {
            this.database.getReference("32:4 Self_Evaluation-Tests").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.Questions_pdf_opener.136
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
    }

    public void checkConnection() {
        if (((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            startActivity(new Intent(this, no_internet_connection2.class));
            finish();
        }
    }

    /* loaded from: classes.dex */
    class RetrivePdfStream extends AsyncTask<String, Void, InputStream> implements OnLoadCompleteListener {
        RetrivePdfStream() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public InputStream doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                if (httpURLConnection.getResponseCode() == 200) {
                    return new BufferedInputStream(httpURLConnection.getInputStream());
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(InputStream inputStream) {
            Questions_pdf_opener.this.pdfView.fromStream(inputStream).defaultPage(0).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(Questions_pdf_opener.this)).spacing(2).swipeHorizontal(false).onLoad(this).load();
        }

        @Override // com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener
        public void loadComplete(int i) {
            Questions_pdf_opener.this.pdfView.setVisibility(0);
            ((LottieAnimationView) Questions_pdf_opener.this.findViewById(R.id.progressBar2)).cancelAnimation();
        }
    }
}
