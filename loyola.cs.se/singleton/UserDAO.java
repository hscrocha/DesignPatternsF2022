
public class UserDAO {
    public static void create(){
        Logger.getInstance().write("Entering UserDAO.create() ");
        Crypto c = CryptoFactory.create();
        //Do the create User DAO functionality
        Logger.getInstance().write("Finishing UserDAO.create() ");
    }

    public static void login(){
        Logger.getInstance().write("Entering UserDAO.login() ");
        Crypto c = CryptoFactory.create();
        //Do the login user ...

        Logger.getInstance().write("Finish UserDAO.login() ");
    }
}
