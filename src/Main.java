public class Main {
    public static void main(String[] args) {

        //Main is for testing.

        colour newColour = new colour("Mid yellow (brown)", 120, 120, 0);
        colour secondColour = new colour("Pink",200 ,150,150);

        colourPalette newPalette = new colourPalette(newColour, secondColour,5);
        newPalette.display();

    }
}