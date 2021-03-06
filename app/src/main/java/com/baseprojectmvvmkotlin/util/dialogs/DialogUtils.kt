package com.baseprojectmvvmkotlin.util.dialogs

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.Window
import android.widget.FrameLayout
import com.baseprojectmvvmkotlin.R

object DialogUtils {
    fun showLoader(context: Context): Dialog {
        val dialog = Dialog(context)
        dialog.window?.let {
            it.requestFeature(Window.FEATURE_NO_TITLE)
            it.setBackgroundDrawableResource(android.R.color.transparent)
            it.setLayout(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
            )
            it.setGravity(Gravity.CENTER)
        }
        dialog.setContentView(R.layout.layout_loading_dialog)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        return dialog
    }
}