package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzgo implements Parcelable {
    public static final Parcelable.Creator<zzgo> CREATOR = new zzgr();
    public final int height;
    public final int width;
    private final String zzaex;
    public final int zzaey;
    public final String zzaez;
    private final zzkx zzafa;
    private final String zzafb;
    public final String zzafc;
    public final int zzafd;
    public final List<byte[]> zzafe;
    public final zzin zzaff;
    public final float zzafg;
    public final int zzafh;
    public final float zzafi;
    private final int zzafj;
    private final byte[] zzafk;
    private final zzok zzafl;
    public final int zzafm;
    public final int zzafn;
    public final int zzafo;
    private final int zzafp;
    private final int zzafq;
    public final long zzafr;
    public final int zzafs;
    public final String zzaft;
    private final int zzafu;
    private int zzafv;

    public static zzgo zza(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzok zzokVar, zzin zzinVar) {
        return new zzgo(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzokVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzinVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static zzgo zza(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzin zzinVar, int i5, String str4) {
        return zza(str, str2, null, -1, -1, i3, i4, -1, null, zzinVar, 0, str4);
    }

    public static zzgo zza(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzin zzinVar, int i6, String str4) {
        return new zzgo(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzinVar, null);
    }

    public static zzgo zza(String str, String str2, String str3, int i, int i2, String str4, zzin zzinVar) {
        return zza(str, str2, null, -1, i2, str4, -1, zzinVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzgo zza(String str, String str2, String str3, int i, int i2, String str4, int i3, zzin zzinVar, long j, List<byte[]> list) {
        return new zzgo(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzinVar, null);
    }

    public static zzgo zza(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzin zzinVar) {
        return new zzgo(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzinVar, null);
    }

    public static zzgo zza(String str, String str2, String str3, int i, zzin zzinVar) {
        return new zzgo(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    private zzgo(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzok zzokVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzin zzinVar, zzkx zzkxVar) {
        this.zzaex = str;
        this.zzafb = str2;
        this.zzafc = str3;
        this.zzaez = str4;
        this.zzaey = i;
        this.zzafd = i2;
        this.width = i3;
        this.height = i4;
        this.zzafg = f;
        this.zzafh = i5;
        this.zzafi = f2;
        this.zzafk = bArr;
        this.zzafj = i6;
        this.zzafl = zzokVar;
        this.zzafm = i7;
        this.zzafn = i8;
        this.zzafo = i9;
        this.zzafp = i10;
        this.zzafq = i11;
        this.zzafs = i12;
        this.zzaft = str5;
        this.zzafu = i13;
        this.zzafr = j;
        this.zzafe = list == null ? Collections.emptyList() : list;
        this.zzaff = zzinVar;
        this.zzafa = zzkxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(Parcel parcel) {
        this.zzaex = parcel.readString();
        this.zzafb = parcel.readString();
        this.zzafc = parcel.readString();
        this.zzaez = parcel.readString();
        this.zzaey = parcel.readInt();
        this.zzafd = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.zzafg = parcel.readFloat();
        this.zzafh = parcel.readInt();
        this.zzafi = parcel.readFloat();
        this.zzafk = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzafj = parcel.readInt();
        this.zzafl = (zzok) parcel.readParcelable(zzok.class.getClassLoader());
        this.zzafm = parcel.readInt();
        this.zzafn = parcel.readInt();
        this.zzafo = parcel.readInt();
        this.zzafp = parcel.readInt();
        this.zzafq = parcel.readInt();
        this.zzafs = parcel.readInt();
        this.zzaft = parcel.readString();
        this.zzafu = parcel.readInt();
        this.zzafr = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzafe = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzafe.add(parcel.createByteArray());
        }
        this.zzaff = (zzin) parcel.readParcelable(zzin.class.getClassLoader());
        this.zzafa = (zzkx) parcel.readParcelable(zzkx.class.getClassLoader());
    }

    public final zzgo zzo(int i) {
        return new zzgo(this.zzaex, this.zzafb, this.zzafc, this.zzaez, this.zzaey, i, this.width, this.height, this.zzafg, this.zzafh, this.zzafi, this.zzafk, this.zzafj, this.zzafl, this.zzafm, this.zzafn, this.zzafo, this.zzafp, this.zzafq, this.zzafs, this.zzaft, this.zzafu, this.zzafr, this.zzafe, this.zzaff, this.zzafa);
    }

    public final zzgo zzdm(long j) {
        return new zzgo(this.zzaex, this.zzafb, this.zzafc, this.zzaez, this.zzaey, this.zzafd, this.width, this.height, this.zzafg, this.zzafh, this.zzafi, this.zzafk, this.zzafj, this.zzafl, this.zzafm, this.zzafn, this.zzafo, this.zzafp, this.zzafq, this.zzafs, this.zzaft, this.zzafu, j, this.zzafe, this.zzaff, this.zzafa);
    }

    public final zzgo zza(int i, int i2) {
        return new zzgo(this.zzaex, this.zzafb, this.zzafc, this.zzaez, this.zzaey, this.zzafd, this.width, this.height, this.zzafg, this.zzafh, this.zzafi, this.zzafk, this.zzafj, this.zzafl, this.zzafm, this.zzafn, this.zzafo, i, i2, this.zzafs, this.zzaft, this.zzafu, this.zzafr, this.zzafe, this.zzaff, this.zzafa);
    }

    public final zzgo zza(zzkx zzkxVar) {
        return new zzgo(this.zzaex, this.zzafb, this.zzafc, this.zzaez, this.zzaey, this.zzafd, this.width, this.height, this.zzafg, this.zzafh, this.zzafi, this.zzafk, this.zzafj, this.zzafl, this.zzafm, this.zzafn, this.zzafo, this.zzafp, this.zzafq, this.zzafs, this.zzaft, this.zzafu, this.zzafr, this.zzafe, this.zzaff, zzkxVar);
    }

    public final int zzej() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final MediaFormat zzek() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzafc);
        String str = this.zzaft;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zza(mediaFormat, "max-input-size", this.zzafd);
        zza(mediaFormat, "width", this.width);
        zza(mediaFormat, "height", this.height);
        float f = this.zzafg;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zza(mediaFormat, "rotation-degrees", this.zzafh);
        zza(mediaFormat, "channel-count", this.zzafm);
        zza(mediaFormat, "sample-rate", this.zzafn);
        zza(mediaFormat, "encoder-delay", this.zzafp);
        zza(mediaFormat, "encoder-padding", this.zzafq);
        for (int i = 0; i < this.zzafe.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.zzafe.get(i)));
        }
        zzok zzokVar = this.zzafl;
        if (zzokVar != null) {
            zza(mediaFormat, "color-transfer", zzokVar.zzapw);
            zza(mediaFormat, "color-standard", zzokVar.zzapv);
            zza(mediaFormat, "color-range", zzokVar.zzapx);
            byte[] bArr = zzokVar.zzbgz;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.zzaex;
        String str2 = this.zzafb;
        String str3 = this.zzafc;
        int i = this.zzaey;
        String str4 = this.zzaft;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.zzafg;
        int i4 = this.zzafm;
        int i5 = this.zzafn;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzafv == 0) {
            String str = this.zzaex;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zzafb;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzafc;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzaez;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzaey) * 31) + this.width) * 31) + this.height) * 31) + this.zzafm) * 31) + this.zzafn) * 31;
            String str5 = this.zzaft;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzafu) * 31;
            zzin zzinVar = this.zzaff;
            int hashCode6 = (hashCode5 + (zzinVar == null ? 0 : zzinVar.hashCode())) * 31;
            zzkx zzkxVar = this.zzafa;
            this.zzafv = hashCode6 + (zzkxVar != null ? zzkxVar.hashCode() : 0);
        }
        return this.zzafv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgo zzgoVar = (zzgo) obj;
            if (this.zzaey == zzgoVar.zzaey && this.zzafd == zzgoVar.zzafd && this.width == zzgoVar.width && this.height == zzgoVar.height && this.zzafg == zzgoVar.zzafg && this.zzafh == zzgoVar.zzafh && this.zzafi == zzgoVar.zzafi && this.zzafj == zzgoVar.zzafj && this.zzafm == zzgoVar.zzafm && this.zzafn == zzgoVar.zzafn && this.zzafo == zzgoVar.zzafo && this.zzafp == zzgoVar.zzafp && this.zzafq == zzgoVar.zzafq && this.zzafr == zzgoVar.zzafr && this.zzafs == zzgoVar.zzafs && zzof.zza(this.zzaex, zzgoVar.zzaex) && zzof.zza(this.zzaft, zzgoVar.zzaft) && this.zzafu == zzgoVar.zzafu && zzof.zza(this.zzafb, zzgoVar.zzafb) && zzof.zza(this.zzafc, zzgoVar.zzafc) && zzof.zza(this.zzaez, zzgoVar.zzaez) && zzof.zza(this.zzaff, zzgoVar.zzaff) && zzof.zza(this.zzafa, zzgoVar.zzafa) && zzof.zza(this.zzafl, zzgoVar.zzafl) && Arrays.equals(this.zzafk, zzgoVar.zzafk) && this.zzafe.size() == zzgoVar.zzafe.size()) {
                for (int i = 0; i < this.zzafe.size(); i++) {
                    if (!Arrays.equals(this.zzafe.get(i), zzgoVar.zzafe.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzaex);
        parcel.writeString(this.zzafb);
        parcel.writeString(this.zzafc);
        parcel.writeString(this.zzaez);
        parcel.writeInt(this.zzaey);
        parcel.writeInt(this.zzafd);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.zzafg);
        parcel.writeInt(this.zzafh);
        parcel.writeFloat(this.zzafi);
        parcel.writeInt(this.zzafk != null ? 1 : 0);
        byte[] bArr = this.zzafk;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzafj);
        parcel.writeParcelable(this.zzafl, i);
        parcel.writeInt(this.zzafm);
        parcel.writeInt(this.zzafn);
        parcel.writeInt(this.zzafo);
        parcel.writeInt(this.zzafp);
        parcel.writeInt(this.zzafq);
        parcel.writeInt(this.zzafs);
        parcel.writeString(this.zzaft);
        parcel.writeInt(this.zzafu);
        parcel.writeLong(this.zzafr);
        int size = this.zzafe.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzafe.get(i2));
        }
        parcel.writeParcelable(this.zzaff, 0);
        parcel.writeParcelable(this.zzafa, 0);
    }
}
