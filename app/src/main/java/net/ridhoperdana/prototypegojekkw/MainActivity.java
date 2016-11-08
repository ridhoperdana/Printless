package net.ridhoperdana.prototypegojekkw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tombolRegister = (Button)findViewById(R.id.registerButton);
        Button tombolLogin = (Button)findViewById(R.id.loginButton);
        tombolRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                //intent.putExtra(RegisterActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });

        tombolLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainMenuUserActivity.class);
                //intent.putExtra(RegisterActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });
    }
}
