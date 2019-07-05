package com.example.realm3;

import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private EditText name;
    private SeekBar gender;
    private EditText phone;
    private EditText roll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        name = findViewById(R.id.name2);

        gender = findViewById(R.id.gender2);
        phone = findViewById(R.id.phone2);
        roll = findViewById(R.id.roll2);




    }

    public void onSubmitPressed(View view){
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        try {
            Person person = realm.createObject(Person.class,System.currentTimeMillis() / 1000);
            person.setName(name.getText().toString());
            if( gender.getProgress()==0)
                person.setGender("Male");
            else
                person.setGender("Female");

            person.setPhone(Integer.parseInt(phone.getText().toString()));
            person.setRoll(Integer.parseInt(roll.getText().toString()));
            realm.commitTransaction();
            Toast.makeText(mContext, "Success!", Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex){
            realm.cancelTransaction();
            Toast.makeText(mContext, "Failure" + ex.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    public void onDisplayButtonPressed(View view){
        Intent intent = new Intent(this,DisplayActivity.class);
        startActivity(intent);
    }
}
