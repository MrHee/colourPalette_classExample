public class colour {

    int r; //how much red 0-255
    int g;
    int b;

    String commonName;

    //Constructor
    colour(String name, int r, int g, int b) {
        this.commonName = name;
        this.r = r;
        this.g = g;
        this.b = b;
    }


    int[] getRGB(){
        return new int[] {r,g,b};

    }

    String getHexCode(){
        //Hex codes look like: #C805C8
        String hexCode = "#"; // Starts as string with only the #

        //Add r to the end as a hex string.
        if(Integer.toHexString(r).length() < 2){
            hexCode += "0";
        }
        hexCode += Integer.toHexString(r);

        //Add g to the end as a hex string.
        if(Integer.toHexString(g).length() < 2){
            hexCode += "0";
        }
        hexCode += Integer.toHexString(g);

        //Add b to the end as a hex string.
        if(Integer.toHexString(b).length() < 2){
            hexCode += "0";
        }
        hexCode += Integer.toHexString(b);

        return  hexCode;
    }

    //This is an example of a more efficient implementation of the above. It is somewhat harder to understand.
    //It uses an integer array and a foreach loop to remove redundant code.
    String getHexCodeEfficiently(){
        String hexCode = "#";
        for (int c: getRGB()
             ) {
            if(Integer.toHexString(c).length() <2){
                hexCode += "0";
            }
            hexCode += Integer.toHexString(c);
        }

        return hexCode;
    }


    //Let's make a display method using the console strings we tested last week.
    //System.out.println("\033[48;2;132;72;52m");

void display(){
    System.out.print("Colour: " + commonName);
    System.out.println("     Hex: " + getHexCode());
    String colourString = "\033[48;2;" + r + ";" + g + ";" + b + "m";
    System.out.println(colourString);
    System.out.println(""); //Create a blank line.
    System.out.print("\u001B[0m"); //Reset console colour
}





}
