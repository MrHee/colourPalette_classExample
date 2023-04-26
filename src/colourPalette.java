import java.util.ArrayList;

public class colourPalette {


    ArrayList<colour> colours;
    colour mainColour;
    int numberOfColours;

    //Generative Constructors
    //These will create colour palettes.

    //Polymorphism - in OOP, methods with the same name can exist and be used depending on context.
    //This type of polymorphism called overloading.
    colourPalette(colour mainColour, int numberOfColours){
        this.colours = new ArrayList<>();
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

    colourPalette(colour firstKeyColour, colour secondKeyColour, int numberOfColours){

        this.colours = new ArrayList<>();
        this.mainColour = firstKeyColour;
        this.numberOfColours = numberOfColours;
        //Add both key colours to the palette.
        this.colours.add(firstKeyColour);
        this.colours.add(secondKeyColour);

        //Generate additional palette colours

        if (this.numberOfColours > 2) {
            //Third colour is average of the two key colours
            int r = (firstKeyColour.r + secondKeyColour.r) / 2;
            int g = (firstKeyColour.g + secondKeyColour.g) / 2;
            int b = (firstKeyColour.b + secondKeyColour.b) / 2;

            colour temp = new colour("Average of key colours", r, g, b);
            this.colours.add(temp);

            if (this.numberOfColours > 3) {
                //fourth colour is the compliment of the average.
                temp = new colour("Average's compliment", 255 - r, 255 - g, 255 - b);
                this.colours.add(temp);
            }
            if(this.numberOfColours > 4){
                //fifth colour - an analogous colour from the average.
                temp = new colour("Average but lighter" , (r+255)/2 , (g+255)/2 , (b+255)/2);
           this.colours.add(3, temp);
            }


        }



    }


    void display(){
        for (colour c : colours
             ) {
            c.display();
        }
    }

}
