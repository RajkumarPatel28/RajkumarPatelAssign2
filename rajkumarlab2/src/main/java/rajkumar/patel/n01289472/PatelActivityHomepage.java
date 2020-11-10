package rajkumar.patel.n01289472;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ViewFlipper;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityHomepage extends AppCompatActivity {

    ViewFlipper rajkumarVf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_homepage);
        setTitle("Select Home");

        rajkumarVf = findViewById(R.id.rajkumarVf);
        rajkumarVf.setDisplayedChild(0);
        ImageButton rajkumarIBtn = findViewById(R.id.rajkumarIBtn);

        rajkumarIBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}