package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class zzbz {
    private static Object zzaae;
    private static boolean zzaaf;
    private static HashMap<String, String> zzzz;
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzzv = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzzw = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzzx = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzzy = new AtomicBoolean();
    private static final HashMap<String, Boolean> zzaaa = new HashMap<>();
    private static final HashMap<String, Integer> zzaab = new HashMap<>();
    private static final HashMap<String, Long> zzaac = new HashMap<>();
    private static final HashMap<String, Float> zzaad = new HashMap<>();
    private static String[] zzaag = new String[0];

    private static void zza(ContentResolver contentResolver) {
        if (zzzz == null) {
            zzzy.set(false);
            zzzz = new HashMap<>();
            zzaae = new Object();
            zzaaf = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzby(null));
        } else if (zzzy.getAndSet(false)) {
            zzzz.clear();
            zzaaa.clear();
            zzaab.clear();
            zzaac.clear();
            zzaad.clear();
            zzaae = new Object();
            zzaaf = false;
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzbz.class) {
            zza(contentResolver);
            Object obj = zzaae;
            if (zzzz.containsKey(str)) {
                String str3 = zzzz.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : zzaag) {
                if (str.startsWith(str4)) {
                    if (!zzaaf || zzzz.isEmpty()) {
                        zzzz.putAll(zza(contentResolver, zzaag));
                        zzaaf = true;
                        if (zzzz.containsKey(str)) {
                            String str5 = zzzz.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            Cursor query = contentResolver.query(CONTENT_URI, null, null, new String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    zza(obj, str, (String) null);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                }
                String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zza(obj, str, string);
                String str6 = string != null ? string : null;
                if (query != null) {
                    query.close();
                }
                return str6;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzbz.class) {
            if (obj == zzaae) {
                zzzz.put(str, str2);
            }
        }
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzzv, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
