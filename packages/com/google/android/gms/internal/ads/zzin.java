package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzin implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzin> CREATOR = new zzim();
    private int zzafv;
    private final zza[] zzamk;
    public final int zzaml;

    public zzin(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zzio();
        private final byte[] data;
        private final String mimeType;
        private final UUID uuid;
        private int zzafv;
        public final boolean zzamm;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zznr.checkNotNull(uuid);
            this.mimeType = (String) zznr.checkNotNull(str);
            this.data = (byte[]) zznr.checkNotNull(bArr);
            this.zzamm = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzamm = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                if (obj == this) {
                    return true;
                }
                zza zzaVar = (zza) obj;
                return this.mimeType.equals(zzaVar.mimeType) && zzof.zza(this.uuid, zzaVar.uuid) && Arrays.equals(this.data, zzaVar.data);
            }
            return false;
        }

        public final int hashCode() {
            if (this.zzafv == 0) {
                this.zzafv = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzafv;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzamm ? (byte) 1 : (byte) 0);
        }
    }

    private zzin(boolean z, zza... zzaVarArr) {
        zza[] zzaVarArr2 = (zza[]) zzaVarArr.clone();
        Arrays.sort(zzaVarArr2, this);
        for (int i = 1; i < zzaVarArr2.length; i++) {
            if (zzaVarArr2[i - 1].uuid.equals(zzaVarArr2[i].uuid)) {
                String valueOf = String.valueOf(zzaVarArr2[i].uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.zzamk = zzaVarArr2;
        this.zzaml = zzaVarArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzamk = zzaVarArr;
        this.zzaml = zzaVarArr.length;
    }

    public final zza zzz(int i) {
        return this.zzamk[i];
    }

    public final int hashCode() {
        if (this.zzafv == 0) {
            this.zzafv = Arrays.hashCode(this.zzamk);
        }
        return this.zzafv;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzamk, ((zzin) obj).zzamk);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzamk, 0);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        if (zzga.zzaca.equals(zzaVar3.uuid)) {
            return zzga.zzaca.equals(zzaVar4.uuid) ? 0 : 1;
        }
        return zzaVar3.uuid.compareTo(zzaVar4.uuid);
    }
}
