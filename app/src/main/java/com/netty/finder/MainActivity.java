package com.netty.finder;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.afollestad.materialdialogs.MaterialDialog;
import com.nettyfinder.Netty;

public class MainActivity extends Activity {
private EditText input;
private String phoneNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        input = findViewById( R.id.input);


        findViewById(R.id.submit).setOnClickListener( view -> {
            phoneNum = Netty.getNetworkString(input.getText().toString().trim());
            MaterialDialog.Builder builder = new MaterialDialog.Builder(MainActivity.this)

                    .title("Nettyfinder Result")
                    .content(phoneNum)
                    //"A verification email has been sent to: " + mEmail
                    .contentColor( getResources().getColor(R.color.black))
                    .backgroundColor( getResources().getColor(R.color.white) )
                    .titleColor( getResources().getColor(R.color.black))
                    .positiveText("OK")
                    .onPositive( (dialog, which) -> {
                        dialog.dismiss();
                    } );

            MaterialDialog dialog = builder.build();
            dialog.show();

            Log.d( "NETTYXXX", Netty.getNetworkString( input.getText().toString()) );

        } );
    }
}
