package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzctf implements zzcru<zzctg> {
    List<String> zzdjf;
    private zzddl zzfoa;
    zzym zzghj;

    public zzctf(zzym zzymVar, zzddl zzddlVar, List<String> list) {
        this.zzghj = zzymVar;
        this.zzfoa = zzddlVar;
        this.zzdjf = list;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final zzddi<zzctg> zzalv() {
        return this.zzfoa.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcti
            private final zzctf zzghk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghk = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzctf zzctfVar = this.zzghk;
                return new zzctg(zzctfVar.zzghj.zzd(zzctfVar.zzdjf));
            }
        });
    }
}
