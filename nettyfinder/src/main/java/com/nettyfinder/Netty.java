package com.nettyfinder;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class Netty extends Application {

    //MTN GSM Prefixes
    static String m1 = "0806";
    static String m2 = "0803";
    static String m3 = "0816";
    static String m4 = "0813";
    static String m5 = "0810";
    static String m6 = "0814";
    static String m7 = "0903";
    static String m8 = "0703";
    static String m9 = "0706";

    //GLO GSM Prefixes
    static String g1 = "0805";
    static String g2 = "0705";
    static String g3 = "0905";
    static String g4 = "0807";
    static String g5 = "0815";
    static String g6 = "0811";

    //9MOBILE GSM Prefixes
    static String n1 = "0809";
    static String n2 = "0909";
    static String n3 = "0817";
    static String n4 = "0818";
    static String n5 = "0908";

    //AIRTEL GSM Prefixes
    static String a1 = "0802";
    static String a2 = "0902";
    static String a3 = "0701";
    static String a4 = "0808";
    static String a5 = "0708";
    static String a6 = "0812";
    static String a7 = "0907";

    //STARCOMMS GSM Prefixes
    static String s1 = "07028";
    static String s2 = "07029";
    static String s3 = "0819";

    //VISAFONE GSM Prefixes
    static String v1 = "07025";
    static String v2 = "07026";
    static String v3 = "0704";

    //MULTILINKS GSM Prefixes
    static String mu1 = "07027";
    static String mu2 = "0709";

    //ZOOM GSM Prefix
    static String z1 = "0707";

    //NTEL GSM Prefix
    static String nt1 = "0804";

    //SMILE GSM Prefix
    static String sm1 = "0702";


    public static String getNetworkString(@NonNull String userInput) {
        String value = "";
        if (!userInput.matches("[0-9]+")) {
            value = "Error! Invalid number";

        }else{
            String checkNumber = userInput.substring(0, 4);

            String checkNumber2 = userInput.substring(0, 5);

            //Stores initial number
            String iInput = userInput;

       /* if (userInput.substring( 0, 1 ).equals( "" )) {

            }else {

                hash = hash.substring( 0, hash.length() - 1 );
                ussd = Uri.encode( "*" ) + hash + Uri.encode( "#" );
            }*/


            if (userInput.length() < 11 || userInput.length() > 11) {
                //Toast.makeText(getApplicationContext(), "Error! Invalid number. Number must not be lesser or greater than 11", Toast.LENGTH_LONG).show();
                value = "Error! Invalid number. Number must not be lesser or greater than 11";
            }
            else if (checkNumber.equals( m1 ) || checkNumber.equals( m2 ) || checkNumber.equals( m3 ) || checkNumber.equals( m4 ) || checkNumber.equals( m5 ) || checkNumber.equals( m6 ) || checkNumber.equals( m7 ) || checkNumber.equals( m8 ) || checkNumber.equals( m9 )) {
                value = iInput + " belongs to MTN network 💛";
            }
            else if (checkNumber.equals( g1 ) || checkNumber.equals( g2 ) || checkNumber.equals( g3 ) || checkNumber.equals( g4 ) || checkNumber.equals( g5 ) || checkNumber.equals( g6 )) {
                value = iInput + " belongs to GLO network 💚";
            }
            else if (checkNumber.equals( n1 ) || checkNumber.equals( n2 ) || checkNumber.equals( n3 ) || checkNumber.equals( n4 ) || checkNumber.equals( n5 )) {
                value = iInput + " belongs to 9MOBILE network 💚";
            }
            else if (checkNumber.equals( a1 ) || checkNumber.equals( a2 ) || checkNumber.equals( a3 ) || checkNumber.equals( a4 ) || checkNumber.equals( a5 ) || checkNumber.equals( a6 ) || checkNumber.equals( a7 )) {
                value = iInput + " belongs to AIRTEL network ❤️";
            }
            else if (checkNumber2.equals( s1 ) || checkNumber2.equals( s2 ) || checkNumber.equals( s3 )) {
                value = iInput + " belongs to STARCOMMS network 💛️";
            }
            else if (checkNumber2.equals( v1 ) || checkNumber2.equals( v2 ) || checkNumber.equals( v3 )) {
                value = iInput + " belongs to VISAFONE network 💗";
            }
            else if (checkNumber2.equals( mu1 ) || checkNumber.equals( mu2 )) {
                value = iInput + " belongs to MULTILINKS network 💙";
            }
            else if (checkNumber.equals( s1 ) || checkNumber.equals( s2 ) || checkNumber.equals( s3 )) {
                value = iInput + " belongs to STARCOMMS network 💛️";
            }
            else if (checkNumber.equals( z1 )) {
                value = iInput + " belongs to ZOOM network 💛️";
            }
            else if (checkNumber.equals( nt1 )) {
                value = iInput + " belongs to NTEL network 💖";
            }
            else if (checkNumber.equals( sm1 )) {
                value = iInput + " belongs to SMILE network 💛️";
            }
            else {
                value = iInput + " belongs to no Nigerian network, check the number and TRY AGAIN!!";
            }
            Log.d( "NETTYX", value);

        }

        return value;
    }

}
