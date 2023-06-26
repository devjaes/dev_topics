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
public class ArbolGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolG ag = new ArbolG();
        ag.raiz = new NodoAG('A');
        ag.raiz.hijos.insertar( new NodoAG( 'B' ) );
        ag.raiz.hijos.insertar( new NodoAG( 'C' ) );
        ag.raiz.hijos.insertar( new NodoAG( 'D' ) );
        
        ((NodoAG)(ag.raiz.hijos.primero.siguiente.dato)).hijos.insertar( new NodoAG( 'E' ) );
        ((NodoAG)(ag.raiz.hijos.primero.siguiente.dato)).hijos.insertar( new NodoAG( 'F' ) );
        
        ArbolBin ab = ag.transformarAB();
        
        ab.imprimirSimétrico();
        
        // insertar 2 hijos más de la raíz y 2 nietos de la raíz. 
        
        // imprimir todos los valores con una sentencia cada uno.  
    }
    
}
