package comp.dafood;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

public class MenuActivity extends AppCompatActivity {
    Button al1, al2, al3, al4, e1, e2, e3, refresco, postre;
    Button limpiar, agregar;
    String entrada, segundo;
    boolean pos, refres;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        al1 = (Button) findViewById(R.id.al_1);
        al2 = (Button) findViewById(R.id.al_2);
        al3 = (Button) findViewById(R.id.al_3);
        al4 = (Button) findViewById(R.id.al_4);

        e1= (Button) findViewById(R.id.en_1);
        e2= (Button) findViewById(R.id.en_2);
        e3= (Button) findViewById(R.id.en_3);

        refresco = (Button) findViewById(R.id.refresco);
        postre = (Button) findViewById(R.id.postre);

        limpiar= (Button) findViewById(R.id.limpiar);
        agregar = (Button) findViewById(R.id.agregarPedido);
        limpiarTodo();
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ColorDrawable cd = (ColorDrawable) e1.getBackground();
                int colorid = cd.getColor();

                if(colorid == Color.RED){
                    e1.setBackgroundColor(Color.WHITE);
                }else{
                    e1.setBackgroundColor(Color.RED);
                    e2.setBackgroundColor(Color.WHITE);
                    e3.setBackgroundColor(Color.WHITE);

                    cd = (ColorDrawable) al1.getBackground();
                    int coloridal1 = cd.getColor();
                    cd = (ColorDrawable) al2.getBackground();
                    int coloridal2 = cd.getColor();
                    cd = (ColorDrawable) al3.getBackground();
                    int coloridal3 = cd.getColor();
                    cd = (ColorDrawable) al4.getBackground();
                    int coloridal4 = cd.getColor();

                    if(coloridal1 == Color.RED|| coloridal2 == Color.RED|| coloridal3 == Color.RED || coloridal4 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }

            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) e2.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    e2.setBackgroundColor(Color.WHITE);
                }else{
                    e2.setBackgroundColor(Color.RED);
                    e1.setBackgroundColor(Color.WHITE);
                    e3.setBackgroundColor(Color.WHITE);

                    cd = (ColorDrawable) al1.getBackground();
                    int coloridal1 = cd.getColor();
                    cd = (ColorDrawable) al2.getBackground();
                    int coloridal2 = cd.getColor();
                    cd = (ColorDrawable) al3.getBackground();
                    int coloridal3 = cd.getColor();
                    cd = (ColorDrawable) al4.getBackground();
                    int coloridal4 = cd.getColor();

                    if(coloridal1 == Color.RED|| coloridal2 == Color.RED|| coloridal3 == Color.RED || coloridal4 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }

                }



            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) e3.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    e3.setBackgroundColor(Color.WHITE);
                }else{
                    e3.setBackgroundColor(Color.RED);
                    e1.setBackgroundColor(Color.WHITE);
                    e2.setBackgroundColor(Color.WHITE);

                    cd = (ColorDrawable) al1.getBackground();
                    int coloridal1 = cd.getColor();
                    cd = (ColorDrawable) al2.getBackground();
                    int coloridal2 = cd.getColor();
                    cd = (ColorDrawable) al3.getBackground();
                    int coloridal3 = cd.getColor();
                    cd = (ColorDrawable) al4.getBackground();
                    int coloridal4 = cd.getColor();

                    if(coloridal1 == Color.RED|| coloridal2 == Color.RED|| coloridal3 == Color.RED || coloridal4 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        al1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) al1.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    al1.setBackgroundColor(Color.WHITE);
                }else{
                    al1.setBackgroundColor(Color.RED);
                    al2.setBackgroundColor(Color.WHITE);
                    al3.setBackgroundColor(Color.WHITE);
                    al4.setBackgroundColor(Color.WHITE);


                    cd = (ColorDrawable) e1.getBackground();
                    int coloride1 = cd.getColor();
                    cd = (ColorDrawable) e2.getBackground();
                    int coloride2 = cd.getColor();
                    cd = (ColorDrawable) e3.getBackground();
                    int coloride3 = cd.getColor();

                    if(coloride1 == Color.RED|| coloride2 == Color.RED|| coloride3 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        al2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) al2.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    al2.setBackgroundColor(Color.WHITE);
                }else{
                    al2.setBackgroundColor(Color.RED);
                    al1.setBackgroundColor(Color.WHITE);
                    al3.setBackgroundColor(Color.WHITE);
                    al4.setBackgroundColor(Color.WHITE);


                    cd = (ColorDrawable) e1.getBackground();
                    int coloride1 = cd.getColor();
                    cd = (ColorDrawable) e2.getBackground();
                    int coloride2 = cd.getColor();
                    cd = (ColorDrawable) e3.getBackground();
                    int coloride3 = cd.getColor();

                    if(coloride1 == Color.RED|| coloride2 == Color.RED|| coloride3 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        al3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) al3.getBackground();
                int colorid = cd.getColor();

                if(colorid == Color.RED){
                    al3.setBackgroundColor(Color.WHITE);
                }else{
                    al3.setBackgroundColor(Color.RED);
                    al2.setBackgroundColor(Color.WHITE);
                    al1.setBackgroundColor(Color.WHITE);
                    al4.setBackgroundColor(Color.WHITE);


                    cd = (ColorDrawable) e1.getBackground();
                    int coloride1 = cd.getColor();
                    cd = (ColorDrawable) e2.getBackground();
                    int coloride2 = cd.getColor();
                    cd = (ColorDrawable) e3.getBackground();
                    int coloride3 = cd.getColor();

                    if(coloride1 == Color.RED|| coloride2 == Color.RED|| coloride3 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        al4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) al4.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    al4.setBackgroundColor(Color.WHITE);
                }else{
                    al4.setBackgroundColor(Color.RED);
                    al2.setBackgroundColor(Color.WHITE);
                    al3.setBackgroundColor(Color.WHITE);
                    al1.setBackgroundColor(Color.WHITE);


                    cd = (ColorDrawable) e1.getBackground();
                    int coloride1 = cd.getColor();
                    cd = (ColorDrawable) e2.getBackground();
                    int coloride2 = cd.getColor();
                    cd = (ColorDrawable) e3.getBackground();
                    int coloride3 = cd.getColor();

                    if(coloride1 == Color.RED|| coloride2 == Color.RED|| coloride3 == Color.RED ){
                        refresco.setBackgroundColor(Color.RED);
                        postre.setBackgroundColor(Color.RED);
                    }
                }
            }
        });

        postre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) postre.getBackground();
                int colorid = cd.getColor();

                if(colorid == Color.RED){
                    postre.setBackgroundColor(Color.WHITE);
                }else{
                    postre.setBackgroundColor(Color.RED);
                }
            }
        });

        refresco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorDrawable cd = (ColorDrawable) refresco.getBackground();
                int colorid = cd.getColor();


                if(colorid == Color.RED){
                    refresco.setBackgroundColor(Color.WHITE);
                }else{
                    refresco.setBackgroundColor(Color.RED);
                }
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiarTodo();
            }
        });

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ColorDrawable cd = (ColorDrawable) e1.getBackground();
                int coloride1 = cd.getColor();
                cd = (ColorDrawable) e2.getBackground();
                int coloride2 = cd.getColor();
                cd = (ColorDrawable) e3.getBackground();
                int coloride3 = cd.getColor();

                cd = (ColorDrawable) al1.getBackground();
                int coloridal1 = cd.getColor();
                cd = (ColorDrawable) al2.getBackground();
                int coloridal2 = cd.getColor();
                cd = (ColorDrawable) al3.getBackground();
                int coloridal3 = cd.getColor();
                cd = (ColorDrawable) al4.getBackground();
                int coloridal4 = cd.getColor();

                cd = (ColorDrawable) postre.getBackground();
                int coloridpostre = cd.getColor();

                cd = (ColorDrawable) refresco.getBackground();
                int coloridRefresco = cd.getColor();


                if(coloride1 == Color.RED){
                    entrada = "1";
                }else if(coloride2 == Color.RED){
                    entrada = "2";
                }else if(coloride3 == Color.RED){
                    entrada = "3";
                }else {
                    entrada = "No selecciono entrada";
                }

                if(coloridal1 == Color.RED){
                    segundo = "A";
                }else if(coloridal2 == Color.RED){
                    segundo = "B";
                }else if(coloridal3 == Color.RED){
                    segundo = "C";
                }else if(coloridal4 == Color.RED){
                    segundo = "D";
                }else{
                    segundo = "No seleciono segundo";
                }

                if(coloridpostre == Color.RED){
                    pos = true;
                }else{
                    pos = false;
                }

                if(coloridRefresco == Color.RED){
                    refres = true;
                }else{
                    refres = false;
                }

                Intent intent = new Intent(getApplicationContext(), AceptarActivity.class);
                intent.putExtra("entrada", entrada);
                intent.putExtra("segundo", segundo);
                intent.putExtra("refresco", refres);
                intent.putExtra("postre", pos);
                startActivity(intent);
            }
        });


    }

    public void limpiarTodo(){
        refresco.setBackgroundColor(Color.WHITE);
        postre.setBackgroundColor(Color.WHITE);
        e1.setBackgroundColor(Color.WHITE);
        e2.setBackgroundColor(Color.WHITE);
        e3.setBackgroundColor(Color.WHITE);
        al1.setBackgroundColor(Color.WHITE);
        al2.setBackgroundColor(Color.WHITE);
        al3.setBackgroundColor(Color.WHITE);
        al4.setBackgroundColor(Color.WHITE);
    }


}
