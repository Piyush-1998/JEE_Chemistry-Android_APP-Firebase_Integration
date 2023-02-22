package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzn extends zza implements zzk {
    public zzn() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzk) {
            return (zzk) queryLocalInterface;
        }
        return new zzm(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzp zzrVar;
        zzp zzpVar;
        zzp zzpVar2 = null;
        zzp zzpVar3 = null;
        zzp zzpVar4 = null;
        zzp zzpVar5 = null;
        zzq zzqVar = null;
        zzq zzqVar2 = null;
        zzq zzqVar3 = null;
        zzp zzpVar6 = null;
        zzp zzpVar7 = null;
        zzp zzpVar8 = null;
        zzp zzpVar9 = null;
        zzp zzpVar10 = null;
        zzp zzpVar11 = null;
        zzv zzvVar = null;
        zzp zzpVar12 = null;
        zzp zzpVar13 = null;
        zzp zzpVar14 = null;
        zzp zzpVar15 = null;
        switch (i) {
            case 1:
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzx) zzd.zza(parcel, zzx.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzd.zza(parcel, Bundle.CREATOR), zzd.zza(parcel), zzd.zza(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzd.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzp) {
                        zzrVar = (zzp) queryLocalInterface;
                    } else {
                        zzrVar = new zzr(readStrongBinder);
                    }
                    zzpVar = zzrVar;
                }
                logEventAndBundle(readString, readString2, bundle, zzpVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzd.zza(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean zza = zzd.zza(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzp) {
                        zzpVar2 = (zzp) queryLocalInterface2;
                    } else {
                        zzpVar2 = new zzr(readStrongBinder2);
                    }
                }
                getUserProperties(readString3, readString4, zza, zzpVar2);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzp) {
                        zzpVar15 = (zzp) queryLocalInterface3;
                    } else {
                        zzpVar15 = new zzr(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString5, zzpVar15);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzd.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzd.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzp) {
                        zzpVar14 = (zzp) queryLocalInterface4;
                    } else {
                        zzpVar14 = new zzr(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString6, readString7, zzpVar14);
                break;
            case 11:
                setMeasurementEnabled(zzd.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzp) {
                        zzpVar13 = (zzp) queryLocalInterface5;
                    } else {
                        zzpVar13 = new zzr(readStrongBinder5);
                    }
                }
                getCurrentScreenName(zzpVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzp) {
                        zzpVar12 = (zzp) queryLocalInterface6;
                    } else {
                        zzpVar12 = new zzr(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(zzpVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzv) {
                        zzvVar = (zzv) queryLocalInterface7;
                    } else {
                        zzvVar = new zzu(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(zzvVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzp) {
                        zzpVar11 = (zzp) queryLocalInterface8;
                    } else {
                        zzpVar11 = new zzr(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(zzpVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzp) {
                        zzpVar10 = (zzp) queryLocalInterface9;
                    } else {
                        zzpVar10 = new zzr(readStrongBinder9);
                    }
                }
                getAppInstanceId(zzpVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzp) {
                        zzpVar9 = (zzp) queryLocalInterface10;
                    } else {
                        zzpVar9 = new zzr(readStrongBinder10);
                    }
                }
                getGmpAppId(zzpVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzp) {
                        zzpVar8 = (zzp) queryLocalInterface11;
                    } else {
                        zzpVar8 = new zzr(readStrongBinder11);
                    }
                }
                generateEventId(zzpVar8);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzd.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzp) {
                        zzpVar7 = (zzp) queryLocalInterface12;
                    } else {
                        zzpVar7 = new zzr(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(asInterface, zzpVar7, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzd.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzp) {
                        zzpVar6 = (zzp) queryLocalInterface13;
                    } else {
                        zzpVar6 = new zzr(readStrongBinder13);
                    }
                }
                performAction(bundle2, zzpVar6, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzq) {
                        zzqVar3 = (zzq) queryLocalInterface14;
                    } else {
                        zzqVar3 = new zzs(readStrongBinder14);
                    }
                }
                setEventInterceptor(zzqVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzq) {
                        zzqVar2 = (zzq) queryLocalInterface15;
                    } else {
                        zzqVar2 = new zzs(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(zzqVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface16;
                    } else {
                        zzqVar = new zzs(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(zzqVar);
                break;
            case 37:
                initForTests(zzd.zzb(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzp) {
                        zzpVar5 = (zzp) queryLocalInterface17;
                    } else {
                        zzpVar5 = new zzr(readStrongBinder17);
                    }
                }
                getTestFlag(zzpVar5, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzd.zza(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzp) {
                        zzpVar4 = (zzp) queryLocalInterface18;
                    } else {
                        zzpVar4 = new zzr(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(zzpVar4);
                break;
            case 41:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof zzp) {
                        zzpVar3 = (zzp) queryLocalInterface19;
                    } else {
                        zzpVar3 = new zzr(readStrongBinder19);
                    }
                }
                getDeepLink(zzpVar3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
