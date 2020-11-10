package rajkumar.patel.n01289472;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityCheckout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_checkout);
        setTitle("Checkout");

        ImageButton rajkumarIBtn2 = findViewById(R.id.rajkumarIBtn2);

        rajkumarIBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( PatelActivityCheckout.this,PatelActivityPayment.class);
                startActivity(intent);
            }
        });
    }
}