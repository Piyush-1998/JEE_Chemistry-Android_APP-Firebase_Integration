package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzes {
    private final /* synthetic */ zzeo zzmj;
    private final String zzmk;
    private final String zzml;
    private final String zzmm;
    private final long zzmn;

    private zzes(zzeo zzeoVar, String str, long j) {
        this.zzmj = zzeoVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0);
        this.zzmk = String.valueOf(str).concat(":start");
        this.zzml = String.valueOf(str).concat(":count");
        this.zzmm = String.valueOf(str).concat(":value");
        this.zzmn = j;
    }

    private final void zzhk() {
        SharedPreferences zzhb;
        this.zzmj.zzo();
        long currentTimeMillis = this.zzmj.zzx().currentTimeMillis();
        zzhb = this.zzmj.zzhb();
        SharedPreferences.Editor edit = zzhb.edit();
        edit.remove(this.zzml);
        edit.remove(this.zzmm);
        edit.putLong(this.zzmk, currentTimeMillis);
        edit.apply();
    }

    public final void zzc(String str, long j) {
        SharedPreferences zzhb;
        SharedPreferences zzhb2;
        SharedPreferences zzhb3;
        this.zzmj.zzo();
        if (zzhm() == 0) {
            zzhk();
        }
        if (str == null) {
            str = "";
        }
        zzhb = this.zzmj.zzhb();
        long j2 = zzhb.getLong(this.zzml, 0L);
        if (j2 > 0) {
            long j3 = j2 + 1;
            boolean z = (this.zzmj.zzz().zzjw().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
            zzhb2 = this.zzmj.zzhb();
            SharedPreferences.Editor edit = zzhb2.edit();
            if (z) {
                edit.putString(this.zzmm, str);
            }
            edit.putLong(this.zzml, j3);
            edit.apply();
            return;
        }
        zzhb3 = this.zzmj.zzhb();
        SharedPreferences.Editor edit2 = zzhb3.edit();
        edit2.putString(this.zzmm, str);
        edit2.putLong(this.zzml, 1L);
        edit2.apply();
    }

    public final Pair<String, Long> zzhl() {
        long abs;
        SharedPreferences zzhb;
        SharedPreferences zzhb2;
        this.zzmj.zzo();
        this.zzmj.zzo();
        long zzhm = zzhm();
        if (zzhm == 0) {
            zzhk();
            abs = 0;
        } else {
            abs = Math.abs(zzhm - this.zzmj.zzx().currentTimeMillis());
        }
        long j = this.zzmn;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            zzhk();
            return null;
        }
        zzhb = this.zzmj.zzhb();
        String string = zzhb.getString(this.zzmm, null);
        zzhb2 = this.zzmj.zzhb();
        long j2 = zzhb2.getLong(this.zzml, 0L);
        zzhk();
        if (string == null || j2 <= 0) {
            return zzeo.zzlg;
        }
        return new Pair<>(string, Long.valueOf(j2));
    }

    private final long zzhm() {
        SharedPreferences zzhb;
        zzhb = this.zzmj.zzhb();
        return zzhb.getLong(this.zzmk, 0L);
    }
}
