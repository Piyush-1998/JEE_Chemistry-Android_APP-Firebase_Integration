package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbzn {
    private final zzasi zzbks;
    private final zzdf zzegb;
    private final Executor zzfbx;
    private final zzbnr zzffv;
    private final zzboo zzfio;
    private final zzbmv zzfjn;
    private final zzbhk zzfjo;
    private final zzbqv zzfjq;
    private final zzbof zzfpy;
    private final zzbpf zzfpz;
    private final com.google.android.gms.ads.internal.zzc zzfqp;
    private final zzbnl zzfqq;
    private final zzbpb zzfqr;

    public zzbzn(zzbmv zzbmvVar, zzbnr zzbnrVar, zzbof zzbofVar, zzboo zzbooVar, zzbpf zzbpfVar, Executor executor, zzbqv zzbqvVar, zzbhk zzbhkVar, com.google.android.gms.ads.internal.zzc zzcVar, zzbnl zzbnlVar, zzasi zzasiVar, zzdf zzdfVar, zzbpb zzbpbVar) {
        this.zzfjn = zzbmvVar;
        this.zzffv = zzbnrVar;
        this.zzfpy = zzbofVar;
        this.zzfio = zzbooVar;
        this.zzfpz = zzbpfVar;
        this.zzfbx = executor;
        this.zzfjq = zzbqvVar;
        this.zzfjo = zzbhkVar;
        this.zzfqp = zzcVar;
        this.zzfqq = zzbnlVar;
        this.zzbks = zzasiVar;
        this.zzegb = zzdfVar;
        this.zzfqr = zzbpbVar;
    }

    public final void zzb(final zzbbw zzbbwVar, boolean z) {
        zzdc zzcd;
        zzbbwVar.zzzp().zza(new zztp(this) { // from class: com.google.android.gms.internal.ads.zzbzm
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
            }

            @Override // com.google.android.gms.internal.ads.zztp
            public final void onAdClicked() {
                this.zzfqo.zzajl();
            }
        }, this.zzfpy, this.zzfio, new zzady(this) { // from class: com.google.android.gms.internal.ads.zzbzp
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
            }

            @Override // com.google.android.gms.internal.ads.zzady
            public final void onAppEvent(String str, String str2) {
                this.zzfqo.zzq(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzt(this) { // from class: com.google.android.gms.internal.ads.zzbzo
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzt
            public final void zzsy() {
                this.zzfqo.zzajk();
            }
        }, z, null, this.zzfqp, new zzbzx(this), this.zzbks);
        zzbbwVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.zzbzr
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.zzfqo.zza(view, motionEvent);
            }
        });
        zzbbwVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.zzbzq
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zzfqo.zzac(view);
            }
        });
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcnb)).booleanValue() && (zzcd = this.zzegb.zzcd()) != null) {
            zzcd.zzb(zzbbwVar.getView());
        }
        this.zzfjq.zza(zzbbwVar, this.zzfbx);
        this.zzfjq.zza(new zzpj(zzbbwVar) { // from class: com.google.android.gms.internal.ads.zzbzt
            private final zzbbw zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = zzbbwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzpj
            public final void zza(zzpk zzpkVar) {
                this.zzehv.zzzp().zza(zzpkVar.zzboa.left, zzpkVar.zzboa.top, false);
            }
        }, this.zzfbx);
        this.zzfjq.zzq(zzbbwVar.getView());
        zzbbwVar.zza("/trackActiveViewUnit", new zzaer(this, zzbbwVar) { // from class: com.google.android.gms.internal.ads.zzbzs
            private final zzbbw zzfpd;
            private final zzbzn zzfqo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqo = this;
                this.zzfpd = zzbbwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzaer
            public final void zza(Object obj, Map map) {
                this.zzfqo.zza(this.zzfpd, (zzbbw) obj, map);
            }
        });
        this.zzfjo.zzo(zzbbwVar);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzckg)).booleanValue()) {
            return;
        }
        zzbnl zzbnlVar = this.zzfqq;
        zzbbwVar.getClass();
        zzbnlVar.zza(zzbzv.zzn(zzbbwVar), this.zzfbx);
    }

    public static zzddi<?> zza(zzbbw zzbbwVar, String str, String str2) {
        final zzaxv zzaxvVar = new zzaxv();
        zzbbwVar.zzzp().zza(new zzbdf(zzaxvVar) { // from class: com.google.android.gms.internal.ads.zzbzu
            private final zzaxv zzbrt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbrt = zzaxvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbdf
            public final void zzad(boolean z) {
                zzaxv zzaxvVar2 = this.zzbrt;
                if (z) {
                    zzaxvVar2.set(null);
                } else {
                    zzaxvVar2.setException(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzbbwVar.zzb(str, str2, null);
        return zzaxvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbbw zzbbwVar, zzbbw zzbbwVar2, Map map) {
        this.zzfjo.zzf(zzbbwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzac(View view) {
        this.zzfqp.recordClick();
        zzasi zzasiVar = this.zzbks;
        if (zzasiVar != null) {
            zzasiVar.zzto();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zza(View view, MotionEvent motionEvent) {
        this.zzfqp.recordClick();
        zzasi zzasiVar = this.zzbks;
        if (zzasiVar != null) {
            zzasiVar.zzto();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzajk() {
        this.zzffv.onAdLeftApplication();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(String str, String str2) {
        this.zzfpz.onAppEvent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzajl() {
        this.zzfjn.onAdClicked();
    }
}
