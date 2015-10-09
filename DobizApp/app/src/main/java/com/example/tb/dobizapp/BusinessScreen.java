package com.example.tb.dobizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BusinessScreen extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_screen);

        b1=(Button)findViewById(R.id.btnForsale);
        b2=(Button)findViewById(R.id.btnCurrentspecials);
        b3=(Button)findViewById(R.id.btnBussinesssearch);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btnForsale:
                Intent intent = new Intent("com.example.tb.dobizapp.ForSale");
                startActivity(intent);
                break;
            case R.id.btnCurrentspecials:
                Intent intent1 = new Intent("com.example.tb.dobizapp.CurrentSpecials");
                startActivity(intent1);
                break;
            case R.id.btnBussinesssearch:
                Intent intent2 = new Intent("com.example.tb.dobizapp.BusinessSearch");
                startActivity(intent2);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_business_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
