package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzah> CREATOR = new zzaj();
    private final Bundle zzft;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah(Bundle bundle) {
        this.zzft = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzcv(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object get(String str) {
        return this.zzft.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long getLong(String str) {
        return Long.valueOf(this.zzft.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double zzah(String str) {
        return Double.valueOf(this.zzft.getDouble(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getString(String str) {
        return this.zzft.getString(str);
    }

    public final int size() {
        return this.zzft.size();
    }

    public final String toString() {
        return this.zzft.toString();
    }

    public final Bundle zzcv() {
        return new Bundle(this.zzft);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzag(this);
    }
}
