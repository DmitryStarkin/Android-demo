package com.hplasplas.task7.managers;

import android.content.SharedPreferences;

import com.hplasplas.task7.App;

import static android.content.Context.MODE_PRIVATE;
import static com.hplasplas.task7.setting.Constants.PREFERENCES_FILE;

/**
 * Created by StarkinDG on 06.04.2017.
 */

public class PreferencesManager {
    
    public static SharedPreferences getPreferences() {
        
        return App.getAppContext().getSharedPreferences(PREFERENCES_FILE, MODE_PRIVATE);
    }
}
