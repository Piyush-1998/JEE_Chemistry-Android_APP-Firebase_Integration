package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzqn {
    final long value;
    final int zzbqf;
    final String zzbqm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqn(long j, String str, int i) {
        this.value = j;
        this.zzbqm = str;
        this.zzbqf = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzqn)) {
            zzqn zzqnVar = (zzqn) obj;
            if (zzqnVar.value == this.value && zzqnVar.zzbqf == this.zzbqf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
