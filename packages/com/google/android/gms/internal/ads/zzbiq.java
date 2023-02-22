package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzbiq extends zzbio {
    private final View view;
    private final zzbbw zzczi;
    private final Executor zzfbx;
    private final zzcvu zzfde;
    private final zzbkl zzfdn;
    private final zzbuy zzfdo;
    private final zzbqw zzfdp;
    private final zzdvv<zzclw> zzfdq;
    private zzua zzfdr;
    private final Context zzlk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbiq(zzbkn zzbknVar, Context context, zzcvu zzcvuVar, View view, zzbbw zzbbwVar, zzbkl zzbklVar, zzbuy zzbuyVar, zzbqw zzbqwVar, zzdvv<zzclw> zzdvvVar, Executor executor) {
        super(zzbknVar);
        this.zzlk = context;
        this.view = view;
        this.zzczi = zzbbwVar;
        this.zzfde = zzcvuVar;
        this.zzfdn = zzbklVar;
        this.zzfdo = zzbuyVar;
        this.zzfdp = zzbqwVar;
        this.zzfdq = zzdvvVar;
        this.zzfbx = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final View zzaeu() {
        return this.view;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zza(ViewGroup viewGroup, zzua zzuaVar) {
        zzbbw zzbbwVar;
        if (viewGroup == null || (zzbbwVar = this.zzczi) == null) {
            return;
        }
        zzbbwVar.zza(zzbdj.zzb(zzuaVar));
        viewGroup.setMinimumHeight(zzuaVar.heightPixels);
        viewGroup.setMinimumWidth(zzuaVar.widthPixels);
        this.zzfdr = zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final zzwr getVideoController() {
        try {
            return this.zzfdn.getVideoController();
        } catch (zzcwh unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final zzcvu zzaet() {
        zzua zzuaVar = this.zzfdr;
        if (zzuaVar != null) {
            return zzcwi.zze(zzuaVar);
        }
        return zzcwi.zza(this.zzfet.zzgjd, this.zzfde);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final int zzaez() {
        return this.zzfbd.zzgkb.zzgjy.zzgju;
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    public final void zzjs() {
        this.zzfdp.zzagq();
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final void zzafa() {
        this.zzfbx.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbit
            private final zzbiq zzfdy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfdy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfdy.zzafb();
            }
        });
        super.zzafa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzafb() {
        if (this.zzfdo.zzaih() != null) {
            try {
                this.zzfdo.zzaih().zza(this.zzfdq.get(), ObjectWrapper.wrap(this.zzlk));
            } catch (RemoteException e) {
                zzaug.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
