package hotchemi.android.rate;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

/* loaded from: classes.dex */
final class DialogManager {
    private DialogManager() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Dialog create(final Context context, final DialogOptions dialogOptions) {
        AlertDialog.Builder dialogBuilder = Utils.getDialogBuilder(context);
        dialogBuilder.setMessage(dialogOptions.getMessageText(context));
        if (dialogOptions.shouldShowTitle()) {
            dialogBuilder.setTitle(dialogOptions.getTitleText(context));
        }
        dialogBuilder.setCancelable(dialogOptions.getCancelable());
        View view = dialogOptions.getView();
        if (view != null) {
            dialogBuilder.setView(view);
        }
        final OnClickButtonListener listener = dialogOptions.getListener();
        dialogBuilder.setPositiveButton(dialogOptions.getPositiveText(context), new DialogInterface.OnClickListener() { // from class: hotchemi.android.rate.DialogManager.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                context.startActivity(DialogOptions.this.getStoreType() == StoreType.GOOGLEPLAY ? IntentHelper.createIntentForGooglePlay(context) : IntentHelper.createIntentForAmazonAppstore(context));
                PreferenceHelper.setAgreeShowDialog(context, false);
                OnClickButtonListener onClickButtonListener = listener;
                if (onClickButtonListener != null) {
                    onClickButtonListener.onClickButton(i);
                }
            }
        });
        if (dialogOptions.shouldShowNeutralButton()) {
            dialogBuilder.setNeutralButton(dialogOptions.getNeutralText(context), new DialogInterface.OnClickListener() { // from class: hotchemi.android.rate.DialogManager.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    PreferenceHelper.setRemindInterval(context);
                    OnClickButtonListener onClickButtonListener = listener;
                    if (onClickButtonListener != null) {
                        onClickButtonListener.onClickButton(i);
                    }
                }
            });
        }
        if (dialogOptions.shouldShowNegativeButton()) {
            dialogBuilder.setNegativeButton(dialogOptions.getNegativeText(context), new DialogInterface.OnClickListener() { // from class: hotchemi.android.rate.DialogManager.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    PreferenceHelper.setAgreeShowDialog(context, false);
                    OnClickButtonListener onClickButtonListener = listener;
                    if (onClickButtonListener != null) {
                        onClickButtonListener.onClickButton(i);
                    }
                }
            });
        }
        return dialogBuilder.create();
    }
}
