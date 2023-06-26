/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgeneral;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felix
 */
public class ArbolG {
    NodoAG raiz;

    ArbolG() {
        this.raiz = null;
    }

    ArbolBin transformarAB() {
        ArbolBin ab = new ArbolBin();
        if (this.raiz == null)
            return ab;

        ab.raiz = new NodoABin(this.raiz.dato);

        this.raiz.transformarAB(ab.raiz);

        return ab;

    }

    List<NodoABin> getHermanos(NodoABin nodo) {
        List<NodoABin> hermanos = new ArrayList<>();
        if (nodo.parent == null)
            return hermanos;
        NodoABin aux = nodo.parent.enlIzq;
        while (aux != null) {
            if (aux != nodo)
                hermanos.add(aux);
            aux = aux.enlDer;
        }
        return hermanos;
    }
}
