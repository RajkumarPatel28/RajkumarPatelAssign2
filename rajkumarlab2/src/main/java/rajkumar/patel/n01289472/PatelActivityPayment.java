package rajkumar.patel.n01289472;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

//Name: Rajkumar Patel
//Student ID: N01289472
//Section: RNA

public class PatelActivityPayment extends AppCompatActivity {

    EditText rajkumarEtFullname, rajkumarEtCardNumber;
    ProgressBar rajkumarPb;
    boolean visibility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patel_payment);

        RadioGroup rajkumarRg = findViewById(R.id.rajkumarRg);
        rajkumarEtFullname = findViewById(R.id.rajkumarEtFullname);
        rajkumarEtCardNumber = findViewById(R.id.rajkumarEtCardNumber);
        rajkumarPb = findViewById(R.id.rajkumarPb);
        visibility = true;

        rajkumarRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rajkumarRBtn1 = findViewById(R.id.rajkumarRBtn1);
                if (rajkumarRBtn1.isChecked()){
                    rajkumarEtCardNumber.setVisibility(View.INVISIBLE);
                    visibility = false;
                }
                else {
                    rajkumarEtCardNumber.setVisibility(View.VISIBLE);
                    visibility = true;
                }
            }
        });

        Button rajkumarBtnValidate= findViewById(R.id.rajkumarBtnValidate);
        rajkumarBtnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, card;
                name = rajkumarEtFullname.getText().toString().trim();
                card = rajkumarEtCardNumber.getText().toString().trim();

                if (card.length() > 16 && visibility) {
                    rajkumarEtCardNumber.setError("The Card Number Entered is invalid");
                }

                if (name.length() < 2) {
                    rajkumarEtFullname.setError("The Name is invalid");
                    return;
                }

                else {
                    rajkumarPb.setVisibility(View.VISIBLE);

                    AlertDialog.Builder dialog = new AlertDialog.Builder(PatelActivityPayment.this);
                    dialog.setMessage("The Confirmation Number is 1234567890");
                    dialog.setCancelable(false);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    System.exit(0);
                                }
                            });
                    AlertDialog dialogmessage = dialog.create();
                    dialogmessage.setTitle("You Have Paid");
                    dialogmessage.show();
                }
            }
        });
    }
}