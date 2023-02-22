package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public enum zzbv implements zzdra {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);
    
    private static final zzdqz<zzbv> zzeg = new zzdqz<zzbv>() { // from class: com.google.android.gms.internal.ads.zzbx
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzdra
    public final int zzab() {
        return this.value;
    }

    public static zzbv zzi(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return UNENCRYPTED;
                }
                return TINK_HYBRID;
            }
            return BITSLICER;
        }
        return UNKNOWN_ENCRYPTION_METHOD;
    }

    public static zzdrc zzac() {
        return zzbw.zzep;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzbv(int i) {
        this.value = i;
    }
}
