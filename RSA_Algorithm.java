

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA_Algorithm {

    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    // Key size in bits (for demonstration purposes; should be larger in practice)
    private static final int KEY_SIZE = 512;

    // Secure random number generator
    private static final SecureRandom random = new SecureRandom();

    public RSA_Algorithm() {
        // Generate key pair
        generateKeyPair();
    }

    private void generateKeyPair() {
        // Step 1: Choose two distinct large random prime numbers, p and q
        BigInteger p = BigInteger.probablePrime(KEY_SIZE, random);
        BigInteger q = BigInteger.probablePrime(KEY_SIZE, random);

        // Step 2: Compute n = pq
        modulus = p.multiply(q);

        // Step 3: Compute the totient (ϕ) of n: ϕ(n) = (p-1)(q-1)
        BigInteger totient = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        // Step 4: Choose a public exponent 'e' such that 1 < e < ϕ(n) and e is coprime to ϕ(n)
        publicKey = new BigInteger("65537"); // Commonly used value for e

        // Step 5: Compute the private exponent 'd' as the modular multiplicative inverse of 'e' mod ϕ(n)
        privateKey = publicKey.modInverse(totient);
    }

    public BigInteger encrypt(BigInteger message) {
        // Encryption: C ≡ M^e mod n
        return message.modPow(publicKey, modulus);
    }

    public BigInteger decrypt(BigInteger ciphertext) {
        // Decryption: M ≡ C^d mod n
        return ciphertext.modPow(privateKey, modulus);
    }

    public static void main(String[] args) {
        RSA_Algorithm rsa = new RSA_Algorithm();

        // Message to be encrypted
        BigInteger message = new BigInteger("2");

        // Encryption
        BigInteger encryptedMessage = rsa.encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decryption
        BigInteger decryptedMessage = rsa.decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}

