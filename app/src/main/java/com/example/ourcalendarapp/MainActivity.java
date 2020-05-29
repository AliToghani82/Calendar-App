package com.example.ourcalendarapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ourcalendarapp.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static com.example.ourcalendarapp.DatabaseHelper mDatabaseHelper;
    public static SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalendarView mCalendarView = findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = month+1 + "/" + dayOfMonth + "/" + year; // not sure what this is but the tutorial said to do it
                //Log.d(TAG, "onSelectedDayChange: date: " + date);




                Intent intent = new Intent(getApplicationContext(), MyDayActivity.class);
                intent.putExtra("date", date);

                startActivity(intent);
            }
        });

    }

}
