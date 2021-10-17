package net.erwinsyahrul.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final public static String EXTRA_NAME = "ekstra_name";
    final public static String EXTRA_EMAIL = "ekstra_email";
    final public static String EXTRA_PHONE = "ekstra_phone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.id_input_nama);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id.id_input_password);

        Button btnSave = (Button) findViewById(R.id.id_button_save);
        btnSave.setOnClickListener(v -> {
            Intent loginIntent = new Intent(MainActivity.this,DashboardActivity.class);
            loginIntent.putExtra(EXTRA_NAME,inputName.getText().toString());
            loginIntent.putExtra(EXTRA_EMAIL,inputEmail.getText().toString());
            loginIntent.putExtra(EXTRA_PHONE,inputPhone.getText().toString());
            startActivity(loginIntent);
        });
    }
}