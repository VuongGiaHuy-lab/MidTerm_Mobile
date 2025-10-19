package com.example.quanlychitieu.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.quanlychitieu.MainActivity;

import java.text.NumberFormat;
import java.util.Locale;


public class CurrencyFormatter {

    public static String format(Context context, String number){

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);

        String currencyCode = prefs.getString(MainActivity.CURRENCY_KEY, "CANADA");

        NumberFormat format = NumberFormat.getInstance(new Locale(currencyCode));

        double doubleNumber = Double.parseDouble(number);
        return format.format(doubleNumber);
    }
}
