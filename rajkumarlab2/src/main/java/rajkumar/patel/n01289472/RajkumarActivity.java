package rajkumar.patel.n01289472;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        setTitle(getString(R.string.firstscreen_title));
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage(getString(R.string.firstscreen_dialog));
        dialog.setCancelable(false);
        dialog.setPositiveButton(getString(R.string.firstscreen_dialog_yes), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                RajkumarActivity.this.finish();
            }
        });
        dialog.setNegativeButton(getString(R.string.firstscreen_dialog_no), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialogMessage = dialog.create();
        dialogMessage.setTitle(getString(R.string.firstscreen_dialod_exit));
        dialogMessage.setIcon(R.drawable.question_mark);
        dialogMessage.show();
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