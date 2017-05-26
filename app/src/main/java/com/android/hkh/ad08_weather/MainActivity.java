package com.android.hkh.ad08_weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView myListView;
    private MyArrayAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Step 1:
        myListView = (ListView) findViewById(R.id.mylistview);
        //step 2: data source
        ArrayList<Weather> weatherDataSource = new ArrayList<>();
        //(String idImage, String cityName, String weather, String temperature)
        weatherDataSource.add(new Weather("Hà Nội", "Sunny", "32°C", "sunny"));
        weatherDataSource.add(new Weather("Quảng Bình", "Cloudy", "25°C", "cloudy"));
        weatherDataSource.add(new Weather("Huế", "Rainy", "23°C", "rainy"));
        weatherDataSource.add(new Weather("Đà Nẵng", "Sunny", "32°C", "sunny"));
        weatherDataSource.add(new Weather("Quảng Nam", "Sunny", "30°C", "sunny"));

        weatherDataSource.add(new Weather("Quảng Ngãi", "Thunder", "24°C", "thunder"));
        weatherDataSource.add(new Weather("Đà Lạt", "Cloudy", "20°C", "cloudy"));
        weatherDataSource.add(new Weather("Phan Thiết", "Thunder", "24°C", "thunder"));
        weatherDataSource.add(new Weather("Vũng Tàu", "Rainy", "25°C", "rainy"));
        weatherDataSource.add(new Weather("Hồ Chính Minh", "Sunny", "33°C", "sunny"));
        //step 3: create adapter
        myAdapter = new MyArrayAdapter(MainActivity.this, R.layout.layout_wather, weatherDataSource);
        //step 4:
        myListView.setAdapter(myAdapter);


    }
}
