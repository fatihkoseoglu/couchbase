package com.example.faithkoseoglu.couchbase_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.couchbase.lite.Database;
import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            String dbName = "couchbaseDB";

            Manager manager = new Manager(new AndroidContext(getApplicationContext()), Manager.DEFAULT_OPTIONS);

            Database db = manager.getDatabase(dbName);
        }catch (Exception e){
            Log.e("couchbaseDB", "Error", e);
            return;
        }
        //Do it here
    }
}
