package com.example.pruebamenuapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.acciones, menu);
        MenuItem shareItem =menu.findItem(R.id.action_share);
        ShareActionProvider sh = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");
        intent.putExtra(Intent.EXTRA_STREAM, "");
        sh.setShareIntent(intent);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item1){
            Toast.makeText(this, "Has presionado la opción 1", Toast.LENGTH_SHORT).show();
        }else if(id== R.id.item2){
            Toast.makeText(this, "Has presionado la opción 2", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.favorito){
            Toast.makeText(this, "Se ha presionado la opción Favoritos", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}