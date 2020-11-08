package rajkumar.patel.n01289472;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_homepage);
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
                Toast.makeText(this,"Item 1 Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.rajkumarItem2:
                Toast.makeText(this,"Item 2 Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.rajkumarItem3:
                Toast.makeText(this,"Item 3 Clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}