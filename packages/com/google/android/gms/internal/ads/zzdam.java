package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzdam {
    private final String className;
    private final zzdap zzgor;
    private zzdap zzgos;
    private boolean zzgot;

    private zzdam(String str) {
        zzdap zzdapVar = new zzdap();
        this.zzgor = zzdapVar;
        this.zzgos = zzdapVar;
        this.zzgot = false;
        this.className = (String) zzdaq.checkNotNull(str);
    }

    public final zzdam zzy(@NullableDecl Object obj) {
        zzdap zzdapVar = new zzdap();
        this.zzgos.zzgou = zzdapVar;
        this.zzgos = zzdapVar;
        zzdapVar.value = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzdap zzdapVar = this.zzgor.zzgou;
        String str = "";
        while (zzdapVar != null) {
            Object obj = zzdapVar.value;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzdapVar = zzdapVar.zzgou;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
