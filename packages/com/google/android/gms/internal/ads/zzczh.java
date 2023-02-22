package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczh extends zzdqw<zzczh, zzb> implements zzdsi {
    private static volatile zzdsp<zzczh> zzdv;
    private static final zzdre<Integer, zza> zzgnp = new zzczg();
    private static final zzczh zzgnt;
    private int zzdj;
    private zzdrb zzgno = zzazv();
    private String zzgnq = "";
    private String zzgnr = "";
    private String zzgns = "";

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzdra {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        
        private static final zzdqz<zza> zzeg = new zzczk();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzdra
        public final int zzab() {
            return this.value;
        }

        public static zza zzdl(int i) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BLOCKED_REASON_BACKGROUND;
            }
            return BLOCKED_REASON_UNKNOWN;
        }

        public static zzdrc zzac() {
            return zzczj.zzep;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzczh() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzdqw.zza<zzczh, zzb> implements zzdsi {
        private zzb() {
            super(zzczh.zzgnt);
        }

        public final zzb zzb(zza zzaVar) {
            zzazn();
            ((zzczh) this.zzhkp).zza(zzaVar);
            return this;
        }

        public final zzb zzgn(String str) {
            zzazn();
            ((zzczh) this.zzhkp).zzgm(str);
            return this;
        }

        /* synthetic */ zzb(zzczg zzczgVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        if (zzaVar == null) {
            throw null;
        }
        if (!this.zzgno.zzaxi()) {
            this.zzgno = zzdqw.zza(this.zzgno);
        }
        this.zzgno.zzgp(zzaVar.zzab());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgm(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdj |= 1;
        this.zzgnq = str;
    }

    public static zzb zzanx() {
        return zzgnt.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzczi.zzdi[i - 1]) {
            case 1:
                return new zzczh();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzgnt, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdj", "zzgno", zza.zzac(), "zzgnq", "zzgnr", "zzgns"});
            case 4:
                return zzgnt;
            case 5:
                zzdsp<zzczh> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzczh.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgnt);
                            zzdv = zzdspVar;
                        }
                    }
                }
                return zzdspVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzczh zzczhVar = new zzczh();
        zzgnt = zzczhVar;
        zzdqw.zza(zzczh.class, zzczhVar);
    }
}
