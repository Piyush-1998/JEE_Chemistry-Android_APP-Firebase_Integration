package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

/* loaded from: classes.dex */
class DecodingAsyncTask extends AsyncTask<Void, Void, Throwable> {
    private boolean cancelled = false;
    private Context context;
    private DocumentSource docSource;
    private int firstPageIdx;
    private int pageHeight;
    private int pageWidth;
    private String password;
    private PdfDocument pdfDocument;
    private PDFView pdfView;
    private PdfiumCore pdfiumCore;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DecodingAsyncTask(DocumentSource documentSource, String str, PDFView pDFView, PdfiumCore pdfiumCore, int i) {
        this.docSource = documentSource;
        this.firstPageIdx = i;
        this.pdfView = pDFView;
        this.password = str;
        this.pdfiumCore = pdfiumCore;
        this.context = pDFView.getContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Throwable doInBackground(Void... voidArr) {
        try {
            PdfDocument createDocument = this.docSource.createDocument(this.context, this.pdfiumCore, this.password);
            this.pdfDocument = createDocument;
            this.pdfiumCore.openPage(createDocument, this.firstPageIdx);
            this.pageWidth = this.pdfiumCore.getPageWidth(this.pdfDocument, this.firstPageIdx);
            this.pageHeight = this.pdfiumCore.getPageHeight(this.pdfDocument, this.firstPageIdx);
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Throwable th) {
        if (th != null) {
            this.pdfView.loadError(th);
        } else if (this.cancelled) {
        } else {
            this.pdfView.loadComplete(this.pdfDocument, this.pageWidth, this.pageHeight);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        this.cancelled = true;
    }
}
