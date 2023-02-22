package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzeq {
    private boolean value;
    private final String zzjj;
    private final boolean zzmh;
    private boolean zzmi;
    private final /* synthetic */ zzeo zzmj;

    public zzeq(zzeo zzeoVar, String str, boolean z) {
        this.zzmj = zzeoVar;
        Preconditions.checkNotEmpty(str);
        this.zzjj = str;
        this.zzmh = z;
    }

    public final boolean get() {
        SharedPreferences zzhb;
        if (!this.zzmi) {
            this.zzmi = true;
            zzhb = this.zzmj.zzhb();
            this.value = zzhb.getBoolean(this.zzjj, this.zzmh);
        }
        return this.value;
    }

    public final void set(boolean z) {
        SharedPreferences zzhb;
        zzhb = this.zzmj.zzhb();
        SharedPreferences.Editor edit = zzhb.edit();
        edit.putBoolean(this.zzjj, z);
        edit.apply();
        this.value = z;
    }
}
