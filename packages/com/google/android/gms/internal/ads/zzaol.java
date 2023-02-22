package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaol extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaol> CREATOR = new zzaoo();
    private final ApplicationInfo applicationInfo;
    private final int versionCode;
    private final zzaxl zzblk;
    private final zzua zzbll;
    private final float zzbog;
    private final String zzbqy;
    private final String zzcdr;
    private final boolean zzdcd;
    private final zzaay zzdeh;
    private final List<String> zzdei;
    private final int zzdgn;
    private final int zzdgo;
    private final Bundle zzdit;
    private final zztx zzdiu;
    private final PackageInfo zzdiv;
    private final String zzdiw;
    private final String zzdix;
    private final Bundle zzdiy;
    private final int zzdiz;
    private final Bundle zzdja;
    private final boolean zzdjb;
    private final String zzdjc;
    private final long zzdjd;
    private final String zzdje;
    private final List<String> zzdjf;
    private final String zzdjg;
    private final List<String> zzdjh;
    private final long zzdji;
    private final String zzdjj;
    private final float zzdjk;
    private final int zzdjl;
    private final int zzdjm;
    private final boolean zzdjn;
    private final boolean zzdjo;
    private final String zzdjp;
    private final boolean zzdjq;
    private final String zzdjr;
    private final int zzdjs;
    private final Bundle zzdjt;
    private final String zzdju;
    private final zzwx zzdjv;
    private final boolean zzdjw;
    private final Bundle zzdjx;
    private final String zzdjy;
    private final String zzdjz;
    private final String zzdka;
    private final boolean zzdkb;
    private final List<Integer> zzdkc;
    private final String zzdkd;
    private final List<String> zzdke;
    private final int zzdkf;
    private final boolean zzdkg;
    private final boolean zzdkh;
    private final boolean zzdki;
    private final ArrayList<String> zzdkj;
    private final String zzdkk;
    private final zzagd zzdkl;
    private final String zzdkm;
    private final Bundle zzdkn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaol(int i, Bundle bundle, zztx zztxVar, zzua zzuaVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzaxl zzaxlVar, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzaay zzaayVar, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzwx zzwxVar, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzagd zzagdVar, String str17, Bundle bundle6) {
        List<String> unmodifiableList;
        List<String> unmodifiableList2;
        this.versionCode = i;
        this.zzdit = bundle;
        this.zzdiu = zztxVar;
        this.zzbll = zzuaVar;
        this.zzbqy = str;
        this.applicationInfo = applicationInfo;
        this.zzdiv = packageInfo;
        this.zzdiw = str2;
        this.zzdix = str3;
        this.zzcdr = str4;
        this.zzblk = zzaxlVar;
        this.zzdiy = bundle2;
        this.zzdiz = i2;
        this.zzdei = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzdjh = unmodifiableList;
        this.zzdja = bundle3;
        this.zzdjb = z;
        this.zzdgn = i3;
        this.zzdgo = i4;
        this.zzbog = f;
        this.zzdjc = str5;
        this.zzdjd = j;
        this.zzdje = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzdjf = unmodifiableList2;
        this.zzdjg = str7;
        this.zzdeh = zzaayVar;
        this.zzdji = j2;
        this.zzdjj = str8;
        this.zzdjk = f2;
        this.zzdjq = z2;
        this.zzdjl = i5;
        this.zzdjm = i6;
        this.zzdjn = z3;
        this.zzdjo = z4;
        this.zzdjp = str9;
        this.zzdjr = str10;
        this.zzdcd = z5;
        this.zzdjs = i7;
        this.zzdjt = bundle4;
        this.zzdju = str11;
        this.zzdjv = zzwxVar;
        this.zzdjw = z6;
        this.zzdjx = bundle5;
        this.zzdjy = str12;
        this.zzdjz = str13;
        this.zzdka = str14;
        this.zzdkb = z7;
        this.zzdkc = list4;
        this.zzdkd = str15;
        this.zzdke = list5;
        this.zzdkf = i8;
        this.zzdkg = z8;
        this.zzdkh = z9;
        this.zzdki = z10;
        this.zzdkj = arrayList;
        this.zzdkk = str16;
        this.zzdkl = zzagdVar;
        this.zzdkm = str17;
        this.zzdkn = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdit, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdiu, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzbll, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbqy, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdiv, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdiw, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdix, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzcdr, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzblk, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdiy, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdiz);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzdei, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdja, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdjb);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdgn);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdgo);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzbog);
        SafeParcelWriter.writeString(parcel, 21, this.zzdjc, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdjd);
        SafeParcelWriter.writeString(parcel, 26, this.zzdje, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdjf, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzdjg, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzdeh, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdjh, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdji);
        SafeParcelWriter.writeString(parcel, 33, this.zzdjj, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdjk);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdjl);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdjm);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdjn);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdjo);
        SafeParcelWriter.writeString(parcel, 39, this.zzdjp, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdjq);
        SafeParcelWriter.writeString(parcel, 41, this.zzdjr, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzdcd);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdjs);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdjt, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdju, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzdjv, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdjw);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdjx, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdjy, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdjz, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdka, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdkb);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzdkc, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdkd, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdke, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdkf);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdkg);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdkh);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdki);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdkj, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdkk, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzdkl, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdkm, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdkn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
