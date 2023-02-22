package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class zzbax implements Releasable {
    protected Context mContext;
    protected String zzdvd;
    protected WeakReference<zzazj> zzedf;

    public zzbax(zzazj zzazjVar) {
        this.mContext = zzazjVar.getContext();
        this.zzdvd = com.google.android.gms.ads.internal.zzq.zzkj().zzr(this.mContext, zzazjVar.zzxr().zzblz);
        this.zzedf = new WeakReference<>(zzazjVar);
    }

    public abstract void abort();

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzcs(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzct(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzcu(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzcv(int i) {
    }

    public abstract boolean zzfd(String str);

    public boolean zze(String str, String[] strArr) {
        return zzfd(str);
    }

    public final void zza(String str, String str2, long j, long j2, boolean z, int i, int i2) {
        zzawy.zzzb.post(new zzbaz(this, str, str2, j, j2, z, i, i2));
    }

    public final void zza(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzawy.zzzb.post(new zzbbc(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, String str2, int i) {
        zzawy.zzzb.post(new zzbbb(this, str, str2, i));
    }

    public final void zzb(String str, String str2, long j) {
        zzawy.zzzb.post(new zzbbe(this, str, str2, j));
    }

    public final void zza(String str, String str2, String str3, String str4) {
        zzawy.zzzb.post(new zzbbd(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String zzfe(String str) {
        zzuv.zzoj();
        return zzawy.zzen(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzff(String str) {
        char c;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                return "internal";
            case 6:
            case 7:
                return "io";
            case '\b':
            case '\t':
                return "network";
            case '\n':
            case 11:
                return "policy";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, Map<String, String> map) {
        zzazj zzazjVar = this.zzedf.get();
        if (zzazjVar != null) {
            zzazjVar.zza(str, map);
        }
    }
}
