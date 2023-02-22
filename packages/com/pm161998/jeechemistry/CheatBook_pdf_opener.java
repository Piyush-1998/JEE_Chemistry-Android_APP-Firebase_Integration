package com.pm161998.jeechemistry;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class CheatBook_pdf_opener extends AppCompatActivity {
    DatabaseReference mref2 = FirebaseDatabase.getInstance().getReference().child("brainmap");
    private PDFView pdfView;
    private TextView text1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_cheat_book_pdf_opener);
        this.pdfView = (PDFView) findViewById(R.id.pdfView);
        this.text1 = (TextView) findViewById(R.id.text1);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.progressBar2);
        this.mref2.addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeechemistry.CheatBook_pdf_opener.1
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                CheatBook_pdf_opener.this.text1.setText(CheatBook_pdf_opener.this.getIntent().getStringExtra("EXTRA_MESSAGE"));
                StyleableToast.makeText(CheatBook_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                lottieAnimationView.playAnimation();
                CheatBook_pdf_opener.this.pdfView.setVisibility(4);
                new RetrivePdfStream().execute(CheatBook_pdf_opener.this.text1.getText().toString());
            }
        });
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
            CheatBook_pdf_opener.this.pdfView.fromStream(inputStream).defaultPage(0).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(CheatBook_pdf_opener.this)).spacing(2).swipeHorizontal(false).onLoad(this).load();
        }

        @Override // com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener
        public void loadComplete(int i) {
            CheatBook_pdf_opener.this.pdfView.setVisibility(0);
            ((LottieAnimationView) CheatBook_pdf_opener.this.findViewById(R.id.progressBar2)).cancelAnimation();
        }
    }
}
