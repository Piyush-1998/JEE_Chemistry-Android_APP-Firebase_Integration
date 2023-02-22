package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzpz extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzboi;
    private final int zzbok;
    private final boolean zzbol;
    private boolean zzbpi;
    private boolean zzbpj;
    private final zzpw zzbpk;
    private final int zzbpl;
    private final int zzbpm;
    private final int zzbpn;
    private final int zzbpo;
    private final int zzbpp;
    private final int zzbpq;
    private final String zzbpr;
    private final boolean zzbps;
    private final boolean zzbpt;

    public zzpz() {
        this(new zzpw());
    }

    private zzpz(zzpw zzpwVar) {
        this.started = false;
        this.zzbpi = false;
        this.zzbpj = false;
        this.zzbpk = zzpwVar;
        this.lock = new Object();
        this.zzboi = ((Integer) zzuv.zzon().zzd(zzza.zzcio)).intValue();
        this.zzbpm = ((Integer) zzuv.zzon().zzd(zzza.zzcip)).intValue();
        this.zzbok = ((Integer) zzuv.zzon().zzd(zzza.zzciq)).intValue();
        this.zzbpn = ((Integer) zzuv.zzon().zzd(zzza.zzcir)).intValue();
        this.zzbpo = ((Integer) zzuv.zzon().zzd(zzza.zzcit)).intValue();
        this.zzbpp = ((Integer) zzuv.zzon().zzd(zzza.zzciu)).intValue();
        this.zzbpq = ((Integer) zzuv.zzon().zzd(zzza.zzciv)).intValue();
        this.zzbpl = ((Integer) zzuv.zzon().zzd(zzza.zzcis)).intValue();
        this.zzbpr = (String) zzuv.zzon().zzd(zzza.zzcix);
        this.zzbps = ((Boolean) zzuv.zzon().zzd(zzza.zzciy)).booleanValue();
        this.zzbol = ((Boolean) zzuv.zzon().zzd(zzza.zzcjc)).booleanValue();
        this.zzbpt = ((Boolean) zzuv.zzon().zzd(zzza.zzcjd)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzlu() {
        synchronized (this.lock) {
            if (this.started) {
                zzaug.zzdv("Content hash thread already started, quiting...");
                return;
            }
            this.started = true;
            start();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                if (zzlv()) {
                    Activity activity = com.google.android.gms.ads.internal.zzq.zzkm().getActivity();
                    if (activity == null) {
                        zzaug.zzdv("ContentFetchThread: no activity. Sleeping.");
                        zzlx();
                    } else if (activity != null) {
                        View view = null;
                        try {
                            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                                view = activity.getWindow().getDecorView().findViewById(16908290);
                            }
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "ContentFetchTask.extractContent");
                            zzaug.zzdv("Failed getting root view of activity. Content not extracted.");
                        }
                        if (view != null && view != null) {
                            view.post(new zzqc(this, view));
                        }
                    }
                } else {
                    zzaug.zzdv("ContentFetchTask: sleeping");
                    zzlx();
                }
                Thread.sleep(this.zzbpl * 1000);
            } catch (InterruptedException e2) {
                zzaug.zzc("Error in ContentFetchTask", e2);
            } catch (Exception e3) {
                zzaug.zzc("Error in ContentFetchTask", e3);
                com.google.android.gms.ads.internal.zzq.zzkn().zza(e3, "ContentFetchTask.run");
            }
            synchronized (this.lock) {
                while (this.zzbpi) {
                    try {
                        zzaug.zzdv("ContentFetchTask: waiting");
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(View view) {
        try {
            zzpt zzptVar = new zzpt(this.zzboi, this.zzbpm, this.zzbok, this.zzbpn, this.zzbpo, this.zzbpp, this.zzbpq, this.zzbol);
            Context context = com.google.android.gms.ads.internal.zzq.zzkm().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbpr)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzuv.zzon().zzd(zzza.zzciw), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbpr)) {
                    return;
                }
            }
            zzqd zza = zza(view, zzptVar);
            zzptVar.zzls();
            if (zza.zzbqa == 0 && zza.zzbqb == 0) {
                return;
            }
            if (zza.zzbqb == 0 && zzptVar.zzlt() == 0) {
                return;
            }
            if (zza.zzbqb == 0 && this.zzbpk.zza(zzptVar)) {
                return;
            }
            this.zzbpk.zzc(zzptVar);
        } catch (Exception e) {
            zzaug.zzc("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    private static boolean zzlv() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = com.google.android.gms.ads.internal.zzq.zzkm().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final zzqd zza(View view, zzpt zzptVar) {
        boolean z;
        if (view == null) {
            return new zzqd(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                zzptVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new zzqd(this, 1, 0);
            }
            return new zzqd(this, 0, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbbw)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzptVar.zzlq();
                webView.post(new zzqb(this, zzptVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new zzqd(this, 0, 1);
            }
            return new zzqd(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzqd zza = zza(viewGroup.getChildAt(i3), zzptVar);
                i += zza.zzbqa;
                i2 += zza.zzbqb;
            }
            return new zzqd(this, i, i2);
        } else {
            return new zzqd(this, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzpt zzptVar, WebView webView, String str, boolean z) {
        zzptVar.zzlp();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzbps && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzptVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzptVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzptVar.zzlk()) {
                this.zzbpk.zzb(zzptVar);
            }
        } catch (JSONException unused) {
            zzaug.zzdv("Json string may be malformed.");
        } catch (Throwable th) {
            zzaug.zzb("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzq.zzkn().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzpt zzlw() {
        return this.zzbpk.zzn(this.zzbpt);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbpi = false;
            this.lock.notifyAll();
            zzaug.zzdv("ContentFetchThread: wakeup");
        }
    }

    private final void zzlx() {
        synchronized (this.lock) {
            this.zzbpi = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzaug.zzdv(sb.toString());
        }
    }

    public final boolean zzly() {
        return this.zzbpi;
    }
}
