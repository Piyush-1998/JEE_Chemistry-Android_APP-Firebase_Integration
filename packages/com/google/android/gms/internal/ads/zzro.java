package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzro extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzro> CREATOR = new zzrn();
    private ParcelFileDescriptor zzbrh;

    public zzro() {
        this(null);
    }

    public zzro(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbrh = parcelFileDescriptor;
    }

    public final synchronized boolean zzmi() {
        return this.zzbrh != null;
    }

    public final synchronized InputStream zzmj() {
        if (this.zzbrh == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbrh);
        this.zzbrh = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzmk() {
        return this.zzbrh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmk(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
