package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdh;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzdh<MessageType extends zzdf<MessageType, BuilderType>, BuilderType extends zzdh<MessageType, BuilderType>> implements zzgh {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzeb zzebVar, zzel zzelVar) throws IOException;

    @Override // 
    /* renamed from: zzru */
    public abstract BuilderType clone();

    public final BuilderType zzf(byte[] bArr, zzel zzelVar) throws zzfi {
        return zza(bArr, 0, bArr.length, zzelVar);
    }

    public BuilderType zza(byte[] bArr, int i, int i2, zzel zzelVar) throws zzfi {
        try {
            zzeb zza = zzeb.zza(bArr, 0, i2, false);
            zza(zza, zzelVar);
            zza.zzat(0);
            return this;
        } catch (zzfi e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgh
    public final /* synthetic */ zzgh zza(zzgi zzgiVar) {
        if (!zzuh().getClass().isInstance(zzgiVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzdh<MessageType, BuilderType>) ((zzdf) zzgiVar));
    }
}
