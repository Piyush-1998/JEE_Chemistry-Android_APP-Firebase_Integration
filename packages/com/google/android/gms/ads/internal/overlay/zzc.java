package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzann;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzaul;
import com.google.android.gms.internal.ads.zzaur;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzza;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzc extends zzann implements zzy {
    private static final int zzdgu = Color.argb(0, 0, 0, 0);
    zzbbw zzczi;
    AdOverlayInfoParcel zzdgv;
    private zzi zzdgw;
    private zzq zzdgx;
    private FrameLayout zzdgz;
    private WebChromeClient.CustomViewCallback zzdha;
    private zzj zzdhc;
    private Runnable zzdhg;
    private boolean zzdhh;
    private boolean zzdhi;
    protected final Activity zzzr;
    private boolean zzdgy = false;
    private boolean zzdhb = false;
    private boolean zzbkw = false;
    private boolean zzdhd = false;
    int zzdhe = 0;
    private final Object zzdhf = new Object();
    private boolean zzdhj = false;
    private boolean zzdhk = false;
    private boolean zzdhl = true;

    public zzc(Activity activity) {
        this.zzzr = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onRestart() {
    }

    public final void close() {
        this.zzdhe = 2;
        this.zzzr.finish();
    }

    public final void zzsn() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdgv;
        if (adOverlayInfoParcel != null && this.zzdgy) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdgz != null) {
            this.zzzr.setContentView(this.zzdhc);
            this.zzdhi = true;
            this.zzdgz.removeAllViews();
            this.zzdgz = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdha;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdha = null;
        }
        this.zzdgy = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzso() {
        this.zzdhe = 1;
        this.zzzr.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onBackPressed() {
        this.zzdhe = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final boolean zzsp() {
        this.zzdhe = 0;
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar == null) {
            return true;
        }
        boolean zzzw = zzbbwVar.zzzw();
        if (!zzzw) {
            this.zzczi.zza("onbackblocked", Collections.emptyMap());
        }
        return zzzw;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public void onCreate(Bundle bundle) {
        this.zzzr.requestWindowFeature(1);
        this.zzdhb = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzzr.getIntent());
            this.zzdgv = zzc;
            if (zzc == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (zzc.zzblk.zzdwf > 7500000) {
                this.zzdhe = 3;
            }
            if (this.zzzr.getIntent() != null) {
                this.zzdhl = this.zzzr.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzdgv.zzdif != null) {
                this.zzbkw = this.zzdgv.zzdif.zzbkw;
            } else {
                this.zzbkw = false;
            }
            if (this.zzbkw && this.zzdgv.zzdif.zzblb != -1) {
                new zzl(this).zzut();
            }
            if (bundle == null) {
                if (this.zzdgv.zzdhy != null && this.zzdhl) {
                    this.zzdgv.zzdhy.zzsj();
                }
                if (this.zzdgv.zzdid != 1 && this.zzdgv.zzcbs != null) {
                    this.zzdgv.zzcbs.onAdClicked();
                }
            }
            zzj zzjVar = new zzj(this.zzzr, this.zzdgv.zzdie, this.zzdgv.zzblk.zzblz);
            this.zzdhc = zzjVar;
            zzjVar.setId(1000);
            com.google.android.gms.ads.internal.zzq.zzkl().zzg(this.zzzr);
            int i = this.zzdgv.zzdid;
            if (i == 1) {
                zzac(false);
            } else if (i == 2) {
                this.zzdgw = new zzi(this.zzdgv.zzczi);
                zzac(false);
            } else if (i == 3) {
                zzac(true);
            } else {
                throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            zzaug.zzeu(e.getMessage());
            this.zzdhe = 3;
            this.zzzr.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onStart() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqi)).booleanValue()) {
            zzbbw zzbbwVar = this.zzczi;
            if (zzbbwVar != null && !zzbbwVar.isDestroyed()) {
                com.google.android.gms.ads.internal.zzq.zzkl();
                zzaur.zzb(this.zzczi);
                return;
            }
            zzaug.zzeu("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onResume() {
        if (this.zzdgv.zzdhy != null) {
            this.zzdgv.zzdhy.onResume();
        }
        zza(this.zzzr.getResources().getConfiguration());
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqi)).booleanValue()) {
            return;
        }
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null && !zzbbwVar.isDestroyed()) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            zzaur.zzb(this.zzczi);
            return;
        }
        zzaug.zzeu("The webview does not exist. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onPause() {
        zzsn();
        if (this.zzdgv.zzdhy != null) {
            this.zzdgv.zzdhy.onPause();
        }
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcqi)).booleanValue() && this.zzczi != null && (!this.zzzr.isFinishing() || this.zzdgw == null)) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            zzaur.zza(this.zzczi);
        }
        zzsr();
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzag(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdhb);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onStop() {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcqi)).booleanValue() && this.zzczi != null && (!this.zzzr.isFinishing() || this.zzdgw == null)) {
            com.google.android.gms.ads.internal.zzq.zzkl();
            zzaur.zza(this.zzczi);
        }
        zzsr();
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onDestroy() {
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            this.zzdhc.removeView(zzbbwVar.getView());
        }
        zzsr();
    }

    private final void zzab(boolean z) {
        int intValue = ((Integer) zzuv.zzon().zzd(zzza.zzcqk)).intValue();
        zzp zzpVar = new zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = z ? intValue : 0;
        zzpVar.paddingRight = z ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        this.zzdgx = new zzq(this.zzzr, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdgv.zzdia);
        this.zzdhc.addView(this.zzdgx, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzda() {
        this.zzdhi = true;
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzuv.zzon().zzd(zzza.zzcku)).booleanValue() && (adOverlayInfoParcel2 = this.zzdgv) != null && adOverlayInfoParcel2.zzdif != null && this.zzdgv.zzdif.zzbld;
        boolean z5 = ((Boolean) zzuv.zzon().zzd(zzza.zzckv)).booleanValue() && (adOverlayInfoParcel = this.zzdgv) != null && adOverlayInfoParcel.zzdif != null && this.zzdgv.zzdif.zzble;
        if (z && z2 && z4 && !z5) {
            new zzanj(this.zzczi, "useCustomClose").zzdn("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzdgx;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zzae(z3);
        }
    }

    public final void zzsq() {
        this.zzdhc.removeView(this.zzdgx);
        zzab(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzzr.getApplicationInfo().targetSdkVersion >= ((Integer) zzuv.zzon().zzd(zzza.zzcsn)).intValue()) {
            if (this.zzzr.getApplicationInfo().targetSdkVersion <= ((Integer) zzuv.zzon().zzd(zzza.zzcso)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzuv.zzon().zzd(zzza.zzcsp)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzuv.zzon().zzd(zzza.zzcsq)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzzr.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzkn().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzzr);
        this.zzdgz = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdgz.addView(view, -1, -1);
        this.zzzr.setContentView(this.zzdgz);
        this.zzdhi = true;
        this.zzdha = customViewCallback;
        this.zzdgy = true;
    }

    private final void zzac(boolean z) throws zzg {
        if (!this.zzdhi) {
            this.zzzr.requestWindowFeature(1);
        }
        Window window = this.zzzr.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzbdg zzzp = this.zzdgv.zzczi != null ? this.zzdgv.zzczi.zzzp() : null;
        boolean z2 = zzzp != null && zzzp.zzyw();
        this.zzdhd = false;
        if (z2) {
            int i = this.zzdgv.orientation;
            com.google.android.gms.ads.internal.zzq.zzkl();
            if (i == 6) {
                this.zzdhd = this.zzzr.getResources().getConfiguration().orientation == 1;
            } else {
                int i2 = this.zzdgv.orientation;
                com.google.android.gms.ads.internal.zzq.zzkl();
                if (i2 == 7) {
                    this.zzdhd = this.zzzr.getResources().getConfiguration().orientation == 2;
                }
            }
        }
        boolean z3 = this.zzdhd;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        zzaug.zzdv(sb.toString());
        setRequestedOrientation(this.zzdgv.orientation);
        com.google.android.gms.ads.internal.zzq.zzkl();
        window.setFlags(16777216, 16777216);
        zzaug.zzdv("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzbkw) {
            this.zzdhc.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzdhc.setBackgroundColor(zzdgu);
        }
        this.zzzr.setContentView(this.zzdhc);
        this.zzdhi = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzq.zzkk();
                zzbbw zza = zzbcb.zza(this.zzzr, this.zzdgv.zzczi != null ? this.zzdgv.zzczi.zzzn() : null, this.zzdgv.zzczi != null ? this.zzdgv.zzczi.zzzo() : null, true, z2, null, this.zzdgv.zzblk, null, null, this.zzdgv.zzczi != null ? this.zzdgv.zzczi.zzxo() : null, zzsd.zzmm(), null, false);
                this.zzczi = zza;
                zza.zzzp().zza(null, this.zzdgv.zzcxc, null, this.zzdgv.zzcxd, this.zzdgv.zzdic, true, null, this.zzdgv.zzczi != null ? this.zzdgv.zzczi.zzzp().zzyv() : null, null, null);
                this.zzczi.zzzp().zza(new zzbdf(this) { // from class: com.google.android.gms.ads.internal.overlay.zzf
                    private final zzc zzdhq;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdhq = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbdf
                    public final void zzad(boolean z4) {
                        zzc zzcVar = this.zzdhq;
                        if (zzcVar.zzczi != null) {
                            zzcVar.zzczi.zzsu();
                        }
                    }
                });
                if (this.zzdgv.url != null) {
                    this.zzczi.loadUrl(this.zzdgv.url);
                } else if (this.zzdgv.zzdib != null) {
                    this.zzczi.loadDataWithBaseURL(this.zzdgv.zzdhz, this.zzdgv.zzdib, "text/html", "UTF-8", null);
                } else {
                    throw new zzg("No URL or HTML to display in ad overlay.");
                }
                if (this.zzdgv.zzczi != null) {
                    this.zzdgv.zzczi.zzb(this);
                }
            } catch (Exception e) {
                zzaug.zzc("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.");
            }
        } else {
            zzbbw zzbbwVar = this.zzdgv.zzczi;
            this.zzczi = zzbbwVar;
            zzbbwVar.zzbr(this.zzzr);
        }
        this.zzczi.zza(this);
        if (this.zzdgv.zzczi != null) {
            zzc(this.zzdgv.zzczi.zzzt(), this.zzdhc);
        }
        ViewParent parent = this.zzczi.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzczi.getView());
        }
        if (this.zzbkw) {
            this.zzczi.zzaab();
        }
        this.zzczi.zza((ViewGroup) null, this.zzzr, this.zzdgv.zzdhz, this.zzdgv.zzdib);
        this.zzdhc.addView(this.zzczi.getView(), -1, -1);
        if (!z && !this.zzdhd) {
            zzsu();
        }
        zzab(z2);
        if (this.zzczi.zzzr()) {
            zza(z2, true);
        }
    }

    private final void zzsr() {
        if (!this.zzzr.isFinishing() || this.zzdhj) {
            return;
        }
        this.zzdhj = true;
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            zzbbwVar.zzdb(this.zzdhe);
            synchronized (this.zzdhf) {
                if (!this.zzdhh && this.zzczi.zzzx()) {
                    this.zzdhg = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzc zzdhq;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdhq = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdhq.zzss();
                        }
                    };
                    zzaul.zzdsu.postDelayed(this.zzdhg, ((Long) zzuv.zzon().zzd(zzza.zzckt)).longValue());
                    return;
                }
            }
        }
        zzss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzss() {
        if (this.zzdhk) {
            return;
        }
        this.zzdhk = true;
        zzbbw zzbbwVar = this.zzczi;
        if (zzbbwVar != null) {
            this.zzdhc.removeView(zzbbwVar.getView());
            zzi zziVar = this.zzdgw;
            if (zziVar != null) {
                this.zzczi.zzbr(zziVar.zzlk);
                this.zzczi.zzas(false);
                this.zzdgw.parent.addView(this.zzczi.getView(), this.zzdgw.index, this.zzdgw.zzdhr);
                this.zzdgw = null;
            } else if (this.zzzr.getApplicationContext() != null) {
                this.zzczi.zzbr(this.zzzr.getApplicationContext());
            }
            this.zzczi = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdgv;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzdhy != null) {
            this.zzdgv.zzdhy.zzsi();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdgv;
        if (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzczi == null) {
            return;
        }
        zzc(this.zzdgv.zzczi.zzzt(), this.zzdgv.zzczi.getView());
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzky().zza(iObjectWrapper, view);
    }

    public final void zzst() {
        if (this.zzdhd) {
            this.zzdhd = false;
            zzsu();
        }
    }

    private final void zzsu() {
        this.zzczi.zzsu();
    }

    public final void zzsv() {
        this.zzdhc.zzdht = true;
    }

    public final void zzsw() {
        synchronized (this.zzdhf) {
            this.zzdhh = true;
            if (this.zzdhg != null) {
                zzaul.zzdsu.removeCallbacks(this.zzdhg);
                zzaul.zzdsu.post(this.zzdhg);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdgv;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdif == null || !this.zzdgv.zzdif.zzbkx) ? false : true;
        boolean zza = com.google.android.gms.ads.internal.zzq.zzkl().zza(this.zzzr, configuration);
        if ((this.zzbkw && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdgv) != null && adOverlayInfoParcel.zzdif != null && this.zzdgv.zzdif.zzblc) {
            z2 = true;
        }
        Window window = this.zzzr.getWindow();
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckw)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
