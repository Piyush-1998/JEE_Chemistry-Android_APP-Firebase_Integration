package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbym implements com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.ads.internal.overlay.zzt, zzadw, zzady, zztp {
    private zztp zzcbs;
    private zzadw zzcxc;
    private zzady zzcxd;
    private com.google.android.gms.ads.internal.overlay.zzo zzdhy;
    private com.google.android.gms.ads.internal.overlay.zzt zzdic;

    private zzbym() {
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final synchronized void onAdClicked() {
        if (this.zzcbs != null) {
            this.zzcbs.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzsi() {
        if (this.zzdhy != null) {
            this.zzdhy.zzsi();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        if (this.zzdhy != null) {
            this.zzdhy.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        if (this.zzdhy != null) {
            this.zzdhy.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzsj() {
        if (this.zzdhy != null) {
            this.zzdhy.zzsj();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final synchronized void zzsy() {
        if (this.zzdic != null) {
            this.zzdic.zzsy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzcxc != null) {
            this.zzcxc.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzcxd != null) {
            this.zzcxd.onAppEvent(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zza(zztp zztpVar, zzadw zzadwVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzady zzadyVar, com.google.android.gms.ads.internal.overlay.zzt zztVar) {
        this.zzcbs = zztpVar;
        this.zzcxc = zzadwVar;
        this.zzdhy = zzoVar;
        this.zzcxd = zzadyVar;
        this.zzdic = zztVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbym(zzbyi zzbyiVar) {
        this();
    }
}
