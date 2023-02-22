package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdz extends com.google.android.gms.internal.measurement.zzb implements zzdx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(zzai zzaiVar, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzaiVar);
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(zzjn zzjnVar, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzjnVar);
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(zzai zzaiVar, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzaiVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzb(zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List<zzjn> zza(zzn zznVar, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        com.google.android.gms.internal.measurement.zzd.writeBoolean(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzjn.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final byte[] zza(zzai zzaiVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzaiVar);
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        byte[] createByteArray = transactAndReadException.createByteArray();
        transactAndReadException.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(long j, String str, String str2, String str3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final String zzc(zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zza(zzq zzqVar, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzqVar);
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzb(zzq zzqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zzqVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List<zzjn> zza(String str, String str2, boolean z, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzd.writeBoolean(obtainAndWriteInterfaceToken, z);
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzjn.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List<zzjn> zza(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        com.google.android.gms.internal.measurement.zzd.writeBoolean(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzjn.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List<zzq> zza(String str, String str2, zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzq.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final List<zzq> zzc(String str, String str2, String str3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        obtainAndWriteInterfaceToken.writeString(str3);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(zzq.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzdx
    public final void zzd(zzn zznVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.measurement.zzd.zza(obtainAndWriteInterfaceToken, zznVar);
        zza(18, obtainAndWriteInterfaceToken);
    }
}
