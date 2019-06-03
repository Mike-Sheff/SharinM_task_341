package ru.netologia.sharinm_task_341;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Utils
{
    private static int sTheme;

    public final static int THEME_DEFAULT = 3;
    public final static int THEME_BLACK = 0;
    public final static int THEME_GREEN = 1;
    public final static int THEME_BLUE = 2;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;

        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

        switch (sTheme) {
            case THEME_BLACK:
                MainActivity.spinnerColor.setSelection(0);
                break;
            case THEME_GREEN:
                MainActivity.spinnerColor.setSelection(1);
                break;
            case THEME_BLUE:
                MainActivity.spinnerColor.setSelection(2);
                break;
        }
    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            case THEME_BLACK:
                activity.setTheme(R.style.AppThemeBlack);
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.AppThemeGreen);
                MainActivity.spinnerLang.setSelection(1);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.AppThemeBlue);
                MainActivity.spinnerLang.setSelection(2);
                break;
            case THEME_DEFAULT:
                activity.setTheme(R.style.AppTheme);
                break;
        }
    }
}