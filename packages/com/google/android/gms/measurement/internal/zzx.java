package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzx extends zzjh {
    private static final String[] zzek = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzel = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzem = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"};
    private static final String[] zzen = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzeo = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzep = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzeq = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzer = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzy zzes;
    private final zzjd zzet;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzjg zzjgVar) {
        super(zzjgVar);
        this.zzet = new zzjd(zzx());
        this.zzes = new zzy(this, getContext(), "google_app_measurement.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    protected final boolean zzbk() {
        return false;
    }

    public final void beginTransaction() {
        zzbi();
        getWritableDatabase().beginTransaction();
    }

    public final void setTransactionSuccessful() {
        zzbi();
        getWritableDatabase().setTransactionSuccessful();
    }

    public final void endTransaction() {
        zzbi();
        getWritableDatabase().endTransaction();
    }

    private final long zza(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = getWritableDatabase().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase getWritableDatabase() {
        zzo();
        try {
            return this.zzes.getWritableDatabase();
        } catch (SQLiteException e) {
            zzab().zzgn().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzo();
        zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaeVar.zzce);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzaeVar.name);
        contentValues.put("lifetime_count", Long.valueOf(zzaeVar.zzfg));
        contentValues.put("current_bundle_count", Long.valueOf(zzaeVar.zzfh));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaeVar.zzfj));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaeVar.zzfk));
        contentValues.put("last_bundled_day", zzaeVar.zzfl);
        contentValues.put("last_sampled_complex_event_id", zzaeVar.zzfm);
        contentValues.put("last_sampling_rate", zzaeVar.zzfn);
        if (zzad().zze(zzaeVar.zzce, zzak.zziz)) {
            contentValues.put("current_session_count", Long.valueOf(zzaeVar.zzfi));
        }
        contentValues.put("last_exempt_from_sampling", (zzaeVar.zzfo == null || !zzaeVar.zzfo.booleanValue()) ? null : 1L);
        try {
            if (getWritableDatabase().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update event aggregates (got -1). appId", zzef.zzam(zzaeVar.zzce));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing event aggregates. appId", zzef.zzam(zzaeVar.zzce), e);
        }
    }

    public final void zzd(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        try {
            zzab().zzgs().zza("Deleted user attribute rows", Integer.valueOf(getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting user attribute. appId", zzef.zzam(str), zzy().zzal(str2), e);
        }
    }

    public final boolean zza(zzjp zzjpVar) {
        Preconditions.checkNotNull(zzjpVar);
        zzo();
        zzbi();
        if (zze(zzjpVar.zzce, zzjpVar.name) == null) {
            if (zzjs.zzbk(zzjpVar.name)) {
                if (zza("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzjpVar.zzce}) >= 25) {
                    return false;
                }
            } else if (zzad().zze(zzjpVar.zzce, zzak.zzij)) {
                if (!"_npa".equals(zzjpVar.name) && zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzjpVar.zzce, zzjpVar.origin}) >= 25) {
                    return false;
                }
            } else if (zza("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzjpVar.zzce, zzjpVar.origin}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjpVar.zzce);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzjpVar.origin);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzjpVar.name);
        contentValues.put("set_timestamp", Long.valueOf(zzjpVar.zztr));
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzjpVar.value);
        try {
            if (getWritableDatabase().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update user property (got -1). appId", zzef.zzam(zzjpVar.zzce));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing user property. appId", zzef.zzam(zzjpVar.zzce), e);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzjp zze(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzo()
            r18.zzbi()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r11 = "user_attributes"
            r0 = 3
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "set_timestamp"
            r1 = 0
            r12[r1] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "value"
            r2 = 1
            r12[r2] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r0 = "origin"
            r3 = 2
            r12[r3] = r0     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r1] = r19     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r14[r2] = r8     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L83 android.database.sqlite.SQLiteException -> L87
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            if (r0 != 0) goto L44
            if (r10 == 0) goto L43
            r10.close()
        L43:
            return r9
        L44:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7f
            r11 = r18
            java.lang.Object r7 = r11.zza(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r3 = r10.getString(r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzjp r0 = new com.google.android.gms.measurement.internal.zzjp     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.zzef r1 = r18.zzab()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzef.zzam(r19)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
            r1.zza(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> Laa
        L73:
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r0
        L79:
            r0 = move-exception
            goto L8b
        L7b:
            r0 = move-exception
            r11 = r18
            goto Lab
        L7f:
            r0 = move-exception
            r11 = r18
            goto L8b
        L83:
            r0 = move-exception
            r11 = r18
            goto Lac
        L87:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L8b:
            com.google.android.gms.measurement.internal.zzef r1 = r18.zzab()     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzgk()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzef.zzam(r19)     // Catch: java.lang.Throwable -> Laa
            com.google.android.gms.measurement.internal.zzed r4 = r18.zzy()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r4 = r4.zzal(r8)     // Catch: java.lang.Throwable -> Laa
            r1.zza(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Laa
            if (r10 == 0) goto La9
            r10.close()
        La9:
            return r9
        Laa:
            r0 = move-exception
        Lab:
            r9 = r10
        Lac:
            if (r9 == 0) goto Lb1
            r9.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzjp");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzjp> zzaa(java.lang.String r23) {
        /*
            r22 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23)
            r22.zzo()
            r22.zzbi()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r22.getWritableDatabase()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r6[r11] = r23     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> L99
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L48
            if (r2 == 0) goto L47
            r2.close()
        L47:
            return r0
        L48:
            java.lang.String r18 = r2.getString(r11)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = r2.getString(r12)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            if (r3 != 0) goto L54
            java.lang.String r3 = ""
        L54:
            r17 = r3
            long r19 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L8d android.database.sqlite.SQLiteException -> L91
            r3 = r22
            java.lang.Object r21 = r3.zza(r2, r14)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r21 != 0) goto L74
            com.google.android.gms.measurement.internal.zzef r4 = r22.zzab()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            java.lang.String r5 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzef.zzam(r23)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r4.zza(r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            goto L7f
        L74:
            com.google.android.gms.measurement.internal.zzjp r4 = new com.google.android.gms.measurement.internal.zzjp     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r15 = r4
            r16 = r23
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
        L7f:
            boolean r4 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L8b java.lang.Throwable -> Lb4
            if (r4 != 0) goto L48
            if (r2 == 0) goto L8a
            r2.close()
        L8a:
            return r0
        L8b:
            r0 = move-exception
            goto L9d
        L8d:
            r0 = move-exception
            r3 = r22
            goto Lb5
        L91:
            r0 = move-exception
            r3 = r22
            goto L9d
        L95:
            r0 = move-exception
            r3 = r22
            goto Lb6
        L99:
            r0 = move-exception
            r3 = r22
            r2 = r1
        L9d:
            com.google.android.gms.measurement.internal.zzef r4 = r22.zzab()     // Catch: java.lang.Throwable -> Lb4
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzgk()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "Error querying user properties. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzef.zzam(r23)     // Catch: java.lang.Throwable -> Lb4
            r4.zza(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb3
            r2.close()
        Lb3:
            return r1
        Lb4:
            r0 = move-exception
        Lb5:
            r1 = r2
        Lb6:
            if (r1 == 0) goto Lbb
            r1.close()
        Lbb:
            goto Lbd
        Lbc:
            throw r0
        Lbd:
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzaa(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        zzab().zzgk().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzjp> zza(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean zza(zzq zzqVar) {
        Preconditions.checkNotNull(zzqVar);
        zzo();
        zzbi();
        if (zze(zzqVar.packageName, zzqVar.zzdw.name) != null || zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzqVar.packageName}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzqVar.packageName);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzqVar.origin);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzqVar.zzdw.name);
            zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzqVar.zzdw.getValue());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzqVar.active));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzqVar.triggerEventName);
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzqVar.triggerTimeout));
            zzz();
            contentValues.put("timed_out_event", zzjs.zza(zzqVar.zzdx));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzqVar.creationTimestamp));
            zzz();
            contentValues.put("triggered_event", zzjs.zza(zzqVar.zzdy));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzqVar.zzdw.zztr));
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzqVar.timeToLive));
            zzz();
            contentValues.put("expired_event", zzjs.zza(zzqVar.zzdz));
            try {
                if (getWritableDatabase().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    zzab().zzgk().zza("Failed to insert/update conditional user property (got -1)", zzef.zzam(zzqVar.packageName));
                }
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error storing conditional user property", zzef.zzam(zzqVar.packageName), e);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzq zzf(java.lang.String r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzf(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzq");
    }

    public final int zzg(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        try {
            return getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting conditional property", zzef.zzam(str), zzy().zzal(str2), e);
            return 0;
        }
    }

    public final List<zzq> zzb(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzo();
        zzbi();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzb(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
        zzab().zzgk().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzq> zzb(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzb(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0190 A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c7 A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01eb A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0209 A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0218 A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0233 A[Catch: SQLiteException -> 0x024a, all -> 0x0273, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x024a, blocks: (B:11:0x00e4, B:13:0x0141, B:18:0x014b, B:22:0x0195, B:26:0x01cb, B:28:0x01d6, B:33:0x01e0, B:35:0x01eb, B:38:0x01f2, B:42:0x020d, B:44:0x0218, B:45:0x022a, B:47:0x0233, B:41:0x0209, B:25:0x01c7, B:21:0x0190), top: B:70:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzf zzab(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzab(java.lang.String):com.google.android.gms.measurement.internal.zzf");
    }

    public final void zza(zzf zzfVar) {
        Preconditions.checkNotNull(zzfVar);
        zzo();
        zzbi();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzfVar.zzag());
        contentValues.put("app_instance_id", zzfVar.getAppInstanceId());
        contentValues.put("gmp_app_id", zzfVar.getGmpAppId());
        contentValues.put("resettable_device_id_hash", zzfVar.zzai());
        contentValues.put("last_bundle_index", Long.valueOf(zzfVar.zzar()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzfVar.zzaj()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzfVar.zzak()));
        contentValues.put("app_version", zzfVar.zzal());
        contentValues.put("app_store", zzfVar.zzan());
        contentValues.put("gmp_version", Long.valueOf(zzfVar.zzao()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzfVar.zzap()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzfVar.isMeasurementEnabled()));
        contentValues.put("day", Long.valueOf(zzfVar.zzav()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzfVar.zzaw()));
        contentValues.put("daily_events_count", Long.valueOf(zzfVar.zzax()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzfVar.zzay()));
        contentValues.put("config_fetched_time", Long.valueOf(zzfVar.zzas()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzfVar.zzat()));
        contentValues.put("app_version_int", Long.valueOf(zzfVar.zzam()));
        contentValues.put("firebase_instance_id", zzfVar.getFirebaseInstanceId());
        contentValues.put("daily_error_events_count", Long.valueOf(zzfVar.zzba()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzfVar.zzaz()));
        contentValues.put("health_monitor_sample", zzfVar.zzbb());
        contentValues.put("android_id", Long.valueOf(zzfVar.zzbd()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzfVar.zzbe()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(zzfVar.zzbf()));
        contentValues.put("admob_app_id", zzfVar.zzah());
        contentValues.put("dynamite_version", Long.valueOf(zzfVar.zzaq()));
        if (zzfVar.zzbh() != null) {
            if (zzfVar.zzbh().size() == 0) {
                zzab().zzgn().zza("Safelisted events should not be an empty list. appId", zzfVar.zzag());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzfVar.zzbh()));
            }
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase.update("apps", contentValues, "app_id = ?", new String[]{zzfVar.zzag()}) == 0 && writableDatabase.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert/update app (got -1). appId", zzef.zzam(zzfVar.zzag()));
            }
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing app. appId", zzef.zzam(zzfVar.zzag()), e);
        }
    }

    public final long zzac(String str) {
        Preconditions.checkNotEmpty(str);
        zzo();
        zzbi();
        try {
            return getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zzad().zzb(str, zzak.zzgu))))});
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error deleting over the limit events. appId", zzef.zzam(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzw zza(long r22, java.lang.String r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzw");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zzad(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r11.zzo()
            r11.zzbi()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.getWritableDatabase()     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r2 = "apps"
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "remote_config"
            r9 = 0
            r4[r9] = r5     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r6[r9] = r12     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r8 = 0
            r10 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5a android.database.sqlite.SQLiteException -> L5c
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r2 != 0) goto L37
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            if (r3 == 0) goto L52
            com.google.android.gms.measurement.internal.zzef r3 = r11.zzab()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzef.zzam(r12)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L58 java.lang.Throwable -> L75
        L52:
            if (r1 == 0) goto L57
            r1.close()
        L57:
            return r2
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            r12 = move-exception
            goto L77
        L5c:
            r2 = move-exception
            r1 = r0
        L5e:
            com.google.android.gms.measurement.internal.zzef r3 = r11.zzab()     // Catch: java.lang.Throwable -> L75
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzgk()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzef.zzam(r12)     // Catch: java.lang.Throwable -> L75
            r3.zza(r4, r12, r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L74
            r1.close()
        L74:
            return r0
        L75:
            r12 = move-exception
            r0 = r1
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzad(java.lang.String):byte[]");
    }

    public final boolean zza(zzbs.zzg zzgVar, boolean z) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzag());
        Preconditions.checkState(zzgVar.zzof());
        zzca();
        long currentTimeMillis = zzx().currentTimeMillis();
        if (zzgVar.zznr() < currentTimeMillis - zzs.zzbs() || zzgVar.zznr() > zzs.zzbs() + currentTimeMillis) {
            zzab().zzgn().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzef.zzam(zzgVar.zzag()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgVar.zznr()));
        }
        try {
            byte[] zzc = zzgw().zzc(zzgVar.toByteArray());
            zzab().zzgs().zza("Saving bundle, size", Integer.valueOf(zzc.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzgVar.zzag());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzgVar.zznr()));
            contentValues.put("data", zzc);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzgVar.zzpn()) {
                contentValues.put("retry_count", Integer.valueOf(zzgVar.zzpo()));
            }
            try {
                if (getWritableDatabase().insert("queue", null, contentValues) == -1) {
                    zzab().zzgk().zza("Failed to insert bundle (got -1). appId", zzef.zzam(zzgVar.zzag()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error storing bundle. appId", zzef.zzam(zzgVar.zzag()), e);
                return false;
            }
        } catch (IOException e2) {
            zzab().zzgk().zza("Data loss. Failed to serialize bundle. appId", zzef.zzam(zzgVar.zzag()), e2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzby() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.getWritableDatabase()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzef r3 = r6.zzab()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzgk()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzby():java.lang.String");
    }

    public final boolean zzbz() {
        return zza("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final List<Pair<zzbs.zzg, Long>> zza(String str, int i, int i2) {
        byte[] zzb;
        zzo();
        zzbi();
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzbs.zzg, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                do {
                    long j = query.getLong(0);
                    try {
                        zzb = zzgw().zzb(query.getBlob(1));
                    } catch (IOException e) {
                        zzab().zzgk().zza("Failed to unzip queued bundle. appId", zzef.zzam(str), e);
                    }
                    if (!arrayList.isEmpty() && zzb.length + i3 > i2) {
                        break;
                    }
                    try {
                        zzbs.zzg.zza zzaVar = (zzbs.zzg.zza) zzbs.zzg.zzpr().zzf(zzb, com.google.android.gms.internal.measurement.zzel.zztq());
                        if (!query.isNull(2)) {
                            zzaVar.zzw(query.getInt(2));
                        }
                        i3 += zzb.length;
                        arrayList.add(Pair.create((zzbs.zzg) ((com.google.android.gms.internal.measurement.zzey) zzaVar.zzug()), Long.valueOf(j)));
                    } catch (IOException e2) {
                        zzab().zzgk().zza("Failed to merge queued bundle. appId", zzef.zzam(str), e2);
                    }
                    if (!query.moveToNext()) {
                        break;
                    }
                } while (i3 <= i2);
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzab().zzgk().zza("Error querying bundles. appId", zzef.zzam(str), e3);
                List<Pair<zzbs.zzg, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzca() {
        int delete;
        zzo();
        zzbi();
        if (zzcg()) {
            long j = zzac().zzlm.get();
            long elapsedRealtime = zzx().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > zzak.zzhd.get(null).longValue()) {
                zzac().zzlm.set(elapsedRealtime);
                zzo();
                zzbi();
                if (!zzcg() || (delete = getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzx().currentTimeMillis()), String.valueOf(zzs.zzbs())})) <= 0) {
                    return;
                }
                zzab().zzgs().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(List<Long> list) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzcg()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zza(sb3.toString(), (String[]) null) > 0) {
                zzab().zzgn().zzao("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                writableDatabase.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, com.google.android.gms.internal.measurement.zzbv[] zzbvVarArr) {
        boolean z;
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbvVarArr);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            zzbi();
            zzo();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase writableDatabase2 = getWritableDatabase();
            writableDatabase2.delete("property_filters", "app_id=?", new String[]{str});
            writableDatabase2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.zzbv zzbvVar : zzbvVarArr) {
                zzbi();
                zzo();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzbvVar);
                Preconditions.checkNotNull(zzbvVar.zzzh);
                Preconditions.checkNotNull(zzbvVar.zzzg);
                if (zzbvVar.zzzf == null) {
                    zzab().zzgn().zza("Audience with no ID. appId", zzef.zzam(str));
                } else {
                    int intValue = zzbvVar.zzzf.intValue();
                    zzbk.zza[] zzaVarArr = zzbvVar.zzzh;
                    int length = zzaVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!zzaVarArr[i].zzkb()) {
                                zzab().zzgn().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzef.zzam(str), zzbvVar.zzzf);
                                break;
                            }
                            i++;
                        } else {
                            zzbk.zzd[] zzdVarArr = zzbvVar.zzzg;
                            int length2 = zzdVarArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    if (!zzdVarArr[i2].zzkb()) {
                                        zzab().zzgn().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzef.zzam(str), zzbvVar.zzzf);
                                        break;
                                    }
                                    i2++;
                                } else {
                                    zzbk.zza[] zzaVarArr2 = zzbvVar.zzzh;
                                    int length3 = zzaVarArr2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= length3) {
                                            z = true;
                                            break;
                                        } else if (!zza(str, intValue, zzaVarArr2[i3])) {
                                            z = false;
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (z) {
                                        zzbk.zzd[] zzdVarArr2 = zzbvVar.zzzg;
                                        int length4 = zzdVarArr2.length;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= length4) {
                                                break;
                                            } else if (!zza(str, intValue, zzdVarArr2[i4])) {
                                                z = false;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzbi();
                                        zzo();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase writableDatabase3 = getWritableDatabase();
                                        writableDatabase3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                        writableDatabase3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(intValue)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzbv zzbvVar2 : zzbvVarArr) {
                arrayList.add(zzbvVar2.zzzf);
            }
            zza(str, arrayList);
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private final boolean zza(String str, int i, zzbk.zza zzaVar) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaVar);
        if (TextUtils.isEmpty(zzaVar.zzjz())) {
            zzab().zzgn().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzef.zzam(str), Integer.valueOf(i), String.valueOf(zzaVar.zzkb() ? Integer.valueOf(zzaVar.getId()) : null));
            return false;
        }
        byte[] byteArray = zzaVar.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzaVar.zzkb() ? Integer.valueOf(zzaVar.getId()) : null);
        contentValues.put("event_name", zzaVar.zzjz());
        if (zzad().zze(str, zzak.zziy)) {
            contentValues.put("session_scoped", zzaVar.zzkh() ? Boolean.valueOf(zzaVar.zzki()) : null);
        }
        contentValues.put("data", byteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert event filter (got -1). appId", zzef.zzam(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing event filter. appId", zzef.zzam(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzbk.zzd zzdVar) {
        zzbi();
        zzo();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzdVar);
        if (TextUtils.isEmpty(zzdVar.getPropertyName())) {
            zzab().zzgn().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzef.zzam(str), Integer.valueOf(i), String.valueOf(zzdVar.zzkb() ? Integer.valueOf(zzdVar.getId()) : null));
            return false;
        }
        byte[] byteArray = zzdVar.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzdVar.zzkb() ? Integer.valueOf(zzdVar.getId()) : null);
        contentValues.put("property_name", zzdVar.getPropertyName());
        if (zzad().zze(str, zzak.zziy)) {
            contentValues.put("session_scoped", zzdVar.zzkh() ? Boolean.valueOf(zzdVar.zzki()) : null);
        }
        contentValues.put("data", byteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert property filter (got -1). appId", zzef.zzam(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing property filter. appId", zzef.zzam(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbk.zza>> zzh(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzbi()
            r12.zzo()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "event_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "app_id=? AND event_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6[r10] = r13     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6[r11] = r14     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzel r2 = com.google.android.gms.internal.measurement.zzel.zztq()     // Catch: java.io.IOException -> L74 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzbk$zza r1 = com.google.android.gms.internal.measurement.zzbk.zza.zza(r1, r2)     // Catch: java.io.IOException -> L74 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r3 != 0) goto L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
        L70:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            goto L86
        L74:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzef r2 = r12.zzab()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzef.zzam(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
        L86:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r1 != 0) goto L48
            if (r14 == 0) goto L91
            r14.close()
        L91:
            return r0
        L92:
            r0 = move-exception
            goto L98
        L94:
            r13 = move-exception
            goto Lb1
        L96:
            r0 = move-exception
            r14 = r9
        L98:
            com.google.android.gms.measurement.internal.zzef r1 = r12.zzab()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzgk()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzef.zzam(r13)     // Catch: java.lang.Throwable -> Laf
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Laf
            if (r14 == 0) goto Lae
            r14.close()
        Lae:
            return r9
        Laf:
            r13 = move-exception
            r9 = r14
        Lb1:
            if (r9 == 0) goto Lb6
            r9.close()
        Lb6:
            goto Lb8
        Lb7:
            throw r13
        Lb8:
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzh(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbk.zzd>> zzi(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.zzbi()
            r12.zzo()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.getWritableDatabase()
            r9 = 0
            java.lang.String r2 = "property_filters"
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "audience_id"
            r10 = 0
            r4[r10] = r5     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "data"
            r11 = 1
            r4[r11] = r5     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            java.lang.String r5 = "app_id=? AND property_name=?"
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6[r10] = r13     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r6[r11] = r14     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            r14 = 0
            r7 = 0
            r8 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteException -> L96
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r1 != 0) goto L48
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r14 == 0) goto L47
            r14.close()
        L47:
            return r13
        L48:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzel r2 = com.google.android.gms.internal.measurement.zzel.zztq()     // Catch: java.io.IOException -> L74 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.internal.measurement.zzbk$zzd r1 = com.google.android.gms.internal.measurement.zzbk.zzd.zzb(r1, r2)     // Catch: java.io.IOException -> L74 android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r3 != 0) goto L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
        L70:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            goto L86
        L74:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzef r2 = r12.zzab()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzef.zzam(r13)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            r2.zza(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
        L86:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L92 java.lang.Throwable -> Laf
            if (r1 != 0) goto L48
            if (r14 == 0) goto L91
            r14.close()
        L91:
            return r0
        L92:
            r0 = move-exception
            goto L98
        L94:
            r13 = move-exception
            goto Lb1
        L96:
            r0 = move-exception
            r14 = r9
        L98:
            com.google.android.gms.measurement.internal.zzef r1 = r12.zzab()     // Catch: java.lang.Throwable -> Laf
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzgk()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzef.zzam(r13)     // Catch: java.lang.Throwable -> Laf
            r1.zza(r2, r13, r0)     // Catch: java.lang.Throwable -> Laf
            if (r14 == 0) goto Lae
            r14.close()
        Lae:
            return r9
        Laf:
            r13 = move-exception
            r9 = r14
        Lb1:
            if (r9 == 0) goto Lb6
            r9.close()
        Lb6:
            goto Lb8
        Lb7:
            throw r13
        Lb8:
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzi(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zzae(java.lang.String r8) {
        /*
            r7 = this;
            r7.zzbi()
            r7.zzo()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L82
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto L84
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            com.google.android.gms.measurement.internal.zzef r3 = r7.zzab()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzgk()     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzef.zzam(r8)     // Catch: java.lang.Throwable -> L82
            r3.zza(r4, r8, r0)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r2
        L82:
            r8 = move-exception
            r2 = r1
        L84:
            if (r2 == 0) goto L89
            r2.close()
        L89:
            goto L8b
        L8a:
            throw r8
        L8b:
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzae(java.lang.String):java.util.Map");
    }

    private final boolean zza(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzbi();
        zzo();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            long zza = zza("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zzad().zzb(str, zzak.zzhk)));
            if (zza <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return writableDatabase.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Database error querying filters. appId", zzef.zzam(str), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbs.zzi> zzaf(java.lang.String r12) {
        /*
            r11 = this;
            r11.zzbi()
            r11.zzo()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.getWritableDatabase()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "audience_id"
            r9 = 0
            r2[r9] = r3     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "current_results"
            r10 = 1
            r2[r10] = r3     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "app_id=?"
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r4[r9] = r12     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            if (r1 != 0) goto L36
            if (r0 == 0) goto L35
            r0.close()
        L35:
            return r8
        L36:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
        L3b:
            int r2 = r0.getInt(r9)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            byte[] r3 = r0.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            com.google.android.gms.internal.measurement.zzel r4 = com.google.android.gms.internal.measurement.zzel.zztq()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            com.google.android.gms.internal.measurement.zzbs$zzi r3 = com.google.android.gms.internal.measurement.zzbs.zzi.zze(r3, r4)     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            goto L69
        L53:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzef r4 = r11.zzab()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.zzeh r4 = r4.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzef.zzam(r12)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            r4.zza(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
        L69:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L75 java.lang.Throwable -> L92
            if (r2 != 0) goto L3b
            if (r0 == 0) goto L74
            r0.close()
        L74:
            return r1
        L75:
            r1 = move-exception
            goto L7b
        L77:
            r12 = move-exception
            goto L94
        L79:
            r1 = move-exception
            r0 = r8
        L7b:
            com.google.android.gms.measurement.internal.zzef r2 = r11.zzab()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzgk()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzef.zzam(r12)     // Catch: java.lang.Throwable -> L92
            r2.zza(r3, r12, r1)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L91
            r0.close()
        L91:
            return r8
        L92:
            r12 = move-exception
            r8 = r0
        L94:
            if (r8 == 0) goto L99
            r8.close()
        L99:
            goto L9b
        L9a:
            throw r12
        L9b:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzaf(java.lang.String):java.util.Map");
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzab().zzgk().zzao("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type == 4) {
                        zzab().zzgk().zzao("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    zzab().zzgk().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    public final long zzcb() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzj(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzo();
        zzbi();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    long zza = zza(sb.toString(), new String[]{str}, -1L);
                    if (zza == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (writableDatabase.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzab().zzgk().zza("Failed to insert column (got -1). appId", zzef.zzam(str), str2);
                            writableDatabase.endTransaction();
                            return -1L;
                        }
                        zza = 0;
                    }
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put(str2, Long.valueOf(1 + zza));
                        if (writableDatabase.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                            zzab().zzgk().zza("Failed to update column (got 0). appId", zzef.zzam(str), str2);
                            writableDatabase.endTransaction();
                            return -1L;
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return zza;
                    } catch (SQLiteException e) {
                        e = e;
                        j = zza;
                        zzab().zzgk().zza("Error inserting column. appId", zzef.zzam(str), str2, e);
                        writableDatabase.endTransaction();
                        return j;
                    }
                } catch (Throwable th) {
                    th = th;
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long zzcc() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zza(zzbs.zzg zzgVar) throws IOException {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzgVar);
        Preconditions.checkNotEmpty(zzgVar.zzag());
        byte[] byteArray = zzgVar.toByteArray();
        long zza = zzgw().zza(byteArray);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzgVar.zzag());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza));
        contentValues.put("metadata", byteArray);
        try {
            getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing raw event metadata. appId", zzef.zzam(zzgVar.zzag()), e);
            throw e;
        }
    }

    public final boolean zzcd() {
        return zza("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzce() {
        return zza("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long zzag(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzu(long r5) {
        /*
            r4 = this;
            r4.zzo()
            r4.zzbi()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzef r6 = r4.zzab()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzeh r6 = r6.zzgs()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zzao(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzef r1 = r4.zzab()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzgk()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zzu(long):java.lang.String");
    }

    public final long zzcf() {
        Cursor cursor = null;
        try {
            try {
                cursor = getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzab().zzgk().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0087: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0087 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbs.zzc, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzo()
            r7.zzbi()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzef r8 = r7.zzab()     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzeh r8 = r8.zzgs()     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            java.lang.String r9 = "Main event not found"
            r8.zzao(r9)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzel r4 = com.google.android.gms.internal.measurement.zzel.zztq()     // Catch: java.io.IOException -> L55 android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            com.google.android.gms.internal.measurement.zzbs$zzc r8 = com.google.android.gms.internal.measurement.zzbs.zzc.zzc(r2, r4)     // Catch: java.io.IOException -> L55 android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            android.util.Pair r8 = android.util.Pair.create(r8, r3)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            if (r1 == 0) goto L54
            r1.close()
        L54:
            return r8
        L55:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzef r3 = r7.zzab()     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzeh r3 = r3.zzgk()     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzef.zzam(r8)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L6d java.lang.Throwable -> L86
            if (r1 == 0) goto L6c
            r1.close()
        L6c:
            return r0
        L6d:
            r8 = move-exception
            goto L73
        L6f:
            r8 = move-exception
            goto L88
        L71:
            r8 = move-exception
            r1 = r0
        L73:
            com.google.android.gms.measurement.internal.zzef r9 = r7.zzab()     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.measurement.internal.zzeh r9 = r9.zzgk()     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L85
            r1.close()
        L85:
            return r0
        L86:
            r8 = move-exception
            r0 = r1
        L88:
            if (r0 == 0) goto L8d
            r0.close()
        L8d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final boolean zza(String str, Long l, long j, zzbs.zzc zzcVar) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzcVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] byteArray = zzcVar.toByteArray();
        zzab().zzgs().zza("Saving complex main event, appId, data size", zzy().zzaj(str), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", byteArray);
        try {
            if (getWritableDatabase().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzab().zzgk().zza("Failed to insert complex main event (got -1). appId", zzef.zzam(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing complex main event. appId", zzef.zzam(str), e);
            return false;
        }
    }

    public final boolean zza(zzaf zzafVar, long j, boolean z) {
        zzo();
        zzbi();
        Preconditions.checkNotNull(zzafVar);
        Preconditions.checkNotEmpty(zzafVar.zzce);
        zzbs.zzc.zza zzah = zzbs.zzc.zzmq().zzah(zzafVar.zzfp);
        Iterator<String> it = zzafVar.zzfq.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzbs.zze.zza zzbz = zzbs.zze.zzng().zzbz(next);
            zzgw().zza(zzbz, zzafVar.zzfq.get(next));
            zzah.zza(zzbz);
        }
        byte[] byteArray = ((zzbs.zzc) ((com.google.android.gms.internal.measurement.zzey) zzah.zzug())).toByteArray();
        zzab().zzgs().zza("Saving event, name, data size", zzy().zzaj(zzafVar.name), Integer.valueOf(byteArray.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzafVar.zzce);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzafVar.name);
        contentValues.put("timestamp", Long.valueOf(zzafVar.timestamp));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", byteArray);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (getWritableDatabase().insert("raw_events", null, contentValues) == -1) {
                zzab().zzgk().zza("Failed to insert raw event (got -1). appId", zzef.zzam(zzafVar.zzce));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            zzab().zzgk().zza("Error storing raw event. appId", zzef.zzam(zzafVar.zzce), e);
            return false;
        }
    }

    private final boolean zzcg() {
        return getContext().getDatabasePath("google_app_measurement.db").exists();
    }
}
