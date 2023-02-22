package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbs;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhp extends zzjh {
    public zzhp(zzjg zzjgVar) {
        super(zzjgVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    protected final boolean zzbk() {
        return false;
    }

    public final byte[] zzb(zzai zzaiVar, String str) {
        zzjp zzjpVar;
        zzf zzfVar;
        zzbs.zzg.zza zzaVar;
        zzbs.zzf.zza zzaVar2;
        Bundle bundle;
        byte[] bArr;
        long j;
        zzae zzw;
        zzo();
        this.zzj.zzl();
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(str);
        if (!zzad().zze(str, zzak.zzio)) {
            zzab().zzgr().zza("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(zzaiVar.name) && !"_iapx".equals(zzaiVar.name)) {
            zzab().zzgr().zza("Generating a payload for this event is not available. package_name, event_name", str, zzaiVar.name);
            return null;
        } else {
            zzbs.zzf.zza zznj = zzbs.zzf.zznj();
            zzgy().beginTransaction();
            try {
                zzf zzab = zzgy().zzab(str);
                if (zzab == null) {
                    zzab().zzgr().zza("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!zzab.isMeasurementEnabled()) {
                    zzab().zzgr().zza("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    zzbs.zzg.zza zzcc = zzbs.zzg.zzpr().zzp(1).zzcc("android");
                    if (!TextUtils.isEmpty(zzab.zzag())) {
                        zzcc.zzch(zzab.zzag());
                    }
                    if (!TextUtils.isEmpty(zzab.zzan())) {
                        zzcc.zzcg(zzab.zzan());
                    }
                    if (!TextUtils.isEmpty(zzab.zzal())) {
                        zzcc.zzci(zzab.zzal());
                    }
                    if (zzab.zzam() != -2147483648L) {
                        zzcc.zzv((int) zzab.zzam());
                    }
                    zzcc.zzas(zzab.zzao()).zzax(zzab.zzaq());
                    if (!TextUtils.isEmpty(zzab.getGmpAppId())) {
                        zzcc.zzcm(zzab.getGmpAppId());
                    } else if (!TextUtils.isEmpty(zzab.zzah())) {
                        zzcc.zzcq(zzab.zzah());
                    }
                    zzcc.zzau(zzab.zzap());
                    if (this.zzj.isEnabled() && zzs.zzbv() && zzad().zzl(zzcc.zzag())) {
                        zzcc.zzag();
                        if (!TextUtils.isEmpty(null)) {
                            zzcc.zzcp(null);
                        }
                    }
                    Pair<String, Boolean> zzap = zzac().zzap(zzab.zzag());
                    if (zzab.zzbe() && zzap != null && !TextUtils.isEmpty((CharSequence) zzap.first)) {
                        zzcc.zzcj(zzo((String) zzap.first, Long.toString(zzaiVar.zzfu)));
                        if (zzap.second != null) {
                            zzcc.zzm(((Boolean) zzap.second).booleanValue());
                        }
                    }
                    zzw().zzbi();
                    zzbs.zzg.zza zzce = zzcc.zzce(Build.MODEL);
                    zzw().zzbi();
                    zzce.zzcd(Build.VERSION.RELEASE).zzt((int) zzw().zzcq()).zzcf(zzw().zzcr());
                    zzcc.zzck(zzo(zzab.getAppInstanceId(), Long.toString(zzaiVar.zzfu)));
                    if (!TextUtils.isEmpty(zzab.getFirebaseInstanceId())) {
                        zzcc.zzcn(zzab.getFirebaseInstanceId());
                    }
                    String zzag = zzab.zzag();
                    List<zzjp> zzaa = zzgy().zzaa(zzag);
                    Iterator<zzjp> it = zzaa.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzjpVar = null;
                            break;
                        }
                        zzjpVar = it.next();
                        if ("_lte".equals(zzjpVar.name)) {
                            break;
                        }
                    }
                    if (zzjpVar == null || zzjpVar.value == null) {
                        zzjp zzjpVar2 = new zzjp(zzag, "auto", "_lte", zzx().currentTimeMillis(), 0L);
                        zzaa.add(zzjpVar2);
                        zzgy().zza(zzjpVar2);
                    }
                    if (zzad().zze(zzag, zzak.zzij)) {
                        zzjo zzgw = zzgw();
                        zzgw.zzab().zzgs().zzao("Checking account type status for ad personalization signals");
                        if (zzgw.zzw().zzcu()) {
                            String zzag2 = zzab.zzag();
                            if (zzab.zzbe() && zzgw.zzgz().zzba(zzag2)) {
                                zzgw.zzab().zzgr().zzao("Turning off ad personalization due to account type");
                                Iterator<zzjp> it2 = zzaa.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().name)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzaa.add(new zzjp(zzag2, "auto", "_npa", zzgw.zzx().currentTimeMillis(), 1L));
                            }
                        }
                    }
                    zzbs.zzk[] zzkVarArr = new zzbs.zzk[zzaa.size()];
                    for (int i = 0; i < zzaa.size(); i++) {
                        zzbs.zzk.zza zzbk = zzbs.zzk.zzqu().zzdb(zzaa.get(i).name).zzbk(zzaa.get(i).zztr);
                        zzgw().zza(zzbk, zzaa.get(i).value);
                        zzkVarArr[i] = (zzbs.zzk) ((com.google.android.gms.internal.measurement.zzey) zzbk.zzug());
                    }
                    zzcc.zzb(Arrays.asList(zzkVarArr));
                    Bundle zzcv = zzaiVar.zzfq.zzcv();
                    zzcv.putLong("_c", 1L);
                    zzab().zzgr().zzao("Marking in-app purchase as real-time");
                    zzcv.putLong("_r", 1L);
                    zzcv.putString("_o", zzaiVar.origin);
                    if (zzz().zzbr(zzcc.zzag())) {
                        zzz().zza(zzcv, "_dbg", (Object) 1L);
                        zzz().zza(zzcv, "_r", (Object) 1L);
                    }
                    zzae zzc = zzgy().zzc(str, zzaiVar.name);
                    if (zzc == null) {
                        zzfVar = zzab;
                        zzaVar = zzcc;
                        zzaVar2 = zznj;
                        bundle = zzcv;
                        bArr = null;
                        zzw = new zzae(str, zzaiVar.name, 0L, 0L, zzaiVar.zzfu, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        zzfVar = zzab;
                        zzaVar = zzcc;
                        zzaVar2 = zznj;
                        bundle = zzcv;
                        bArr = null;
                        j = zzc.zzfj;
                        zzw = zzc.zzw(zzaiVar.zzfu);
                    }
                    zzgy().zza(zzw);
                    zzaf zzafVar = new zzaf(this.zzj, zzaiVar.origin, str, zzaiVar.name, zzaiVar.zzfu, j, bundle);
                    zzbs.zzc.zza zzah = zzbs.zzc.zzmq().zzag(zzafVar.timestamp).zzbx(zzafVar.name).zzah(zzafVar.zzfp);
                    Iterator<String> it3 = zzafVar.zzfq.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        zzbs.zze.zza zzbz = zzbs.zze.zzng().zzbz(next);
                        zzgw().zza(zzbz, zzafVar.zzfq.get(next));
                        zzah.zza(zzbz);
                    }
                    zzbs.zzg.zza zzaVar3 = zzaVar;
                    zzaVar3.zza(zzah).zza(zzbs.zzh.zzpt().zza(zzbs.zzd.zzms().zzak(zzw.zzfg).zzby(zzaiVar.name)));
                    zzaVar3.zzc(zzgx().zza(zzfVar.zzag(), Collections.emptyList(), zzaVar3.zzno()));
                    if (zzah.zzml()) {
                        zzaVar3.zzao(zzah.getTimestampMillis()).zzap(zzah.getTimestampMillis());
                    }
                    long zzak = zzfVar.zzak();
                    if (zzak != 0) {
                        zzaVar3.zzar(zzak);
                    }
                    long zzaj = zzfVar.zzaj();
                    if (zzaj != 0) {
                        zzaVar3.zzaq(zzaj);
                    } else if (zzak != 0) {
                        zzaVar3.zzaq(zzak);
                    }
                    zzfVar.zzau();
                    zzaVar3.zzu((int) zzfVar.zzar()).zzat(zzad().zzao()).zzan(zzx().currentTimeMillis()).zzn(Boolean.TRUE.booleanValue());
                    zzbs.zzf.zza zzaVar4 = zzaVar2;
                    zzaVar4.zza(zzaVar3);
                    zzf zzfVar2 = zzfVar;
                    zzfVar2.zze(zzaVar3.zznq());
                    zzfVar2.zzf(zzaVar3.zznr());
                    zzgy().zza(zzfVar2);
                    zzgy().setTransactionSuccessful();
                    try {
                        return zzgw().zzc(((zzbs.zzf) ((com.google.android.gms.internal.measurement.zzey) zzaVar4.zzug())).toByteArray());
                    } catch (IOException e) {
                        zzab().zzgk().zza("Data loss. Failed to bundle and serialize. appId", zzef.zzam(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                zzab().zzgr().zza("Resettable device id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                zzab().zzgr().zza("app instance id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                zzgy().endTransaction();
            }
        }
    }

    private static String zzo(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }
}
