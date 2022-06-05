/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andriawan.event_tix.utils;

import java.util.prefs.Preferences;

/**
 *
 * @author naufalfawwaz
 */
public class PreferenceUtil {
    
    private static final Preferences prefs = Preferences.userRoot();
    private static final String PREF_USER_ID = "user-id";
    private static final String PREF_NAME = "name";
    private static final String PREF_ROLE = "role";

    public static void saveUserData(int userID, String name, String role) {
        prefs.putInt(PREF_USER_ID, userID);
        prefs.put(PREF_NAME, name);
        prefs.put(PREF_ROLE, role);
    }

    public static int getUserID() {
        return prefs.getInt(PREF_USER_ID, 0);
    }

    public static String getRole() {
        return prefs.get(PREF_ROLE, "");
    }
}
