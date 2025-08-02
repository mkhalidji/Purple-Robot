package edu.northwestern.cbits.purple_robot_manager.activities.settings;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DisabledEditTextPreference extends FlexibleEditTextPreference {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DisabledEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DisabledEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public DisabledEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DisabledEditTextPreference(Context context) {
        super(context);
    }

    @Override
    protected void onAddEditTextToDialogView(View dialogView, EditText editText) {
        super.onAddEditTextToDialogView(dialogView, editText);

        editText.setEnabled(false);
        editText.setInputType(InputType.TYPE_NULL);
        editText.setFocusable(false);
    }
}