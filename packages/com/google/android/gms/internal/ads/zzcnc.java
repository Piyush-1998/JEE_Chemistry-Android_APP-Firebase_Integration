package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzcnc {
    private String zzgdm;

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private String zzgdm;

        public final zza zzge(String str) {
            this.zzgdm = str;
            return this;
        }
    }

    private zzcnc(zza zzaVar) {
        this.zzgdm = zzaVar.zzgdm;
    }

    public final Set<String> zzals() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zzgdm.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzalt() {
        return this.zzgdm.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzalu() {
        char c;
        String str = this.zzgdm;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return c != 3 ? 0 : 7;
                }
                return 6;
            }
            return 3;
        }
        return 1;
    }
}
