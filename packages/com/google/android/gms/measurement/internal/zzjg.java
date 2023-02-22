package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zzjg implements zzgh {
    private static volatile zzjg zzsn;
    private boolean zzdh;
    private final zzfj zzj;
    private zzfd zzso;
    private zzej zzsp;
    private zzx zzsq;
    private zzem zzsr;
    private zzjc zzss;
    private zzp zzst;
    private final zzjo zzsu;
    private zzhp zzsv;
    private boolean zzsw;
    private boolean zzsx;
    private long zzsy;
    private List<Runnable> zzsz;
    private int zzta;
    private int zztb;
    private boolean zztc;
    private boolean zztd;
    private boolean zzte;
    private FileLock zztf;
    private FileChannel zztg;
    private List<Long> zzth;
    private List<Long> zzti;
    private long zztj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class zza implements zzz {
        zzbs.zzg zztn;
        List<Long> zzto;
        List<zzbs.zzc> zztp;
        private long zztq;

        private zza() {
        }

        @Override // com.google.android.gms.measurement.internal.zzz
        public final void zzb(zzbs.zzg zzgVar) {
            Preconditions.checkNotNull(zzgVar);
            this.zztn = zzgVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzz
        public final boolean zza(long j, zzbs.zzc zzcVar) {
            Preconditions.checkNotNull(zzcVar);
            if (this.zztp == null) {
                this.zztp = new ArrayList();
            }
            if (this.zzto == null) {
                this.zzto = new ArrayList();
            }
            if (this.zztp.size() <= 0 || zza(this.zztp.get(0)) == zza(zzcVar)) {
                long zzuk = this.zztq + zzcVar.zzuk();
                if (zzuk >= Math.max(0, zzak.zzgn.get(null).intValue())) {
                    return false;
                }
                this.zztq = zzuk;
                this.zztp.add(zzcVar);
                this.zzto.add(Long.valueOf(j));
                return this.zztp.size() < Math.max(1, zzak.zzgo.get(null).intValue());
            }
            return false;
        }

        private static long zza(zzbs.zzc zzcVar) {
            return ((zzcVar.getTimestampMillis() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzjg zzjgVar, zzjj zzjjVar) {
            this();
        }
    }

    public static zzjg zzm(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzsn == null) {
            synchronized (zzjg.class) {
                if (zzsn == null) {
                    zzsn = new zzjg(new zzjm(context));
                }
            }
        }
        return zzsn;
    }

    private zzjg(zzjm zzjmVar) {
        this(zzjmVar, null);
    }

    private zzjg(zzjm zzjmVar, zzfj zzfjVar) {
        this.zzdh = false;
        Preconditions.checkNotNull(zzjmVar);
        this.zzj = zzfj.zza(zzjmVar.zzob, (com.google.android.gms.internal.measurement.zzx) null);
        this.zztj = -1L;
        zzjo zzjoVar = new zzjo(this);
        zzjoVar.initialize();
        this.zzsu = zzjoVar;
        zzej zzejVar = new zzej(this);
        zzejVar.initialize();
        this.zzsp = zzejVar;
        zzfd zzfdVar = new zzfd(this);
        zzfdVar.initialize();
        this.zzso = zzfdVar;
        this.zzj.zzaa().zza(new zzjj(this, zzjmVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzjm zzjmVar) {
        this.zzj.zzaa().zzo();
        zzx zzxVar = new zzx(this);
        zzxVar.initialize();
        this.zzsq = zzxVar;
        this.zzj.zzad().zza(this.zzso);
        zzp zzpVar = new zzp(this);
        zzpVar.initialize();
        this.zzst = zzpVar;
        zzhp zzhpVar = new zzhp(this);
        zzhpVar.initialize();
        this.zzsv = zzhpVar;
        zzjc zzjcVar = new zzjc(this);
        zzjcVar.initialize();
        this.zzss = zzjcVar;
        this.zzsr = new zzem(this);
        if (this.zzta != this.zztb) {
            this.zzj.zzab().zzgk().zza("Not all upload components initialized", Integer.valueOf(this.zzta), Integer.valueOf(this.zztb));
        }
        this.zzdh = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void start() {
        this.zzj.zzaa().zzo();
        zzgy().zzca();
        if (this.zzj.zzac().zzlj.get() == 0) {
            this.zzj.zzac().zzlj.set(this.zzj.zzx().currentTimeMillis());
        }
        zzjn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzr zzae() {
        return this.zzj.zzae();
    }

    public final zzs zzad() {
        return this.zzj.zzad();
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzef zzab() {
        return this.zzj.zzab();
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final zzfc zzaa() {
        return this.zzj.zzaa();
    }

    public final zzfd zzgz() {
        zza(this.zzso);
        return this.zzso;
    }

    public final zzej zzjf() {
        zza(this.zzsp);
        return this.zzsp;
    }

    public final zzx zzgy() {
        zza(this.zzsq);
        return this.zzsq;
    }

    private final zzem zzjg() {
        zzem zzemVar = this.zzsr;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjc zzjh() {
        zza(this.zzss);
        return this.zzss;
    }

    public final zzp zzgx() {
        zza(this.zzst);
        return this.zzst;
    }

    public final zzhp zzji() {
        zza(this.zzsv);
        return this.zzsv;
    }

    public final zzjo zzgw() {
        zza(this.zzsu);
        return this.zzsu;
    }

    public final zzed zzy() {
        return this.zzj.zzy();
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final Context getContext() {
        return this.zzj.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final Clock zzx() {
        return this.zzj.zzx();
    }

    public final zzjs zzz() {
        return this.zzj.zzz();
    }

    private final void zzo() {
        this.zzj.zzaa().zzo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzjj() {
        if (!this.zzdh) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zza(zzjh zzjhVar) {
        if (zzjhVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzjhVar.isInitialized()) {
            return;
        }
        String valueOf = String.valueOf(zzjhVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzn zznVar) {
        zzo();
        zzjj();
        Preconditions.checkNotEmpty(zznVar.packageName);
        zzg(zznVar);
    }

    private final long zzjk() {
        long currentTimeMillis = this.zzj.zzx().currentTimeMillis();
        zzeo zzac = this.zzj.zzac();
        zzac.zzbi();
        zzac.zzo();
        long j = zzac.zzln.get();
        if (j == 0) {
            j = 1 + zzac.zzz().zzjw().nextInt(86400000);
            zzac.zzln.set(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzai zzaiVar, String str) {
        zzf zzab = zzgy().zzab(str);
        if (zzab == null || TextUtils.isEmpty(zzab.zzal())) {
            this.zzj.zzab().zzgr().zza("No app data available; dropping event", str);
            return;
        }
        Boolean zzc = zzc(zzab);
        if (zzc == null) {
            if (!"_ui".equals(zzaiVar.name)) {
                this.zzj.zzab().zzgn().zza("Could not find package. appId", zzef.zzam(str));
            }
        } else if (!zzc.booleanValue()) {
            this.zzj.zzab().zzgk().zza("App version does not match; dropping event. appId", zzef.zzam(str));
            return;
        }
        zzc(zzaiVar, new zzn(str, zzab.getGmpAppId(), zzab.zzal(), zzab.zzam(), zzab.zzan(), zzab.zzao(), zzab.zzap(), (String) null, zzab.isMeasurementEnabled(), false, zzab.getFirebaseInstanceId(), zzab.zzbd(), 0L, 0, zzab.zzbe(), zzab.zzbf(), false, zzab.zzah(), zzab.zzbg(), zzab.zzaq(), zzab.zzbh()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzai zzaiVar, zzn zznVar) {
        List<zzq> zzb;
        List<zzq> zzb2;
        List<zzq> zzb3;
        zzai zzaiVar2 = zzaiVar;
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.packageName);
        zzo();
        zzjj();
        String str = zznVar.packageName;
        long j = zzaiVar2.zzfu;
        if (zzgw().zze(zzaiVar2, zznVar)) {
            if (!zznVar.zzcq) {
                zzg(zznVar);
                return;
            }
            if (this.zzj.zzad().zze(str, zzak.zzix) && zznVar.zzcw != null) {
                if (zznVar.zzcw.contains(zzaiVar2.name)) {
                    Bundle zzcv = zzaiVar2.zzfq.zzcv();
                    zzcv.putLong("ga_safelisted", 1L);
                    zzaiVar2 = new zzai(zzaiVar2.name, new zzah(zzcv), zzaiVar2.origin, zzaiVar2.zzfu);
                } else {
                    this.zzj.zzab().zzgr().zza("Dropping non-safelisted event. appId, event name, origin", str, zzaiVar2.name, zzaiVar2.origin);
                    return;
                }
            }
            zzgy().beginTransaction();
            try {
                zzx zzgy = zzgy();
                Preconditions.checkNotEmpty(str);
                zzgy.zzo();
                zzgy.zzbi();
                if (j < 0) {
                    zzgy.zzab().zzgn().zza("Invalid time querying timed out conditional properties", zzef.zzam(str), Long.valueOf(j));
                    zzb = Collections.emptyList();
                } else {
                    zzb = zzgy.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzq zzqVar : zzb) {
                    if (zzqVar != null) {
                        this.zzj.zzab().zzgr().zza("User property timed out", zzqVar.packageName, this.zzj.zzy().zzal(zzqVar.zzdw.name), zzqVar.zzdw.getValue());
                        if (zzqVar.zzdx != null) {
                            zzd(new zzai(zzqVar.zzdx, j), zznVar);
                        }
                        zzgy().zzg(str, zzqVar.zzdw.name);
                    }
                }
                zzx zzgy2 = zzgy();
                Preconditions.checkNotEmpty(str);
                zzgy2.zzo();
                zzgy2.zzbi();
                if (j < 0) {
                    zzgy2.zzab().zzgn().zza("Invalid time querying expired conditional properties", zzef.zzam(str), Long.valueOf(j));
                    zzb2 = Collections.emptyList();
                } else {
                    zzb2 = zzgy2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzb2.size());
                for (zzq zzqVar2 : zzb2) {
                    if (zzqVar2 != null) {
                        this.zzj.zzab().zzgr().zza("User property expired", zzqVar2.packageName, this.zzj.zzy().zzal(zzqVar2.zzdw.name), zzqVar2.zzdw.getValue());
                        zzgy().zzd(str, zzqVar2.zzdw.name);
                        if (zzqVar2.zzdz != null) {
                            arrayList.add(zzqVar2.zzdz);
                        }
                        zzgy().zzg(str, zzqVar2.zzdw.name);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zzd(new zzai((zzai) obj, j), zznVar);
                }
                zzx zzgy3 = zzgy();
                String str2 = zzaiVar2.name;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zzgy3.zzo();
                zzgy3.zzbi();
                if (j < 0) {
                    zzgy3.zzab().zzgn().zza("Invalid time querying triggered conditional properties", zzef.zzam(str), zzgy3.zzy().zzaj(str2), Long.valueOf(j));
                    zzb3 = Collections.emptyList();
                } else {
                    zzb3 = zzgy3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(zzb3.size());
                for (zzq zzqVar3 : zzb3) {
                    if (zzqVar3 != null) {
                        zzjn zzjnVar = zzqVar3.zzdw;
                        zzjp zzjpVar = new zzjp(zzqVar3.packageName, zzqVar3.origin, zzjnVar.name, j, zzjnVar.getValue());
                        if (zzgy().zza(zzjpVar)) {
                            this.zzj.zzab().zzgr().zza("User property triggered", zzqVar3.packageName, this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
                        } else {
                            this.zzj.zzab().zzgk().zza("Too many active user properties, ignoring", zzef.zzam(zzqVar3.packageName), this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
                        }
                        if (zzqVar3.zzdy != null) {
                            arrayList3.add(zzqVar3.zzdy);
                        }
                        zzqVar3.zzdw = new zzjn(zzjpVar);
                        zzqVar3.active = true;
                        zzgy().zza(zzqVar3);
                    }
                }
                zzd(zzaiVar2, zznVar);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    zzd(new zzai((zzai) obj2, j), zznVar);
                }
                zzgy().setTransactionSuccessful();
            } finally {
                zzgy().endTransaction();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:225|(1:227)(1:251)|228|(8:233|234|235|(1:237)|238|(0)|43|(0)(0))|243|244|245|246|234|235|(0)|238|(0)|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x080f, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023c, code lost:
        r7.zzab().zzgk().zza("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzef.zzam(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0271 A[Catch: all -> 0x08c8, TryCatch #2 {all -> 0x08c8, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b7, B:87:0x02f6, B:89:0x02fb, B:90:0x0314, B:94:0x0325, B:96:0x033a, B:98:0x0341, B:99:0x035a, B:103:0x037d, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040f, B:119:0x0419, B:121:0x0427, B:123:0x0433, B:125:0x0439, B:126:0x0444, B:128:0x044c, B:130:0x045c, B:132:0x046a, B:134:0x0475, B:136:0x0481, B:137:0x0498, B:139:0x04c5, B:142:0x04d5, B:145:0x0511, B:147:0x0539, B:149:0x0573, B:150:0x0578, B:152:0x0580, B:153:0x0585, B:155:0x058d, B:156:0x0592, B:158:0x059b, B:159:0x05a1, B:161:0x05ae, B:162:0x05b3, B:164:0x05c1, B:166:0x05cb, B:168:0x05d3, B:172:0x05e6, B:174:0x05ee, B:175:0x05f3, B:177:0x0608, B:179:0x0612, B:180:0x0615, B:182:0x0623, B:184:0x062d, B:186:0x0631, B:188:0x063c, B:200:0x06aa, B:202:0x06f2, B:204:0x06f8, B:206:0x0701, B:207:0x0706, B:209:0x0712, B:210:0x0779, B:212:0x0783, B:213:0x078a, B:215:0x0794, B:216:0x079b, B:217:0x07a6, B:219:0x07ac, B:221:0x07dd, B:222:0x07ed, B:224:0x07f5, B:225:0x07fb, B:227:0x0801, B:237:0x084d, B:239:0x0853, B:242:0x086f, B:244:0x0883, B:231:0x0814, B:233:0x0838, B:241:0x0857, B:189:0x0648, B:191:0x065a, B:193:0x065e, B:195:0x0670, B:199:0x06a7, B:196:0x068a, B:198:0x0690, B:169:0x05d9, B:171:0x05e1, B:146:0x052b, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b6, B:62:0x01c0, B:64:0x01cb, B:67:0x01d2, B:76:0x0267, B:78:0x0271, B:82:0x02a8, B:69:0x0201, B:70:0x021f, B:75:0x024d, B:74:0x023c, B:61:0x01bb, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a8 A[Catch: all -> 0x08c8, TRY_LEAVE, TryCatch #2 {all -> 0x08c8, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b7, B:87:0x02f6, B:89:0x02fb, B:90:0x0314, B:94:0x0325, B:96:0x033a, B:98:0x0341, B:99:0x035a, B:103:0x037d, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040f, B:119:0x0419, B:121:0x0427, B:123:0x0433, B:125:0x0439, B:126:0x0444, B:128:0x044c, B:130:0x045c, B:132:0x046a, B:134:0x0475, B:136:0x0481, B:137:0x0498, B:139:0x04c5, B:142:0x04d5, B:145:0x0511, B:147:0x0539, B:149:0x0573, B:150:0x0578, B:152:0x0580, B:153:0x0585, B:155:0x058d, B:156:0x0592, B:158:0x059b, B:159:0x05a1, B:161:0x05ae, B:162:0x05b3, B:164:0x05c1, B:166:0x05cb, B:168:0x05d3, B:172:0x05e6, B:174:0x05ee, B:175:0x05f3, B:177:0x0608, B:179:0x0612, B:180:0x0615, B:182:0x0623, B:184:0x062d, B:186:0x0631, B:188:0x063c, B:200:0x06aa, B:202:0x06f2, B:204:0x06f8, B:206:0x0701, B:207:0x0706, B:209:0x0712, B:210:0x0779, B:212:0x0783, B:213:0x078a, B:215:0x0794, B:216:0x079b, B:217:0x07a6, B:219:0x07ac, B:221:0x07dd, B:222:0x07ed, B:224:0x07f5, B:225:0x07fb, B:227:0x0801, B:237:0x084d, B:239:0x0853, B:242:0x086f, B:244:0x0883, B:231:0x0814, B:233:0x0838, B:241:0x0857, B:189:0x0648, B:191:0x065a, B:193:0x065e, B:195:0x0670, B:199:0x06a7, B:196:0x068a, B:198:0x0690, B:169:0x05d9, B:171:0x05e1, B:146:0x052b, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b6, B:62:0x01c0, B:64:0x01cb, B:67:0x01d2, B:76:0x0267, B:78:0x0271, B:82:0x02a8, B:69:0x0201, B:70:0x021f, B:75:0x024d, B:74:0x023c, B:61:0x01bb, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f6 A[Catch: all -> 0x08c8, TryCatch #2 {all -> 0x08c8, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b7, B:87:0x02f6, B:89:0x02fb, B:90:0x0314, B:94:0x0325, B:96:0x033a, B:98:0x0341, B:99:0x035a, B:103:0x037d, B:107:0x03a5, B:108:0x03be, B:112:0x03ce, B:115:0x03f1, B:116:0x040f, B:119:0x0419, B:121:0x0427, B:123:0x0433, B:125:0x0439, B:126:0x0444, B:128:0x044c, B:130:0x045c, B:132:0x046a, B:134:0x0475, B:136:0x0481, B:137:0x0498, B:139:0x04c5, B:142:0x04d5, B:145:0x0511, B:147:0x0539, B:149:0x0573, B:150:0x0578, B:152:0x0580, B:153:0x0585, B:155:0x058d, B:156:0x0592, B:158:0x059b, B:159:0x05a1, B:161:0x05ae, B:162:0x05b3, B:164:0x05c1, B:166:0x05cb, B:168:0x05d3, B:172:0x05e6, B:174:0x05ee, B:175:0x05f3, B:177:0x0608, B:179:0x0612, B:180:0x0615, B:182:0x0623, B:184:0x062d, B:186:0x0631, B:188:0x063c, B:200:0x06aa, B:202:0x06f2, B:204:0x06f8, B:206:0x0701, B:207:0x0706, B:209:0x0712, B:210:0x0779, B:212:0x0783, B:213:0x078a, B:215:0x0794, B:216:0x079b, B:217:0x07a6, B:219:0x07ac, B:221:0x07dd, B:222:0x07ed, B:224:0x07f5, B:225:0x07fb, B:227:0x0801, B:237:0x084d, B:239:0x0853, B:242:0x086f, B:244:0x0883, B:231:0x0814, B:233:0x0838, B:241:0x0857, B:189:0x0648, B:191:0x065a, B:193:0x065e, B:195:0x0670, B:199:0x06a7, B:196:0x068a, B:198:0x0690, B:169:0x05d9, B:171:0x05e1, B:146:0x052b, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b6, B:62:0x01c0, B:64:0x01cb, B:67:0x01d2, B:76:0x0267, B:78:0x0271, B:82:0x02a8, B:69:0x0201, B:70:0x021f, B:75:0x024d, B:74:0x023c, B:61:0x01bb, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzd(com.google.android.gms.measurement.internal.zzai r28, com.google.android.gms.measurement.internal.zzn r29) {
        /*
            Method dump skipped, instructions count: 2260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzd(com.google.android.gms.measurement.internal.zzai, com.google.android.gms.measurement.internal.zzn):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzjl() {
        zzf zzab;
        String str;
        zzo();
        zzjj();
        this.zzte = true;
        try {
            this.zzj.zzae();
            Boolean zzit = this.zzj.zzs().zzit();
            if (zzit == null) {
                this.zzj.zzab().zzgn().zzao("Upload data called on the client side before use of service was decided");
            } else if (zzit.booleanValue()) {
                this.zzj.zzab().zzgk().zzao("Upload called in the client side when service should be used");
            } else if (this.zzsy > 0) {
                zzjn();
            } else {
                zzo();
                if (this.zzth != null) {
                    this.zzj.zzab().zzgs().zzao("Uploading requested multiple times");
                } else if (!zzjf().zzgv()) {
                    this.zzj.zzab().zzgs().zzao("Network not connected, ignoring upload request");
                    zzjn();
                } else {
                    long currentTimeMillis = this.zzj.zzx().currentTimeMillis();
                    zzd((String) null, currentTimeMillis - zzs.zzbt());
                    long j = this.zzj.zzac().zzlj.get();
                    if (j != 0) {
                        this.zzj.zzab().zzgr().zza("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - j)));
                    }
                    String zzby = zzgy().zzby();
                    if (!TextUtils.isEmpty(zzby)) {
                        if (this.zztj == -1) {
                            this.zztj = zzgy().zzcf();
                        }
                        List<Pair<zzbs.zzg, Long>> zza2 = zzgy().zza(zzby, this.zzj.zzad().zzb(zzby, zzak.zzgl), Math.max(0, this.zzj.zzad().zzb(zzby, zzak.zzgm)));
                        if (!zza2.isEmpty()) {
                            Iterator<Pair<zzbs.zzg, Long>> it = zza2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                zzbs.zzg zzgVar = (zzbs.zzg) it.next().first;
                                if (!TextUtils.isEmpty(zzgVar.zzot())) {
                                    str = zzgVar.zzot();
                                    break;
                                }
                            }
                            if (str != null) {
                                int i = 0;
                                while (true) {
                                    if (i >= zza2.size()) {
                                        break;
                                    }
                                    zzbs.zzg zzgVar2 = (zzbs.zzg) zza2.get(i).first;
                                    if (!TextUtils.isEmpty(zzgVar2.zzot()) && !zzgVar2.zzot().equals(str)) {
                                        zza2 = zza2.subList(0, i);
                                        break;
                                    }
                                    i++;
                                }
                            }
                            zzbs.zzf.zza zznj = zzbs.zzf.zznj();
                            int size = zza2.size();
                            ArrayList arrayList = new ArrayList(zza2.size());
                            boolean z = zzs.zzbv() && this.zzj.zzad().zzl(zzby);
                            for (int i2 = 0; i2 < size; i2++) {
                                zzbs.zzg.zza zzuj = ((zzbs.zzg) zza2.get(i2).first).zzuj();
                                arrayList.add((Long) zza2.get(i2).second);
                                zzbs.zzg.zza zzan = zzuj.zzat(this.zzj.zzad().zzao()).zzan(currentTimeMillis);
                                this.zzj.zzae();
                                zzan.zzn(false);
                                if (!z) {
                                    zzuj.zznw();
                                }
                                if (this.zzj.zzad().zze(zzby, zzak.zzis)) {
                                    zzuj.zzay(zzgw().zza(((zzbs.zzg) ((com.google.android.gms.internal.measurement.zzey) zzuj.zzug())).toByteArray()));
                                }
                                zznj.zza(zzuj);
                            }
                            String zza3 = this.zzj.zzab().isLoggable(2) ? zzgw().zza((zzbs.zzf) ((com.google.android.gms.internal.measurement.zzey) zznj.zzug())) : null;
                            zzgw();
                            byte[] byteArray = ((zzbs.zzf) ((com.google.android.gms.internal.measurement.zzey) zznj.zzug())).toByteArray();
                            String str2 = zzak.zzgv.get(null);
                            try {
                                URL url = new URL(str2);
                                Preconditions.checkArgument(!arrayList.isEmpty());
                                if (this.zzth != null) {
                                    this.zzj.zzab().zzgk().zzao("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.zzth = new ArrayList(arrayList);
                                }
                                this.zzj.zzac().zzlk.set(currentTimeMillis);
                                this.zzj.zzab().zzgs().zza("Uploading data. app, uncompressed size, data", size > 0 ? zznj.zzo(0).zzag() : "?", Integer.valueOf(byteArray.length), zza3);
                                this.zztd = true;
                                zzej zzjf = zzjf();
                                zzji zzjiVar = new zzji(this, zzby);
                                zzjf.zzo();
                                zzjf.zzbi();
                                Preconditions.checkNotNull(url);
                                Preconditions.checkNotNull(byteArray);
                                Preconditions.checkNotNull(zzjiVar);
                                zzjf.zzaa().zzb(new zzen(zzjf, zzby, url, byteArray, null, zzjiVar));
                            } catch (MalformedURLException unused) {
                                this.zzj.zzab().zzgk().zza("Failed to parse upload URL. Not uploading. appId", zzef.zzam(zzby), str2);
                            }
                        }
                    } else {
                        this.zztj = -1L;
                        String zzu = zzgy().zzu(currentTimeMillis - zzs.zzbt());
                        if (!TextUtils.isEmpty(zzu) && (zzab = zzgy().zzab(zzu)) != null) {
                            zzb(zzab);
                        }
                    }
                }
            }
        } finally {
            this.zzte = false;
            zzjo();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(8:10|(2:561|562)(1:12)|13|(1:15)|16|17|18|(5:(1:21)|22|(2:27|(29:29|(3:30|31|(4:33|34|(6:36|(4:41|(1:45)|46|47)|49|(2:43|45)|46|47)(23:50|51|(2:53|(2:55|(6:57|(3:212|(1:209)(1:66)|(1:68)(12:208|119|(13:122|(5:126|(2:128|129)(2:131|(2:133|134)(1:135))|130|124|123)|136|137|(2:139|(10:144|(1:146)(3:192|(4:195|(3:198|(2:201|202)(1:200)|196)|203|204)(0)|194)|(1:148)|149|(6:151|(2:153|(2:(2:158|(2:160|161))|175)(2:176|177))(3:179|(2:181|(2:(2:186|(2:188|161))|189)(1:190))|177)|(2:165|(1:167)(2:168|(1:170)(3:171|172|173)))|174|172|173)(1:191)|178|(3:163|165|(0)(0))|174|172|173)(1:143))|205|149|(0)(0)|178|(0)|174|172|173)|206|205|149|(0)(0)|178|(0)|174|172|173))|60|(1:62)|209|(0)(0))(6:213|(4:215|(0)|209|(0)(0))|60|(0)|209|(0)(0)))(6:216|(4:218|(0)|209|(0)(0))|60|(0)|209|(0)(0)))(1:219)|69|(3:70|71|(3:73|(2:75|76)(2:78|(2:80|81)(2:82|83))|77)(1:84))|85|(1:88)|(1:90)|91|(1:93)(1:207)|94|(4:99|(4:102|(2:104|105)(2:107|(2:109|110)(1:111))|106|100)|112|(1:(1:117)(1:118))(1:115))|119|(13:122|(2:124|123)|136|137|(0)|205|149|(0)(0)|178|(0)|174|172|173)|206|205|149|(0)(0)|178|(0)|174|172|173)|48)(1:220))|221|(4:223|(5:225|(2:227|(3:229|230|231))|232|(1:245)(3:234|(1:236)(1:244)|(2:240|241))|231)|246|247)(1:491)|248|249|(4:251|(2:252|(2:254|(2:256|257))(2:486|487))|(1:259)|260)(2:488|(1:490))|261|(2:263|(3:271|(2:272|(2:274|(2:277|278)(1:276))(2:281|282))|(1:280)))|283|(9:362|363|(7:366|367|(5:369|(1:371)|372|(5:374|(1:376)|377|(1:381)|382)|383)(5:388|(2:391|(2:392|(2:394|(3:397|398|(1:402)(0))(1:396))(1:475)))(0)|476|(1:404)(1:466)|(1:406)(7:407|(1:465)(2:411|(1:413)(1:464))|414|(1:416)(1:463)|417|418|(3:420|(1:428)|429)(5:430|(4:432|(1:434)|435|436)(5:439|440|(3:442|(2:444|445)(1:459)|446)(3:460|(2:462|448)|458)|(3:450|(1:452)|453)(2:455|(1:457))|454)|437|438|386)))|384|385|386|364)|477|478|(1:480)|481|(2:484|482)|485)|285|(6:288|(1:290)|291|(2:293|294)(1:296)|295|286)|297|298|(2:300|301)(2:338|(9:340|(1:342)(1:356)|343|(1:345)(1:355)|346|(1:348)(1:354)|349|(1:351)(1:353)|352))|302|(5:304|(2:309|310)|311|(1:313)(1:314)|310)|315|(3:(2:319|320)(1:322)|321|316)|323|324|(1:326)|327|328|329|330|331|332)(4:492|493|494|495))|496|(0)(0))(4:497|498|499|500))(7:566|(1:568)(1:579)|569|(1:571)|572|573|(5:(1:576)|22|(3:24|27|(0)(0))|496|(0)(0))(2:577|578))|501|502|(2:504|(1:506))(10:507|508|509|510|(1:512)|513|(1:515)(1:540)|516|517|(2:519|(1:521))(1:(8:522|523|524|525|526|(2:533|(1:535))|528|(2:530|(1:532)))))|22|(0)|496|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0264, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0c76, code lost:
        if (r5 != r14) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x023f, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264 A[Catch: all -> 0x0f29, TRY_ENTER, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026b A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279 A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e8 A[Catch: all -> 0x0f29, TRY_ENTER, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0611 A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06a9 A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0773 A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0783 A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x079d A[Catch: all -> 0x0f29, TryCatch #5 {all -> 0x0f29, blocks: (B:3:0x000b, B:26:0x0088, B:104:0x0267, B:106:0x026b, B:112:0x0279, B:113:0x02a3, B:116:0x02b7, B:119:0x02df, B:121:0x0318, B:127:0x032e, B:129:0x0338, B:286:0x07ed, B:131:0x0363, B:134:0x037b, B:163:0x03dc, B:166:0x03e6, B:168:0x03f4, B:173:0x044b, B:169:0x0417, B:171:0x0426, B:177:0x045a, B:179:0x048a, B:180:0x04b8, B:182:0x04ec, B:184:0x04f2, B:187:0x04fe, B:189:0x0533, B:190:0x0550, B:192:0x0556, B:194:0x0564, B:198:0x057a, B:195:0x056f, B:201:0x0581, B:203:0x0587, B:204:0x05a5, B:205:0x05be, B:208:0x05d2, B:209:0x05de, B:212:0x05e8, B:218:0x060b, B:215:0x05fa, B:221:0x0611, B:223:0x061d, B:225:0x0629, B:241:0x0678, B:244:0x0695, B:246:0x06a9, B:248:0x06b5, B:251:0x06c8, B:253:0x06da, B:255:0x06e8, B:275:0x0773, B:277:0x077d, B:279:0x0783, B:280:0x079d, B:282:0x07b0, B:283:0x07ca, B:285:0x07d3, B:259:0x070b, B:261:0x071b, B:264:0x0730, B:266:0x0742, B:268:0x0750, B:229:0x064a, B:233:0x065e, B:235:0x0664, B:238:0x066f, B:141:0x039d, B:144:0x03a7, B:147:0x03b1, B:291:0x080f, B:293:0x081d, B:295:0x0826, B:306:0x0858, B:296:0x082e, B:298:0x0837, B:300:0x083d, B:303:0x0849, B:305:0x0853, B:309:0x085f, B:312:0x0877, B:313:0x087f, B:315:0x0885, B:320:0x089c, B:321:0x08a7, B:325:0x08c9, B:327:0x08db, B:329:0x08fa, B:331:0x0908, B:333:0x090e, B:335:0x0918, B:336:0x094a, B:338:0x0950, B:340:0x095e, B:344:0x0969, B:341:0x0963, B:345:0x096c, B:353:0x09d1, B:355:0x09ec, B:356:0x09fd, B:358:0x0a01, B:360:0x0a0d, B:361:0x0a15, B:363:0x0a19, B:365:0x0a21, B:366:0x0a2f, B:367:0x0a3a, B:373:0x0a7b, B:374:0x0a83, B:376:0x0a89, B:378:0x0a9b, B:380:0x0a9f, B:394:0x0ad5, B:397:0x0aeb, B:401:0x0b1e, B:403:0x0b32, B:405:0x0b61, B:416:0x0bcc, B:418:0x0bdd, B:420:0x0be1, B:422:0x0be5, B:424:0x0be9, B:425:0x0bf5, B:429:0x0c00, B:431:0x0c1c, B:432:0x0c25, B:439:0x0c5a, B:406:0x0b87, B:382:0x0aad, B:384:0x0ab1, B:386:0x0abb, B:388:0x0abf, B:322:0x08ac, B:324:0x08be, B:52:0x0131, B:68:0x01c7, B:76:0x0203, B:84:0x0222, B:90:0x023b, B:103:0x0264, B:44:0x00e3, B:55:0x013a), top: B:554:0x000b, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0f0c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzd(java.lang.String r62, long r63) {
        /*
            Method dump skipped, instructions count: 3894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzd(java.lang.String, long):boolean");
    }

    private final void zza(zzbs.zzg.zza zzaVar, long j, boolean z) {
        zzjp zzjpVar;
        String str = z ? "_se" : "_lte";
        zzjp zze = zzgy().zze(zzaVar.zzag(), str);
        if (zze == null || zze.value == null) {
            zzjpVar = new zzjp(zzaVar.zzag(), "auto", str, this.zzj.zzx().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzjpVar = new zzjp(zzaVar.zzag(), "auto", str, this.zzj.zzx().currentTimeMillis(), Long.valueOf(((Long) zze.value).longValue() + j));
        }
        zzbs.zzk zzkVar = (zzbs.zzk) ((com.google.android.gms.internal.measurement.zzey) zzbs.zzk.zzqu().zzdb(str).zzbk(this.zzj.zzx().currentTimeMillis()).zzbl(((Long) zzjpVar.value).longValue()).zzug());
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= zzaVar.zznp()) {
                break;
            } else if (str.equals(zzaVar.zzs(i).getName())) {
                zzaVar.zza(i, zzkVar);
                z2 = true;
                break;
            } else {
                i++;
            }
        }
        if (!z2) {
            zzaVar.zza(zzkVar);
        }
        if (j > 0) {
            zzgy().zza(zzjpVar);
            this.zzj.zzab().zzgr().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", zzjpVar.value);
        }
    }

    private final boolean zza(zzbs.zzc.zza zzaVar, zzbs.zzc.zza zzaVar2) {
        Preconditions.checkArgument("_e".equals(zzaVar.getName()));
        zzgw();
        zzbs.zze zza2 = zzjo.zza((zzbs.zzc) ((com.google.android.gms.internal.measurement.zzey) zzaVar.zzug()), "_sc");
        String zzmy = zza2 == null ? null : zza2.zzmy();
        zzgw();
        zzbs.zze zza3 = zzjo.zza((zzbs.zzc) ((com.google.android.gms.internal.measurement.zzey) zzaVar2.zzug()), "_pc");
        String zzmy2 = zza3 != null ? zza3.zzmy() : null;
        if (zzmy2 == null || !zzmy2.equals(zzmy)) {
            return false;
        }
        zzgw();
        zzbs.zze zza4 = zzjo.zza((zzbs.zzc) ((com.google.android.gms.internal.measurement.zzey) zzaVar.zzug()), "_et");
        if (zza4.zzna() && zza4.zznb() > 0) {
            long zznb = zza4.zznb();
            zzgw();
            zzbs.zze zza5 = zzjo.zza((zzbs.zzc) ((com.google.android.gms.internal.measurement.zzey) zzaVar2.zzug()), "_et");
            if (zza5 != null && zza5.zznb() > 0) {
                zznb += zza5.zznb();
            }
            zzgw();
            zzjo.zza(zzaVar2, "_et", Long.valueOf(zznb));
            zzgw();
            zzjo.zza(zzaVar, "_fr", (Object) 1L);
        }
        return true;
    }

    private static void zza(zzbs.zzc.zza zzaVar, String str) {
        List<zzbs.zze> zzmj = zzaVar.zzmj();
        for (int i = 0; i < zzmj.size(); i++) {
            if (str.equals(zzmj.get(i).getName())) {
                zzaVar.zzm(i);
                return;
            }
        }
    }

    private static void zza(zzbs.zzc.zza zzaVar, int i, String str) {
        List<zzbs.zze> zzmj = zzaVar.zzmj();
        for (int i2 = 0; i2 < zzmj.size(); i2++) {
            if ("_err".equals(zzmj.get(i2).getName())) {
                return;
            }
        }
        zzaVar.zza((zzbs.zze) ((com.google.android.gms.internal.measurement.zzey) zzbs.zze.zzng().zzbz("_err").zzam(Long.valueOf(i).longValue()).zzug())).zza((zzbs.zze) ((com.google.android.gms.internal.measurement.zzey) zzbs.zze.zzng().zzbz("_ev").zzca(str).zzug()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
        r8.zzj.zzac().zzll.set(r8.zzj.zzx().currentTimeMillis());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zza(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    private final boolean zzjm() {
        zzo();
        zzjj();
        return zzgy().zzcd() || !TextUtils.isEmpty(zzgy().zzby());
    }

    private final void zzb(zzf zzfVar) {
        zzo();
        if (TextUtils.isEmpty(zzfVar.getGmpAppId()) && (!zzs.zzbx() || TextUtils.isEmpty(zzfVar.zzah()))) {
            zzb(zzfVar.zzag(), 204, null, null, null);
            return;
        }
        zzs zzad = this.zzj.zzad();
        Uri.Builder builder = new Uri.Builder();
        String gmpAppId = zzfVar.getGmpAppId();
        if (TextUtils.isEmpty(gmpAppId) && zzs.zzbx()) {
            gmpAppId = zzfVar.zzah();
        }
        ArrayMap arrayMap = null;
        Uri.Builder encodedAuthority = builder.scheme(zzak.zzgj.get(null)).encodedAuthority(zzak.zzgk.get(null));
        String valueOf = String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", zzfVar.getAppInstanceId()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzad.zzao()));
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            this.zzj.zzab().zzgs().zza("Fetching remote configuration", zzfVar.zzag());
            com.google.android.gms.internal.measurement.zzbw zzaw = zzgz().zzaw(zzfVar.zzag());
            String zzax = zzgz().zzax(zzfVar.zzag());
            if (zzaw != null && !TextUtils.isEmpty(zzax)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", zzax);
            }
            this.zztc = true;
            zzej zzjf = zzjf();
            String zzag = zzfVar.zzag();
            zzjl zzjlVar = new zzjl(this);
            zzjf.zzo();
            zzjf.zzbi();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzjlVar);
            zzjf.zzaa().zzb(new zzen(zzjf, zzag, url, null, arrayMap, zzjlVar));
        } catch (MalformedURLException unused) {
            this.zzj.zzab().zzgk().zza("Failed to parse config URL. Not fetching. appId", zzef.zzam(zzfVar.zzag()), uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        r6.zzj.zzac().zzll.set(r6.zzj.zzx().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: all -> 0x018d, TryCatch #2 {all -> 0x0196, blocks: (B:4:0x000c, B:5:0x000e, B:64:0x0180, B:43:0x00f6, B:50:0x0117, B:6:0x0029, B:15:0x0045, B:63:0x0179, B:20:0x0061, B:27:0x00b0, B:28:0x00c5, B:31:0x00cd, B:34:0x00d9, B:36:0x00df, B:41:0x00ec, B:53:0x0124, B:55:0x013a, B:57:0x0162, B:59:0x016c, B:61:0x0172, B:62:0x0176, B:56:0x014a, B:46:0x0103, B:48:0x010d), top: B:73:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzb(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzjn() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzjn():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(Runnable runnable) {
        zzo();
        if (this.zzsz == null) {
            this.zzsz = new ArrayList();
        }
        this.zzsz.add(runnable);
    }

    private final void zzjo() {
        zzo();
        if (this.zztc || this.zztd || this.zzte) {
            this.zzj.zzab().zzgs().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zztc), Boolean.valueOf(this.zztd), Boolean.valueOf(this.zzte));
            return;
        }
        this.zzj.zzab().zzgs().zzao("Stopping uploading service(s)");
        List<Runnable> list = this.zzsz;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        this.zzsz.clear();
    }

    private final Boolean zzc(zzf zzfVar) {
        try {
            if (zzfVar.zzam() != -2147483648L) {
                if (zzfVar.zzam() == Wrappers.packageManager(this.zzj.getContext()).getPackageInfo(zzfVar.zzag(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzj.getContext()).getPackageInfo(zzfVar.zzag(), 0).versionName;
                if (zzfVar.zzal() != null && zzfVar.zzal().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean zzjp() {
        FileLock fileLock;
        zzo();
        if (this.zzj.zzad().zza(zzak.zzjh) && (fileLock = this.zztf) != null && fileLock.isValid()) {
            this.zzj.zzab().zzgs().zzao("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzj.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zztg = channel;
            FileLock tryLock = channel.tryLock();
            this.zztf = tryLock;
            if (tryLock != null) {
                this.zzj.zzab().zzgs().zzao("Storage concurrent access okay");
                return true;
            }
            this.zzj.zzab().zzgk().zzao("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.zzj.zzab().zzgk().zza("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            this.zzj.zzab().zzgk().zza("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            this.zzj.zzab().zzgn().zza("Storage lock already acquired", e3);
            return false;
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzo();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzab().zzgk().zzao("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.zzj.zzab().zzgn().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.zzj.zzab().zzgk().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzo();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzab().zzgk().zzao("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzj.zzab().zzgk().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzj.zzab().zzgk().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzjq() {
        zzo();
        zzjj();
        if (!this.zzsx) {
            this.zzsx = true;
            zzo();
            zzjj();
            if ((this.zzj.zzad().zza(zzak.zzim) || zzjr()) && zzjp()) {
                int zza2 = zza(this.zztg);
                int zzgf = this.zzj.zzr().zzgf();
                zzo();
                if (zza2 > zzgf) {
                    this.zzj.zzab().zzgk().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzgf));
                } else if (zza2 < zzgf) {
                    if (zza(zzgf, this.zztg)) {
                        this.zzj.zzab().zzgs().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzgf));
                    } else {
                        this.zzj.zzab().zzgk().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzgf));
                    }
                }
            }
        }
        if (this.zzsw || this.zzj.zzad().zza(zzak.zzim)) {
            return;
        }
        this.zzj.zzab().zzgq().zzao("This instance being marked as an uploader");
        this.zzsw = true;
        zzjn();
    }

    private final boolean zzjr() {
        zzo();
        zzjj();
        return this.zzsw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzn zznVar) {
        if (this.zzth != null) {
            ArrayList arrayList = new ArrayList();
            this.zzti = arrayList;
            arrayList.addAll(this.zzth);
        }
        zzx zzgy = zzgy();
        String str = zznVar.packageName;
        Preconditions.checkNotEmpty(str);
        zzgy.zzo();
        zzgy.zzbi();
        try {
            SQLiteDatabase writableDatabase = zzgy.getWritableDatabase();
            String[] strArr = {str};
            int delete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzgy.zzab().zzgs().zza("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzgy.zzab().zzgk().zza("Error resetting analytics data. appId, error", zzef.zzam(str), e);
        }
        zzn zza2 = zza(this.zzj.getContext(), zznVar.packageName, zznVar.zzcg, zznVar.zzcq, zznVar.zzcs, zznVar.zzct, zznVar.zzdr, zznVar.zzcu);
        if (zznVar.zzcq) {
            zzf(zza2);
        }
    }

    private final zzn zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzj.zzab().zzgk().zzao("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.zzj.zzab().zzgk().zza("Error retrieving installer package name. appId", zzef.zzam(str));
            str4 = "Unknown";
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str6 = str4;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str);
                if (!TextUtils.isEmpty(applicationLabel)) {
                    applicationLabel.toString();
                }
                String str7 = packageInfo.versionName;
                i = packageInfo.versionCode;
                str5 = str7;
            } else {
                i = Integer.MIN_VALUE;
                str5 = "Unknown";
            }
            this.zzj.zzae();
            return new zzn(str, str2, str5, i, str6, this.zzj.zzad().zzao(), this.zzj.zzz().zzc(context, str), (String) null, z, false, "", 0L, this.zzj.zzad().zzr(str) ? j : 0L, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.zzj.zzab().zzgk().zza("Error retrieving newly installed package info. appId, appName", zzef.zzam(str), "Unknown");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzjn zzjnVar, zzn zznVar) {
        zzae zzc;
        zzo();
        zzjj();
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            return;
        }
        if (!zznVar.zzcq) {
            zzg(zznVar);
            return;
        }
        int zzbm = this.zzj.zzz().zzbm(zzjnVar.name);
        if (zzbm != 0) {
            this.zzj.zzz();
            this.zzj.zzz().zza(zznVar.packageName, zzbm, "_ev", zzjs.zza(zzjnVar.name, 24, true), zzjnVar.name != null ? zzjnVar.name.length() : 0);
            return;
        }
        int zzc2 = this.zzj.zzz().zzc(zzjnVar.name, zzjnVar.getValue());
        if (zzc2 != 0) {
            this.zzj.zzz();
            String zza2 = zzjs.zza(zzjnVar.name, 24, true);
            Object value = zzjnVar.getValue();
            this.zzj.zzz().zza(zznVar.packageName, zzc2, "_ev", zza2, (value == null || !((value instanceof String) || (value instanceof CharSequence))) ? 0 : String.valueOf(value).length());
            return;
        }
        Object zzd = this.zzj.zzz().zzd(zzjnVar.name, zzjnVar.getValue());
        if (zzd == null) {
            return;
        }
        if ("_sid".equals(zzjnVar.name) && this.zzj.zzad().zzw(zznVar.packageName)) {
            long j = zzjnVar.zztr;
            String str = zzjnVar.origin;
            long j2 = 0;
            zzjp zze = zzgy().zze(zznVar.packageName, "_sno");
            if (zze != null && (zze.value instanceof Long)) {
                j2 = ((Long) zze.value).longValue();
            } else {
                if (zze != null) {
                    this.zzj.zzab().zzgn().zza("Retrieved last session number from database does not contain a valid (long) value", zze.value);
                }
                if (this.zzj.zzad().zze(zznVar.packageName, zzak.zzie) && (zzc = zzgy().zzc(zznVar.packageName, "_s")) != null) {
                    j2 = zzc.zzfg;
                    this.zzj.zzab().zzgs().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                }
            }
            zzb(new zzjn("_sno", j, Long.valueOf(j2 + 1), str), zznVar);
        }
        zzjp zzjpVar = new zzjp(zznVar.packageName, zzjnVar.origin, zzjnVar.name, zzjnVar.zztr, zzd);
        this.zzj.zzab().zzgr().zza("Setting user property", this.zzj.zzy().zzal(zzjpVar.name), zzd);
        zzgy().beginTransaction();
        try {
            zzg(zznVar);
            boolean zza3 = zzgy().zza(zzjpVar);
            zzgy().setTransactionSuccessful();
            if (zza3) {
                this.zzj.zzab().zzgr().zza("User property set", this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
            } else {
                this.zzj.zzab().zzgk().zza("Too many unique user properties are set. Ignoring user property", this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
                this.zzj.zzz().zza(zznVar.packageName, 9, (String) null, (String) null, 0);
            }
        } finally {
            zzgy().endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzjn zzjnVar, zzn zznVar) {
        zzo();
        zzjj();
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            return;
        }
        if (!zznVar.zzcq) {
            zzg(zznVar);
        } else if (this.zzj.zzad().zze(zznVar.packageName, zzak.zzij)) {
            if ("_npa".equals(zzjnVar.name) && zznVar.zzcv != null) {
                this.zzj.zzab().zzgr().zzao("Falling back to manifest metadata value for ad personalization");
                zzb(new zzjn("_npa", this.zzj.zzx().currentTimeMillis(), Long.valueOf(zznVar.zzcv.booleanValue() ? 1L : 0L), "auto"), zznVar);
                return;
            }
            this.zzj.zzab().zzgr().zza("Removing user property", this.zzj.zzy().zzal(zzjnVar.name));
            zzgy().beginTransaction();
            try {
                zzg(zznVar);
                zzgy().zzd(zznVar.packageName, zzjnVar.name);
                zzgy().setTransactionSuccessful();
                this.zzj.zzab().zzgr().zza("User property removed", this.zzj.zzy().zzal(zzjnVar.name));
            } finally {
            }
        } else {
            this.zzj.zzab().zzgr().zza("Removing user property", this.zzj.zzy().zzal(zzjnVar.name));
            zzgy().beginTransaction();
            try {
                zzg(zznVar);
                zzgy().zzd(zznVar.packageName, zzjnVar.name);
                zzgy().setTransactionSuccessful();
                this.zzj.zzab().zzgr().zza("User property removed", this.zzj.zzy().zzal(zzjnVar.name));
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzjh zzjhVar) {
        this.zzta++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzjs() {
        this.zztb++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfj zzjt() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzn zznVar) {
        String str;
        int i;
        zzae zzc;
        String str2;
        long j;
        long j2;
        PackageInfo packageInfo;
        String str3;
        ApplicationInfo applicationInfo;
        boolean z;
        zzjp zze;
        zzo();
        zzjj();
        Preconditions.checkNotNull(zznVar);
        Preconditions.checkNotEmpty(zznVar.packageName);
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            return;
        }
        zzf zzab = zzgy().zzab(zznVar.packageName);
        if (zzab != null && TextUtils.isEmpty(zzab.getGmpAppId()) && !TextUtils.isEmpty(zznVar.zzcg)) {
            zzab.zzl(0L);
            zzgy().zza(zzab);
            zzgz().zzaz(zznVar.packageName);
        }
        if (!zznVar.zzcq) {
            zzg(zznVar);
            return;
        }
        long j3 = zznVar.zzdr;
        if (j3 == 0) {
            j3 = this.zzj.zzx().currentTimeMillis();
        }
        if (this.zzj.zzad().zze(zznVar.packageName, zzak.zzij)) {
            this.zzj.zzw().zzct();
        }
        int i2 = zznVar.zzds;
        if (i2 != 0 && i2 != 1) {
            this.zzj.zzab().zzgn().zza("Incorrect app type, assuming installed app. appId, appType", zzef.zzam(zznVar.packageName), Integer.valueOf(i2));
            i2 = 0;
        }
        zzgy().beginTransaction();
        try {
            if (!this.zzj.zzad().zze(zznVar.packageName, zzak.zzij) || ((zze = zzgy().zze(zznVar.packageName, "_npa")) != null && !"auto".equals(zze.origin))) {
                str = "_sysu";
                i = 1;
            } else if (zznVar.zzcv != null) {
                str = "_sysu";
                i = 1;
                zzjn zzjnVar = new zzjn("_npa", j3, Long.valueOf(zznVar.zzcv.booleanValue() ? 1L : 0L), "auto");
                if (zze == null || !zze.value.equals(zzjnVar.zzts)) {
                    zzb(zzjnVar, zznVar);
                }
            } else {
                str = "_sysu";
                i = 1;
                if (zze != null) {
                    zzc(new zzjn("_npa", j3, null, "auto"), zznVar);
                }
            }
            zzf zzab2 = zzgy().zzab(zznVar.packageName);
            if (zzab2 != null) {
                this.zzj.zzz();
                if (zzjs.zza(zznVar.zzcg, zzab2.getGmpAppId(), zznVar.zzcu, zzab2.zzah())) {
                    this.zzj.zzab().zzgn().zza("New GMP App Id passed in. Removing cached database data. appId", zzef.zzam(zzab2.zzag()));
                    zzx zzgy = zzgy();
                    String zzag = zzab2.zzag();
                    zzgy.zzbi();
                    zzgy.zzo();
                    Preconditions.checkNotEmpty(zzag);
                    try {
                        SQLiteDatabase writableDatabase = zzgy.getWritableDatabase();
                        String[] strArr = new String[i];
                        strArr[0] = zzag;
                        int delete = writableDatabase.delete("events", "app_id=?", strArr) + 0 + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("apps", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("event_filters", "app_id=?", strArr) + writableDatabase.delete("property_filters", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            zzgy.zzab().zzgs().zza("Deleted application data. app, records", zzag, Integer.valueOf(delete));
                        }
                    } catch (SQLiteException e) {
                        zzgy.zzab().zzgk().zza("Error deleting application data. appId, error", zzef.zzam(zzag), e);
                    }
                    zzab2 = null;
                }
            }
            if (zzab2 != null) {
                if (zzab2.zzam() != -2147483648L) {
                    if (zzab2.zzam() != zznVar.zzcn) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", zzab2.zzal());
                        zzc(new zzai("_au", new zzah(bundle), "auto", j3), zznVar);
                    }
                } else if (zzab2.zzal() != null && !zzab2.zzal().equals(zznVar.zzcm)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", zzab2.zzal());
                    zzc(new zzai("_au", new zzah(bundle2), "auto", j3), zznVar);
                }
            }
            zzg(zznVar);
            if (i2 == 0) {
                zzc = zzgy().zzc(zznVar.packageName, "_f");
            } else {
                zzc = i2 == i ? zzgy().zzc(zznVar.packageName, "_v") : null;
            }
            if (zzc == null) {
                long j4 = ((j3 / 3600000) + 1) * 3600000;
                if (i2 == 0) {
                    str2 = "_et";
                    zzb(new zzjn("_fot", j3, Long.valueOf(j4), "auto"), zznVar);
                    if (this.zzj.zzad().zzt(zznVar.zzcg)) {
                        zzo();
                        this.zzj.zzht().zzat(zznVar.packageName);
                    }
                    zzo();
                    zzjj();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1L);
                    bundle3.putLong("_r", 1L);
                    bundle3.putLong("_uwa", 0L);
                    bundle3.putLong("_pfo", 0L);
                    bundle3.putLong("_sys", 0L);
                    String str4 = str;
                    bundle3.putLong(str4, 0L);
                    if (this.zzj.zzad().zzz(zznVar.packageName)) {
                        j2 = 1;
                        bundle3.putLong(str2, 1L);
                    } else {
                        j2 = 1;
                    }
                    if (zznVar.zzdt) {
                        bundle3.putLong("_dac", j2);
                    }
                    if (this.zzj.getContext().getPackageManager() == null) {
                        this.zzj.zzab().zzgk().zza("PackageManager is null, first open report might be inaccurate. appId", zzef.zzam(zznVar.packageName));
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(this.zzj.getContext()).getPackageInfo(zznVar.packageName, 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            this.zzj.zzab().zzgk().zza("Package info is null, first open report might be inaccurate. appId", zzef.zzam(zznVar.packageName), e2);
                            packageInfo = null;
                        }
                        if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                            str3 = str4;
                        } else {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1L);
                                z = false;
                            } else {
                                z = true;
                            }
                            str3 = str4;
                            zzb(new zzjn("_fi", j3, Long.valueOf(z ? 1L : 0L), "auto"), zznVar);
                        }
                        try {
                            applicationInfo = Wrappers.packageManager(this.zzj.getContext()).getApplicationInfo(zznVar.packageName, 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            this.zzj.zzab().zzgk().zza("Application info is null, first open report might be inaccurate. appId", zzef.zzam(zznVar.packageName), e3);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1L);
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                bundle3.putLong(str3, 1L);
                            }
                        }
                    }
                    zzx zzgy2 = zzgy();
                    String str5 = zznVar.packageName;
                    Preconditions.checkNotEmpty(str5);
                    zzgy2.zzo();
                    zzgy2.zzbi();
                    long zzj = zzgy2.zzj(str5, "first_open_count");
                    if (zzj >= 0) {
                        bundle3.putLong("_pfo", zzj);
                    }
                    zzc(new zzai("_f", new zzah(bundle3), "auto", j3), zznVar);
                } else {
                    str2 = "_et";
                    if (i2 == 1) {
                        zzb(new zzjn("_fvt", j3, Long.valueOf(j4), "auto"), zznVar);
                        zzo();
                        zzjj();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1L);
                        bundle4.putLong("_r", 1L);
                        if (this.zzj.zzad().zzz(zznVar.packageName)) {
                            j = 1;
                            bundle4.putLong(str2, 1L);
                        } else {
                            j = 1;
                        }
                        if (zznVar.zzdt) {
                            bundle4.putLong("_dac", j);
                        }
                        zzc(new zzai("_v", new zzah(bundle4), "auto", j3), zznVar);
                    }
                }
                if (!this.zzj.zzad().zze(zznVar.packageName, zzak.zzii)) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong(str2, 1L);
                    if (this.zzj.zzad().zzz(zznVar.packageName)) {
                        bundle5.putLong("_fr", 1L);
                    }
                    zzc(new zzai("_e", new zzah(bundle5), "auto", j3), zznVar);
                }
            } else if (zznVar.zzdq) {
                zzc(new zzai("_cd", new zzah(new Bundle()), "auto", j3), zznVar);
            }
            zzgy().setTransactionSuccessful();
        } finally {
            zzgy().endTransaction();
        }
    }

    private final zzn zzbi(String str) {
        zzf zzab = zzgy().zzab(str);
        if (zzab == null || TextUtils.isEmpty(zzab.zzal())) {
            this.zzj.zzab().zzgr().zza("No app data available; dropping", str);
            return null;
        }
        Boolean zzc = zzc(zzab);
        if (zzc != null && !zzc.booleanValue()) {
            this.zzj.zzab().zzgk().zza("App version does not match; dropping. appId", zzef.zzam(str));
            return null;
        }
        return new zzn(str, zzab.getGmpAppId(), zzab.zzal(), zzab.zzam(), zzab.zzan(), zzab.zzao(), zzab.zzap(), (String) null, zzab.isMeasurementEnabled(), false, zzab.getFirebaseInstanceId(), zzab.zzbd(), 0L, 0, zzab.zzbe(), zzab.zzbf(), false, zzab.zzah(), zzab.zzbg(), zzab.zzaq(), zzab.zzbh());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(zzq zzqVar) {
        zzn zzbi = zzbi(zzqVar.packageName);
        if (zzbi != null) {
            zzb(zzqVar, zzbi);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzq zzqVar, zzn zznVar) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.packageName);
        Preconditions.checkNotNull(zzqVar.origin);
        Preconditions.checkNotNull(zzqVar.zzdw);
        Preconditions.checkNotEmpty(zzqVar.zzdw.name);
        zzo();
        zzjj();
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            return;
        }
        if (!zznVar.zzcq) {
            zzg(zznVar);
            return;
        }
        zzq zzqVar2 = new zzq(zzqVar);
        boolean z = false;
        zzqVar2.active = false;
        zzgy().beginTransaction();
        try {
            zzq zzf = zzgy().zzf(zzqVar2.packageName, zzqVar2.zzdw.name);
            if (zzf != null && !zzf.origin.equals(zzqVar2.origin)) {
                this.zzj.zzab().zzgn().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzj.zzy().zzal(zzqVar2.zzdw.name), zzqVar2.origin, zzf.origin);
            }
            if (zzf != null && zzf.active) {
                zzqVar2.origin = zzf.origin;
                zzqVar2.creationTimestamp = zzf.creationTimestamp;
                zzqVar2.triggerTimeout = zzf.triggerTimeout;
                zzqVar2.triggerEventName = zzf.triggerEventName;
                zzqVar2.zzdy = zzf.zzdy;
                zzqVar2.active = zzf.active;
                zzqVar2.zzdw = new zzjn(zzqVar2.zzdw.name, zzf.zzdw.zztr, zzqVar2.zzdw.getValue(), zzf.zzdw.origin);
            } else if (TextUtils.isEmpty(zzqVar2.triggerEventName)) {
                zzqVar2.zzdw = new zzjn(zzqVar2.zzdw.name, zzqVar2.creationTimestamp, zzqVar2.zzdw.getValue(), zzqVar2.zzdw.origin);
                zzqVar2.active = true;
                z = true;
            }
            if (zzqVar2.active) {
                zzjn zzjnVar = zzqVar2.zzdw;
                zzjp zzjpVar = new zzjp(zzqVar2.packageName, zzqVar2.origin, zzjnVar.name, zzjnVar.zztr, zzjnVar.getValue());
                if (zzgy().zza(zzjpVar)) {
                    this.zzj.zzab().zzgr().zza("User property updated immediately", zzqVar2.packageName, this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
                } else {
                    this.zzj.zzab().zzgk().zza("(2)Too many active user properties, ignoring", zzef.zzam(zzqVar2.packageName), this.zzj.zzy().zzal(zzjpVar.name), zzjpVar.value);
                }
                if (z && zzqVar2.zzdy != null) {
                    zzd(new zzai(zzqVar2.zzdy, zzqVar2.creationTimestamp), zznVar);
                }
            }
            if (zzgy().zza(zzqVar2)) {
                this.zzj.zzab().zzgr().zza("Conditional property added", zzqVar2.packageName, this.zzj.zzy().zzal(zzqVar2.zzdw.name), zzqVar2.zzdw.getValue());
            } else {
                this.zzj.zzab().zzgk().zza("Too many conditional properties, ignoring", zzef.zzam(zzqVar2.packageName), this.zzj.zzy().zzal(zzqVar2.zzdw.name), zzqVar2.zzdw.getValue());
            }
            zzgy().setTransactionSuccessful();
        } finally {
            zzgy().endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzq zzqVar) {
        zzn zzbi = zzbi(zzqVar.packageName);
        if (zzbi != null) {
            zzc(zzqVar, zzbi);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzq zzqVar, zzn zznVar) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.packageName);
        Preconditions.checkNotNull(zzqVar.zzdw);
        Preconditions.checkNotEmpty(zzqVar.zzdw.name);
        zzo();
        zzjj();
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            return;
        }
        if (!zznVar.zzcq) {
            zzg(zznVar);
            return;
        }
        zzgy().beginTransaction();
        try {
            zzg(zznVar);
            zzq zzf = zzgy().zzf(zzqVar.packageName, zzqVar.zzdw.name);
            if (zzf != null) {
                this.zzj.zzab().zzgr().zza("Removing conditional user property", zzqVar.packageName, this.zzj.zzy().zzal(zzqVar.zzdw.name));
                zzgy().zzg(zzqVar.packageName, zzqVar.zzdw.name);
                if (zzf.active) {
                    zzgy().zzd(zzqVar.packageName, zzqVar.zzdw.name);
                }
                if (zzqVar.zzdz != null) {
                    zzd(this.zzj.zzz().zza(zzqVar.packageName, zzqVar.zzdz.name, zzqVar.zzdz.zzfq != null ? zzqVar.zzdz.zzfq.zzcv() : null, zzf.origin, zzqVar.zzdz.zzfu, true, false), zznVar);
                }
            } else {
                this.zzj.zzab().zzgn().zza("Conditional user property doesn't exist", zzef.zzam(zzqVar.packageName), this.zzj.zzy().zzal(zzqVar.zzdw.name));
            }
            zzgy().setTransactionSuccessful();
        } finally {
            zzgy().endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzf zzg(com.google.android.gms.measurement.internal.zzn r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjg.zzg(com.google.android.gms.measurement.internal.zzn):com.google.android.gms.measurement.internal.zzf");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzh(zzn zznVar) {
        try {
            return (String) this.zzj.zzaa().zza(new zzjk(this, zznVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzj.zzab().zzgk().zza("Failed to get app instance id. appId", zzef.zzam(zznVar.packageName), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(boolean z) {
        zzjn();
    }
}
