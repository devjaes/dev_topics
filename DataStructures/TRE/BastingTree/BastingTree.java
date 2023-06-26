package BastingTree;

public class BastingTree {
    public BastingTreeNode root;

    public BastingTree() {
        root = null;
    }

    public BastingTreeNode getRoot() {
        return root;
    }

    public void setRoot(BastingTreeNode root) {
        this.root = root;
    }

    public boolean insert(Comparable data) {
        if (this.getRoot() == null) {
            this.setRoot(new BastingTreeNode(data, null, true, null, true));
            return true;
        }

        BastingTreeNode aux = this.getRoot();
        while (!aux.getData().equals(data)) {

            if (data.compareTo(aux.getData()) < 0) {
                if (aux.getLeft() == null || !aux.isTrueLeft()) {
                    aux.setLeft(new BastingTreeNode(data, aux.getLeft(), aux.isTrueLeft(), aux, false));
                    aux.setTrueLeft(true);
                    return true;
                }

                aux = aux.getLeft();

            } else {
                if (aux.getRight() == null || !aux.isTrueRight()) {
                    aux.setRight(new BastingTreeNode(data, aux, false, aux.getRight(), aux.isTrueRight()));
                    aux.setTrueRight(true);
                    return true;
                }
            }
            aux = aux.getRight();

        }

        return false;
    }

    /**
     * Comparar si la raiz esta vacia si lo esta se inserta el dato en la raiz, con
     * su derecha e izquierda con referencia a null, y sus enlaces verdaderos en
     * true
     * Si la raiz no esta vacia se crea un nodo auxiliar que apunta a la raiz
     * 
     * Ciclo mientras el valor que se quiere insertar no sea igual al valor que
     * esta tomando el nodo auxiliar
     * si el valor que se quiere ingresar es menor al valor del auxiliar comparar si
     * la izquierda del nodo auxiliar esta vacia o es una un enlace izquierdo falso
     * si es asi creo un nuevo nodo con el valor que quiero ingresar, cuya izquierda
     * sera ena referencia
     * a null y sera un enlace verdadero, su derecha sera una referencia a aux y
     * sera un
     * enlace falso, en la izquierda de aux
     * y retorno true
     * si no asigno a mi nodo auxiliar su izquierda
     * 
     * si el dato que se quiere ingresar es mayor al valor del nodo auxliar
     * comprobar si su derecha no esta vacia o no es un enlace verdadero si es asi
     * entonces crear el
     * nodo en la derecha del auxiliar cuyo enlace izquierdo es una referencia a aux
     * y es un enlace
     * falso y su derecha es una referencia nula con enlace verdadero y retornar
     * true
     * 
     * en caso de no haberse creado ningun nodo, se asigna a aux su derecha y repite
     * el ciclo
     */
    public void print() {
        if (this.getRoot() == null) {
            System.out.println("Tree is empty");
        } else {
            BastingTreeNode current = this.getRoot();
            BastingTreeNode lastPrinted = null;

            while (current.getLeft() != null) {
                current = current.getLeft();
            }

            while (current != null) {
                System.out.println(current.getData());
                lastPrinted = current;
                current = current.getRight();

                if (current != null && current.isTrueRight()) {
                    while (current.isTrueLeft() && current.getLeft() != lastPrinted) {
                        current = current.getLeft();
                    }
                }
            }
        }
    }

}
