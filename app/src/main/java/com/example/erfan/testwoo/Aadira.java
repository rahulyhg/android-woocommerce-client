package com.example.erfan.testwoo;

import android.app.Application;

import com.aadira.library.Enums.SigningMethod;
import com.aadira.library.Main.WCBuilder;
import com.aadira.library.Main.WooCommerce;

/**
 * Created by erfan on 2/19/18.
 */

public class Aadira extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        WCBuilder builder = new WCBuilder();

        //Whether your website has https
        builder.setIsHttps(false);

        // Set the website URL
        builder.setBaseUrl("http://redchimpbd.com/");

        // Signing method. Can be one of HMACSHA1 or HMACSHA256
        builder.setSigning_method(SigningMethod.HMACSHA1);

        // your woocommerce api key
        builder.setWc_key("ck_ba27b3193e89ff574f47e78158ea458e243bc1fd");

        // your woocommerce api secret
        builder.setWc_secret("cs_9c2633b70ffbbaa559bf66874e1dfea4609ab2bc");

        WooCommerce.getInstance().initialize(builder);

    }
}