package edu.ru.exercise01;

/**
 *
 * @author upall
 */
public class MainClass {
    public static void main(String[] args){
        String myPlainText = "attack at noon";
        String myEncryptedText = encrypt(myPlainText, 5);
        System.out.println("Plain Text: " + myPlainText);
        System.out.println("Encrypted Text:" + myEncryptedText);
        
    }
    public static String encrypt(String plainText, int key){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        char currentChar;
        int currentCharPos;
        int encryptedCharPos;
        char encryptedChar;
        String encryptedText = "";
        
        for(int i = 0; i < plainText.length(); i++){
            
            currentChar = plainText.charAt(i);
            currentCharPos = alphabet.indexOf(currentChar);
            encryptedCharPos = (currentCharPos + key) % alphabet.length();
            encryptedChar = alphabet.charAt(encryptedCharPos);
            
            encryptedText = encryptedText + encryptedChar;
        }
    
    return encryptedText;
    }
}
