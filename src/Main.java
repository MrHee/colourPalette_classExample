public class Main {
    public static void main(String[] args) {

        colour newColour = new colour("Bellerose Burgandy", 118, 35, 47);
        colour secondColour = new colour("PK Blue",150 ,170,250);

        colourPalette newPalette = new colourPalette(newColour, secondColour,4);
        newPalette.display();

    }
}