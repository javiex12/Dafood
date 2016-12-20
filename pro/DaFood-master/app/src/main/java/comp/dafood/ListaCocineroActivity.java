package comp.dafood;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import comp.dafood.Utils.Lista_Adaptador;
import comp.dafood.Utils.Pedido;

public class ListaCocineroActivity extends Activity {

    ListView lista;
    ArrayList<Pedido> datos;
    DatabaseReference database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cocinero);
        database= FirebaseDatabase.getInstance().getReference();
        datos = new ArrayList<>();
        lista= (ListView)findViewById(R.id.listview_listadopedidos);


        database.child("pedidos").addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                datos.clear();
                for(DataSnapshot pedidoDataSnapshot : dataSnapshot.getChildren()){
                    Pedido ped = pedidoDataSnapshot.getValue(Pedido.class);
                    if(ped.isStatus()==true){
                        datos.add(ped);
                    }

                }

                lista.setAdapter(new Lista_Adaptador(datos, R.layout.entrada_listview, getApplicationContext()) {
                    @Override
                    public void onEntrada(Object entrada, View view) {
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
