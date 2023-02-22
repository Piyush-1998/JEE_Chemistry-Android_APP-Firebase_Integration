package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzckt extends zzakc {
    private final zzbob zzffh;
    private final zzbnr zzffv;
    private final zzboo zzfio;
    private final zzbni zzfjm;
    private final zzbmv zzfjn;
    private final zzbpf zzfpz;
    private final zzbrl zzgan;

    public zzckt(zzbmv zzbmvVar, zzbni zzbniVar, zzbnr zzbnrVar, zzbob zzbobVar, zzbpf zzbpfVar, zzboo zzbooVar, zzbrl zzbrlVar) {
        this.zzfjn = zzbmvVar;
        this.zzfjm = zzbniVar;
        this.zzffv = zzbnrVar;
        this.zzffh = zzbobVar;
        this.zzfpz = zzbpfVar;
        this.zzfio = zzbooVar;
        this.zzgan = zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdFailedToLoad(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzace zzaceVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzake zzakeVar) {
    }

    public void zza(zzaqv zzaqvVar) throws RemoteException {
    }

    public void zzb(Bundle bundle) throws RemoteException {
    }

    public void zzb(zzaqt zzaqtVar) {
    }

    public void zzcl(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzde(String str) {
    }

    public void zzrx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdClicked() {
        this.zzfjn.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdClosed() {
        this.zzfio.zzsi();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdLeftApplication() {
        this.zzffv.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdOpened() {
        this.zzfio.zzsj();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAppEvent(String str, String str2) {
        this.zzfpz.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdLoaded() {
        this.zzffh.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onAdImpression() {
        this.zzfjm.onAdImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onVideoPause() {
        this.zzgan.onVideoPause();
    }

    public void zzrw() {
        this.zzgan.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzgan.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void onVideoPlay() throws RemoteException {
        this.zzgan.onVideoPlay();
    }
}
