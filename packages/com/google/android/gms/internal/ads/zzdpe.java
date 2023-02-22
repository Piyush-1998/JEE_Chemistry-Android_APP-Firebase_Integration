package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpe;
import com.google.android.gms.internal.ads.zzdpf;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdpe<MessageType extends zzdpf<MessageType, BuilderType>, BuilderType extends zzdpe<MessageType, BuilderType>> implements zzdsf {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzdpy zzdpyVar, zzdqj zzdqjVar) throws IOException;

    @Override // 
    /* renamed from: zzaxf */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzdqj zzdqjVar) throws zzdrg {
        try {
            zzdpy zzc = zzdpy.zzc(bArr, 0, i2, false);
            zza(zzc, zzdqjVar);
            zzc.zzfp(0);
            return this;
        } catch (zzdrg e) {
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
    @Override // com.google.android.gms.internal.ads.zzdsf
    public final /* synthetic */ zzdsf zzi(zzdsg zzdsgVar) {
        if (!zzazs().getClass().isInstance(zzdsgVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzdpf) zzdsgVar);
    }
}
