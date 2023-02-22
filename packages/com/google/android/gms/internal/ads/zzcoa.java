package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzcoa implements zzcru<zzcnx> {
    private final zzatr zzbml;
    private final zzcwe zzfga;
    private final zzcru<zzcrx> zzgee;
    private final Context zzlk;

    public zzcoa(zzcpd<zzcrx> zzcpdVar, zzcwe zzcweVar, Context context, zzatr zzatrVar) {
        this.zzgee = zzcpdVar;
        this.zzfga = zzcweVar;
        this.zzlk = context;
        this.zzbml = zzatrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzcnx> zzalv() {
        return zzdcy.zzb(this.zzgee.zzalv(), new zzdal(this) { // from class: com.google.android.gms.internal.ads.zzcnz
            private final zzcoa zzged;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzged = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdal
            public final Object apply(Object obj) {
                return this.zzged.zza((zzcrx) obj);
            }
        }, zzaxn.zzdwn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcnx zza(zzcrx zzcrxVar) {
        zzua[] zzuaVarArr;
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        zzua[] zzuaVarArr2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzua zzuaVar = this.zzfga.zzbll;
        if (zzuaVar.zzccn == null) {
            str = zzuaVar.zzabd;
            z = zzuaVar.zzcco;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzua zzuaVar2 : zzuaVar.zzccn) {
                if (!zzuaVar2.zzcco && !z2) {
                    str = zzuaVar2.zzabd;
                    z2 = true;
                }
                if (zzuaVar2.zzcco && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.zzlk.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzbml.zzuh().zzvk();
            i = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzuaVar.zzccn != null) {
            boolean z4 = false;
            for (zzua zzuaVar3 : zzuaVar.zzccn) {
                if (zzuaVar3.zzcco) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzuaVar3.width == -1 && f != 0.0f) {
                        i4 = (int) (zzuaVar3.widthPixels / f);
                    } else {
                        i4 = zzuaVar3.width;
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzuaVar3.height == -2 && f != 0.0f) {
                        i5 = (int) (zzuaVar3.heightPixels / f);
                        sb.append(i5);
                    }
                    i5 = zzuaVar3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzcnx(zzuaVar, str, z, sb.toString(), f, i, i2, str2);
    }
}
