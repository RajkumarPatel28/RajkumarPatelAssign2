package rajkumar.patel.n01289472;

import androidx.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityHomepage extends AppCompatActivity {

    ViewFlipper rajkumarVf;
    CheckBox rajkumarCb1, rajkumarCb2, rajkumarCb3, rajkumarCb4,
            rajkumarCb5, rajkumarCb6, rajkumarCb7, rajkumarCb8,
            rajkumarCb9, rajkumarCb10, rajkumarCb11, rajkumarCb12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_homepage);
        setTitle("Select Home");

        rajkumarVf = findViewById(R.id.rajkumarVf);
        rajkumarVf.setDisplayedChild(0);

        rajkumarCb1 = findViewById(R.id.rajkumarCb1);
        rajkumarCb2 = findViewById(R.id.rajkumarCb2);
        rajkumarCb3 = findViewById(R.id.rajkumarCb3);
        rajkumarCb4 = findViewById(R.id.rajkumarCb4);
        rajkumarCb5 = findViewById(R.id.rajkumarCb5);
        rajkumarCb6 = findViewById(R.id.rajkumarCb6);
        rajkumarCb7 = findViewById(R.id.rajkumarCb7);
        rajkumarCb8 = findViewById(R.id.rajkumarCb8);
        rajkumarCb9 = findViewById(R.id.rajkumarCb9);
        rajkumarCb10 = findViewById(R.id.rajkumarCb10);
        rajkumarCb11 = findViewById(R.id.rajkumarCb11);
        rajkumarCb12 = findViewById(R.id.rajkumarCb12);

        ImageButton rajkumarIBtn = findViewById(R.id.rajkumarIBtn);
        rajkumarIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveList("apartment1Value", rajkumarCb1.isChecked());
                saveList("apartment2Value", rajkumarCb2.isChecked());
                saveList("apartment3Value", rajkumarCb3.isChecked());
                saveList("apartment4Value", rajkumarCb4.isChecked());

                saveList("detachedHome1Value", rajkumarCb5.isChecked());
                saveList("detachedHome2Value", rajkumarCb6.isChecked());
                saveList("detachedHome3Value", rajkumarCb7.isChecked());
                saveList("detachedHome4Value", rajkumarCb8.isChecked());

                saveList("semiDetachedHome1Value", rajkumarCb9.isChecked());
                saveList("semiDetachedHome2Value", rajkumarCb10.isChecked());
                saveList("semiDetachedHome3Value", rajkumarCb11.isChecked());
                saveList("semiDetachedHome4Value", rajkumarCb12.isChecked());

                Intent intent = new Intent( PatelActivityHomepage.this,PatelActivityCheckout.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.rajkumarItem1:
                setTitle("These are the Apartments");
                rajkumarVf.setDisplayedChild(1);
                return true;
            case R.id.rajkumarItem2:
                setTitle("These are the Detached Homes");
                rajkumarVf.setDisplayedChild(2);
                return true;
            case R.id.rajkumarItem3:
                setTitle("These are the Semi-Detached Homes");
                rajkumarVf.setDisplayedChild(3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void saveList(String key, boolean passed) {
        SharedPreferences myList = PreferenceManager.getDefaultSharedPreferences(PatelActivityHomepage.this);
        SharedPreferences.Editor editor = myList.edit();
        editor.putBoolean(key, passed);
        editor.apply();
    }
}