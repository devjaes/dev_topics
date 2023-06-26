package arbolgeneral;

public class LexBinTree extends ArbolBin {
    public LexBinTree() {
        super();
    }

    public boolean insert(int number) {
        NodoABin newNodoABin = new NodoABin(number);

        if (this.raiz == null) {
            this.raiz = newNodoABin;
            this.raiz.setParent(null);
            return true;
        } else {
            NodoABin current = this.raiz;

            while (true) {
                if (number < (int) current.getDato()) {
                    if (current.getEnlIzq() == null) {
                        current.setEnlIzq(newNodoABin);
                        current.getEnlIzq().setParent(current);
                        return true;
                    } else {
                        current = current.getEnlIzq();
                    }
                } else if (number > (int) current.getDato()) {
                    if (current.getEnlDer() == null) {
                        current.setEnlDer(newNodoABin);
                        current.getEnlDer().setParent(current);
                        return true;
                    } else {
                        current = current.getEnlDer();
                    }
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public String toString() {
        String LexTree = String.valueOf(this.raiz) + "\n";

        return LexTree;
    }

    public String chidsToString(NodoABin root) {

        return (root.getEnlIzq().equals(null) ? "null"
                : String.valueOf((int) root.getDato()))
                + (root.getEnlDer().equals(null) ? "null"
                        : String.valueOf((int) root.getDato()));

    }

    public void print() {
        if (this.raiz.equals(null)) {
            System.out.println("");
        } else {
            this.raiz.imprimirSimétrico();
        }

    }

    // 3,5,6,8,9,10--S
    // 3,6,10,9,8,5--POS
}
