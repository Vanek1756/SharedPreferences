package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SharedPreferences sharedPreferences = this.getSharedPreferences(
                "mySharedPreferences", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putString("newHelloText", "Hello Shared Preferences"); // Добавление в файл данных
        //editor.remove("newHelloText"); // Удаление из файла данных по ключу
        //editor.clear(); // Полная очистка файла
        editor.apply();

        TextView textView = findViewById(R.id.textView);
        textView.setText(sharedPreferences.getString("newHelloText",
                "Default text"));
        
        
    }
}