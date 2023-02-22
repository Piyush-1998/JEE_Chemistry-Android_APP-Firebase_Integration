package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbo;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzczv> CREATOR = new zzczu();
    private final int versionCode;
    private zzbo.zza zzgog = null;
    private byte[] zzgoh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczv(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzgoh = bArr;
        zzaod();
    }

    public final zzbo.zza zzaoc() {
        if (!(this.zzgog != null)) {
            try {
                this.zzgog = zzbo.zza.zzb(this.zzgoh, zzdqj.zzazb());
                this.zzgoh = null;
            } catch (zzdrg e) {
                throw new IllegalStateException(e);
            }
        }
        zzaod();
        return this.zzgog;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        byte[] bArr = this.zzgoh;
        if (bArr == null) {
            bArr = this.zzgog.toByteArray();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzaod() {
        if (this.zzgog != null || this.zzgoh == null) {
            if (this.zzgog == null || this.zzgoh != null) {
                if (this.zzgog != null && this.zzgoh != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.zzgog == null && this.zzgoh == null) {
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Impossible");
            }
        }
    }
}
