package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzhv extends zzg {
    private final zzin zzre;
    private zzdx zzrf;
    private volatile Boolean zzrg;
    private final zzaa zzrh;
    private final zzjd zzri;
    private final List<Runnable> zzrj;
    private final zzaa zzrk;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzhv(zzfj zzfjVar) {
        super(zzfjVar);
        this.zzrj = new ArrayList();
        this.zzri = new zzjd(zzfjVar.zzx());
        this.zzre = new zzin(this);
        this.zzrh = new zzhu(this, zzfjVar);
        this.zzrk = new zzif(this, zzfjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzbk() {
        return false;
    }

    public final boolean isConnected() {
        zzo();
        zzbi();
        return this.zzrf != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzip() {
        zzo();
        zzbi();
        zzd(new zzie(this, zzi(true)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzdx zzdxVar, AbstractSafeParcelable abstractSafeParcelable, zzn zznVar) {
        int i;
        List<AbstractSafeParcelable> zzc;
        zzo();
        zzm();
        zzbi();
        boolean zziq = zziq();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zziq || (zzc = zzu().zzc(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(zzc);
                i = zzc.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzai) {
                    try {
                        zzdxVar.zza((zzai) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e) {
                        zzab().zzgk().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzjn) {
                    try {
                        zzdxVar.zza((zzjn) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e2) {
                        zzab().zzgk().zza("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzq) {
                    try {
                        zzdxVar.zza((zzq) abstractSafeParcelable2, zznVar);
                    } catch (RemoteException e3) {
                        zzab().zzgk().zza("Failed to send conditional property to the service", e3);
                    }
                } else {
                    zzab().zzgk().zzao("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzc(zzai zzaiVar, String str) {
        Preconditions.checkNotNull(zzaiVar);
        zzo();
        zzbi();
        boolean zziq = zziq();
        zzd(new zzih(this, zziq, zziq && zzu().zza(zzaiVar), zzaiVar, zzi(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        zzo();
        zzbi();
        zzae();
        zzd(new zzig(this, true, zzu().zzc(zzqVar), new zzq(zzqVar), zzi(true), zzqVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzq>> atomicReference, String str, String str2, String str3) {
        zzo();
        zzbi();
        zzd(new zzij(this, atomicReference, str, str2, str3, zzi(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzp zzpVar, String str, String str2) {
        zzo();
        zzbi();
        zzd(new zzii(this, str, str2, zzi(false), zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzjn>> atomicReference, String str, String str2, String str3, boolean z) {
        zzo();
        zzbi();
        zzd(new zzil(this, atomicReference, str, str2, str3, z, zzi(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(com.google.android.gms.internal.measurement.zzp zzpVar, String str, String str2, boolean z) {
        zzo();
        zzbi();
        zzd(new zzik(this, str, str2, z, zzi(false), zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(zzjn zzjnVar) {
        zzo();
        zzbi();
        zzd(new zzhx(this, zziq() && zzu().zza(zzjnVar), zzjnVar, zzi(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzjn>> atomicReference, boolean z) {
        zzo();
        zzbi();
        zzd(new zzhw(this, atomicReference, zzi(false), z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void resetAnalyticsData() {
        zzo();
        zzm();
        zzbi();
        zzn zzi = zzi(false);
        if (zziq()) {
            zzu().resetAnalyticsData();
        }
        zzd(new zzhz(this, zzi));
    }

    private final boolean zziq() {
        zzae();
        return true;
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzo();
        zzbi();
        zzd(new zzhy(this, atomicReference, zzi(false)));
    }

    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzp zzpVar) {
        zzo();
        zzbi();
        zzd(new zzib(this, zzi(false), zzpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzim() {
        zzo();
        zzbi();
        zzn zzi = zzi(true);
        boolean zza = zzad().zza(zzak.zzjd);
        if (zza) {
            zzu().zzgh();
        }
        zzd(new zzia(this, zzi, zza));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzhr zzhrVar) {
        zzo();
        zzbi();
        zzd(new zzid(this, zzhrVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzir() {
        zzo();
        this.zzri.start();
        this.zzrh.zzv(zzak.zzhl.get(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzis() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhv.zzis():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzit() {
        return this.zzrg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(zzdx zzdxVar) {
        zzo();
        Preconditions.checkNotNull(zzdxVar);
        this.zzrf = zzdxVar;
        zzir();
        zziv();
    }

    public final void disconnect() {
        zzo();
        zzbi();
        this.zzre.zziw();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzre);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzrf = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(ComponentName componentName) {
        zzo();
        if (this.zzrf != null) {
            this.zzrf = null;
            zzab().zzgs().zza("Disconnected from device MeasurementService", componentName);
            zzo();
            zzis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zziu() {
        zzo();
        if (isConnected()) {
            zzab().zzgs().zzao("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    private final void zzd(Runnable runnable) throws IllegalStateException {
        zzo();
        if (isConnected()) {
            runnable.run();
        } else if (this.zzrj.size() >= 1000) {
            zzab().zzgk().zzao("Discarding data. Max runnable queue size reached");
        } else {
            this.zzrj.add(runnable);
            this.zzrk.zzv(60000L);
            zzis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zziv() {
        zzo();
        zzab().zzgs().zza("Processing queued up service tasks", Integer.valueOf(this.zzrj.size()));
        for (Runnable runnable : this.zzrj) {
            try {
                runnable.run();
            } catch (Exception e) {
                zzab().zzgk().zza("Task exception while flushing queue", e);
            }
        }
        this.zzrj.clear();
        this.zzrk.cancel();
    }

    private final zzn zzi(boolean z) {
        zzae();
        return zzr().zzai(z ? zzab().zzgu() : null);
    }

    public final void zza(com.google.android.gms.internal.measurement.zzp zzpVar, zzai zzaiVar, String str) {
        zzo();
        zzbi();
        if (zzz().zzd(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzab().zzgn().zzao("Not bundling data. Service unavailable or out of date");
            zzz().zza(zzpVar, new byte[0]);
            return;
        }
        zzd(new zzic(this, zzaiVar, str, zzpVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzl() {
        super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzm() {
        super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzn() {
        super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgf
    public final /* bridge */ /* synthetic */ void zzo() {
        super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzgp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzdy zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhv zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhq zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeb zzu() {
        return super.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziw zzv() {
        return super.zzv();
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
