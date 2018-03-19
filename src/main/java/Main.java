import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {
        // Initialize Api Context
        ApiContextInitializer.init();
        // Instantiate Telegram Bots Api
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        try{
            botsApi.registerBot(new ConvertetBot());
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

}
