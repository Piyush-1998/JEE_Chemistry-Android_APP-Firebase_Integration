package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzadw;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zztp;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzm();
    public final int orientation;
    public final String url;
    public final zzaxl zzblk;
    public final zztp zzcbs;
    public final zzadw zzcxc;
    public final zzady zzcxd;
    public final zzbbw zzczi;
    public final zzd zzdhx;
    public final zzo zzdhy;
    public final String zzdhz;
    public final boolean zzdia;
    public final String zzdib;
    public final zzt zzdic;
    public final int zzdid;
    public final String zzdie;
    public final com.google.android.gms.ads.internal.zzg zzdif;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(zztp zztpVar, zzo zzoVar, zzt zztVar, zzbbw zzbbwVar, int i, zzaxl zzaxlVar, String str, com.google.android.gms.ads.internal.zzg zzgVar, String str2, String str3) {
        this.zzdhx = null;
        this.zzcbs = null;
        this.zzdhy = zzoVar;
        this.zzczi = zzbbwVar;
        this.zzcxc = null;
        this.zzcxd = null;
        this.zzdhz = str2;
        this.zzdia = false;
        this.zzdib = str3;
        this.zzdic = null;
        this.orientation = i;
        this.zzdid = 1;
        this.url = null;
        this.zzblk = zzaxlVar;
        this.zzdie = str;
        this.zzdif = zzgVar;
    }

    public AdOverlayInfoParcel(zztp zztpVar, zzo zzoVar, zzt zztVar, zzbbw zzbbwVar, boolean z, int i, zzaxl zzaxlVar) {
        this.zzdhx = null;
        this.zzcbs = zztpVar;
        this.zzdhy = zzoVar;
        this.zzczi = zzbbwVar;
        this.zzcxc = null;
        this.zzcxd = null;
        this.zzdhz = null;
        this.zzdia = z;
        this.zzdib = null;
        this.zzdic = zztVar;
        this.orientation = i;
        this.zzdid = 2;
        this.url = null;
        this.zzblk = zzaxlVar;
        this.zzdie = null;
        this.zzdif = null;
    }

    public AdOverlayInfoParcel(zztp zztpVar, zzo zzoVar, zzadw zzadwVar, zzady zzadyVar, zzt zztVar, zzbbw zzbbwVar, boolean z, int i, String str, zzaxl zzaxlVar) {
        this.zzdhx = null;
        this.zzcbs = zztpVar;
        this.zzdhy = zzoVar;
        this.zzczi = zzbbwVar;
        this.zzcxc = zzadwVar;
        this.zzcxd = zzadyVar;
        this.zzdhz = null;
        this.zzdia = z;
        this.zzdib = null;
        this.zzdic = zztVar;
        this.orientation = i;
        this.zzdid = 3;
        this.url = str;
        this.zzblk = zzaxlVar;
        this.zzdie = null;
        this.zzdif = null;
    }

    public AdOverlayInfoParcel(zztp zztpVar, zzo zzoVar, zzadw zzadwVar, zzady zzadyVar, zzt zztVar, zzbbw zzbbwVar, boolean z, int i, String str, String str2, zzaxl zzaxlVar) {
        this.zzdhx = null;
        this.zzcbs = zztpVar;
        this.zzdhy = zzoVar;
        this.zzczi = zzbbwVar;
        this.zzcxc = zzadwVar;
        this.zzcxd = zzadyVar;
        this.zzdhz = str2;
        this.zzdia = z;
        this.zzdib = str;
        this.zzdic = zztVar;
        this.orientation = i;
        this.zzdid = 3;
        this.url = null;
        this.zzblk = zzaxlVar;
        this.zzdie = null;
        this.zzdif = null;
    }

    public AdOverlayInfoParcel(zzd zzdVar, zztp zztpVar, zzo zzoVar, zzt zztVar, zzaxl zzaxlVar) {
        this.zzdhx = zzdVar;
        this.zzcbs = zztpVar;
        this.zzdhy = zzoVar;
        this.zzczi = null;
        this.zzcxc = null;
        this.zzcxd = null;
        this.zzdhz = null;
        this.zzdia = false;
        this.zzdib = null;
        this.zzdic = zztVar;
        this.orientation = -1;
        this.zzdid = 4;
        this.url = null;
        this.zzblk = zzaxlVar;
        this.zzdie = null;
        this.zzdif = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(zzd zzdVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzaxl zzaxlVar, String str4, com.google.android.gms.ads.internal.zzg zzgVar, IBinder iBinder6) {
        this.zzdhx = zzdVar;
        this.zzcbs = (zztp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdhy = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzczi = (zzbbw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzcxc = (zzadw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzcxd = (zzady) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzdhz = str;
        this.zzdia = z;
        this.zzdib = str2;
        this.zzdic = (zzt) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzdid = i2;
        this.url = str3;
        this.zzblk = zzaxlVar;
        this.zzdie = str4;
        this.zzdif = zzgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdhx, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzcbs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzdhy).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzczi).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzcxd).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdhz, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdia);
        SafeParcelWriter.writeString(parcel, 9, this.zzdib, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzdic).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzdid);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzblk, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzdie, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzdif, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzcxc).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
