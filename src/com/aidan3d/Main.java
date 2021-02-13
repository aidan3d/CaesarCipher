package com.aidan3d;

public class Main {

    public static void main(String[] args) {
        // Create a new CaesarCipher object.
        CaesarCipher engine = new CaesarCipher();

        // Roll out the 'welcome mat!'
        System.out.println(
                "Hello, world. A CaesarCipher object referenced by the variable \"engine\" has been created."
        );

        // Encrypt a simple message.
        String encryptedMessage = engine.encrypt( "abc", 3 );

        // Display the encoded message.
        System.out.printf( "The message has been encrypted. It now reads: \"%s\".", encryptedMessage );

    } //end method main
} // end class Main
