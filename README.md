# HIDING-TEXT-IN-THE-IMAGE-USING-LSB
To secure sensitive text like weapon designs or maps, data is hidden in an image using the Least Significant Bit (LSB) technique. Each bit of the secret text is embedded into the image pixels, making the message invisible. The client can then extract the hidden data using the reverse process.
# Overview
This project is a Java-based desktop application that allows users to perform image steganography — the practice of hiding messages within images. Users can encode (encrypt) text messages into image files and later decode (decrypt) those hidden messages from the images.

# Features
Embed Messages in Images: Encrypt a text message and hide it within an image.

Decode Hidden Messages: Extract and display the hidden message from an image.

User-Friendly GUI: Simple graphical interface built with Java Swing.

File Operations: Open and save images before and after encoding.

# File Structure
Encryption.java – GUI and logic to embed messages into images.

Decryption.java – GUI and logic to decode messages from images.

MenuFrame.java – Main menu interface for navigating between features.

Main.java – Entry point that initializes the application with a splash screen.

Major-Project.iml – IntelliJ IDEA project configuration file.

# Requirements
Java Development Kit (JDK) 8 or higher

Java Swing (included in standard JDK)

An IDE such as IntelliJ IDEA or Eclipse (optional)

# How to Run
Compile the Java files:

javac MenuFrame.java
Run the application:
java Main
Use the GUI to choose between encoding or decoding messages.

# Notes
The application supports only image formats compatible with Java's ImageIO (e.g., PNG, JPG).

Messages are hidden using a simple least significant bit (LSB) technique.
