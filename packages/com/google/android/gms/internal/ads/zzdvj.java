package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdvj extends zzdvl implements zzbb {
    private String type;
    private long zzauv;
    private zzbe zzhwm;
    private boolean zzhwn;

    public zzdvj(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zza(zzbe zzbeVar) {
        this.zzhwm = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zza(zzdvn zzdvnVar, ByteBuffer byteBuffer, long j, zzba zzbaVar) throws IOException {
        this.zzauv = zzdvnVar.position() - byteBuffer.remaining();
        this.zzhwn = byteBuffer.remaining() == 16;
        zza(zzdvnVar, j, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvl
    public final void zza(zzdvn zzdvnVar, long j, zzba zzbaVar) throws IOException {
        this.zzhwt = zzdvnVar;
        this.zzhwy = zzdvnVar.position();
        this.zzbch = this.zzhwy - ((this.zzhwn || 8 + j >= 4294967296L) ? 16 : 8);
        zzdvnVar.zzew(zzdvnVar.position() + j);
        this.zzaqu = zzdvnVar.position();
        this.zzhww = zzbaVar;
    }
}
