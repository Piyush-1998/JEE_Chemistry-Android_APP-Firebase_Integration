package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzann;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzu extends zzann {
    private AdOverlayInfoParcel zzdii;
    private Activity zzzr;
    private boolean zzdhb = false;
    private boolean zzdij = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdii = adOverlayInfoParcel;
        this.zzzr = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzda() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final boolean zzsp() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdii;
        if (adOverlayInfoParcel == null) {
            this.zzzr.finish();
        } else if (z) {
            this.zzzr.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzcbs != null) {
                    this.zzdii.zzcbs.onAdClicked();
                }
                if (this.zzzr.getIntent() != null && this.zzzr.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && this.zzdii.zzdhy != null) {
                    this.zzdii.zzdhy.zzsj();
                }
            }
            com.google.android.gms.ads.internal.zzq.zzkh();
            if (zzb.zza(this.zzzr, this.zzdii.zzdhx, this.zzdii.zzdic)) {
                return;
            }
            this.zzzr.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onResume() throws RemoteException {
        if (this.zzdhb) {
            this.zzzr.finish();
            return;
        }
        this.zzdhb = true;
        if (this.zzdii.zzdhy != null) {
            this.zzdii.zzdhy.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdhb);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onPause() throws RemoteException {
        if (this.zzdii.zzdhy != null) {
            this.zzdii.zzdhy.onPause();
        }
        if (this.zzzr.isFinishing()) {
            zzsz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onStop() throws RemoteException {
        if (this.zzzr.isFinishing()) {
            zzsz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void onDestroy() throws RemoteException {
        if (this.zzzr.isFinishing()) {
            zzsz();
        }
    }

    private final synchronized void zzsz() {
        if (!this.zzdij) {
            if (this.zzdii.zzdhy != null) {
                this.zzdii.zzdhy.zzsi();
            }
            this.zzdij = true;
        }
    }
}
