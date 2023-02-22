package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzet {
    private long value;
    private final String zzjj;
    private boolean zzmi;
    private final /* synthetic */ zzeo zzmj;
    private final long zzmo;

    public zzet(zzeo zzeoVar, String str, long j) {
        this.zzmj = zzeoVar;
        Preconditions.checkNotEmpty(str);
        this.zzjj = str;
        this.zzmo = j;
    }

    public final long get() {
        SharedPreferences zzhb;
        if (!this.zzmi) {
            this.zzmi = true;
            zzhb = this.zzmj.zzhb();
            this.value = zzhb.getLong(this.zzjj, this.zzmo);
        }
        return this.value;
    }

    public final void set(long j) {
        SharedPreferences zzhb;
        zzhb = this.zzmj.zzhb();
        SharedPreferences.Editor edit = zzhb.edit();
        edit.putLong(this.zzjj, j);
        edit.apply();
        this.value = j;
    }
}
