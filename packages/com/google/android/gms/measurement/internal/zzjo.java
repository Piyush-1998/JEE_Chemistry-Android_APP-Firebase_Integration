package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class zzjo extends zzjh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjo(zzjg zzjgVar) {
        super(zzjgVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    protected final boolean zzbk() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbs.zzk.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzqz().zzra().zzrb();
        if (obj instanceof String) {
            zzaVar.zzdc((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zzbl(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zzc(((Double) obj).doubleValue());
        } else {
            zzab().zzgk().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbs.zze.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzmu().zzmv().zzmw();
        if (obj instanceof String) {
            zzaVar.zzca((String) obj);
        } else if (obj instanceof Long) {
            zzaVar.zzam(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzab().zzgk().zza("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbs.zze zza(zzbs.zzc zzcVar, String str) {
        for (zzbs.zze zzeVar : zzcVar.zzmj()) {
            if (zzeVar.getName().equals(str)) {
                return zzeVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzb(zzbs.zzc zzcVar, String str) {
        zzbs.zze zza = zza(zzcVar, str);
        if (zza != null) {
            if (zza.zzmx()) {
                return zza.zzmy();
            }
            if (zza.zzna()) {
                return Long.valueOf(zza.zznb());
            }
            if (zza.zznd()) {
                return Double.valueOf(zza.zzne());
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzbs.zzc.zza zzaVar, String str, Object obj) {
        List<zzbs.zze> zzmj = zzaVar.zzmj();
        int i = 0;
        while (true) {
            if (i >= zzmj.size()) {
                i = -1;
                break;
            } else if (str.equals(zzmj.get(i).getName())) {
                break;
            } else {
                i++;
            }
        }
        zzbs.zze.zza zzbz = zzbs.zze.zzng().zzbz(str);
        if (obj instanceof Long) {
            zzbz.zzam(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzbz.zzca((String) obj);
        } else if (obj instanceof Double) {
            zzbz.zza(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            zzaVar.zza(i, zzbz);
        } else {
            zzaVar.zza(zzbz);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzbs.zzf zzfVar) {
        List<zzbs.zze> zzmj;
        if (zzfVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzbs.zzg zzgVar : zzfVar.zzni()) {
            if (zzgVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzgVar.zznx()) {
                    zza(sb, 1, "protocol_version", Integer.valueOf(zzgVar.zzny()));
                }
                zza(sb, 1, "platform", zzgVar.zzom());
                if (zzgVar.zzoq()) {
                    zza(sb, 1, "gmp_version", Long.valueOf(zzgVar.zzao()));
                }
                if (zzgVar.zzor()) {
                    zza(sb, 1, "uploading_gmp_version", Long.valueOf(zzgVar.zzos()));
                }
                if (zzgVar.zzpq()) {
                    zza(sb, 1, "dynamite_version", Long.valueOf(zzgVar.zzaq()));
                }
                if (zzgVar.zzpi()) {
                    zza(sb, 1, "config_version", Long.valueOf(zzgVar.zzpj()));
                }
                zza(sb, 1, "gmp_app_id", zzgVar.getGmpAppId());
                zza(sb, 1, "admob_app_id", zzgVar.zzpp());
                zza(sb, 1, "app_id", zzgVar.zzag());
                zza(sb, 1, "app_version", zzgVar.zzal());
                if (zzgVar.zzpf()) {
                    zza(sb, 1, "app_version_major", Integer.valueOf(zzgVar.zzpg()));
                }
                zza(sb, 1, "firebase_instance_id", zzgVar.getFirebaseInstanceId());
                if (zzgVar.zzow()) {
                    zza(sb, 1, "dev_cert_hash", Long.valueOf(zzgVar.zzap()));
                }
                zza(sb, 1, "app_store", zzgVar.zzan());
                if (zzgVar.zzoc()) {
                    zza(sb, 1, "upload_timestamp_millis", Long.valueOf(zzgVar.zzod()));
                }
                if (zzgVar.zzoe()) {
                    zza(sb, 1, "start_timestamp_millis", Long.valueOf(zzgVar.zznq()));
                }
                if (zzgVar.zzof()) {
                    zza(sb, 1, "end_timestamp_millis", Long.valueOf(zzgVar.zznr()));
                }
                if (zzgVar.zzog()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgVar.zzoh()));
                }
                if (zzgVar.zzoj()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgVar.zzok()));
                }
                zza(sb, 1, "app_instance_id", zzgVar.getAppInstanceId());
                zza(sb, 1, "resettable_device_id", zzgVar.zzot());
                zza(sb, 1, "device_id", zzgVar.zzph());
                zza(sb, 1, "ds_id", zzgVar.zzpl());
                if (zzgVar.zzou()) {
                    zza(sb, 1, "limited_ad_tracking", Boolean.valueOf(zzgVar.zzov()));
                }
                zza(sb, 1, "os_version", zzgVar.getOsVersion());
                zza(sb, 1, "device_model", zzgVar.zzon());
                zza(sb, 1, "user_default_language", zzgVar.zzcr());
                if (zzgVar.zzoo()) {
                    zza(sb, 1, "time_zone_offset_minutes", Integer.valueOf(zzgVar.zzop()));
                }
                if (zzgVar.zzox()) {
                    zza(sb, 1, "bundle_sequential_index", Integer.valueOf(zzgVar.zzoy()));
                }
                if (zzgVar.zzpb()) {
                    zza(sb, 1, "service_upload", Boolean.valueOf(zzgVar.zzpc()));
                }
                zza(sb, 1, "health_monitor", zzgVar.zzoz());
                if (zzgVar.zzpk() && zzgVar.zzbd() != 0) {
                    zza(sb, 1, "android_id", Long.valueOf(zzgVar.zzbd()));
                }
                if (zzgVar.zzpn()) {
                    zza(sb, 1, "retry_counter", Integer.valueOf(zzgVar.zzpo()));
                }
                List<zzbs.zzk> zzno = zzgVar.zzno();
                int i = 2;
                if (zzno != null) {
                    for (zzbs.zzk zzkVar : zzno) {
                        if (zzkVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zzkVar.zzqs() ? Long.valueOf(zzkVar.zzqt()) : null);
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzy().zzal(zzkVar.getName()));
                            zza(sb, 2, "string_value", zzkVar.zzmy());
                            zza(sb, 2, "int_value", zzkVar.zzna() ? Long.valueOf(zzkVar.zznb()) : null);
                            zza(sb, 2, "double_value", zzkVar.zznd() ? Double.valueOf(zzkVar.zzne()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzbs.zza> zzpd = zzgVar.zzpd();
                String zzag = zzgVar.zzag();
                if (zzpd != null) {
                    for (zzbs.zza zzaVar : zzpd) {
                        if (zzaVar != null) {
                            zza(sb, i);
                            sb.append("audience_membership {\n");
                            if (zzaVar.zzly()) {
                                zza(sb, i, "audience_id", Integer.valueOf(zzaVar.zzlz()));
                            }
                            if (zzaVar.zzma()) {
                                zza(sb, i, "new_audience", Boolean.valueOf(zzaVar.zzmb()));
                            }
                            zza(sb, 2, "current_data", zzaVar.zzlv(), zzag);
                            zza(sb, 2, "previous_data", zzaVar.zzlx(), zzag);
                            zza(sb, 2);
                            sb.append("}\n");
                            i = 2;
                        }
                    }
                }
                List<zzbs.zzc> zznl = zzgVar.zznl();
                if (zznl != null) {
                    for (zzbs.zzc zzcVar : zznl) {
                        if (zzcVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, zzy().zzaj(zzcVar.getName()));
                            if (zzcVar.zzml()) {
                                zza(sb, 2, "timestamp_millis", Long.valueOf(zzcVar.getTimestampMillis()));
                            }
                            if (zzcVar.zzmo()) {
                                zza(sb, 2, "previous_timestamp_millis", Long.valueOf(zzcVar.zzmm()));
                            }
                            if (zzcVar.zzmp()) {
                                zza(sb, 2, "count", Integer.valueOf(zzcVar.getCount()));
                            }
                            if (zzcVar.zzmk() != 0 && (zzmj = zzcVar.zzmj()) != null) {
                                for (zzbs.zze zzeVar : zzmj) {
                                    if (zzeVar != null) {
                                        zza(sb, 3);
                                        sb.append("param {\n");
                                        zza(sb, 3, AppMeasurementSdk.ConditionalUserProperty.NAME, zzy().zzak(zzeVar.getName()));
                                        zza(sb, 3, "string_value", zzeVar.zzmy());
                                        zza(sb, 3, "int_value", zzeVar.zzna() ? Long.valueOf(zzeVar.zznb()) : null);
                                        zza(sb, 3, "double_value", zzeVar.zznd() ? Double.valueOf(zzeVar.zzne()) : null);
                                        zza(sb, 3);
                                        sb.append("}\n");
                                    }
                                }
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzbk.zza zzaVar) {
        if (zzaVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzaVar.zzkb()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzaVar.getId()));
        }
        zza(sb, 0, "event_name", zzy().zzaj(zzaVar.zzjz()));
        String zza = zza(zzaVar.zzkf(), zzaVar.zzkg(), zzaVar.zzki());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        zza(sb, 1, "event_count_filter", zzaVar.zzke());
        sb.append("  filters {\n");
        for (zzbk.zzb zzbVar : zzaVar.zzkc()) {
            zza(sb, 2, zzbVar);
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza(zzbk.zzd zzdVar) {
        if (zzdVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzdVar.zzkb()) {
            zza(sb, 0, "filter_id", Integer.valueOf(zzdVar.getId()));
        }
        zza(sb, 0, "property_name", zzy().zzal(zzdVar.getPropertyName()));
        String zza = zza(zzdVar.zzkf(), zzdVar.zzkg(), zzdVar.zzki());
        if (!zza.isEmpty()) {
            zza(sb, 0, "filter_type", zza);
        }
        zza(sb, 1, zzdVar.zzli());
        sb.append("}\n");
        return sb.toString();
    }

    private static String zza(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void zza(StringBuilder sb, int i, String str, zzbs.zzi zziVar, String str2) {
        if (zziVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziVar.zzpz() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zziVar.zzpy()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zziVar.zzpw() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zziVar.zzpv()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzad().zzq(str2)) {
            if (zziVar.zzqc() != 0) {
                zza(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzbs.zzb zzbVar : zziVar.zzqb()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzbVar.zzme() ? Integer.valueOf(zzbVar.getIndex()) : null);
                    sb.append(":");
                    sb.append(zzbVar.zzmf() ? Long.valueOf(zzbVar.zzmg()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zziVar.zzqf() != 0) {
                zza(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzbs.zzj zzjVar : zziVar.zzqe()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(zzjVar.zzme() ? Integer.valueOf(zzjVar.getIndex()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long l3 : zzjVar.zzqk()) {
                        long longValue = l3.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, String str, zzbk.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzcVar.zzku()) {
            zza(sb, i, "comparison_type", zzcVar.zzkv().name());
        }
        if (zzcVar.zzkw()) {
            zza(sb, i, "match_as_float", Boolean.valueOf(zzcVar.zzkx()));
        }
        zza(sb, i, "comparison_value", zzcVar.zzkz());
        zza(sb, i, "min_comparison_value", zzcVar.zzlb());
        zza(sb, i, "max_comparison_value", zzcVar.zzld());
        zza(sb, i);
        sb.append("}\n");
    }

    private final void zza(StringBuilder sb, int i, zzbk.zzb zzbVar) {
        if (zzbVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzbVar.zzkp()) {
            zza(sb, i, "complement", Boolean.valueOf(zzbVar.zzkq()));
        }
        zza(sb, i, "param_name", zzy().zzak(zzbVar.zzkr()));
        int i2 = i + 1;
        zzbk.zze zzkm = zzbVar.zzkm();
        if (zzkm != null) {
            zza(sb, i2);
            sb.append("string_filter");
            sb.append(" {\n");
            if (zzkm.zzlk()) {
                zza(sb, i2, "match_type", zzkm.zzll().name());
            }
            zza(sb, i2, "expression", zzkm.zzln());
            if (zzkm.zzlo()) {
                zza(sb, i2, "case_sensitive", Boolean.valueOf(zzkm.zzlp()));
            }
            if (zzkm.zzlr() > 0) {
                zza(sb, i2 + 1);
                sb.append("expression_list {\n");
                for (String str : zzkm.zzlq()) {
                    zza(sb, i2 + 2);
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("}\n");
            }
            zza(sb, i2);
            sb.append("}\n");
        }
        zza(sb, i2, "number_filter", zzbVar.zzko());
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzab().zzgk().zzao("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze(zzai zzaiVar, zzn zznVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotNull(zznVar);
        if (TextUtils.isEmpty(zznVar.zzcg) && TextUtils.isEmpty(zznVar.zzcu)) {
            zzae();
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbj(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzab().zzgn().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzab().zzgn().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(zzx().currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzz().zzo();
        MessageDigest messageDigest = zzjs.getMessageDigest();
        if (messageDigest == null) {
            zzab().zzgk().zzao("Failed to get MD5");
            return 0L;
        }
        return zzjs.zzd(messageDigest.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            zzab().zzgk().zza("Failed to ungzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            zzab().zzgk().zza("Failed to gzip content", e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Integer> zzju() {
        Map<String, String> zzk = zzak.zzk(this.zzkz.getContext());
        if (zzk == null || zzk.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzak.zzhr.get(null).intValue();
        for (Map.Entry<String, String> entry : zzk.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzab().zzgn().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    zzab().zzgn().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
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
