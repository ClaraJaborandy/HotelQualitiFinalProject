package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hotelqualitifinalproject.model.Guest;
import com.example.hotelqualitifinalproject.service.GuestService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class RegisterPage extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        //final EditText nomeCompleto = (EditText) findViewById(R.id.NomeCompleto);
        //final EditText emailAddress = (EditText) findViewById(R.id.EmailAddress);
        //final EditText password = (EditText) findViewById(R.id.editTextTextPassword2);
        //final EditText phone = (EditText) findViewById(R.id.editTelephone);
        //final EditText birthday = (EditText) findViewById(R.id.editTextDate5);
        //Button registrar = (Button) findViewById(R.id.button2);

        //registrar.setOnClickListener(new View.OnClickListener() {

        //   @Override
        //   public void onClick(View v) {
        //       dialog = new ProgressDialog(RegisterPage.this);
        //       dialog.setMessage("Carregando...");
        //       dialog.setCancelable(false);
        //       dialog.show();
        //       Guest guest = new Guest();
        //       guest.setName(nomeCompleto.getText().toString());
        //       guest.setEmail(emailAddress.getText().toString());
        //       guest.setPassword(password.getText().toString());
        //       guest.setTelephone(phone.getText().toString());
        //       guest.setBirthday(birthday.getText().toString());
        //       GuestService guestService = GuestService.retrofit.create(GuestService.class);
        //       final Call<Void> call = GuestService.saveGuest(guest);
        //      call.enqueue(new Callback<Void>() {
        //           @Override
        //           public void onResponse(Call<Void> call, Response<Void> response) {
        //               if (dialog.isShowing())
        //                  dialog.dismiss();
        //               Toast.makeText(getBaseContext(), "Se cadastro foi realizado com sucesso", Toast.LENGTH_SHORT).show();
        //           }
//
        //           @Override
        //           public void onFailure(Call<Void> call, Throwable t) {
        //               if (dialog.isShowing())
        //                   dialog.dismiss();
        //               Toast.makeText(getBaseContext(), "Não foi possível realizar o cadastro. Tente novamente mais tarde.", Toast.LENGTH_SHORT).show();
        //            }
        //        });
        //   }
        //});

        //public void clickRegister (View v) {
        //    Intent intent = new Intent(this, MainActivity.class);
        //    startActivity(intent);
        //    finish();
        //}


    }
}