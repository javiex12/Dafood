package comp.dafood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import comp.dafood.Utils.Lista_Adaptador;
import comp.dafood.Utils.Pedido;

public class ListaMosoActivity extends AppCompatActivity {

    ListView lista;
    ArrayList<Pedido> datos;
    DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_moso);
        database= FirebaseDatabase.getInstance().getReference();
        datos = new ArrayList<>();
        lista = (ListView) findViewById(R.id.listview_listadopedidosmoso);

        database.child("pedidos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                datos.clear();

                for(DataSnapshot pedidoDataSnapshot : dataSnapshot.getChildren()){
                    Pedido ped = pedidoDataSnapshot.getValue(Pedido.class);
                    ped.setUid(pedidoDataSnapshot.getKey());
                    if(ped.isStatus()==true){
                        datos.add(ped);
                    }

                }

                lista.setAdapter(new Lista_Adaptador(datos, R.layout.entrada_listviewmoso, getApplicationContext()) {
                    @Override
                    public void onEntrada(final Object entrada, View view) {

                        if (entrada != null) {
                            TextView entradaRest = (TextView) view.findViewById(R.id.entrada);
                            if (entradaRest != null) {
                                entradaRest.setText("Entrada: " + ((Pedido) entrada).getEntrada());
                            }
                            TextView segundo = (TextView) view.findViewById(R.id.segundo);
                            if (segundo != null) {
                                segundo.setText("Segundo: " + ((Pedido) entrada).getAlmuerzo());
                            }
                            TextView refresco = (TextView) view.findViewById(R.id.refresco);
                            if (refresco != null) {
                                boolean refre = ((Pedido) entrada).isRefresco();
                                if (refre == true) {
                                    refresco.setText("Refresco: Si");
                                } else {
                                    refresco.setText("Refresco: No");
                                }
                            }
                            TextView postre = (TextView) view.findViewById(R.id.postre);
                            if (postre != null) {
                                boolean post = ((Pedido) entrada).isPostre();
                                if (post == true) {
                                    postre.setText("Postre: Si");
                                } else {
                                    postre.setText("Postre: No");
                                }
                            }

                            TextView observa = (TextView) view.findViewById(R.id.obs);
                            if (observa != null) {
                                observa.setText("Numero de mesa: " + ((Pedido) entrada).getObservaciones());
                            }

                            TextView numMesa = (TextView) view.findViewById(R.id.numMesa);
                            if (numMesa != null) {
                                numMesa.setText("Observaciones: " + ((Pedido) entrada).getNumeroMesa());
                            }

                            RadioGroup rg = (RadioGroup) view.findViewById(R.id.radioGroup);
                            if(rg !=null){
                                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                    @Override
                                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                                        if(checkedId == R.id.radiopro){
                                            ((Pedido)entrada).setStatus(true);
                                            Toast.makeText(getApplicationContext(), ((Pedido)entrada).getUid(), Toast.LENGTH_LONG).show();
                                        }else if(checkedId == R.id.radiofin){
                                            ((Pedido)entrada).setStatus(false);
                                            Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                            }

                            Button cambios = (Button)view.findViewById(R.id.cambios);
                            if(cambios !=null){
                                cambios.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(((Pedido)entrada).isStatus()==false){
                                            Toast.makeText(getApplicationContext(), "false", Toast.LENGTH_LONG).show();
                                            Pedido pes = ((Pedido)entrada);
                                            pes.setStatus(false);
                                        database.child("pedidos").child(pes.getUid()).setValue(pes);
                                        }else{
                                            Toast.makeText(getApplicationContext(), "verdadero", Toast.LENGTH_LONG).show();
                                        }
                                    }
                                });
                            }




                        }
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

}
