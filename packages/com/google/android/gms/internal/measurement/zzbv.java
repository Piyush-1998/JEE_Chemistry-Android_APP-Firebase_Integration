package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbk;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzbv extends zziq<zzbv> {
    private static volatile zzbv[] zzze;
    public Integer zzzf = null;
    public zzbk.zzd[] zzzg = new zzbk.zzd[0];
    public zzbk.zza[] zzzh = new zzbk.zza[0];
    private Boolean zzzi = null;
    private Boolean zzzj = null;

    public static zzbv[] zzqx() {
        if (zzze == null) {
            synchronized (zziu.zzaov) {
                if (zzze == null) {
                    zzze = new zzbv[0];
                }
            }
        }
        return zzze;
    }

    public zzbv() {
        this.zzaoo = null;
        this.zzaow = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            Integer num = this.zzzf;
            if (num == null) {
                if (zzbvVar.zzzf != null) {
                    return false;
                }
            } else if (!num.equals(zzbvVar.zzzf)) {
                return false;
            }
            if (zziu.equals(this.zzzg, zzbvVar.zzzg) && zziu.equals(this.zzzh, zzbvVar.zzzh)) {
                Boolean bool = this.zzzi;
                if (bool == null) {
                    if (zzbvVar.zzzi != null) {
                        return false;
                    }
                } else if (!bool.equals(zzbvVar.zzzi)) {
                    return false;
                }
                Boolean bool2 = this.zzzj;
                if (bool2 == null) {
                    if (zzbvVar.zzzj != null) {
                        return false;
                    }
                } else if (!bool2.equals(zzbvVar.zzzj)) {
                    return false;
                }
                if (this.zzaoo == null || this.zzaoo.isEmpty()) {
                    return zzbvVar.zzaoo == null || zzbvVar.zzaoo.isEmpty();
                }
                return this.zzaoo.equals(zzbvVar.zzaoo);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzzf;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zziu.hashCode(this.zzzg)) * 31) + zziu.hashCode(this.zzzh)) * 31;
        Boolean bool = this.zzzi;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzzj;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.zzaoo != null && !this.zzaoo.isEmpty()) {
            i = this.zzaoo.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zziq, com.google.android.gms.internal.measurement.zziw
    public final void zza(zzio zzioVar) throws IOException {
        Integer num = this.zzzf;
        if (num != null) {
            zzioVar.zzc(1, num.intValue());
        }
        zzbk.zzd[] zzdVarArr = this.zzzg;
        int i = 0;
        if (zzdVarArr != null && zzdVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbk.zzd[] zzdVarArr2 = this.zzzg;
                if (i2 >= zzdVarArr2.length) {
                    break;
                }
                zzbk.zzd zzdVar = zzdVarArr2[i2];
                if (zzdVar != null) {
                    zzioVar.zze(2, zzdVar);
                }
                i2++;
            }
        }
        zzbk.zza[] zzaVarArr = this.zzzh;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            while (true) {
                zzbk.zza[] zzaVarArr2 = this.zzzh;
                if (i >= zzaVarArr2.length) {
                    break;
                }
                zzbk.zza zzaVar = zzaVarArr2[i];
                if (zzaVar != null) {
                    zzioVar.zze(3, zzaVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzzi;
        if (bool != null) {
            zzioVar.zzb(4, bool.booleanValue());
        }
        Boolean bool2 = this.zzzj;
        if (bool2 != null) {
            zzioVar.zzb(5, bool2.booleanValue());
        }
        super.zza(zzioVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zziq, com.google.android.gms.internal.measurement.zziw
    public final int zzqy() {
        int zzqy = super.zzqy();
        Integer num = this.zzzf;
        if (num != null) {
            zzqy += zzio.zzg(1, num.intValue());
        }
        zzbk.zzd[] zzdVarArr = this.zzzg;
        int i = 0;
        if (zzdVarArr != null && zzdVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzbk.zzd[] zzdVarArr2 = this.zzzg;
                if (i2 >= zzdVarArr2.length) {
                    break;
                }
                zzbk.zzd zzdVar = zzdVarArr2[i2];
                if (zzdVar != null) {
                    zzqy += zzee.zzc(2, zzdVar);
                }
                i2++;
            }
        }
        zzbk.zza[] zzaVarArr = this.zzzh;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            while (true) {
                zzbk.zza[] zzaVarArr2 = this.zzzh;
                if (i >= zzaVarArr2.length) {
                    break;
                }
                zzbk.zza zzaVar = zzaVarArr2[i];
                if (zzaVar != null) {
                    zzqy += zzee.zzc(3, zzaVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzzi;
        if (bool != null) {
            bool.booleanValue();
            zzqy += zzio.zzbi(4) + 1;
        }
        Boolean bool2 = this.zzzj;
        if (bool2 != null) {
            bool2.booleanValue();
            return zzqy + zzio.zzbi(5) + 1;
        }
        return zzqy;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final /* synthetic */ zziw zza(zzil zzilVar) throws IOException {
        while (true) {
            int zzsg = zzilVar.zzsg();
            if (zzsg == 0) {
                return this;
            }
            if (zzsg == 8) {
                this.zzzf = Integer.valueOf(zzilVar.zzta());
            } else if (zzsg == 18) {
                int zzb = zzix.zzb(zzilVar, 18);
                zzbk.zzd[] zzdVarArr = this.zzzg;
                int length = zzdVarArr == null ? 0 : zzdVarArr.length;
                int i = zzb + length;
                zzbk.zzd[] zzdVarArr2 = new zzbk.zzd[i];
                if (length != 0) {
                    System.arraycopy(this.zzzg, 0, zzdVarArr2, 0, length);
                }
                while (length < i - 1) {
                    zzdVarArr2[length] = (zzbk.zzd) zzilVar.zza(zzbk.zzd.zzkj());
                    zzilVar.zzsg();
                    length++;
                }
                zzdVarArr2[length] = (zzbk.zzd) zzilVar.zza(zzbk.zzd.zzkj());
                this.zzzg = zzdVarArr2;
            } else if (zzsg == 26) {
                int zzb2 = zzix.zzb(zzilVar, 26);
                zzbk.zza[] zzaVarArr = this.zzzh;
                int length2 = zzaVarArr == null ? 0 : zzaVarArr.length;
                int i2 = zzb2 + length2;
                zzbk.zza[] zzaVarArr2 = new zzbk.zza[i2];
                if (length2 != 0) {
                    System.arraycopy(this.zzzh, 0, zzaVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    zzaVarArr2[length2] = (zzbk.zza) zzilVar.zza(zzbk.zza.zzkj());
                    zzilVar.zzsg();
                    length2++;
                }
                zzaVarArr2[length2] = (zzbk.zza) zzilVar.zza(zzbk.zza.zzkj());
                this.zzzh = zzaVarArr2;
            } else if (zzsg == 32) {
                this.zzzi = Boolean.valueOf(zzilVar.zzsm());
            } else if (zzsg != 40) {
                if (!super.zza(zzilVar, zzsg)) {
                    return this;
                }
            } else {
                this.zzzj = Boolean.valueOf(zzilVar.zzsm());
            }
        }
    }
}
