public class Main {
    public static void main(String[] args) {

        colour newColour = new colour("Bellerose Burgandy", 118, 35, 47);

        colourPalette newPalette = new colourPalette(newColour, 2);
        newPalette.display();

    }
}