package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzay implements zzba {
    private static Logger zzcn = Logger.getLogger(zzay.class.getName());
    private ThreadLocal<ByteBuffer> zzco = new zzax(this);

    public abstract zzbb zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbb zza(zzdvn zzdvnVar, zzbe zzbeVar) throws IOException {
        int read;
        long size;
        long position = zzdvnVar.position();
        this.zzco.get().rewind().limit(8);
        do {
            read = zzdvnVar.read(this.zzco.get());
            if (read == 8) {
                this.zzco.get().rewind();
                long zza = zzbc.zza(this.zzco.get());
                byte[] bArr = null;
                if (zza < 8 && zza > 1) {
                    Logger logger = zzcn;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zza);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String zzf = zzbc.zzf(this.zzco.get());
                if (zza == 1) {
                    this.zzco.get().limit(16);
                    zzdvnVar.read(this.zzco.get());
                    this.zzco.get().position(8);
                    size = zzbc.zzc(this.zzco.get()) - 16;
                } else {
                    size = zza == 0 ? zzdvnVar.size() - zzdvnVar.position() : zza - 8;
                }
                if ("uuid".equals(zzf)) {
                    this.zzco.get().limit(this.zzco.get().limit() + 16);
                    zzdvnVar.read(this.zzco.get());
                    bArr = new byte[16];
                    for (int position2 = this.zzco.get().position() - 16; position2 < this.zzco.get().position(); position2++) {
                        bArr[position2 - (this.zzco.get().position() - 16)] = this.zzco.get().get(position2);
                    }
                    size -= 16;
                }
                long j = size;
                zzbb zza2 = zza(zzf, bArr, zzbeVar instanceof zzbb ? ((zzbb) zzbeVar).getType() : "");
                zza2.zza(zzbeVar);
                this.zzco.get().rewind();
                zza2.zza(zzdvnVar, this.zzco.get(), j, this);
                return zza2;
            }
        } while (read >= 0);
        zzdvnVar.zzew(position);
        throw new EOFException();
    }
}
