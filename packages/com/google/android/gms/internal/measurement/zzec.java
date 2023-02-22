package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzec implements zzgy {
    private int tag;
    private final zzeb zzadu;
    private int zzadv;
    private int zzadw = 0;

    public static zzec zza(zzeb zzebVar) {
        if (zzebVar.zzads != null) {
            return zzebVar.zzads;
        }
        return new zzec(zzebVar);
    }

    private zzec(zzeb zzebVar) {
        zzeb zzebVar2 = (zzeb) zzez.zza(zzebVar, "input");
        this.zzadu = zzebVar2;
        zzebVar2.zzads = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsy() throws IOException {
        int i = this.zzadw;
        if (i != 0) {
            this.tag = i;
            this.zzadw = 0;
        } else {
            this.tag = this.zzadu.zzsg();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.zzadv) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzsz() throws IOException {
        int i;
        if (this.zzadu.zzsw() || (i = this.tag) == this.zzadv) {
            return false;
        }
        return this.zzadu.zzau(i);
    }

    private final void zzba(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final double readDouble() throws IOException {
        zzba(1);
        return this.zzadu.readDouble();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final float readFloat() throws IOException {
        zzba(5);
        return this.zzadu.readFloat();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzsh() throws IOException {
        zzba(0);
        return this.zzadu.zzsh();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzsi() throws IOException {
        zzba(0);
        return this.zzadu.zzsi();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsj() throws IOException {
        zzba(0);
        return this.zzadu.zzsj();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzsk() throws IOException {
        zzba(1);
        return this.zzadu.zzsk();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsl() throws IOException {
        zzba(5);
        return this.zzadu.zzsl();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final boolean zzsm() throws IOException {
        zzba(0);
        return this.zzadu.zzsm();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String readString() throws IOException {
        zzba(2);
        return this.zzadu.readString();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String zzsn() throws IOException {
        zzba(2);
        return this.zzadu.zzsn();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final <T> T zza(zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        zzba(2);
        return (T) zzc(zzgxVar, zzelVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final <T> T zzb(zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        zzba(3);
        return (T) zzd(zzgxVar, zzelVar);
    }

    private final <T> T zzc(zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        int zzsp = this.zzadu.zzsp();
        if (this.zzadu.zzadp >= this.zzadu.zzadq) {
            throw zzfi.zzuz();
        }
        int zzaw = this.zzadu.zzaw(zzsp);
        T newInstance = zzgxVar.newInstance();
        this.zzadu.zzadp++;
        zzgxVar.zza(newInstance, this, zzelVar);
        zzgxVar.zzj(newInstance);
        this.zzadu.zzat(0);
        zzeb zzebVar = this.zzadu;
        zzebVar.zzadp--;
        this.zzadu.zzax(zzaw);
        return newInstance;
    }

    private final <T> T zzd(zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        int i = this.zzadv;
        this.zzadv = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzgxVar.newInstance();
            zzgxVar.zza(newInstance, this, zzelVar);
            zzgxVar.zzj(newInstance);
            if (this.tag == this.zzadv) {
                return newInstance;
            }
            throw zzfi.zzva();
        } finally {
            this.zzadv = i;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final zzdp zzso() throws IOException {
        zzba(2);
        return this.zzadu.zzso();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsp() throws IOException {
        zzba(0);
        return this.zzadu.zzsp();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsq() throws IOException {
        zzba(0);
        return this.zzadu.zzsq();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzsr() throws IOException {
        zzba(5);
        return this.zzadu.zzsr();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzss() throws IOException {
        zzba(1);
        return this.zzadu.zzss();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final int zzst() throws IOException {
        zzba(0);
        return this.zzadu.zzst();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final long zzsu() throws IOException {
        zzba(0);
        return this.zzadu.zzsu();
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zze(List<Double> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzeh) {
            zzeh zzehVar = (zzeh) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzehVar.zzf(this.zzadu.readDouble());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbb(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzehVar.zzf(this.zzadu.readDouble());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zzadu.readDouble()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbb(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Double.valueOf(this.zzadu.readDouble()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzf(List<Float> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzeu) {
            zzeu zzeuVar = (zzeu) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbc(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzeuVar.zzc(this.zzadu.readFloat());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzeuVar.zzc(this.zzadu.readFloat());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbc(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Float.valueOf(this.zzadu.readFloat()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zzadu.readFloat()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzg(List<Long> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfwVar.zzby(this.zzadu.zzsh());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfwVar.zzby(this.zzadu.zzsh());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsh()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsh()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzh(List<Long> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfwVar.zzby(this.zzadu.zzsi());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfwVar.zzby(this.zzadu.zzsi());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsi()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsi()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzi(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzsj());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfaVar.zzbu(this.zzadu.zzsj());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsj()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsj()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzj(List<Long> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfwVar.zzby(this.zzadu.zzsk());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbb(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzfwVar.zzby(this.zzadu.zzsk());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsk()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbb(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Long.valueOf(this.zzadu.zzsk()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzk(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbc(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzfaVar.zzbu(this.zzadu.zzsl());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzsl());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbc(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Integer.valueOf(this.zzadu.zzsl()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsl()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzl(List<Boolean> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzdn) {
            zzdn zzdnVar = (zzdn) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzdnVar.addBoolean(this.zzadu.zzsm());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzdnVar.addBoolean(this.zzadu.zzsm());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zzadu.zzsm()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Boolean.valueOf(this.zzadu.zzsm()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzm(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzsg;
        int zzsg2;
        if ((this.tag & 7) != 2) {
            throw zzfi.zzuy();
        }
        if ((list instanceof zzfp) && !z) {
            zzfp zzfpVar = (zzfp) list;
            do {
                zzfpVar.zzc(zzso());
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg2 = this.zzadu.zzsg();
            } while (zzsg2 == this.tag);
            this.zzadw = zzsg2;
            return;
        }
        do {
            list.add(z ? zzsn() : readString());
            if (this.zzadu.zzsw()) {
                return;
            }
            zzsg = this.zzadu.zzsg();
        } while (zzsg == this.tag);
        this.zzadw = zzsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgy
    public final <T> void zza(List<T> list, zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        int zzsg;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzfi.zzuy();
        }
        do {
            list.add(zzc(zzgxVar, zzelVar));
            if (this.zzadu.zzsw() || this.zzadw != 0) {
                return;
            }
            zzsg = this.zzadu.zzsg();
        } while (zzsg == i);
        this.zzadw = zzsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgy
    public final <T> void zzb(List<T> list, zzgx<T> zzgxVar, zzel zzelVar) throws IOException {
        int zzsg;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzfi.zzuy();
        }
        do {
            list.add(zzd(zzgxVar, zzelVar));
            if (this.zzadu.zzsw() || this.zzadw != 0) {
                return;
            }
            zzsg = this.zzadu.zzsg();
        } while (zzsg == i);
        this.zzadw = zzsg;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzn(List<zzdp> list) throws IOException {
        int zzsg;
        if ((this.tag & 7) != 2) {
            throw zzfi.zzuy();
        }
        do {
            list.add(zzso());
            if (this.zzadu.zzsw()) {
                return;
            }
            zzsg = this.zzadu.zzsg();
        } while (zzsg == this.tag);
        this.zzadw = zzsg;
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzo(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzsp());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfaVar.zzbu(this.zzadu.zzsp());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsp()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsp()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzp(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzsq());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfaVar.zzbu(this.zzadu.zzsq());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsq()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzsq()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzq(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbc(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzfaVar.zzbu(this.zzadu.zzsr());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else if (i == 5) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzsr());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbc(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Integer.valueOf(this.zzadu.zzsr()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzsr()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzr(List<Long> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            int i = this.tag & 7;
            if (i == 1) {
                do {
                    zzfwVar.zzby(this.zzadu.zzss());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsp = this.zzadu.zzsp();
                zzbb(zzsp);
                int zzsx = this.zzadu.zzsx() + zzsp;
                do {
                    zzfwVar.zzby(this.zzadu.zzss());
                } while (this.zzadu.zzsx() < zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zzadu.zzss()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsp2 = this.zzadu.zzsp();
            zzbb(zzsp2);
            int zzsx2 = this.zzadu.zzsx() + zzsp2;
            do {
                list.add(Long.valueOf(this.zzadu.zzss()));
            } while (this.zzadu.zzsx() < zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzs(List<Integer> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfa) {
            zzfa zzfaVar = (zzfa) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfaVar.zzbu(this.zzadu.zzst());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfaVar.zzbu(this.zzadu.zzst());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zzadu.zzst()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Integer.valueOf(this.zzadu.zzst()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final void zzt(List<Long> list) throws IOException {
        int zzsg;
        int zzsg2;
        if (list instanceof zzfw) {
            zzfw zzfwVar = (zzfw) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzfwVar.zzby(this.zzadu.zzsu());
                    if (this.zzadu.zzsw()) {
                        return;
                    }
                    zzsg2 = this.zzadu.zzsg();
                } while (zzsg2 == this.tag);
                this.zzadw = zzsg2;
                return;
            } else if (i == 2) {
                int zzsx = this.zzadu.zzsx() + this.zzadu.zzsp();
                do {
                    zzfwVar.zzby(this.zzadu.zzsu());
                } while (this.zzadu.zzsx() < zzsx);
                zzbd(zzsx);
                return;
            } else {
                throw zzfi.zzuy();
            }
        }
        int i2 = this.tag & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zzadu.zzsu()));
                if (this.zzadu.zzsw()) {
                    return;
                }
                zzsg = this.zzadu.zzsg();
            } while (zzsg == this.tag);
            this.zzadw = zzsg;
        } else if (i2 == 2) {
            int zzsx2 = this.zzadu.zzsx() + this.zzadu.zzsp();
            do {
                list.add(Long.valueOf(this.zzadu.zzsu()));
            } while (this.zzadu.zzsx() < zzsx2);
            zzbd(zzsx2);
        } else {
            throw zzfi.zzuy();
        }
    }

    private static void zzbb(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzfi.zzva();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzgy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzfz<K, V> r9, com.google.android.gms.internal.measurement.zzel r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzba(r0)
            com.google.android.gms.internal.measurement.zzeb r1 = r7.zzadu
            int r1 = r1.zzsp()
            com.google.android.gms.internal.measurement.zzeb r2 = r7.zzadu
            int r1 = r2.zzaw(r1)
            K r2 = r9.zzakc
            V r3 = r9.zzaba
        L14:
            int r4 = r7.zzsy()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.measurement.zzeb r5 = r7.zzadu     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzsw()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzsz()     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzfi r4 = new com.google.android.gms.internal.measurement.zzfi     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.measurement.zzig r4 = r9.zzakd     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzaba     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.measurement.zzig r4 = r9.zzakb     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzsz()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.zzfi r8 = new com.google.android.gms.internal.measurement.zzfi     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.measurement.zzeb r8 = r7.zzadu
            r8.zzax(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzeb r9 = r7.zzadu
            r9.zzax(r1)
            goto L6c
        L6b:
            throw r8
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzec.zza(java.util.Map, com.google.android.gms.internal.measurement.zzfz, com.google.android.gms.internal.measurement.zzel):void");
    }

    private final Object zza(zzig zzigVar, Class<?> cls, zzel zzelVar) throws IOException {
        switch (zzef.zzaee[zzigVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzsm());
            case 2:
                return zzso();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzsq());
            case 5:
                return Integer.valueOf(zzsl());
            case 6:
                return Long.valueOf(zzsk());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzsj());
            case 9:
                return Long.valueOf(zzsi());
            case 10:
                zzba(2);
                return zzc(zzgt.zzvy().zzf(cls), zzelVar);
            case 11:
                return Integer.valueOf(zzsr());
            case 12:
                return Long.valueOf(zzss());
            case 13:
                return Integer.valueOf(zzst());
            case 14:
                return Long.valueOf(zzsu());
            case 15:
                return zzsn();
            case 16:
                return Integer.valueOf(zzsp());
            case 17:
                return Long.valueOf(zzsh());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzbc(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzfi.zzva();
        }
    }

    private final void zzbd(int i) throws IOException {
        if (this.zzadu.zzsx() != i) {
            throw zzfi.zzut();
        }
    }
}
