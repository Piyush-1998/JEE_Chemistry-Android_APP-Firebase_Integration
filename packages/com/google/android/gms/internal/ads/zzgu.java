package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzgu {
    public static final zzgu zzafz = new zzgu(1.0f, 1.0f);
    public final float zzaga;
    public final float zzagb;
    private final int zzagc;

    public zzgu(float f, float f2) {
        this.zzaga = f;
        this.zzagb = f2;
        this.zzagc = Math.round(f * 1000.0f);
    }

    public final long zzdo(long j) {
        return j * this.zzagc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgu zzguVar = (zzgu) obj;
            if (this.zzaga == zzguVar.zzaga && this.zzagb == zzguVar.zzagb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzaga) + 527) * 31) + Float.floatToRawIntBits(this.zzagb);
    }
}
