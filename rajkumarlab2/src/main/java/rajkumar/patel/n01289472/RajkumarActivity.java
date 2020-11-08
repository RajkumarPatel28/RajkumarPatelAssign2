package rajkumar.patel.n01289472;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class RajkumarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajkumar);
    }

    public void callIntent(View view) {
        switch (view.getId()) {
            case R.id.rajkumarBtn:
            case R.id.rajkumarBtn2:
                Intent intent = new Intent(RajkumarActivity.this, PatelActivityHomepage.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}