public class IsPractical {
    
}
import java.util.Scanner;

public class CaesarCipherSimple {
    
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char)((c - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(c)) {
                result.append((char)((c - 'a' + shift) % 26 + 'a'));
            } else {
                result.append(c); // Non-alphabetic characters stay the same
            }
        }
        
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    // public static void cryptanalysis(String cipherText) {
    //     System.out.println("Trying all possible keys:");
    //     for (int key = 1; key < 26; key++) {
    //         String decrypted = decrypt(cipherText, key);
    //         System.out.println("Key " + key + ": " + decrypted);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the plain text:");
        String plainText = sc.nextLine();
        
        System.out.println("Enter the shift key (1-25):");
        int key = sc.nextInt();
        sc.nextLine(); // consume newline
        
        String cipherText = encrypt(plainText, key);
        System.out.println("Encrypted Text: " + cipherText);
        
        // Decryption
        String decryptedText = decrypt(cipherText, key);
        System.out.println("Decrypted Text: " + decryptedText);
        
        // System.out.println("\nPerforming Cryptanalysis:");
        // cryptanalysis(cipherText);
        
        sc.close();
    }
}
