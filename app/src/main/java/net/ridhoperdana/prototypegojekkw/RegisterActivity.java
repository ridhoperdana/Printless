package net.ridhoperdana.prototypegojekkw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button submitButton = (Button)findViewById(R.id.submitRegister);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                //intent.putExtra(OtherActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });
    }
}
