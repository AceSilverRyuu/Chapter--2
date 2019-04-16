import javax.swing.*;

public class madLibs {

    public static void main (String [] args){

        String color;
        String wordEST;
        String bodyPartPlural;
        String animal;
        String noun;
        String pluralNoun;
        String aString;
        String bString;
        int a;
        int b;
        int c;


        color = JOptionPane.showInputDialog(null,
                "enter a color.", JOptionPane.INFORMATION_MESSAGE);
        wordEST = JOptionPane.showInputDialog(null,
                "enter a word ending in EST.", JOptionPane.INFORMATION_MESSAGE);
        bodyPartPlural = JOptionPane.showInputDialog(null,
                "enter a plural body part.", JOptionPane.INFORMATION_MESSAGE);
        animal = JOptionPane.showInputDialog(null,
                "enter an animal.", JOptionPane.INFORMATION_MESSAGE);
        noun = JOptionPane.showInputDialog(null,
                "enter a noun.", JOptionPane.INFORMATION_MESSAGE);
        pluralNoun = JOptionPane.showInputDialog(null,
                "enter a plural noun.", JOptionPane.INFORMATION_MESSAGE);
        aString = JOptionPane.showInputDialog(null,
                "enter a number.", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(aString);

        bString = JOptionPane.showInputDialog(null,
                "enter another number.", JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(bString);

        c = a + b;

        JOptionPane.showMessageDialog(null, "The " + color + "Dragon is the " + wordEST +
                "dragon of all. It has "+ c + bodyPartPlural + ", and a " +animal + " shaped like a " + noun +
                " It loves to eat " + pluralNoun + ", although it will feast on nearly anything.");


    }
}
