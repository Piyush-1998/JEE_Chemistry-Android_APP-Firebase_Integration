package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzev {
    private String value;
    private final String zzjj;
    private boolean zzmi;
    private final /* synthetic */ zzeo zzmj;
    private final String zzmp;

    public zzev(zzeo zzeoVar, String str, String str2) {
        this.zzmj = zzeoVar;
        Preconditions.checkNotEmpty(str);
        this.zzjj = str;
        this.zzmp = null;
    }

    public final String zzho() {
        SharedPreferences zzhb;
        if (!this.zzmi) {
            this.zzmi = true;
            zzhb = this.zzmj.zzhb();
            this.value = zzhb.getString(this.zzjj, null);
        }
        return this.value;
    }

    public final void zzau(String str) {
        SharedPreferences zzhb;
        if (zzjs.zzs(str, this.value)) {
            return;
        }
        zzhb = this.zzmj.zzhb();
        SharedPreferences.Editor edit = zzhb.edit();
        edit.putString(this.zzjj, str);
        edit.apply();
        this.value = str;
    }
}
