package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzdqw;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public class zzdqj {
    private static volatile boolean zzhhi = false;
    private static boolean zzhhj = true;
    private static volatile zzdqj zzhhl;
    private static volatile zzdqj zzhhm;
    private final Map<zza, zzdqw.zze<?, ?>> zzhho;
    private static final Class<?> zzhhk = zzayz();
    private static final zzdqj zzhhn = new zzdqj(true);

    private static Class<?> zzayz() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
    /* loaded from: classes.dex */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }
    }

    public static zzdqj zzaza() {
        zzdqj zzdqjVar = zzhhl;
        if (zzdqjVar == null) {
            synchronized (zzdqj.class) {
                zzdqjVar = zzhhl;
                if (zzdqjVar == null) {
                    zzdqjVar = zzhhn;
                    zzhhl = zzdqjVar;
                }
            }
        }
        return zzdqjVar;
    }

    public static zzdqj zzazb() {
        zzdqj zzdqjVar = zzhhm;
        if (zzdqjVar == null) {
            synchronized (zzdqj.class) {
                zzdqjVar = zzhhm;
                if (zzdqjVar == null) {
                    zzdqjVar = zzdqv.zze(zzdqj.class);
                    zzhhm = zzdqjVar;
                }
            }
        }
        return zzdqjVar;
    }

    public final <ContainingType extends zzdsg> zzdqw.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzdqw.zze<ContainingType, ?>) this.zzhho.get(new zza(containingtype, i));
    }

    zzdqj() {
        this.zzhho = new HashMap();
    }

    private zzdqj(boolean z) {
        this.zzhho = Collections.emptyMap();
    }
}
