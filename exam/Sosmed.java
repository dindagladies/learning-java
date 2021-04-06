/**
 *
 * @author gladis // applikasi mengirim pesan sosmed
 */

abstract class Interface{
    protected abstract void message(String receiver, String content);
}

class Telegram extends Interface{
    @Override
    protected void message(String receiver, String content){
        System.out.println("Mengirim pesan telegram ke "+ receiver +" pesan : ");
        System.out.println(content);
    }
}

class Discord extends Interface{
    @Override
    protected void message(String receiver, String content){
        System.out.println("Mengirim pesan discord ke "+ receiver +" pesan : ");
        System.out.println(content);
    }
}

public class Sosmed{
    public static void main(String[] args){
        String username = "dgsd@glds";
        String message = "test";

        Telegram telegram = new Telegram();
        Discord discord = new Discord();

        telegram.message(username, message);
        discord.message(username, message);
    }
}