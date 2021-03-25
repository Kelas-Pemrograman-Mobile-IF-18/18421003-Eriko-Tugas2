package com.eriko.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtTampil, txtJudul;
    EditText edtNpm, edtNama, edtAlamat, edtUmur, edtTelepon;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJudul = (TextView) findViewById(R.id.txtJudul);
        txtJudul.setText("Biodata");
        txtTampil = (TextView) findViewById(R.id.txtBiodata);

        edtNpm = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtUmur = (EditText) findViewById(R.id.edtUmur);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtTelepon = (EditText) findViewById(R.id.edtTelepon);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strUmur = edtUmur.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strTelepon = edtTelepon.getText().toString();
                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strUmur+ "\n" + strAlamat + "\n" + strTelepon);
            }
        });
    }
}