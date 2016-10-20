package com.example.admin.helloworld;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            textView1.setText("Landscape");
            textView2.setText("Landscape");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            textView1.setText("Portrait");
            textView2.setText("Portrait");
        }
    }

    public void doSomething(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "doSomething: ");
        Log.d("TAG_", "Git change: ");
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        int a = Integer.parseInt(editText1.getText().toString());
        Toast.makeText(this, a+"", Toast.LENGTH_SHORT).show();
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int b = Integer.parseInt(editText2.getText().toString());
        int c = a+b;

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(c+"");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(c+"");
        //Intent intent = new Intent(this, DetailsActivity.class);
        //startActivity(intent);
    }

    public void doSomethingBtn2(View view) {
        Toast.makeText(this, "You pressed button 2", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "The user pressed button 2");
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("00000000000000");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("00000000000000");
    }

    public void doSomethingBtn3(View view) {
        Toast.makeText(this, "You pressed button 3", Toast.LENGTH_SHORT).show();
        Log.d("TAG_", "The user pressed button 3");
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("1111111111111111");
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("111111111111111");
    }
}
