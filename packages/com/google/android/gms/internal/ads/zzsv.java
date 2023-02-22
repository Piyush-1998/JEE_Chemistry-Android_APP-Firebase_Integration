package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public enum zzsv implements zzdra {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzdqz<zzsv> zzeg = new zzdqz<zzsv>() { // from class: com.google.android.gms.internal.ads.zzsu
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzdra
    public final int zzab() {
        return this.value;
    }

    public static zzsv zzbt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 1000) {
                    return null;
                }
                return ENUM_UNKNOWN;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzdrc zzac() {
        return zzsw.zzep;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzsv(int i) {
        this.value = i;
    }
}
