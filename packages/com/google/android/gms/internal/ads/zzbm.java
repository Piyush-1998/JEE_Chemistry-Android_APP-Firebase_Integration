package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public enum zzbm implements zzdra {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final zzdqz<zzbm> zzeg = new zzdqz<zzbm>() { // from class: com.google.android.gms.internal.ads.zzbl
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzdra
    public final int zzab() {
        return this.value;
    }

    public static zzbm zze(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                    }
                    return ENUM_SIGNAL_SOURCE_GASS;
                }
                return ENUM_SIGNAL_SOURCE_ADSHIELD;
            }
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        return ENUM_SIGNAL_SOURCE_UNKNOWN;
    }

    public static zzdrc zzac() {
        return zzbn.zzep;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzbm(int i) {
        this.value = i;
    }
}
