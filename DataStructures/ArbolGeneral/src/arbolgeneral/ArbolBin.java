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
public class ArbolBin {
    NodoABin raiz;
    
    ArbolBin(){
        this.raiz = null;
    }
    
    boolean insertar( Object dato, boolean izq, Object padre ){
        return false;
    }
    
    void imprimirSimétrico(){
        if ( this.raiz != null )
            this.raiz.imprimirSimétrico();
    }
    
    void imprimirPreorden(){
        if ( this.raiz != null )
            this.raiz.imprimirPreorden();
    }
    
    void imprimirPostorden(){
        if ( this.raiz != null )
            this.raiz.imprimirPostOrden();
    }
    
}
