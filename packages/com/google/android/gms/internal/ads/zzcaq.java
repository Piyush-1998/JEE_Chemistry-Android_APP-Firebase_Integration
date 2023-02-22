package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsf;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcaq implements zzbnb, zzbnj, zzbog, zzbpc, zztp {
    private final zzsd zzfrg;
    private boolean zzfrh = false;
    private boolean zzfri = false;

    public zzcaq(zzsd zzsdVar, @Nullable zzcuf zzcufVar) {
        this.zzfrg = zzsdVar;
        zzsdVar.zza(zzsf.zza.EnumC0018zza.AD_REQUEST);
        if (zzcufVar == null || !zzcufVar.zzggg) {
            return;
        }
        zzsdVar.zza(zzsf.zza.EnumC0018zza.REQUEST_IS_PREFETCH);
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zzb(zzape zzapeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpc
    public final void zza(final zzcvz zzcvzVar) {
        this.zzfrg.zza(new zzsg(zzcvzVar) { // from class: com.google.android.gms.internal.ads.zzcat
            private final zzcvz zzfhg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfhg = zzcvzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzsg
            public final void zza(zztl zztlVar) {
                zzcvz zzcvzVar2 = this.zzfhg;
                zztlVar.zzcax.zzbzv.zzbzn = zzcvzVar2.zzgkb.zzgjy.zzbzn;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void onAdLoaded() {
        this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_LOADED);
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void onAdFailedToLoad(int i) {
        switch (i) {
            case 1:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_INVALID_REQUEST);
                return;
            case 2:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_NETWORK_ERROR);
                return;
            case 3:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_NO_FILL);
                return;
            case 4:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_TIMEOUT);
                return;
            case 5:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_CANCELLED);
                return;
            case 6:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_NO_ERROR);
                return;
            case 7:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD_NOT_FOUND);
                return;
            default:
                this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FAILED_TO_LOAD);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final synchronized void onAdImpression() {
        this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final synchronized void onAdClicked() {
        if (!this.zzfri) {
            this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_FIRST_CLICK);
            this.zzfri = true;
            return;
        }
        this.zzfrg.zza(zzsf.zza.EnumC0018zza.AD_SUBSEQUENT_CLICK);
    }
}
