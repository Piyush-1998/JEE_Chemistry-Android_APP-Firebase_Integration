package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@18.2.0 */
/* loaded from: classes.dex */
public final class zzaxl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxl> CREATOR = new zzaxo();
    public String zzblz;
    public int zzdwe;
    public int zzdwf;
    public boolean zzdwg;
    private boolean zzdwh;

    public zzaxl(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzaxl(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzaxl(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxl.<init>(int, int, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxl(String str, int i, int i2, boolean z, boolean z2) {
        this.zzblz = str;
        this.zzdwe = i;
        this.zzdwf = i2;
        this.zzdwg = z;
        this.zzdwh = z2;
    }

    public static zzaxl zzwo() {
        return new zzaxl(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzblz, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdwe);
        SafeParcelWriter.writeInt(parcel, 4, this.zzdwf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdwg);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzdwh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
