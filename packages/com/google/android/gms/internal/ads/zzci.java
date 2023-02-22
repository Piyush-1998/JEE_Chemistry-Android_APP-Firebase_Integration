package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@18.2.0 */
/* loaded from: classes.dex */
public final class zzci {
    private static boolean zznt = false;
    private static MessageDigest zznu;
    private static final Object zznv = new Object();
    private static final Object zznw = new Object();
    static CountDownLatch zznx = new CountDownLatch(1);

    public static void zzbx() {
        synchronized (zznw) {
            if (!zznt) {
                zznt = true;
                new Thread(new zzck()).start();
            }
        }
    }

    private static MessageDigest zzby() {
        boolean z;
        MessageDigest messageDigest;
        zzbx();
        try {
            z = zznx.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = zznu) != null) {
            return messageDigest;
        }
        return null;
    }

    public static String zzj(zzbo.zza zzaVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zza;
        byte[] byteArray = zzaVar.toByteArray();
        if (!((Boolean) zzuv.zzon().zzd(zzza.zzcni)).booleanValue()) {
            if (zzed.zzyo == null) {
                throw new GeneralSecurityException();
            }
            zza = ((zzbo.zzg) ((zzdqw) zzbo.zzg.zzbj().zzm(zzdpm.zzy(zzed.zzyo.zzc(byteArray, str != null ? str.getBytes() : new byte[0]))).zza(zzbv.TINK_HYBRID).zzazr())).toByteArray();
        } else {
            Vector<byte[]> zza2 = zza(byteArray, 255);
            if (zza2 == null || zza2.size() == 0) {
                zza = zza(zza(zzbo.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray(), str, true);
            } else {
                zzbo.zzg.zza zzbj = zzbo.zzg.zzbj();
                Iterator<byte[]> it = zza2.iterator();
                while (it.hasNext()) {
                    zzbj.zzm(zzdpm.zzy(zza(it.next(), str, false)));
                }
                zzbj.zzn(zzdpm.zzy(zzb(byteArray)));
                zza = ((zzbo.zzg) ((zzdqw) zzbj.zzazr())).toByteArray();
            }
        }
        return zzcg.zza(zza, true);
    }

    private static Vector<byte[]> zza(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static zzbo.zza zza(zzbo.zza.zzd zzdVar) {
        zzbo.zza.zzb zzal = zzbo.zza.zzal();
        zzal.zzau(zzdVar.zzab());
        return (zzbo.zza) ((zzdqw) zzal.zzazr());
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zza(zzbo.zza.zzd.PSN_ENCODE_SIZE_FAIL).toByteArray();
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[i - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zzb(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (zzcl zzclVar : new zzcj().zzvl) {
            zzclVar.zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzdpc(str.getBytes("UTF-8")).zzx(bArr3);
        }
        return bArr3;
    }

    public static byte[] zzb(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zznv) {
            MessageDigest zzby = zzby();
            if (zzby == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            zzby.reset();
            zzby.update(bArr);
            digest = zznu.digest();
        }
        return digest;
    }

    public static String zza(String str, String str2, boolean z) {
        byte[] zzb = zzb(str, str2, true);
        if (zzb != null) {
            return zzcg.zza(zzb, true);
        }
        return Integer.toString(7);
    }

    private static byte[] zzb(String str, String str2, boolean z) {
        byte[] zza;
        zzbo.zzc.zza zzav = zzbo.zzc.zzav();
        try {
            if (str.length() < 3) {
                zza = str.getBytes("ISO-8859-1");
            } else {
                zza = zzcg.zza(str, true);
            }
            zzav.zzg(zzdpm.zzy(zza));
            zzav.zzh(zzdpm.zzy(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : zzcg.zza(str2, true)));
            return ((zzbo.zzc) ((zzdqw) zzav.zzazr())).toByteArray();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }
}
