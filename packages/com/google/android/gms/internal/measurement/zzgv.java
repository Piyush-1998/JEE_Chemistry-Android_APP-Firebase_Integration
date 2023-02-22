package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzey;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgv implements zzgg {
    private final int flags;
    private final String info;
    private final Object[] zzakk;
    private final zzgi zzakn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgi zzgiVar, String str, Object[] objArr) {
        this.zzakn = zzgiVar;
        this.info = str;
        this.zzakk = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzvz() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzwa() {
        return this.zzakk;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final zzgi zzvt() {
        return this.zzakn;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final int zzvr() {
        return (this.flags & 1) == 1 ? zzey.zzd.zzail : zzey.zzd.zzaim;
    }

    @Override // com.google.android.gms.internal.measurement.zzgg
    public final boolean zzvs() {
        return (this.flags & 2) == 2;
    }
}
