package comp.dafood.Utils;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Javier on 12/12/2016.
 */

public class Lista_entrada {
    private String entrada;
    private String almuerzo;
    private boolean refresco;
    private boolean postre;
    private String observaciones;
    private String numeroMesa;
    private String metododepago;
    private boolean status;
    private RadioGroup rg;
    private RadioButton rb1;
    private RadioButton rb2;
    private Button button;

    public Lista_entrada(String entrada, String almuerzo, boolean refresco, boolean postre, String observaciones, String numeroMesa, String metododepago, boolean status, RadioGroup rg, RadioButton rb1, RadioButton rb2, Button button) {
        this.entrada = entrada;
        this.almuerzo = almuerzo;
        this.refresco = refresco;
        this.postre = postre;
        this.observaciones = observaciones;
        this.numeroMesa = numeroMesa;
        this.metododepago = metododepago;
        this.status = status;
        this.rg = rg;
        this.rb1 = rb1;
        this.rb2 = rb2;
        this.button = button;
    }

    public Lista_entrada() {
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public boolean isRefresco() {
        return refresco;
    }

    public void setRefresco(boolean refresco) {
        this.refresco = refresco;
    }

    public boolean isPostre() {
        return postre;
    }

    public void setPostre(boolean postre) {
        this.postre = postre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getMetododepago() {
        return metododepago;
    }

    public void setMetododepago(String metododepago) {
        this.metododepago = metododepago;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public RadioGroup getRg() {
        return rg;
    }

    public void setRg(RadioGroup rg) {
        this.rg = rg;
    }

    public RadioButton getRb1() {
        return rb1;
    }

    public void setRb1(RadioButton rb1) {
        this.rb1 = rb1;
    }

    public RadioButton getRb2() {
        return rb2;
    }

    public void setRb2(RadioButton rb2) {
        this.rb2 = rb2;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
