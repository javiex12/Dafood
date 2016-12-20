package comp.dafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import comp.dafood.Utils.Pedido;

public class AceptarActivity extends AppCompatActivity {

    EditText observaciones;
    EditText nMesa;
    RadioGroup rdgGroup;
    String metododepago;
    Button enviarPedido;
    String obs;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptar);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        observaciones = (EditText) findViewById(R.id.observaciones);
        nMesa = (EditText)findViewById(R.id.nmesa);
        rdgGroup = (RadioGroup)findViewById(R.id.radioGroup);
        rdgGroup.check(R.id.efectivo);
        enviarPedido = (Button)findViewById(R.id.enviarPedido);
        metododepago="Efectivo";
        obs="No hay observaciones";

        rdgGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.efectivo){
                metododepago = "Efectivo";
                }else if(checkedId == R.id.tarjeta){
                metododepago = "Planilla";
                }
            }
        });

        enviarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String almuerzo = getIntent().getExtras().getString("segundo");
                String entrada = getIntent().getExtras().getString("entrada");
                boolean refresco = getIntent().getExtras().getBoolean("refresco");
                boolean postre = getIntent().getExtras().getBoolean("postre");
                obs = observaciones.getText().toString();
                if(obs.equalsIgnoreCase("")){
                    obs="No hay observaciones";
                }

                String numeroMesa = nMesa.getText().toString();
                Pedido ped = new Pedido(entrada,almuerzo,refresco,postre,obs,numeroMesa,metododepago,true);
                String key = mDatabase.child("pedidos").push().getKey();
                mDatabase.child("pedidos").child(key).setValue(ped);

                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent);
            }
        });

    }


}
