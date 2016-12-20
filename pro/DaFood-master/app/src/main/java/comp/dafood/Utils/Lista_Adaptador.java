package comp.dafood.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Javier on 12/12/2016.
 */

public abstract class Lista_Adaptador extends BaseAdapter{

    private ArrayList<?> entradas;
    private int r_layout_idView;
    private Context context;

    public Lista_Adaptador(ArrayList<?> entradas, int r_layout_idView, Context context) {
        this.entradas = entradas;
        this.r_layout_idView = r_layout_idView;
        this.context = context;
    }

    @Override
    public int getCount() {
        return entradas.size();
    }

    @Override
    public Object getItem(int position) {
        return entradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int posicion, View view, ViewGroup pariente) {
        if (view == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(r_layout_idView, null);
        }
        onEntrada(entradas.get(posicion), view);
        return view;
    }

    /** Devuelve cada una de las entradas con cada una de las vistas a la que debe de ser asociada
     * @param entrada La entrada que será la asociada a la view. La entrada es del tipo del paquete/handler
     * @param view View particular que contendrá los datos del paquete/handler
     */

    public abstract void onEntrada(Object entrada, View view);

}
