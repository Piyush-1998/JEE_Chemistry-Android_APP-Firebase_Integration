package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public enum zzca implements zzdra {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    
    private static final zzdqz<zzca> zzeg = new zzdqz<zzca>() { // from class: com.google.android.gms.internal.ads.zzcd
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzdra
    public final int zzab() {
        return this.value;
    }

    public static zzca zzk(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PARTNER_SIGNALS;
                }
                return UNITY_SIGNALS;
            }
            return AFMA_SIGNALS;
        }
        return UNKNOWN_PROTO;
    }

    public static zzdrc zzac() {
        return zzcc.zzep;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzca(int i) {
        this.value = i;
    }
}
