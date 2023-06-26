/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgeneral;

/**
 *
 * @author felix
 */
public class NodoABin {
    Object dato;
    NodoABin enlIzq;
    NodoABin enlDer;
    NodoABin parent;

    NodoABin(Object dato) {
        this.dato = dato;
        this.enlIzq = this.enlDer = null;
    }

    boolean insertar(int valor) {
        if (valor == (Integer) this.dato)
            return false;
        else if (valor < (Integer) this.dato)
            if (this.enlIzq == null) {
                this.enlIzq = new NodoABin(valor);
                this.enlIzq.parent = this;
                return true;
            } else
                return this.enlIzq.insertar(valor);
        else if (this.enlDer == null) {
            this.enlDer = new NodoABin(valor);
            this.enlDer.parent = this;
            return true;
        } else
            return this.enlDer.insertar(valor);
    }

    void imprimirSimétrico() {
        if (this.enlIzq != null)
            this.enlIzq.imprimirSimétrico();

        System.out.println(this.dato);

        if (this.enlDer != null)
            this.enlDer.imprimirSimétrico();
    }

    void imprimirPreorden() {
        System.out.println(this.dato);

        if (this.enlIzq != null)
            this.enlIzq.imprimirPreorden();

        if (this.enlDer != null)
            this.enlDer.imprimirPreorden();
    }

    void imprimirPostOrden() {

        if (this.enlIzq != null)
            this.enlIzq.imprimirPostOrden();

        if (this.enlDer != null)
            this.enlDer.imprimirPostOrden();

        System.out.println(this.dato);
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoABin getEnlIzq() {
        return enlIzq;
    }

    public void setEnlIzq(NodoABin enlIzq) {
        this.enlIzq = enlIzq;
    }

    public NodoABin getEnlDer() {
        return enlDer;
    }

    public void setEnlDer(NodoABin enlDer) {
        this.enlDer = enlDer;
    }

    public NodoABin getParent() {
        return parent;
    }

    public void setParent(NodoABin parent) {
        this.parent = parent;
    }

}
