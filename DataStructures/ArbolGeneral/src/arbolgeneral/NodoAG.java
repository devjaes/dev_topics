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
public class NodoAG {
    Object dato;
    Lista hijos;

    NodoAG(Object dato) {
        this.dato = dato;
        this.hijos = new Lista();
    }

    void transformarAB(NodoABin raiz) {
        if (this.hijos.primero == null) // nodo no tiene hijos
            return; // no hay nada que hacer
        NodoABin hermano = raiz.enlIzq = new NodoABin(((NodoAG) (this.hijos.primero.dato)).dato);
        hermano.parent = raiz;
        ((NodoAG) (this.hijos.primero.dato)).transformarAB(hermano);
        Nodo aux = this.hijos.primero.siguiente;
        while (aux != null) {
            hermano.enlDer = new NodoABin(((NodoAG) (aux.dato)).dato);
            hermano.enlDer.parent = raiz;
            ((NodoAG) (aux.dato)).transformarAB(hermano.enlDer);
            hermano = hermano.enlDer;
            aux = aux.siguiente;
        }

    }
}
