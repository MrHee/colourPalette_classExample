import java.util.ArrayList;

public class colourPalette {


    ArrayList<colour> colours;
    colour mainColour;
    int numberOfColours;

    //Generative Constructors
    //These will create colour palettes.

    colourPalette(colour mainColour, int numberOfColours){
        this.colours = new ArrayList<colour>();
        this.mainColour = mainColour;
        this.numberOfColours = numberOfColours;
        this.colours.add(mainColour);

        //Second colour is complimentary.
        if(numberOfColours > 1){
            int newColourR = 255-mainColour.r;
            int newColourG = 255-mainColour.g;
            int newColourB = 255-mainColour.b;
            colour temp = new colour(""+ mainColour.commonName +" 's compliment.",  newColourR, newColourG, newColourB);
            colours.add(temp);
        }

    }


    void display(){
        for (colour c : colours
             ) {
            c.display();
        }
    }

}
