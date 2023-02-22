package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzand implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzana zzdge;
    private final /* synthetic */ String zzdgf;
    private final /* synthetic */ String zzdgg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzand(zzana zzanaVar, String str, String str2) {
        this.zzdge = zzanaVar;
        this.zzdgf = str;
        this.zzdgg = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzdge.zzlk;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zzdgf;
            String str2 = this.zzdgg;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzq.zzkl();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdge.zzdn("Could not store picture.");
        }
    }
}
