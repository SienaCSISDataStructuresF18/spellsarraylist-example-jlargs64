/*
 * Example SpellsArray: a version of the Spells program that
 * uses an ArrayList of Associations, which is developed in class
 *
 * Siena College, CSIS 210, Fall 2017
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SpellsArrayList {

    public static void main(String args[]) throws IOException {

	final int NUM_SPELLS = 10;
        // create an array of the magic spells we know.
        // Note: due to the way Java handles arrays and generic types,
        // we have to leave off the <String,String> in the construction..
        ArrayList<Association<String,String>> spells = new ArrayList<Association<String, String>>();
	Scanner inFile = new Scanner(new File("spells.txt"));
	for (int i = 0; i < NUM_SPELLS; i++) {
	    String spell = inFile.nextLine().trim();
	    String action = inFile.nextLine().trim();
       
	    spells.add(new Association<String,String>(spell, action));
	    //System.out.println(spells[i]);
	}
	inFile.close();

        // we play a little game matching spells to descriptions
        // until an invalid spell is specified
        Scanner keyboard = new Scanner(System.in);
        int spellnum = 0;
        while (spellnum >= 0) {
            System.out.print("Which spell will you use? ");
            String spellName = keyboard.next();
            spellnum = -1;
            for (int spellIndex = 0; spellIndex < spells.size(); spellIndex++) {
                if (spellName.equals(spells.get(spellIndex).getKey())) {
                    spellnum = spellIndex;
                    break;
                }
            }
            if (spellnum >= 0) {
                System.out.println(spells.get(spellnum).getValue());
            }
            else {
                System.out.println("Your wand doesn't know that one.  It explodes.  Bye!");
            }
        }
    }
}
