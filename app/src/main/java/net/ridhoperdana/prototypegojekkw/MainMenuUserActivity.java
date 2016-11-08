package net.ridhoperdana.prototypegojekkw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_user);
        Button tombolPesanBaru = (Button)findViewById(R.id.pesanBaru);
        Button tombolRiwayat = (Button)findViewById(R.id.historiPesan);

        tombolPesanBaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuUserActivity.this, MainMenuActivity.class);
                //intent.putExtra(RegisterActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });

        tombolRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuUserActivity.this, RiwayatStatusActivity.class);
                //intent.putExtra(RegisterActivity.KEY_EXTRA, yourDataObject);
                startActivity(intent);
            }
        });
    }
}
