public class Main {
    public static void main(String[] args) {
        Figure square = new Square(5.3f);
        Figure circle = new Circle(3.2f);
        Figure rectangle = new Rectangle(2.3f, 4.5f);

        FigureManager figureManager = new FigureManager(3);
        figureManager.insert(square);
        figureManager.insert(circle);
        figureManager.insert(rectangle);

        figureManager.printFiguresArea();
    }
}
