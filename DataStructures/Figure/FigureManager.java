public class FigureManager {
    private Figure[] figures;

    public FigureManager(Figure[] figures) {
        this.figures = figures;
    }

    public FigureManager(int figuresNumber) {
        this.figures = new Figure[figuresNumber];
    }

    public boolean insert(Figure figure) {
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] == null) {
                figures[i] = figure;
                return true;
            }
        }
        return false;
    }

    public void printFiguresArea() {
        for (Figure figure : figures) {
            if (figure != null) {
                System.out.printf("Area de %s: %.2f\n", figure.getClass().getName(), figure.getArea());
            }
        }
    }
}
