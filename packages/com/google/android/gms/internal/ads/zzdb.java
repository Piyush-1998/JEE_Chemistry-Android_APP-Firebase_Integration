package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbo;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdb implements zzdc {
    protected static volatile zzdx zzvo;
    protected MotionEvent zzvt;
    protected double zzwc;
    private double zzwd;
    private double zzwe;
    protected float zzwf;
    protected float zzwg;
    protected float zzwh;
    protected float zzwi;
    protected DisplayMetrics zzwl;
    protected LinkedList<MotionEvent> zzvu = new LinkedList<>();
    protected long zzvv = 0;
    protected long zzvw = 0;
    protected long zzvx = 0;
    protected long zzvy = 0;
    protected long zzvz = 0;
    protected long zzwa = 0;
    protected long zzwb = 0;
    private boolean zzwj = false;
    protected boolean zzwk = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdb(Context context) {
        try {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcni)).booleanValue()) {
                zzci.zzbx();
            } else {
                zzed.zzb(zzvo);
            }
            this.zzwl = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzdw;

    protected abstract zzbo.zza.zzb zza(Context context, View view, Activity activity);

    protected abstract zzbo.zza.zzb zza(Context context, zzbk.zza zzaVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzef zza(MotionEvent motionEvent) throws zzdw;

    protected abstract zzbo.zza.zzb zzb(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzdc
    public void zzb(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context) {
        if (zzee.isMainThread()) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcnk)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, zzdt.zzxk, null, null, null);
    }

    public final String zza(Context context, byte[] bArr) {
        if (zzee.isMainThread()) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcnk)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return zza(context, null, zzdt.zzxk, null, null, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, zzdt.zzxm, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zzb(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzwj) {
            zzcc();
            this.zzwj = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzwc = 0.0d;
            this.zzwd = motionEvent.getRawX();
            this.zzwe = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzwd;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzwe;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzwc += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzwd = rawX;
            this.zzwe = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzvt = obtain;
                    this.zzvu.add(obtain);
                    if (this.zzvu.size() > 6) {
                        this.zzvu.remove().recycle();
                    }
                    this.zzvx++;
                    this.zzvz = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzvw += motionEvent.getHistorySize() + 1;
                    zzef zza = zza(motionEvent);
                    if ((zza == null || zza.zzyt == null || zza.zzyw == null) ? false : true) {
                        this.zzwa += zza.zzyt.longValue() + zza.zzyw.longValue();
                    }
                    if (this.zzwl != null && zza != null && zza.zzyu != null && zza.zzyx != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzwb += zza.zzyu.longValue() + zza.zzyx.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzvy++;
                }
            } catch (zzdw unused) {
            }
        } else {
            this.zzwf = motionEvent.getX();
            this.zzwg = motionEvent.getY();
            this.zzwh = motionEvent.getRawX();
            this.zzwi = motionEvent.getRawY();
            this.zzvv++;
        }
        this.zzwk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zza(int i, int i2, int i3) {
        if (this.zzvt != null) {
            if (((Boolean) zzuv.zzon().zzd(zzza.zzcmv)).booleanValue()) {
                zzcc();
            } else {
                this.zzvt.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzwl;
        if (displayMetrics != null) {
            this.zzvt = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzwl.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzvt = null;
        }
        this.zzwk = false;
    }

    private final void zzcc() {
        this.zzvz = 0L;
        this.zzvv = 0L;
        this.zzvw = 0L;
        this.zzvx = 0L;
        this.zzvy = 0L;
        this.zzwa = 0L;
        this.zzwb = 0L;
        if (this.zzvu.size() > 0) {
            Iterator<MotionEvent> it = this.zzvu.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzvu.clear();
        } else {
            MotionEvent motionEvent = this.zzvt;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzvt = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(13:5|6|7|(4:9|(1:11)(1:88)|12|(1:14)(1:87))(1:89)|15|16|17|(1:19)(2:68|(1:70)(1:71))|(1:22)|24|(3:29|30|(1:32)(2:33|(1:48)(4:36|(1:38)(2:41|(1:43)(2:44|(1:46)(1:47)))|39|40)))|26|27)|92|7|(0)(0)|15|16|17|(0)(0)|(1:22)|24|(0)|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r9 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r23 == com.google.android.gms.internal.ads.zzdt.zzxm) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        r13 = androidx.core.view.PointerIconCompat.TYPE_HELP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r23 == com.google.android.gms.internal.ads.zzdt.zzxl) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r13 = androidx.core.view.PointerIconCompat.TYPE_VERTICAL_TEXT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r23 == com.google.android.gms.internal.ads.zzdt.zzxk) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r13 = androidx.core.view.PointerIconCompat.TYPE_CONTEXT_MENU;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        r10.zza(r13, -1, java.lang.System.currentTimeMillis() - r7, r11, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:21:0x005a, B:23:0x005e, B:30:0x0085, B:24:0x006a, B:26:0x006e, B:27:0x0078), top: B:88:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[Catch: Exception -> 0x0093, TryCatch #2 {Exception -> 0x0093, blocks: (B:21:0x005a, B:23:0x005e, B:30:0x0085, B:24:0x006a, B:26:0x006e, B:27:0x0078), top: B:88:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zza(android.content.Context r21, java.lang.String r22, int r23, android.view.View r24, android.app.Activity r25, byte[] r26) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdb.zza(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }
}
