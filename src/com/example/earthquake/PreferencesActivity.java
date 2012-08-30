package com.example.earthquake;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class PreferencesActivity extends PreferenceActivity {
	
	CheckBox autoUpdate;
	Spinner updateFreqSpinner;
	Spinner magnitudeSpinner;
	public static final String USER_PREFERENCE = "USER_PREFERENCE";
	public static final String PREF_AUTO_UPDATE = "PREF_AUTO_UPDATE";
	public static final String PREF_MIN_MAG_INDEX = "PREF_MIN_MAG_INDEX";
	public static final String PREF_UPDATE_FREQ_INDEX = "PREF_UPDATE_FREQ_INDEX";
	public static final String PREF_MIN_MAG ="PREF_MIN_MAG";
	public static final String PREF_UPDATE_FREQ ="PREF_UPDATE_FREQ";

	SharedPreferences prefs;
	@Override
	public void onCreate(Bundle savedInstanceState) {

	  super.onCreate(savedInstanceState);  
	  addPreferencesFromResource(R.xml.userpreferences);
	}
}