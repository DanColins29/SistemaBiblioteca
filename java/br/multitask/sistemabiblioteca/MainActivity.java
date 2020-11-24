package br.multitask.sistemabiblioteca;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends Activity {

    public Button btnLogin;
    public EditText cod;
    public EditText password;
    public Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Button getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(Button btnLogin) {
        this.btnLogin = btnLogin;
    }

    public EditText getCod() {
        return cod;
    }

    public void setCod(EditText cod) {
        this.cod = cod;
    }

    public EditText getPassword() {
        return password;
    }

    public void setPassword(EditText password) {
        this.password = password;
    }

    public Spinner getSp() {
        return sp;
    }

    public void setSp(Spinner sp) {
        this.sp = sp;
    }
}
