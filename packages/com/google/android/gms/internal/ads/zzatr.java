package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzatr {
    private zzaxl zzblk;
    private zzpg zzdqm;
    private zzddi<ArrayList<String>> zzdqt;
    private Context zzlk;
    private final Object lock = new Object();
    private final zzauh zzdqn = new zzauh();
    private final zzatz zzdqe = new zzatz(zzuv.zzoo(), this.zzdqn);
    private boolean zzye = false;
    private zzzr zzdqo = null;
    private Boolean zzdqp = null;
    private final AtomicInteger zzdqq = new AtomicInteger(0);
    private final zzatw zzdqr = new zzatw(null);
    private final Object zzdqs = new Object();

    public final zzzr zzub() {
        zzzr zzzrVar;
        synchronized (this.lock) {
            zzzrVar = this.zzdqo;
        }
        return zzzrVar;
    }

    public final void zza(Boolean bool) {
        synchronized (this.lock) {
            this.zzdqp = bool;
        }
    }

    public final Boolean zzuc() {
        Boolean bool;
        synchronized (this.lock) {
            bool = this.zzdqp;
        }
        return bool;
    }

    public final void zzud() {
        this.zzdqr.zzud();
    }

    public final void zzd(Context context, zzaxl zzaxlVar) {
        synchronized (this.lock) {
            if (!this.zzye) {
                this.zzlk = context.getApplicationContext();
                this.zzblk = zzaxlVar;
                com.google.android.gms.ads.internal.zzq.zzkm().zza(this.zzdqe);
                zzzr zzzrVar = null;
                this.zzdqn.zza(this.zzlk, null, true);
                zzaod.zzc(this.zzlk, this.zzblk);
                this.zzdqm = new zzpg(context.getApplicationContext(), this.zzblk);
                com.google.android.gms.ads.internal.zzq.zzks();
                if (!((Boolean) zzuv.zzon().zzd(zzza.zzcik)).booleanValue()) {
                    zzaug.zzdy("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzzrVar = new zzzr();
                }
                this.zzdqo = zzzrVar;
                if (zzzrVar != null) {
                    zzaxr.zza(new zzatt(this).zzut(), "AppState.registerCsiReporter");
                }
                this.zzye = true;
                zzui();
            }
        }
        com.google.android.gms.ads.internal.zzq.zzkj().zzr(context, zzaxlVar.zzblz);
    }

    public final Resources getResources() {
        if (this.zzblk.zzdwg) {
            return this.zzlk.getResources();
        }
        try {
            zzaxh.zzbp(this.zzlk).getResources();
            return null;
        } catch (zzaxj e) {
            zzaug.zzd("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Throwable th, String str) {
        zzaod.zzc(this.zzlk, this.zzblk).zza(th, str);
    }

    public final void zzb(Throwable th, String str) {
        zzaod.zzc(this.zzlk, this.zzblk).zza(th, str, ((Float) zzuv.zzon().zzd(zzza.zzcgs)).floatValue());
    }

    public final void zzue() {
        this.zzdqq.incrementAndGet();
    }

    public final void zzuf() {
        this.zzdqq.decrementAndGet();
    }

    public final int zzug() {
        return this.zzdqq.get();
    }

    public final zzaui zzuh() {
        zzauh zzauhVar;
        synchronized (this.lock) {
            zzauhVar = this.zzdqn;
        }
        return zzauhVar;
    }

    public final Context getApplicationContext() {
        return this.zzlk;
    }

    public final zzddi<ArrayList<String>> zzui() {
        if (PlatformVersion.isAtLeastJellyBean() && this.zzlk != null) {
            if (!((Boolean) zzuv.zzon().zzd(zzza.zzcne)).booleanValue()) {
                synchronized (this.zzdqs) {
                    if (this.zzdqt != null) {
                        return this.zzdqt;
                    }
                    zzddi<ArrayList<String>> zzd = zzaxn.zzdwi.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzatu
                        private final zzatr zzdrc;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdrc = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdrc.zzuk();
                        }
                    });
                    this.zzdqt = zzd;
                    return zzd;
                }
            }
        }
        return zzdcy.zzah(new ArrayList());
    }

    private static ArrayList<String> zzal(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final zzatz zzuj() {
        return this.zzdqe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzuk() throws Exception {
        return zzal(zzapv.zzaa(this.zzlk));
    }
}
