package com.bkang.myps.mypersonalshopper;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView MainMenuListView;

    public static String MainMenuItems[] = {
        "New Items",
        "Used Items",
        "Go Shopping",
        "Settings",
        "Email-us"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MainMenuListView = (ListView)findViewById(R.id.MainMenuItems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.mainmenu_singleitemlayout, R.id.MainMenuSingleItemText ,MainMenuItems);
        MainMenuListView.setAdapter(adapter);

        MainMenuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue = (String) MainMenuListView.getItemAtPosition(itemPosition);
                switch (position) {
                    case 0:
                        toNextActivity(MainMenuListView, NewItemsActivity.class);
                        break;
                    case 1:
                        toNextActivity(MainMenuListView, UsedItemsActivity.class);
                        break;
                    case 2:
                        toNextActivity(MainMenuListView, ConnectToShoppingActivity.class);
                        break;
                    case 3:
                        toNextActivity(MainMenuListView, Settings.class);
                        break;
                    case 4:
                        onContactUsClick();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    public void onContactUsClick() {
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

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
    public void toNextActivity(View aView, Class<?> aNextActivityClass){
        Intent intent = new Intent(this,aNextActivityClass);
        startActivity(intent);
    }

}
