package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public abstract class zzdvk implements zzbb {
    private static zzdvt zzcp = zzdvt.zzn(zzdvk.class);
    private String type;
    private long zzauv;
    private zzbe zzhwm;
    private ByteBuffer zzhwq;
    private long zzhwr;
    private zzdvn zzhwt;
    private long zzhws = -1;
    private ByteBuffer zzhwu = null;
    private boolean zzhwp = true;
    boolean zzhwo = true;

    private final synchronized void zzbda() {
        if (!this.zzhwp) {
            try {
                zzdvt zzdvtVar = zzcp;
                String valueOf = String.valueOf(this.type);
                zzdvtVar.zzhr(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.zzhwq = this.zzhwt.zzh(this.zzhwr, this.zzhws);
                this.zzhwp = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract void zzg(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdvk(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zza(zzdvn zzdvnVar, ByteBuffer byteBuffer, long j, zzba zzbaVar) throws IOException {
        long position = zzdvnVar.position();
        this.zzhwr = position;
        this.zzauv = position - byteBuffer.remaining();
        this.zzhws = j;
        this.zzhwt = zzdvnVar;
        zzdvnVar.zzew(zzdvnVar.position() + j);
        this.zzhwp = false;
        this.zzhwo = false;
        zzbdb();
    }

    public final synchronized void zzbdb() {
        zzbda();
        zzdvt zzdvtVar = zzcp;
        String valueOf = String.valueOf(this.type);
        zzdvtVar.zzhr(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.zzhwq != null) {
            ByteBuffer byteBuffer = this.zzhwq;
            this.zzhwo = true;
            byteBuffer.rewind();
            zzg(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzhwu = byteBuffer.slice();
            }
            this.zzhwq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zza(zzbe zzbeVar) {
        this.zzhwm = zzbeVar;
    }
}
