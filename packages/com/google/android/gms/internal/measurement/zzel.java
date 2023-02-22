package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.zzey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class zzel {
    private static volatile boolean zzaer = false;
    private static volatile zzel zzaet;
    private static volatile zzel zzaeu;
    private final Map<zza, zzey.zze<?, ?>> zzaew;
    private static final Class<?> zzaes = zzto();
    static final zzel zzaev = new zzel(true);

    private static Class<?> zzto() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }
    }

    public static zzel zztp() {
        zzel zzelVar = zzaet;
        if (zzelVar == null) {
            synchronized (zzel.class) {
                zzelVar = zzaet;
                if (zzelVar == null) {
                    zzelVar = zzej.zztm();
                    zzaet = zzelVar;
                }
            }
        }
        return zzelVar;
    }

    public static zzel zztq() {
        zzel zzelVar = zzaeu;
        if (zzelVar == null) {
            synchronized (zzel.class) {
                zzelVar = zzaeu;
                if (zzelVar == null) {
                    zzelVar = zzej.zztn();
                    zzaeu = zzelVar;
                }
            }
        }
        return zzelVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzel zztn() {
        return zzex.zzc(zzel.class);
    }

    public final <ContainingType extends zzgi> zzey.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzey.zze<ContainingType, ?>) this.zzaew.get(new zza(containingtype, i));
    }

    zzel() {
        this.zzaew = new HashMap();
    }

    private zzel(boolean z) {
        this.zzaew = Collections.emptyMap();
    }
}
