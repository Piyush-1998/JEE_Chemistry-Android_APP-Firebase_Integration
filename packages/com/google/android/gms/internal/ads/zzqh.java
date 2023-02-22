package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
final class zzqh implements Comparator<zzqn> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqh(zzqi zzqiVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzqn zzqnVar, zzqn zzqnVar2) {
        zzqn zzqnVar3 = zzqnVar;
        zzqn zzqnVar4 = zzqnVar2;
        int i = zzqnVar3.zzbqf - zzqnVar4.zzbqf;
        return i != 0 ? i : (int) (zzqnVar3.value - zzqnVar4.value);
    }
}
