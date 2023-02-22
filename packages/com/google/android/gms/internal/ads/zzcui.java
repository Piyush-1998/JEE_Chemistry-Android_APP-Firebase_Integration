package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcui extends AdMetadataListener implements zzbna, zzbnb, zzbnf, zzbog {
    private final AtomicReference<AdMetadataListener> zzghv = new AtomicReference<>();
    private final AtomicReference<zzari> zzghw = new AtomicReference<>();
    private final AtomicReference<zzarb> zzghx = new AtomicReference<>();
    private final AtomicReference<zzaqi> zzghy = new AtomicReference<>();
    private final AtomicReference<zzarj> zzghz = new AtomicReference<>();
    private final AtomicReference<zzapz> zzgia = new AtomicReference<>();

    public final void zza(zzari zzariVar) {
        this.zzghw.set(zzariVar);
    }

    public final void zzb(zzarb zzarbVar) {
        this.zzghx.set(zzarbVar);
    }

    public final void zzb(zzarj zzarjVar) {
        this.zzghz.set(zzarjVar);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzghv.set(adMetadataListener);
    }

    @Deprecated
    public final void zzb(zzaqi zzaqiVar) {
        this.zzghy.set(zzaqiVar);
    }

    @Deprecated
    public final void zzb(zzapz zzapzVar) {
        this.zzgia.set(zzapzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        zza(this.zzghw, zzcuh.zzghu);
        zza(this.zzghy, zzcuk.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(final int i) {
        zza(this.zzghw, new zzcva(i) { // from class: com.google.android.gms.internal.ads.zzcus
            private final int zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwc = i;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                ((zzari) obj).onRewardedAdFailedToLoad(this.zzdwc);
            }
        });
        zza(this.zzghy, new zzcva(i) { // from class: com.google.android.gms.internal.ads.zzcur
            private final int zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwc = i;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                ((zzaqi) obj).onRewardedVideoAdFailedToLoad(this.zzdwc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdOpened() {
        zza(this.zzghx, zzcuu.zzghu);
        zza(this.zzghy, zzcut.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdClosed() {
        zza(this.zzghx, zzcuw.zzghu);
        zza(this.zzghy, zzcuv.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onAdLeftApplication() {
        zza(this.zzghy, zzcuy.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoStarted() {
        zza(this.zzghy, zzcux.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void zzb(final zzapy zzapyVar, final String str, final String str2) {
        zza(this.zzghx, new zzcva(zzapyVar) { // from class: com.google.android.gms.internal.ads.zzcuj
            private final zzapy zzfhc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhc = zzapyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                zzapy zzapyVar2 = this.zzfhc;
                ((zzarb) obj).zza(new zzarw(zzapyVar2.getType(), zzapyVar2.getAmount()));
            }
        });
        zza(this.zzghz, new zzcva(zzapyVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcum
            private final String zzcyz;
            private final String zzdbt;
            private final zzapy zzfhc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhc = zzapyVar;
                this.zzcyz = str;
                this.zzdbt = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                zzapy zzapyVar2 = this.zzfhc;
                ((zzarj) obj).zza(new zzarw(zzapyVar2.getType(), zzapyVar2.getAmount()), this.zzcyz, this.zzdbt);
            }
        });
        zza(this.zzghy, new zzcva(zzapyVar) { // from class: com.google.android.gms.internal.ads.zzcul
            private final zzapy zzfhc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhc = zzapyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                ((zzaqi) obj).zza(this.zzfhc);
            }
        });
        zza(this.zzgia, new zzcva(zzapyVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzcuo
            private final String zzcyz;
            private final String zzdbt;
            private final zzapy zzfhc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhc = zzapyVar;
                this.zzcyz = str;
                this.zzdbt = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                ((zzapz) obj).zza(this.zzfhc, this.zzcyz, this.zzdbt);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbna
    public final void onRewardedVideoCompleted() {
        zza(this.zzghy, zzcun.zzghu);
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zzcl(final int i) {
        zza(this.zzghx, new zzcva(i) { // from class: com.google.android.gms.internal.ads.zzcuq
            private final int zzdwc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdwc = i;
            }

            @Override // com.google.android.gms.internal.ads.zzcva
            public final void zzt(Object obj) {
                ((zzarb) obj).onRewardedAdFailedToShow(this.zzdwc);
            }
        });
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zza(this.zzghv, zzcup.zzghu);
    }

    private static <T> void zza(AtomicReference<T> atomicReference, zzcva<T> zzcvaVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzcvaVar.zzt(t);
        } catch (RemoteException e) {
            zzaug.zze("#007 Could not call remote method.", e);
        }
    }
}
