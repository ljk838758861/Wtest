package com.titan.wtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.one_textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toOtherActivity();
            }
        });
    }

    @JavascriptInterface
    public void toOtherActivity(){
        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }
}
