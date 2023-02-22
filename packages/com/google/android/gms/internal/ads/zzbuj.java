package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzbuj extends zzbkk {
    private final zzaxl zzblk;
    private final zzdf zzegb;
    private final Executor zzfbx;
    private final zzbuy zzfdo;
    private final zzasm zzfff;
    private final zzbur zzfjl;
    private final zzbuz zzfkp;
    private final zzbvj zzfkq;
    private final zzbuv zzfkr;
    private final zzdvv<zzbxz> zzfks;
    private final zzdvv<zzbxx> zzfkt;
    private final zzdvv<zzbyc> zzfku;
    private final zzdvv<zzbxs> zzfkv;
    private final zzdvv<zzbyb> zzfkw;
    private zzbvz zzfkx;
    private boolean zzfky;
    private final zzbup zzfkz;
    private final Context zzlk;

    public zzbuj(zzbkn zzbknVar, Executor executor, zzbur zzburVar, zzbuz zzbuzVar, zzbvj zzbvjVar, zzbuv zzbuvVar, zzbuy zzbuyVar, zzdvv<zzbxz> zzdvvVar, zzdvv<zzbxx> zzdvvVar2, zzdvv<zzbyc> zzdvvVar3, zzdvv<zzbxs> zzdvvVar4, zzdvv<zzbyb> zzdvvVar5, zzasm zzasmVar, zzdf zzdfVar, zzaxl zzaxlVar, Context context, zzbup zzbupVar) {
        super(zzbknVar);
        this.zzfbx = executor;
        this.zzfjl = zzburVar;
        this.zzfkp = zzbuzVar;
        this.zzfkq = zzbvjVar;
        this.zzfkr = zzbuvVar;
        this.zzfdo = zzbuyVar;
        this.zzfks = zzdvvVar;
        this.zzfkt = zzdvvVar2;
        this.zzfku = zzdvvVar3;
        this.zzfkv = zzdvvVar4;
        this.zzfkw = zzdvvVar5;
        this.zzfff = zzasmVar;
        this.zzegb = zzdfVar;
        this.zzblk = zzaxlVar;
        this.zzlk = context;
        this.zzfkz = zzbupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final void zzafa() {
        this.zzfbx.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbui
            private final zzbuj zzfko;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfko = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfko.zzaho();
            }
        });
        if (this.zzfjl.zzahp() != 7) {
            Executor executor = this.zzfbx;
            zzbuz zzbuzVar = this.zzfkp;
            zzbuzVar.getClass();
            executor.execute(zzbul.zza(zzbuzVar));
        }
        super.zzafa();
    }

    public final synchronized void zzfp(String str) {
        this.zzfkp.zzfp(str);
    }

    public final synchronized void zzahd() {
        if (this.zzfky) {
            return;
        }
        this.zzfkp.zzahd();
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzfkp.zzf(bundle);
    }

    public final synchronized boolean zzh(Bundle bundle) {
        if (this.zzfky) {
            return true;
        }
        boolean zzh = this.zzfkp.zzh(bundle);
        this.zzfky = zzh;
        return zzh;
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzfkp.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbkk
    public final synchronized void destroy() {
        this.zzfbx.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbuk
            private final zzbuj zzfko;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfko = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfko.zzahn();
            }
        });
        super.destroy();
    }

    public final synchronized void zza(zzbvz zzbvzVar) {
        zzdc zzcd;
        this.zzfkx = zzbvzVar;
        this.zzfkq.zza(zzbvzVar);
        this.zzfkp.zza(zzbvzVar.zzaeu(), zzbvzVar.zzaiq(), zzbvzVar.zzair(), zzbvzVar, zzbvzVar);
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcnb)).booleanValue() && (zzcd = this.zzegb.zzcd()) != null) {
            zzcd.zzb(zzbvzVar.zzaeu());
        }
        if (zzbvzVar.zzaio() != null) {
            zzbvzVar.zzaio().zza(this.zzfff);
        }
    }

    public final synchronized void zzb(zzbvz zzbvzVar) {
        this.zzfkp.zza(zzbvzVar.zzaeu(), zzbvzVar.zzaip());
        if (zzbvzVar.zzain() != null) {
            zzbvzVar.zzain().setClickable(false);
            zzbvzVar.zzain().removeAllViews();
        }
        if (zzbvzVar.zzaio() != null) {
            zzbvzVar.zzaio().zzb(this.zzfff);
        }
        this.zzfkx = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzuv.zzon().zzd(zzza.zzcsx)).booleanValue()) {
            this.zzfkq.zzc(this.zzfkx);
        }
        this.zzfkp.zza(view, view2, map, map2, z);
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfkp.zza(view, motionEvent, view2);
    }

    public final synchronized void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzfky) {
            return;
        }
        if (z) {
            this.zzfkp.zza(view, map, map2);
            this.zzfky = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcom)).booleanValue() && map != null) {
                for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                    View view2 = entry.getValue().get();
                    if (view2 != null && zzx(view2)) {
                        this.zzfkp.zza(view, map, map2);
                        this.zzfky = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzfkp.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzadf zzadfVar) {
        this.zzfkp.zza(zzadfVar);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzfkp.cancelUnconfirmedClick();
    }

    public final synchronized void zza(zzwi zzwiVar) {
        this.zzfkp.zza(zzwiVar);
    }

    public final synchronized void zza(zzwe zzweVar) {
        this.zzfkp.zza(zzweVar);
    }

    public final synchronized void zzqw() {
        this.zzfkp.zzqw();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzfkx == null) {
            zzaug.zzdv("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = this.zzfkx instanceof zzbve;
        this.zzfbx.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbun
            private final boolean zzdyt;
            private final zzbuj zzfko;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfko = this;
                this.zzdyt = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfko.zzaz(this.zzdyt);
            }
        });
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzfkp.isCustomClickGestureEnabled();
    }

    public static boolean zzx(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzahk() {
        return this.zzfkr.zzaic();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbuv r0 = r10.zzfkr
            boolean r0 = r0.zzahl()
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.gms.internal.ads.zzbur r0 = r10.zzfjl
            com.google.android.gms.internal.ads.zzbbw r0 = r0.zzahv()
            com.google.android.gms.internal.ads.zzbur r1 = r10.zzfjl
            com.google.android.gms.internal.ads.zzbbw r1 = r1.zzahu()
            if (r0 != 0) goto L1a
            if (r1 != 0) goto L1a
            return
        L1a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            if (r1 == 0) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = 0
            if (r4 == 0) goto L2a
        L28:
            r8 = r3
            goto L32
        L2a:
            if (r2 == 0) goto L30
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L28
        L30:
            r0 = r3
            r8 = r0
        L32:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L39
            return
        L39:
            com.google.android.gms.internal.ads.zzanl r3 = com.google.android.gms.ads.internal.zzq.zzky()
            android.content.Context r4 = r10.zzlk
            boolean r3 = r3.zzp(r4)
            if (r3 == 0) goto L97
            com.google.android.gms.internal.ads.zzaxl r3 = r10.zzblk
            int r3 = r3.zzdwe
            com.google.android.gms.internal.ads.zzaxl r4 = r10.zzblk
            int r4 = r4.zzdwf
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r3)
            java.lang.String r3 = "."
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzanl r3 = com.google.android.gms.ads.internal.zzq.zzky()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.zza(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L77
            return
        L77:
            com.google.android.gms.internal.ads.zzbur r3 = r10.zzfjl
            r3.zzas(r11)
            r0.zzaq(r11)
            if (r2 == 0) goto L8e
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.zzanl r1 = com.google.android.gms.ads.internal.zzq.zzky()
            r1.zza(r11, r0)
        L8e:
            if (r12 == 0) goto L97
            com.google.android.gms.internal.ads.zzanl r12 = com.google.android.gms.ads.internal.zzq.zzky()
            r12.zzae(r11)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuj.zzg(java.lang.String, boolean):void");
    }

    public final boolean zzahl() {
        return this.zzfkr.zzahl();
    }

    public final void zzy(View view) {
        IObjectWrapper zzahw = this.zzfjl.zzahw();
        boolean z = this.zzfjl.zzahv() != null;
        if (!this.zzfkr.zzahl() || zzahw == null || !z || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzky().zza(zzahw, view);
    }

    public final void zzz(View view) {
        IObjectWrapper zzahw = this.zzfjl.zzahw();
        if (!this.zzfkr.zzahl() || zzahw == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzky().zzb(zzahw, view);
    }

    public final zzbup zzahm() {
        return this.zzfkz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaz(boolean z) {
        this.zzfkp.zza(this.zzfkx.zzaeu(), this.zzfkx.zzaip(), this.zzfkx.zzaiq(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzahn() {
        this.zzfkp.destroy();
        this.zzfjl.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaho() {
        try {
            int zzahp = this.zzfjl.zzahp();
            if (zzahp == 1) {
                if (this.zzfdo.zzaie() != null) {
                    zzg("Google", true);
                    this.zzfdo.zzaie().zza(this.zzfks.get());
                }
            } else if (zzahp == 2) {
                if (this.zzfdo.zzaif() != null) {
                    zzg("Google", true);
                    this.zzfdo.zzaif().zza(this.zzfkt.get());
                }
            } else if (zzahp == 3) {
                if (this.zzfdo.zzfu(this.zzfjl.getCustomTemplateId()) != null) {
                    if (this.zzfjl.zzahu() != null) {
                        zzg("Google", true);
                    }
                    this.zzfdo.zzfu(this.zzfjl.getCustomTemplateId()).zzb(this.zzfkw.get());
                }
            } else if (zzahp == 6) {
                if (this.zzfdo.zzaig() != null) {
                    zzg("Google", true);
                    this.zzfdo.zzaig().zza(this.zzfku.get());
                }
            } else if (zzahp == 7) {
                if (this.zzfdo.zzaii() != null) {
                    this.zzfdo.zzaii().zza(this.zzfkv.get());
                }
            } else {
                zzaug.zzes("Wrong native template id!");
            }
        } catch (RemoteException e) {
            zzaug.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
