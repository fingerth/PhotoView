package com.github.chrisbanes.photoview;

import android.content.Context;

public final class AppUtils {
    /**
     * 得到屏幕的宽度
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context){
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
