package rajkumar.patel.n01289472;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityCheckout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_checkout);
        setTitle(getString(R.string.checkout_title));

        loadList();
        ImageButton rajkumarIBtn2 = findViewById(R.id.rajkumarIBtn2);

        rajkumarIBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PatelActivityCheckout.this,PatelActivityPayment.class);
                startActivity(intent);
            }
        });
    }

    private void loadList(){
        RadioButton rajkumarRb1, rajkumarRb2, rajkumarRb3, rajkumarRb4,
                rajkumarRb5, rajkumarRb6, rajkumarRb7, rajkumarRb8,
                rajkumarRb9, rajkumarRb10, rajkumarRb11, rajkumarRb12;

        SharedPreferences myList = PreferenceManager.getDefaultSharedPreferences(PatelActivityCheckout.this);

        boolean apartment1Value = myList.getBoolean("apartment1Value", false);
        boolean apartment2Value = myList.getBoolean("apartment2Value", false);
        boolean apartment3Value = myList.getBoolean("apartment3Value", false);
        boolean apartment4Value = myList.getBoolean("apartment4Value", false);

        boolean detachedHome1Value = myList.getBoolean("detachedHome1Value", false);
        boolean detachedHome2Value = myList.getBoolean("detachedHome2Value", false);
        boolean detachedHome3Value = myList.getBoolean("detachedHome3Value", false);
        boolean detachedHome4Value = myList.getBoolean("detachedHome4Value", false);

        boolean semiDetachedHome1Value = myList.getBoolean("semiDetachedHome1Value", false);
        boolean semiDetachedHome2Value = myList.getBoolean("semiDetachedHome2Value", false);
        boolean semiDetachedHome3Value = myList.getBoolean("semiDetachedHome3Value", false);
        boolean semiDetachedHome4Value = myList.getBoolean("semiDetachedHome4Value", false);

        rajkumarRb1 = findViewById(R.id.rajkumarRb1);
        if (!apartment1Value){
            rajkumarRb1.setVisibility(View.GONE);
        }

        rajkumarRb2 = findViewById(R.id.rajkumarRb2);
        if (!apartment2Value){
            rajkumarRb2.setVisibility(View.GONE);
        }

        rajkumarRb3 = findViewById(R.id.rajkumarRb3);
        if (!apartment3Value){
            rajkumarRb3.setVisibility(View.GONE);
        }

        rajkumarRb4 = findViewById(R.id.rajkumarRb4);
        if (!apartment4Value){
            rajkumarRb4.setVisibility(View.GONE);
        }

        rajkumarRb5 = findViewById(R.id.rajkumarRb5);
        if (!detachedHome1Value){
            rajkumarRb5.setVisibility(View.GONE);
        }

        rajkumarRb6 = findViewById(R.id.rajkumarRb6);
        if (!detachedHome2Value){
            rajkumarRb6.setVisibility(View.GONE);
        }

        rajkumarRb7 = findViewById(R.id.rajkumarRb7);
        if (!detachedHome3Value){
            rajkumarRb7.setVisibility(View.GONE);
        }

        rajkumarRb8 = findViewById(R.id.rajkumarRb8);
        if (!detachedHome4Value){
            rajkumarRb8.setVisibility(View.GONE);
        }

        rajkumarRb9 = findViewById(R.id.rajkumarRb9);
        if (!semiDetachedHome1Value){
            rajkumarRb9.setVisibility(View.GONE);
        }

        rajkumarRb10 = findViewById(R.id.rajkumarRb10);
        if (!semiDetachedHome2Value){
            rajkumarRb10.setVisibility(View.GONE);
        }

        rajkumarRb11 = findViewById(R.id.rajkumarRb11);
        if (!semiDetachedHome3Value){
            rajkumarRb11.setVisibility(View.GONE);
        }

        rajkumarRb12 = findViewById(R.id.rajkumarRb12);
        if (!semiDetachedHome4Value){
            rajkumarRb12.setVisibility(View.GONE);
        }
    }
}