package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzie implements zzhe {
    private ByteBuffer zzajf;
    private ByteBuffer zzakm;
    private boolean zzakn;
    private zzif zzakw;
    private ShortBuffer zzakx;
    private long zzaky;
    private long zzakz;
    private float zzaga = 1.0f;
    private float zzagb = 1.0f;
    private int zzafm = -1;
    private int zzaki = -1;

    public zzie() {
        ByteBuffer byteBuffer = zzagy;
        this.zzakm = byteBuffer;
        this.zzakx = byteBuffer.asShortBuffer();
        this.zzajf = zzagy;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final int zzeu() {
        return 2;
    }

    public final float zza(float f) {
        float zza = zzof.zza(f, 0.1f, 8.0f);
        this.zzaga = zza;
        return zza;
    }

    public final float zzb(float f) {
        this.zzagb = zzof.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzfp() {
        return this.zzaky;
    }

    public final long zzfq() {
        return this.zzakz;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final boolean zzb(int i, int i2, int i3) throws zzhh {
        if (i3 != 2) {
            throw new zzhh(i, i2, i3);
        }
        if (this.zzaki == i && this.zzafm == i2) {
            return false;
        }
        this.zzaki = i;
        this.zzafm = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final boolean isActive() {
        return Math.abs(this.zzaga - 1.0f) >= 0.01f || Math.abs(this.zzagb - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final int zzet() {
        return this.zzafm;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzi(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzaky += remaining;
            this.zzakw.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzfr = (this.zzakw.zzfr() * this.zzafm) << 1;
        if (zzfr > 0) {
            if (this.zzakm.capacity() < zzfr) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzfr).order(ByteOrder.nativeOrder());
                this.zzakm = order;
                this.zzakx = order.asShortBuffer();
            } else {
                this.zzakm.clear();
                this.zzakx.clear();
            }
            this.zzakw.zzb(this.zzakx);
            this.zzakz += zzfr;
            this.zzakm.limit(zzfr);
            this.zzajf = this.zzakm;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void zzev() {
        this.zzakw.zzev();
        this.zzakn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final ByteBuffer zzew() {
        ByteBuffer byteBuffer = this.zzajf;
        this.zzajf = zzagy;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final boolean zzeo() {
        if (this.zzakn) {
            zzif zzifVar = this.zzakw;
            return zzifVar == null || zzifVar.zzfr() == 0;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void flush() {
        zzif zzifVar = new zzif(this.zzaki, this.zzafm);
        this.zzakw = zzifVar;
        zzifVar.setSpeed(this.zzaga);
        this.zzakw.zzc(this.zzagb);
        this.zzajf = zzagy;
        this.zzaky = 0L;
        this.zzakz = 0L;
        this.zzakn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzhe
    public final void reset() {
        this.zzakw = null;
        ByteBuffer byteBuffer = zzagy;
        this.zzakm = byteBuffer;
        this.zzakx = byteBuffer.asShortBuffer();
        this.zzajf = zzagy;
        this.zzafm = -1;
        this.zzaki = -1;
        this.zzaky = 0L;
        this.zzakz = 0L;
        this.zzakn = false;
    }
}
