package comp.dafood.Utils;

/**
 * Created by Javier on 11/12/2016.
 */

public class Pedido {
    private String entrada;
    private String almuerzo;
    private boolean refresco;
    private boolean postre;
    private String observaciones;
    private String numeroMesa;
    private String metododepago;
    private boolean status;
    private String uid;

    public Pedido() {
    }

    public Pedido(String entrada, String almuerzo, boolean refresco, boolean postre, String observaciones, String numeroMesa, String metododepago, boolean status) {
        this.entrada = entrada;
        this.almuerzo = almuerzo;
        this.refresco = refresco;
        this.postre = postre;
        this.observaciones = observaciones;
        this.numeroMesa = numeroMesa;
        this.metododepago = metododepago;
        this.status = status;
    }

    public Pedido(String entrada, String almuerzo, boolean refresco, boolean postre, String observaciones, String numeroMesa, String metododepago, boolean status, String uid) {
        this.entrada = entrada;
        this.almuerzo = almuerzo;
        this.refresco = refresco;
        this.postre = postre;
        this.observaciones = observaciones;
        this.numeroMesa = numeroMesa;
        this.metododepago = metododepago;
        this.status = status;
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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
}
