package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public class zzdvl implements zzbe, Closeable, Iterator<zzbb> {
    protected zzdvn zzhwt;
    protected zzba zzhww;
    private static final zzbb zzhwv = new zzdvo("eof ");
    private static zzdvt zzcp = zzdvt.zzn(zzdvl.class);
    private zzbb zzhwx = null;
    long zzhwy = 0;
    long zzbch = 0;
    long zzaqu = 0;
    private List<zzbb> zzhwz = new ArrayList();

    public final List<zzbb> zzbdc() {
        if (this.zzhwt != null && this.zzhwx != zzhwv) {
            return new zzdvr(this.zzhwz, this);
        }
        return this.zzhwz;
    }

    public void zza(zzdvn zzdvnVar, long j, zzba zzbaVar) throws IOException {
        this.zzhwt = zzdvnVar;
        long position = zzdvnVar.position();
        this.zzbch = position;
        this.zzhwy = position;
        zzdvnVar.zzew(zzdvnVar.position() + j);
        this.zzaqu = zzdvnVar.position();
        this.zzhww = zzbaVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbb zzbbVar = this.zzhwx;
        if (zzbbVar == zzhwv) {
            return false;
        }
        if (zzbbVar != null) {
            return true;
        }
        try {
            this.zzhwx = (zzbb) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzhwx = zzhwv;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: zzbdd */
    public final zzbb next() {
        zzbb zza;
        zzbb zzbbVar = this.zzhwx;
        if (zzbbVar != null && zzbbVar != zzhwv) {
            this.zzhwx = null;
            return zzbbVar;
        }
        zzdvn zzdvnVar = this.zzhwt;
        if (zzdvnVar == null || this.zzhwy >= this.zzaqu) {
            this.zzhwx = zzhwv;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzdvnVar) {
                this.zzhwt.zzew(this.zzhwy);
                zza = this.zzhww.zza(this.zzhwt, this);
                this.zzhwy = this.zzhwt.position();
            }
            return zza;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzhwz.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zzhwz.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zzhwt.close();
    }
}
