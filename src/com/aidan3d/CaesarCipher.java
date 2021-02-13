// CaesarCipher.java
// This program encodes a message.
package com.aidan3d;
// import edu.duke.*;

/****
 * This program encodes a message.
 *
 * @author    Aidan Hegarty (with a great deal of help from Duke University via Coursera!)
 * @version   2/13/21
 */


public class CaesarCipher {

    /***
     * Checks whether a character is sitting in the seat
     * (i.e., whether a specific character is "sitting on
     * the 'bus'!")
     * @param currentPersonOfInterest   The current character at which we are looking
     * @param alphabets                 Basically, our solution set of available
     *                                  characters to encode—we can encode those
     *                                  on this list
     * @return                          A signal flag, raised if a character is
     *                                  to be found in the provided lower- and
     *                                  upper-case "EXISTING_SEATING_LIST" string
     */
    private boolean isHuman(char currentPersonOfInterest, String alphabets) {

        // Lower my boolean flag first. Assume I have picked
        // a non-manifest (unlisted) person initially...
        boolean doesBelong = false;

        // Check whether the one seated is, indeed, human after all!
        if ( -1 != alphabets.indexOf(currentPersonOfInterest ) ) {
            doesBelong = true;
        } // End of the single-alternative decision structure

        return doesBelong;
    } // End method isHuman


    /**
     * The "engine" of the program—this method does the actual leg-work
     * (as all engines do!)!
     * @param passengers    The message we wish to encode—I think of this
     *                      as a manifest, or list of "passenger's names"
     *                      (Letters of the alphabet, duplicates are all
     *                      right).
     * @param seatsMoved    The number of spaces we want to move the
     *                      letters of the alphabet, i.e., "3" moves "a"
     *                      to "d," etc. The analogy here is that we
     *                      "move" passengers in a single row of "seats"
     *                      up by a certain number of those seats—we
     *                      "slide" them up, if you will.
     * @return              An encrypted message
     */
    public String encrypt( String passengers, int seatsMoved ) { // A list such as "{'a', ' ', 'p', 'e', 'a'}

        // First, I'll create a kind of ship's manifest of those I
        // expect to be seated on my "bus..." (a population eligible
        // character-names, if you will).
        String EXISTING_SEATING_LIST =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";  // "People" we're looking for

        // String REVISED_SEATING_LIST = adjustSeatingPlan(EXISTING_SEATING_LIST, seatsMoved);

        // ...now, let's create an empty bus!
        StringBuilder bus = new StringBuilder( passengers );

        // Create a character variable to reference the
        // current "seat" being looked at (all seats have
        // a passenger of some kind, and are envisioned to
        // be, abstractly, placed in a single row. Cool bus!
        char currentPassengerOldName;

        // I will now initialize the thing-that-holds the-
        // current character being admired. An eyeball to
        // rove the bus' dark interior!
        currentPassengerOldName = ' ';

        // This next part loops through the "bus," looking
        // at every seat. isHuman means that we have a "human"
        // or "letter-of-the-alphabet character—if it ain't
        // "human," 'taint a letter in our alphabets (lower-
        // or upper-case)
        for ( int i = 0; i < bus.length(); i++ ) {

            // Look at the current "seat."
            currentPassengerOldName = bus.charAt(i);

            if ( isHuman( currentPassengerOldName, EXISTING_SEATING_LIST ) ) {
                // bus.charAt(i) = bump(seat, i);
            } // End of the single-alternative
              // decision structure

        } // End of the counter-controlled loop


        // Let's pull the "bus" out with the "people" accurately
        // seated within!
        String busAsString = bus.toString();
        return busAsString;

    } // end method encrypt

} // end class CaesarCipher

