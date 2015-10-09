package com.example.tb.dobizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BusinessSearch extends AppCompatActivity {
    Spinner show;
    Spinner country;
    Spinner city;
    Spinner industry;
    Spinner services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_search);
        show = (Spinner)findViewById(R.id.spishow);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.show_business, android.R.layout.simple_spinner_item);
        show.setAdapter(adapter);

        country = (Spinner)findViewById(R.id.spicountry);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.country_business, android.R.layout.simple_spinner_item);
        country.setAdapter(adapter1);

        city = (Spinner)findViewById(R.id.spicity);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.city_business, android.R.layout.simple_spinner_item);
        city.setAdapter(adapter2);

        industry = (Spinner)findViewById(R.id.spiindustry);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,R.array.industry_business, android.R.layout.simple_spinner_item);
        industry.setAdapter(adapter3);

        services = (Spinner)findViewById(R.id.spiservices);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(this,R.array.services_business, android.R.layout.simple_spinner_item);
        services.setAdapter(adapter4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_business_search, menu);
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
