package com.example.kaczor.tmc_shpreader.Main;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.kaczor.tmc_shpreader.Authors.AuthorsFragment;
import com.example.kaczor.tmc_shpreader.History.HistoryFragment;
import com.example.kaczor.tmc_shpreader.R;
import com.example.kaczor.tmc_shpreader.Shape.ShapeFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static {
        System.loadLibrary("hello-android-jni");
    }
    public native String getMsgFromJni();

    private NavigationView navigationView;;
    private DrawerLayout drawer;
    private FragmentManager fragmentManager;

    private int frame_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame_layout = R.id.Frame_Layout;
        fragmentManager = getSupportFragmentManager();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager.beginTransaction().replace(frame_layout, new ShapeFragment()).commit();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_history){
            fragmentManager.beginTransaction().replace(frame_layout, new HistoryFragment()).commit();
        }else if (id == R.id.nav_authors){
            fragmentManager.beginTransaction().replace(frame_layout, new AuthorsFragment()).commit();
        }else if (id == R.id.nav_shape ){
            fragmentManager.beginTransaction().replace(frame_layout, new ShapeFragment()).commit();
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
