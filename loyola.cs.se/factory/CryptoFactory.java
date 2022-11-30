public class CryptoFactory{
    public static Crypto create(){
        return new CryptoECC();
    }
}