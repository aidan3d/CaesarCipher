// CaesarCipher.java
// This program encodes a message.
package com.aidan3d;

/****
 * This program encodes a message.
 *
 * @author    Aidan Hegarty (with a great deal
 *            deal of help from Duke University via
 *            Coursera!)
 * @version   3/11/21
 */


public class CaesarCipher {

    /***
     * Checks whether a character is sitting on the "bus,"(basically,
     * it runs through a list of characters, seeing if each is a
     * regular member of the alphabet (lower- or upper-case).
     *
     * @param currentPersonOfInterest   The current 'slot' at which
     *                                  we are looking, as we thumb
     *                                  through our incoming
     *                                  message's characters.
     * @param alphabets                 Letters of the alphabet. If
     *                                  it's a letter, we encode it!
     *                                  Fed into this function for
     *                                  convenience (for this cipher
     *                                  the 'code book' is just the
     *                                  upper and lower-case alphabet).
     * @return                          A signal flag, raised if a
     *                                  character is to be found in
     *                                  the lower- and upper-case
     *                                  alphabet string referenced by
     *                                  the parameter "alphabets."
     */
    private boolean isHuman( char currentPersonOfInterest,
        String alphabets ) {

        // Lower my boolean flag first. Assume I have picked
        // an off-the-manifest (unlisted) person initially...
        boolean doesBelong = false;

        // Check whether the one seated is, indeed, human
        // after all!
        if ( -1 != alphabets.indexOf( currentPersonOfInterest ) ) {
            doesBelong = true;
        } // End of the single-alternative decision structure

        // Finally, let the calling method know whether the
        // person popped is supposed to be at the 'party!'
        return doesBelong;
    } // end method isHuman

    char bump( int oldPassengerSeatNumber, int newPassengerSeatNumber ) {
        // physically change the character
    } // end method bump


    /**
     * The "engine" of the program—this method does the actual leg-
     * work (as all engines do!).
     * @param passengers    The message we wish to encode—I think of
     *                      this as a kind of passenger manifest,
     *                      or list of names of passengers (each
     *                      denoted by a letter of the alphabet)
     *                      wishing to get on a proverbial "bus"
     *                      (only lower- or upper-case letters of the
     *                      alphabet will be allowed to stay on
     *                      board).
     * @param seatsBumped   The number of spaces we want to move the
     *                      letters of the alphabet, i.e., "3" moves
     *                      "a" to "d," etc. The analogy here is that
     *                      we "move" passengers in a single row of
     *                      "seats" up by a certain number of those
     *                      seats—we "slide" them up, if you will.
     * @return              An encrypted message, or string with
     *                      relocated characters (maybe all the letter
     *                      "v"s are now "w"s).
     */
    public String encrypt( String passengers, int seatsBumped ) {
        // Remember, the variable "passengers" references a list such
        // as "{'a', ' ', 'p', 'e', 'a'}

        // First, I'll create a kind of ship's manifest of those I
        // expect to be seated on my "bus" (a population of
        // eligible character-names, if you will)...these are
        // "people" we will be scouting for.
        String EXISTING_SEATING_LIST =
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // String REVISED_SEATING_LIST =
        //     adjustSeatingPlan(EXISTING_SEATING_LIST, seatsBumped);

        // Now, let's create an empty bus!
        StringBuilder bus = new StringBuilder( passengers );

        // Create a character variable to reference the current "seat"
        // being looked at (all seats have a passenger of some kind
        // (alphabetic or other), and are envisioned to be,
        // abstractly, placed in a single row. Cool bus!
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

            if ( isHuman( currentPassengerOldName,
                    EXISTING_SEATING_LIST ) ) {
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
