package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzavd {
    private Handler handler;
    private int state;
    private String zzblz;
    private String zzbqy;
    private String zzdie;
    private String zzdlk;
    private int zzdtf;
    private PointF zzdtg;
    private PointF zzdth;
    private Runnable zzdti;
    private final Context zzlk;

    public zzavd(Context context) {
        this.state = 0;
        this.zzdti = new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzavg
            private final zzavd zzdtj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdtj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdtj.zzvx();
            }
        };
        this.zzlk = context;
        this.zzdtf = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzq.zzkx().zzwd();
        this.handler = com.google.android.gms.ads.internal.zzq.zzkx().getHandler();
    }

    public zzavd(Context context, String str) {
        this(context);
        this.zzdie = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L21
            r10.state = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.zzdtg = r0
            return
        L21:
            int r4 = r10.state
            r5 = -1
            if (r4 != r5) goto L27
            return
        L27:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L56
            if (r0 != r6) goto L56
            r10.state = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.zzdth = r0
            android.os.Handler r11 = r10.handler
            java.lang.Runnable r0 = r10.zzdti
            com.google.android.gms.internal.ads.zzyp<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzza.zzcqa
            com.google.android.gms.internal.ads.zzyw r2 = com.google.android.gms.internal.ads.zzuv.zzon()
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L56:
            int r4 = r10.state
            if (r4 != r6) goto La2
            r4 = 2
            if (r2 == r4) goto L5f
        L5d:
            r3 = 1
            goto L97
        L5f:
            if (r0 != r4) goto L97
            r0 = 0
            r2 = 0
        L63:
            if (r0 >= r1) goto L7f
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.zza(r4, r6, r8, r9)
            if (r4 != 0) goto L7c
            r2 = 1
        L7c:
            int r0 = r0 + 1
            goto L63
        L7f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.zza(r0, r1, r3, r11)
            if (r11 != 0) goto L96
            goto L5d
        L96:
            r3 = r2
        L97:
            if (r3 == 0) goto La2
            r10.state = r5
            android.os.Handler r11 = r10.handler
            java.lang.Runnable r0 = r10.zzdti
            r11.removeCallbacks(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavd.zzd(android.view.MotionEvent):void");
    }

    private final boolean zza(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzdtg.x - f) < ((float) this.zzdtf) && Math.abs(this.zzdtg.y - f2) < ((float) this.zzdtf) && Math.abs(this.zzdth.x - f3) < ((float) this.zzdtf) && Math.abs(this.zzdth.y - f4) < ((float) this.zzdtf);
    }

    public final void showDialog() {
        try {
            if (!(this.zzlk instanceof Activity)) {
                zzaug.zzet("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzq.zzkt().zzvz()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = com.google.android.gms.ads.internal.zzq.zzkt().zzwa() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int zza = zza((List<String>) arrayList, "Ad Information", true);
            final int zza2 = zza((List<String>) arrayList, str, true);
            final int zza3 = zza((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zzlk, com.google.android.gms.ads.internal.zzq.zzkl().zzvt());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, zza, zza2, zza3) { // from class: com.google.android.gms.internal.ads.zzavf
                private final zzavd zzdtj;
                private final int zzdtk;
                private final int zzdtl;
                private final int zzdtm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdtj = this;
                    this.zzdtk = zza;
                    this.zzdtl = zza2;
                    this.zzdtm = zza3;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zzdtj.zza(this.zzdtk, this.zzdtl, this.zzdtm, dialogInterface, i);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zzaug.zza("", e);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzbqy = str;
    }

    public final void zzr(String str) {
        this.zzblz = str;
    }

    public final void zzej(String str) {
        this.zzdie = str;
    }

    public final void zzek(String str) {
        this.zzdlk = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzdie);
        sb.append(",DebugSignal: ");
        sb.append(this.zzdlk);
        sb.append(",AFMA Version: ");
        sb.append(this.zzblz);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzbqy);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzvv() {
        com.google.android.gms.ads.internal.zzq.zzkt().zza(this.zzlk, this.zzbqy, this.zzblz, this.zzdlk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzvw() {
        com.google.android.gms.ads.internal.zzq.zzkt().zze(this.zzlk, this.zzbqy, this.zzblz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzq.zzkj();
        zzaul.zza(this.zzlk, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zza(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L9b
            android.content.Context r1 = r0.zzlk
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzaug.zzet(r1)
            return
        Le:
            java.lang.String r1 = r0.zzdie
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzq.zzkj()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzaul.zzi(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L3f
        L62:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            goto L73
        L71:
            java.lang.String r1 = "No debug information"
        L73:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.zzlk
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.zzavi r3 = new com.google.android.gms.internal.ads.zzavi
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.zzavh.zzdtn
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L9b:
            if (r5 != r2) goto Lad
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzaug.zzdv(r1)
            com.google.android.gms.internal.ads.zzddl r1 = com.google.android.gms.internal.ads.zzaxn.zzdwi
            com.google.android.gms.internal.ads.zzavk r2 = new com.google.android.gms.internal.ads.zzavk
            r2.<init>(r0)
            r1.execute(r2)
            return
        Lad:
            if (r5 != r3) goto Lbe
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzaug.zzdv(r1)
            com.google.android.gms.internal.ads.zzddl r1 = com.google.android.gms.internal.ads.zzaxn.zzdwi
            com.google.android.gms.internal.ads.zzavj r2 = new com.google.android.gms.internal.ads.zzavj
            r2.<init>(r0)
            r1.execute(r2)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavd.zza(int, int, int, android.content.DialogInterface, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzvx() {
        this.state = 4;
        showDialog();
    }
}
