package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzczh;
import com.google.android.gms.internal.ads.zzdqw;

/* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
/* loaded from: classes.dex */
public final class zzczl extends zzdqw<zzczl, zza> implements zzdsi {
    private static volatile zzdsp<zzczl> zzdv;
    private static final zzczl zzgoa;
    private int zzdj;
    private int zzgnx;
    private zzczh zzgnz;
    private String zzdk = "";
    private String zzgny = "";

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public enum zzb implements zzdra {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final zzdqz<zzb> zzeg = new zzczn();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzdra
        public final int zzab() {
            return this.value;
        }

        public static zzb zzdm(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BLOCKED_IMPRESSION;
            }
            return EVENT_TYPE_UNKNOWN;
        }

        public static zzdrc zzac() {
            return zzczp.zzep;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zzb(int i) {
            this.value = i;
        }
    }

    private zzczl() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@18.2.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzdqw.zza<zzczl, zza> implements zzdsi {
        private zza() {
            super(zzczl.zzgoa);
        }

        public final zza zzb(zzb zzbVar) {
            zzazn();
            ((zzczl) this.zzhkp).zza(zzbVar);
            return this;
        }

        public final zza zzgo(String str) {
            zzazn();
            ((zzczl) this.zzhkp).zzm(str);
            return this;
        }

        public final zza zzb(zzczh.zzb zzbVar) {
            zzazn();
            ((zzczl) this.zzhkp).zza(zzbVar);
            return this;
        }

        /* synthetic */ zza(zzczm zzczmVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        if (zzbVar == null) {
            throw null;
        }
        this.zzdj |= 1;
        this.zzgnx = zzbVar.zzab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(String str) {
        if (str == null) {
            throw null;
        }
        this.zzdj |= 2;
        this.zzdk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzczh.zzb zzbVar) {
        this.zzgnz = (zzczh) ((zzdqw) zzbVar.zzazr());
        this.zzdj |= 8;
    }

    public static zza zzanz() {
        return zzgoa.zzazt();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqw
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzczm.zzdi[i - 1]) {
            case 1:
                return new zzczl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzgoa, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdj", "zzgnx", zzb.zzac(), "zzdk", "zzgny", "zzgnz"});
            case 4:
                return zzgoa;
            case 5:
                zzdsp<zzczl> zzdspVar = zzdv;
                if (zzdspVar == null) {
                    synchronized (zzczl.class) {
                        zzdspVar = zzdv;
                        if (zzdspVar == null) {
                            zzdspVar = new zzdqw.zzc<>(zzgoa);
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
        zzczl zzczlVar = new zzczl();
        zzgoa = zzczlVar;
        zzdqw.zza(zzczl.class, zzczlVar);
    }
}
