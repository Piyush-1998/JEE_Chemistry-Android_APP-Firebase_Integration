package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzey;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfd extends zzjh implements zzu {
    private static int zznk = 65535;
    private static int zznl = 2;
    private final Map<String, Map<String, String>> zznm;
    private final Map<String, Map<String, Boolean>> zznn;
    private final Map<String, Map<String, Boolean>> zzno;
    private final Map<String, com.google.android.gms.internal.measurement.zzbw> zznp;
    private final Map<String, Map<String, Integer>> zznq;
    private final Map<String, String> zznr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfd(zzjg zzjgVar) {
        super(zzjgVar);
        this.zznm = new ArrayMap();
        this.zznn = new ArrayMap();
        this.zzno = new ArrayMap();
        this.zznp = new ArrayMap();
        this.zznr = new ArrayMap();
        this.zznq = new ArrayMap();
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    protected final boolean zzbk() {
        return false;
    }

    private final void zzav(String str) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        if (this.zznp.get(str) == null) {
            byte[] zzad = zzgy().zzad(str);
            if (zzad == null) {
                this.zznm.put(str, null);
                this.zznn.put(str, null);
                this.zzno.put(str, null);
                this.zznp.put(str, null);
                this.zznr.put(str, null);
                this.zznq.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.zzbw zza = zza(str, zzad);
            this.zznm.put(str, zza(zza));
            zza(str, zza);
            this.zznp.put(str, zza);
            this.zznr.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.zzbw zzaw(String str) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        zzav(str);
        return this.zznp.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzax(String str) {
        zzo();
        return this.zznr.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzay(String str) {
        zzo();
        this.zznr.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaz(String str) {
        zzo();
        this.zznp.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzba(String str) {
        Boolean bool;
        zzo();
        com.google.android.gms.internal.measurement.zzbw zzaw = zzaw(str);
        if (zzaw == null || (bool = zzaw.zzzq) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzu
    public final String zzb(String str, String str2) {
        zzo();
        zzav(str);
        Map<String, String> map = this.zznm.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(com.google.android.gms.internal.measurement.zzbw zzbwVar) {
        zzbq.zza[] zzaVarArr;
        ArrayMap arrayMap = new ArrayMap();
        if (zzbwVar != null && zzbwVar.zzzm != null) {
            for (zzbq.zza zzaVar : zzbwVar.zzzm) {
                if (zzaVar != null) {
                    arrayMap.put(zzaVar.getKey(), zzaVar.getValue());
                }
            }
        }
        return arrayMap;
    }

    private final void zza(String str, com.google.android.gms.internal.measurement.zzbw zzbwVar) {
        com.google.android.gms.internal.measurement.zzbx[] zzbxVarArr;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzbwVar != null && zzbwVar.zzzn != null) {
            for (com.google.android.gms.internal.measurement.zzbx zzbxVar : zzbwVar.zzzn) {
                if (TextUtils.isEmpty(zzbxVar.name)) {
                    zzab().zzgn().zzao("EventConfig contained null event name");
                } else {
                    String zzbe = zzgj.zzbe(zzbxVar.name);
                    if (!TextUtils.isEmpty(zzbe)) {
                        zzbxVar.name = zzbe;
                    }
                    arrayMap.put(zzbxVar.name, zzbxVar.zzzs);
                    arrayMap2.put(zzbxVar.name, zzbxVar.zzzt);
                    if (zzbxVar.zzzu != null) {
                        if (zzbxVar.zzzu.intValue() < zznl || zzbxVar.zzzu.intValue() > zznk) {
                            zzab().zzgn().zza("Invalid sampling rate. Event name, sample rate", zzbxVar.name, zzbxVar.zzzu);
                        } else {
                            arrayMap3.put(zzbxVar.name, zzbxVar.zzzu);
                        }
                    }
                }
            }
        }
        this.zznn.put(str, arrayMap);
        this.zzno.put(str, arrayMap2);
        this.zznq.put(str, arrayMap3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        ContentValues contentValues;
        boolean z;
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzbw zza = zza(str, bArr);
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.zznp.put(str, zza);
        this.zznr.put(str, str2);
        this.zznm.put(str, zza(zza));
        zzp zzgx = zzgx();
        com.google.android.gms.internal.measurement.zzbv[] zzbvVarArr = zza.zzzo;
        Preconditions.checkNotNull(zzbvVarArr);
        for (com.google.android.gms.internal.measurement.zzbv zzbvVar : zzbvVarArr) {
            if (zzbvVar.zzzh != null) {
                for (int i = 0; i < zzbvVar.zzzh.length; i++) {
                    zzbk.zza.C0025zza zzuj = zzbvVar.zzzh[i].zzuj();
                    zzbk.zza.C0025zza c0025zza = (zzbk.zza.C0025zza) ((zzey.zza) zzuj.clone());
                    String zzbe = zzgj.zzbe(zzuj.zzjz());
                    if (zzbe != null) {
                        c0025zza.zzbs(zzbe);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i2 = 0; i2 < zzuj.zzka(); i2++) {
                        zzbk.zzb zze = zzuj.zze(i2);
                        String zzbe2 = zzgi.zzbe(zze.zzkr());
                        if (zzbe2 != null) {
                            c0025zza.zza(i2, (zzbk.zzb) ((com.google.android.gms.internal.measurement.zzey) zze.zzuj().zzbu(zzbe2).zzug()));
                            z = true;
                        }
                    }
                    if (z) {
                        zzbvVar.zzzh[i] = (zzbk.zza) ((com.google.android.gms.internal.measurement.zzey) c0025zza.zzug());
                    }
                }
            }
            if (zzbvVar.zzzg != null) {
                for (int i3 = 0; i3 < zzbvVar.zzzg.length; i3++) {
                    zzbk.zzd zzdVar = zzbvVar.zzzg[i3];
                    String zzbe3 = zzgl.zzbe(zzdVar.getPropertyName());
                    if (zzbe3 != null) {
                        zzbvVar.zzzg[i3] = (zzbk.zzd) ((com.google.android.gms.internal.measurement.zzey) zzdVar.zzuj().zzbw(zzbe3).zzug());
                    }
                }
            }
        }
        zzgx.zzgy().zza(str, zzbvVarArr);
        try {
            zza.zzzo = null;
            int zzuk = zza.zzuk();
            bArr2 = new byte[zzuk];
            zza.zza(com.google.android.gms.internal.measurement.zzio.zzk(bArr2, 0, zzuk));
        } catch (IOException e) {
            zzab().zzgn().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzef.zzam(str), e);
            bArr2 = bArr;
        }
        zzx zzgy = zzgy();
        Preconditions.checkNotEmpty(str);
        zzgy.zzo();
        zzgy.zzbi();
        new ContentValues().put("remote_config", bArr2);
        try {
            if (zzgy.getWritableDatabase().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzgy.zzab().zzgk().zza("Failed to update remote config (got 0). appId", zzef.zzam(str));
            }
        } catch (SQLiteException e2) {
            zzgy.zzab().zzgk().zza("Error storing remote config. appId", zzef.zzam(str), e2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(String str, String str2) {
        Boolean bool;
        zzo();
        zzav(str);
        if (zzbc(str) && zzjs.zzbq(str2)) {
            return true;
        }
        if (zzbd(str) && zzjs.zzbk(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zznn.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzl(String str, String str2) {
        Boolean bool;
        zzo();
        zzav(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzno.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzm(String str, String str2) {
        Integer num;
        zzo();
        zzav(str);
        Map<String, Integer> map = this.zznq.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzbb(String str) {
        String zzb = zzb(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zzb)) {
            return 0L;
        }
        try {
            return Long.parseLong(zzb);
        } catch (NumberFormatException e) {
            zzab().zzgn().zza("Unable to parse timezone offset. appId", zzef.zzam(str), e);
            return 0L;
        }
    }

    private final com.google.android.gms.internal.measurement.zzbw zza(String str, byte[] bArr) {
        if (bArr == null) {
            return new com.google.android.gms.internal.measurement.zzbw();
        }
        com.google.android.gms.internal.measurement.zzil zzj = com.google.android.gms.internal.measurement.zzil.zzj(bArr, 0, bArr.length);
        com.google.android.gms.internal.measurement.zzbw zzbwVar = new com.google.android.gms.internal.measurement.zzbw();
        try {
            zzbwVar.zza(zzj);
            zzab().zzgs().zza("Parsed config. version, gmp_app_id", zzbwVar.zzzk, zzbwVar.zzcg);
            return zzbwVar;
        } catch (IOException e) {
            zzab().zzgn().zza("Unable to merge remote config. appId", zzef.zzam(str), e);
            return new com.google.android.gms.internal.measurement.zzbw();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzbc(String str) {
        return "1".equals(zzb(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzbd(String str) {
        return "1".equals(zzb(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    public final /* bridge */ /* synthetic */ zzjo zzgw() {
        return super.zzgw();
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    public final /* bridge */ /* synthetic */ zzp zzgx() {
        return super.zzgx();
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    public final /* bridge */ /* synthetic */ zzx zzgy() {
        return super.zzgy();
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    public final /* bridge */ /* synthetic */ zzfd zzgz() {
        return super.zzgz();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzac zzw() {
        return super.zzw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Clock zzx() {
        return super.zzx();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzed zzy() {
        return super.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzjs zzz() {
        return super.zzz();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzfc zzaa() {
        return super.zzaa();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzef zzab() {
        return super.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzeo zzac() {
        return super.zzac();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ zzs zzad() {
        return super.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzgf, com.google.android.gms.measurement.internal.zzgh
    public final /* bridge */ /* synthetic */ zzr zzae() {
        return super.zzae();
    }
}
