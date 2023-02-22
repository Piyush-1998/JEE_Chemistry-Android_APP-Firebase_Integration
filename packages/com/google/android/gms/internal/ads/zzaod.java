package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaod implements zzaoh {
    private static final Object lock = new Object();
    private static zzaoh zzdik = null;
    private static zzaoh zzdil = null;
    private final Context zzcfz;
    private final Object zzdim;
    private final WeakHashMap<Thread, Boolean> zzdin;
    private final zzaxl zzdio;
    private final ExecutorService zzxr;

    public static zzaoh zzs(Context context) {
        synchronized (lock) {
            if (zzdik == null) {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcgo)).booleanValue()) {
                    zzdik = new zzaod(context);
                } else {
                    zzdik = new zzaok();
                }
            }
        }
        return zzdik;
    }

    public static zzaoh zzc(Context context, zzaxl zzaxlVar) {
        synchronized (lock) {
            if (zzdil == null) {
                if (((Boolean) zzuv.zzon().zzd(zzza.zzcgo)).booleanValue()) {
                    zzaod zzaodVar = new zzaod(context, zzaxlVar);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (zzaodVar.zzdim) {
                            zzaodVar.zzdin.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new zzaoi(zzaodVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new zzaof(zzaodVar, Thread.getDefaultUncaughtExceptionHandler()));
                    zzdil = zzaodVar;
                } else {
                    zzdil = new zzaok();
                }
            }
        }
        return zzdil;
    }

    private zzaod(Context context) {
        this(context, zzaxl.zzwo());
    }

    private zzaod(Context context, zzaxl zzaxlVar) {
        this.zzdim = new Object();
        this.zzdin = new WeakHashMap<>();
        this.zzxr = zzczy.zzaoe().zzdn(zzdad.zzgom);
        this.zzcfz = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdio = zzaxlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r3 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3e
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L39
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L34
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzawy.zzeo(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L31
            r3 = 1
        L31:
            int r6 = r6 + 1
            goto Lf
        L34:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L39:
            if (r2 == 0) goto L3e
            if (r3 != 0) goto L3e
            goto L3f
        L3e:
            r10 = 0
        L3f:
            if (r10 == 0) goto L48
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.zza(r11, r0, r10)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaod.zza(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaoh
    public final void zza(Throwable th, String str) {
        zza(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzaoh
    public final void zza(Throwable th, String str, float f) {
        if (zzawy.zzc(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzdoy.zza(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int i = 0;
        boolean z = Math.random() < ((double) f);
        int i2 = f > 0.0f ? (int) (1.0f / f) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zza(name, stringWriter2, str, i2).toString());
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                final String str2 = (String) obj;
                final zzaxm zzaxmVar = new zzaxm();
                this.zzxr.execute(new Runnable(zzaxmVar, str2) { // from class: com.google.android.gms.internal.ads.zzaog
                    private final String zzcyz;
                    private final zzaxm zzdir;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdir = zzaxmVar;
                        this.zzcyz = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdir.zzei(this.zzcyz);
                    }
                });
            }
        }
    }

    private final Uri.Builder zza(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.packageManager(this.zzcfz).isCallerInstantApp();
        } catch (Throwable th) {
            zzaxi.zzc("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.zzcfz.getPackageName();
        } catch (Throwable unused) {
            zzaxi.zzeu("Cannot obtain package name, proceeding.");
            str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzdio.zzblz).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzza.zzpr())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "265976736").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzuv.zzoo()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzuv.zzon().zzd(zzza.zzcsm)));
    }
}
