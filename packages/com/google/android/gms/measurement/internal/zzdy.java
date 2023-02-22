package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdy extends zzg {
    private String zzce;
    private String zzcg;
    private String zzcm;
    private String zzco;
    private long zzcr;
    private String zzcu;
    private List<String> zzcw;
    private int zzds;
    private int zzjr;
    private String zzjs;
    private long zzjt;
    private long zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdy(zzfj zzfjVar, long j) {
        super(zzfjVar);
        this.zzs = j;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzbk() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(6:85|86|(1:88)(2:103|(1:105))|89|90|(24:92|(1:94)(1:101)|96|97|5|(1:84)(1:9)|10|(1:83)(1:14)|15|(1:(1:18)(1:19))|(2:21|(2:23|(1:25))(1:(1:(13:36|37|(1:41)|42|43|(1:45)(1:79)|46|(1:48)|(1:50)|52|(3:54|(3:56|(1:58)(3:60|(3:63|(1:65)|61)|66)|59)(0)|(1:68))|69|(1:(2:72|73)(2:75|76))(2:77|78))(1:35))(2:29|(1:31))))|82|37|(2:39|41)|42|43|(0)(0)|46|(0)|(0)|52|(0)|69|(0)(0)))|4|5|(1:7)|84|10|(1:12)|83|15|(0)|(0)|82|37|(0)|42|43|(0)(0)|46|(0)|(0)|52|(0)|69|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cc, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cd, code lost:
        zzab().zzgk().zza("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzef.zzam(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a7 A[Catch: IllegalStateException -> 0x01cc, TryCatch #3 {IllegalStateException -> 0x01cc, blocks: (B:66:0x0193, B:70:0x019f, B:72:0x01a7, B:74:0x01ba), top: B:109:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba A[Catch: IllegalStateException -> 0x01cc, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x01cc, blocks: (B:66:0x0193, B:70:0x019f, B:72:0x01a7, B:74:0x01ba), top: B:109:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023a  */
    @Override // com.google.android.gms.measurement.internal.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzbl() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdy.zzbl():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzn zzai(String str) {
        Boolean zzj;
        zzo();
        zzm();
        String zzag = zzag();
        String gmpAppId = getGmpAppId();
        zzbi();
        String str2 = this.zzcm;
        long zzgf = zzgf();
        zzbi();
        String str3 = this.zzco;
        long zzao = zzad().zzao();
        zzbi();
        zzo();
        if (this.zzjt == 0) {
            this.zzjt = this.zzj.zzz().zzc(getContext(), getContext().getPackageName());
        }
        long j = this.zzjt;
        boolean isEnabled = this.zzj.isEnabled();
        boolean z = !zzac().zzmc;
        zzo();
        zzm();
        String zzge = !this.zzj.isEnabled() ? null : zzge();
        zzbi();
        long j2 = this.zzcr;
        long zzic = this.zzj.zzic();
        int zzgg = zzgg();
        boolean booleanValue = zzad().zzbr().booleanValue();
        zzs zzad = zzad();
        zzad.zzm();
        Boolean zzj2 = zzad.zzj("google_analytics_ssaid_collection_enabled");
        return new zzn(zzag, gmpAppId, str2, zzgf, str3, zzao, j, str, isEnabled, z, zzge, j2, zzic, zzgg, booleanValue, Boolean.valueOf(zzj2 == null || zzj2.booleanValue()).booleanValue(), zzac().zzhi(), zzah(), (!zzad().zze(zzag(), zzak.zzij) || (zzj = zzad().zzj("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : Boolean.valueOf(!zzj.booleanValue()), this.zzs, zzad().zze(zzag(), zzak.zzix) ? this.zzcw : null);
    }

    private final String zzge() {
        try {
            Class<?> loadClass = getContext().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, getContext());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzab().zzgp().zzao("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzab().zzgo().zzao("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzag() {
        zzbi();
        return this.zzce;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getGmpAppId() {
        zzbi();
        return this.zzcg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzah() {
        zzbi();
        return this.zzcu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzgf() {
        zzbi();
        return this.zzjr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzgg() {
        zzbi();
        return this.zzds;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> zzbh() {
        return this.zzcw;
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
