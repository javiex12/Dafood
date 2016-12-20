package comp.dafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button alm,desa,moso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alm=(Button)findViewById(R.id.almuerzo);
        desa=(Button) findViewById(R.id.desayuno);
        moso = (Button)findViewById(R.id.moso);

        alm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,MenuActivity.class);
                startActivity(i);
            }
        });

        desa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListaCocineroActivity.class);
                startActivity(i);
            }
        });

        moso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListaMosoActivity.class);
                startActivity(i);
            }
        });
    }
}
