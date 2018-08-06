package com.example.halkabani.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.halkabani.login.Presenter.ILoginPresenter;
import com.example.halkabani.login.Presenter.LoginPresenter;
import com.example.halkabani.login.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView{
    EditText email, password;
    Button but;
    ILoginPresenter Pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.emailText);
        password = (EditText) findViewById(R.id.passwordText);
        but = (Button) findViewById(R.id.button);

        Pre = new LoginPresenter(this);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pre.onLogin(email.getText().toString(), password.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
