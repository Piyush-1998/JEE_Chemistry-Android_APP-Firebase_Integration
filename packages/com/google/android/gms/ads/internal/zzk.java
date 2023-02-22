package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzuy;
import com.google.android.gms.internal.ads.zzza;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzk extends WebViewClient {
    private final /* synthetic */ zzl zzblj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(zzl zzlVar) {
        this.zzblj = zzlVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzuy zzuyVar;
        zzuy zzuyVar2;
        String zzbo;
        zzuy zzuyVar3;
        zzuy zzuyVar4;
        zzuy zzuyVar5;
        zzuy zzuyVar6;
        zzuy zzuyVar7;
        zzuy zzuyVar8;
        if (str.startsWith(this.zzblj.zzjy())) {
            return false;
        }
        if (!str.startsWith((String) zzuv.zzon().zzd(zzza.zzcpa))) {
            if (!str.startsWith((String) zzuv.zzon().zzd(zzza.zzcpb))) {
                if (!str.startsWith((String) zzuv.zzon().zzd(zzza.zzcpc))) {
                    if (str.startsWith("gmsg://")) {
                        return true;
                    }
                    zzuyVar = this.zzblj.zzblp;
                    if (zzuyVar != null) {
                        try {
                            zzuyVar2 = this.zzblj.zzblp;
                            zzuyVar2.onAdLeftApplication();
                        } catch (RemoteException e) {
                            zzaug.zze("#007 Could not call remote method.", e);
                        }
                    }
                    zzbo = this.zzblj.zzbo(str);
                    this.zzblj.zzbp(zzbo);
                    return true;
                }
                zzuyVar3 = this.zzblj.zzblp;
                if (zzuyVar3 != null) {
                    try {
                        zzuyVar4 = this.zzblj.zzblp;
                        zzuyVar4.onAdLoaded();
                    } catch (RemoteException e2) {
                        zzaug.zze("#007 Could not call remote method.", e2);
                    }
                }
                this.zzblj.zzbl(this.zzblj.zzbn(str));
                return true;
            }
            zzuyVar5 = this.zzblj.zzblp;
            if (zzuyVar5 != null) {
                try {
                    zzuyVar6 = this.zzblj.zzblp;
                    zzuyVar6.onAdFailedToLoad(0);
                } catch (RemoteException e3) {
                    zzaug.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzblj.zzbl(0);
            return true;
        }
        zzuyVar7 = this.zzblj.zzblp;
        if (zzuyVar7 != null) {
            try {
                zzuyVar8 = this.zzblj.zzblp;
                zzuyVar8.onAdFailedToLoad(3);
            } catch (RemoteException e4) {
                zzaug.zze("#007 Could not call remote method.", e4);
            }
        }
        this.zzblj.zzbl(0);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzuy zzuyVar;
        zzuy zzuyVar2;
        zzuyVar = this.zzblj.zzblp;
        if (zzuyVar != null) {
            try {
                zzuyVar2 = this.zzblj.zzblp;
                zzuyVar2.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzaug.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
