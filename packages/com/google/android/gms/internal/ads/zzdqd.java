package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-base@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdqd implements zzdsw {
    private int tag;
    private final zzdpy zzhgu;
    private int zzhgv;
    private int zzhgw = 0;

    public static zzdqd zza(zzdpy zzdpyVar) {
        if (zzdpyVar.zzhgm != null) {
            return zzdpyVar.zzhgm;
        }
        return new zzdqd(zzdpyVar);
    }

    private zzdqd(zzdpy zzdpyVar) {
        zzdpy zzdpyVar2 = (zzdpy) zzdqx.zza(zzdpyVar, "input");
        this.zzhgu = zzdpyVar2;
        zzdpyVar2.zzhgm = this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzays() throws IOException {
        int i = this.zzhgw;
        if (i != 0) {
            this.tag = i;
            this.zzhgw = 0;
        } else {
            this.tag = this.zzhgu.zzaxu();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzhgv) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final boolean zzayt() throws IOException {
        int i;
        if (this.zzhgu.zzayk() || (i = this.tag) == this.zzhgv) {
            return false;
        }
        return this.zzhgu.zzfq(i);
    }

    private final void zzfv(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final double readDouble() throws IOException {
        zzfv(1);
        return this.zzhgu.readDouble();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final float readFloat() throws IOException {
        zzfv(5);
        return this.zzhgu.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long zzaxv() throws IOException {
        zzfv(0);
        return this.zzhgu.zzaxv();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long zzaxw() throws IOException {
        zzfv(0);
        return this.zzhgu.zzaxw();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzaxx() throws IOException {
        zzfv(0);
        return this.zzhgu.zzaxx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long zzaxy() throws IOException {
        zzfv(1);
        return this.zzhgu.zzaxy();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzaxz() throws IOException {
        zzfv(5);
        return this.zzhgu.zzaxz();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final boolean zzaya() throws IOException {
        zzfv(0);
        return this.zzhgu.zzaya();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final String readString() throws IOException {
        zzfv(2);
        return this.zzhgu.readString();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final String zzayb() throws IOException {
        zzfv(2);
        return this.zzhgu.zzayb();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final <T> T zza(zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        zzfv(2);
        return (T) zzc(zzdsvVar, zzdqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final <T> T zzb(zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        zzfv(3);
        return (T) zzd(zzdsvVar, zzdqjVar);
    }

    private final <T> T zzc(zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        int zzayd = this.zzhgu.zzayd();
        if (this.zzhgu.zzhgj >= this.zzhgu.zzhgk) {
            throw new zzdrg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzfr = this.zzhgu.zzfr(zzayd);
        T newInstance = zzdsvVar.newInstance();
        this.zzhgu.zzhgj++;
        zzdsvVar.zza(newInstance, this, zzdqjVar);
        zzdsvVar.zzak(newInstance);
        this.zzhgu.zzfp(0);
        zzdpy zzdpyVar = this.zzhgu;
        zzdpyVar.zzhgj--;
        this.zzhgu.zzfs(zzfr);
        return newInstance;
    }

    private final <T> T zzd(zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        int i = this.zzhgv;
        this.zzhgv = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzdsvVar.newInstance();
            zzdsvVar.zza(newInstance, this, zzdqjVar);
            zzdsvVar.zzak(newInstance);
            if (this.tag == this.zzhgv) {
                return newInstance;
            }
            throw zzdrg.zzbai();
        } finally {
            this.zzhgv = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final zzdpm zzayc() throws IOException {
        zzfv(2);
        return this.zzhgu.zzayc();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzayd() throws IOException {
        zzfv(0);
        return this.zzhgu.zzayd();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzaye() throws IOException {
        zzfv(0);
        return this.zzhgu.zzaye();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzayf() throws IOException {
        zzfv(5);
        return this.zzhgu.zzayf();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long zzayg() throws IOException {
        zzfv(1);
        return this.zzhgu.zzayg();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int zzayh() throws IOException {
        zzfv(0);
        return this.zzhgu.zzayh();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long zzayi() throws IOException {
        zzfv(0);
        return this.zzhgu.zzayi();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzk(List<Double> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqi) {
            zzdqi zzdqiVar = (zzdqi) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdqiVar.zzd(this.zzhgu.readDouble());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfw(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdqiVar.zzd(this.zzhgu.readDouble());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzhgu.readDouble()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfw(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Double.valueOf(this.zzhgu.readDouble()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzl(List<Float> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqs) {
            zzdqs zzdqsVar = (zzdqs) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfx(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdqsVar.zzh(this.zzhgu.readFloat());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else if (i == 5) {
                do {
                    zzdqsVar.zzh(this.zzhgu.readFloat());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfx(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Float.valueOf(this.zzhgu.readFloat()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzhgu.readFloat()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzm(List<Long> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxv());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxv());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxv()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxv()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzn(List<Long> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxw());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxw());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxw()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxw()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzo(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaxx());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaxx());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaxx()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaxx()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzp(List<Long> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxy());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfw(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdruVar.zzfl(this.zzhgu.zzaxy());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxy()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfw(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Long.valueOf(this.zzhgu.zzaxy()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzq(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfx(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaxz());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else if (i == 5) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaxz());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfx(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaxz()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaxz()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzr(List<Boolean> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdpk) {
            zzdpk zzdpkVar = (zzdpk) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdpkVar.addBoolean(this.zzhgu.zzaya());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdpkVar.addBoolean(this.zzhgu.zzaya());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzhgu.zzaya()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Boolean.valueOf(this.zzhgu.zzaya()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzs(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzaxu;
        int zzaxu2;
        if ((this.tag & 7) != 2) {
            throw zzdrg.zzbah();
        }
        if ((list instanceof zzdrn) && !z) {
            zzdrn zzdrnVar = (zzdrn) list;
            do {
                zzdrnVar.zzdb(zzayc());
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu2 = this.zzhgu.zzaxu();
            } while (zzaxu2 == this.tag);
            this.zzhgw = zzaxu2;
            return;
        }
        do {
            list.add(z ? zzayb() : readString());
            if (this.zzhgu.zzayk()) {
                return;
            }
            zzaxu = this.zzhgu.zzaxu();
        } while (zzaxu == this.tag);
        this.zzhgw = zzaxu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdsw
    public final <T> void zza(List<T> list, zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        int zzaxu;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzdrg.zzbah();
        }
        do {
            list.add(zzc(zzdsvVar, zzdqjVar));
            if (this.zzhgu.zzayk() || this.zzhgw != 0) {
                return;
            }
            zzaxu = this.zzhgu.zzaxu();
        } while (zzaxu == i);
        this.zzhgw = zzaxu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdsw
    public final <T> void zzb(List<T> list, zzdsv<T> zzdsvVar, zzdqj zzdqjVar) throws IOException {
        int zzaxu;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzdrg.zzbah();
        }
        do {
            list.add(zzd(zzdsvVar, zzdqjVar));
            if (this.zzhgu.zzayk() || this.zzhgw != 0) {
                return;
            }
            zzaxu = this.zzhgu.zzaxu();
        } while (zzaxu == i);
        this.zzhgw = zzaxu;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzt(List<zzdpm> list) throws IOException {
        int zzaxu;
        if ((this.tag & 7) != 2) {
            throw zzdrg.zzbah();
        }
        do {
            list.add(zzayc());
            if (this.zzhgu.zzayk()) {
                return;
            }
            zzaxu = this.zzhgu.zzaxu();
        } while (zzaxu == this.tag);
        this.zzhgw = zzaxu;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzu(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayd());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayd());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayd()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayd()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzv(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaye());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzaye());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaye()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Integer.valueOf(this.zzhgu.zzaye()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzw(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfx(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayf());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else if (i == 5) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayf());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfx(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayf()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayf()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzx(List<Long> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzdruVar.zzfl(this.zzhgu.zzayg());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayd = this.zzhgu.zzayd();
                zzfw(zzayd);
                int zzayl = this.zzhgu.zzayl() + zzayd;
                do {
                    zzdruVar.zzfl(this.zzhgu.zzayg());
                } while (this.zzhgu.zzayl() < zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzhgu.zzayg()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayd2 = this.zzhgu.zzayd();
            zzfw(zzayd2);
            int zzayl2 = this.zzhgu.zzayl() + zzayd2;
            do {
                list.add(Long.valueOf(this.zzhgu.zzayg()));
            } while (this.zzhgu.zzayl() < zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzy(List<Integer> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdqy) {
            zzdqy zzdqyVar = (zzdqy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayh());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdqyVar.zzgp(this.zzhgu.zzayh());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayh()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Integer.valueOf(this.zzhgu.zzayh()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final void zzz(List<Long> list) throws IOException {
        int zzaxu;
        int zzaxu2;
        if (list instanceof zzdru) {
            zzdru zzdruVar = (zzdru) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdruVar.zzfl(this.zzhgu.zzayi());
                    if (this.zzhgu.zzayk()) {
                        return;
                    }
                    zzaxu2 = this.zzhgu.zzaxu();
                } while (zzaxu2 == this.tag);
                this.zzhgw = zzaxu2;
                return;
            } else if (i == 2) {
                int zzayl = this.zzhgu.zzayl() + this.zzhgu.zzayd();
                do {
                    zzdruVar.zzfl(this.zzhgu.zzayi());
                } while (this.zzhgu.zzayl() < zzayl);
                zzfy(zzayl);
                return;
            } else {
                throw zzdrg.zzbah();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzhgu.zzayi()));
                if (this.zzhgu.zzayk()) {
                    return;
                }
                zzaxu = this.zzhgu.zzaxu();
            } while (zzaxu == this.tag);
            this.zzhgw = zzaxu;
        } else if (i2 == 2) {
            int zzayl2 = this.zzhgu.zzayl() + this.zzhgu.zzayd();
            do {
                list.add(Long.valueOf(this.zzhgu.zzayi()));
            } while (this.zzhgu.zzayl() < zzayl2);
            zzfy(zzayl2);
        } else {
            throw zzdrg.zzbah();
        }
    }

    private static void zzfw(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzdrg.zzbai();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdsw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.zzdrx<K, V> r9, com.google.android.gms.internal.ads.zzdqj r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzfv(r0)
            com.google.android.gms.internal.ads.zzdpy r1 = r7.zzhgu
            int r1 = r1.zzayd()
            com.google.android.gms.internal.ads.zzdpy r2 = r7.zzhgu
            int r1 = r2.zzfr(r1)
            K r2 = r9.zzhmu
            V r3 = r9.zzcfq
        L14:
            int r4 = r7.zzays()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.ads.zzdpy r5 = r7.zzhgu     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzayk()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzayt()     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.ads.zzdrg r4 = new com.google.android.gms.internal.ads.zzdrg     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.ads.zzdue r4 = r9.zzhmv     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzcfq     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.ads.zzdue r4 = r9.zzhmt     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.ads.zzdrf -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzayt()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.ads.zzdrg r8 = new com.google.android.gms.internal.ads.zzdrg     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.ads.zzdpy r8 = r7.zzhgu
            r8.zzfs(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdpy r9 = r7.zzhgu
            r9.zzfs(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqd.zza(java.util.Map, com.google.android.gms.internal.ads.zzdrx, com.google.android.gms.internal.ads.zzdqj):void");
    }

    private final Object zza(zzdue zzdueVar, Class<?> cls, zzdqj zzdqjVar) throws IOException {
        switch (zzdqc.zzhgt[zzdueVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzaya());
            case 2:
                return zzayc();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzaye());
            case 5:
                return Integer.valueOf(zzaxz());
            case 6:
                return Long.valueOf(zzaxy());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzaxx());
            case 9:
                return Long.valueOf(zzaxw());
            case 10:
                zzfv(2);
                return zzc(zzdsr.zzbbf().zzh(cls), zzdqjVar);
            case 11:
                return Integer.valueOf(zzayf());
            case 12:
                return Long.valueOf(zzayg());
            case 13:
                return Integer.valueOf(zzayh());
            case 14:
                return Long.valueOf(zzayi());
            case 15:
                return zzayb();
            case 16:
                return Integer.valueOf(zzayd());
            case 17:
                return Long.valueOf(zzaxv());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzfx(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzdrg.zzbai();
        }
    }

    private final void zzfy(int i) throws IOException {
        if (this.zzhgu.zzayl() != i) {
            throw zzdrg.zzbac();
        }
    }
}
