
package com.olegsv.showerrorfixeddemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.olegsv.showerrorfixeddemo.R;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final Button show = (Button) findViewById(R.id.button1);
        final Button hide = (Button) findViewById(R.id.button2);
        final EditText edit1 = (EditText) findViewById(R.id.editText1);
        final EditText edit2 = (EditText) findViewById(R.id.editText2);
        final EditText edit3 = (EditText) findViewById(R.id.editText3);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setError("Error!");
                edit2.setError("Error!");
                edit3.setError("Error!");
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setError(null);
                edit2.setError(null);
                edit3.setError(null);
            }
        });
    }

}
