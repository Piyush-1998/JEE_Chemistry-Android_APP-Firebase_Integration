package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzua extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzua> CREATOR = new zzud();
    public final int height;
    public final int heightPixels;
    public final int width;
    public final int widthPixels;
    public final String zzabd;
    public final boolean zzbmb;
    public final boolean zzccm;
    public final zzua[] zzccn;
    public final boolean zzcco;
    public boolean zzccp;
    public boolean zzccq;
    private boolean zzccr;
    public boolean zzccs;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (zzd(displayMetrics) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzua zzg(Context context) {
        return new zzua("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false);
    }

    public static zzua zzoa() {
        return new zzua("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false);
    }

    public static zzua zzob() {
        return new zzua("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false);
    }

    public zzua() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false);
    }

    public static zzua zzoc() {
        return new zzua("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false);
    }

    public zzua(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzua(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzua.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzua(String str, int i, int i2, boolean z, int i3, int i4, zzua[] zzuaVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.zzabd = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzccm = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzccn = zzuaVarArr;
        this.zzbmb = z2;
        this.zzcco = z3;
        this.zzccp = z4;
        this.zzccq = z5;
        this.zzccr = z6;
        this.zzccs = z7;
    }

    public final AdSize zzod() {
        return com.google.android.gms.ads.zzb.zza(this.width, this.height, this.zzabd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzabd, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzccm);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzccn, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbmb);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzcco);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzccp);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzccq);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzccr);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzccs);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
