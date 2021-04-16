package party.folf.furgram;

import android.content.SharedPreferences;
import org.telegram.messenger.ApplicationLoader;

public class FurgramUtils {

    public static boolean isNightTheme() {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        String string = sharedPreferences.getString("theme", null);
        return string == null || string.equals("BGramOldNight") || string.equals("Dark") || string.equals("BGram Dark Blue") || string.equals("Darkify") || string.equals("DarkifyX") || string.equals("Incognito") || string.equals("Pitch Black Spotify") || string.equals(sharedPreferences.getString("nighttheme", null));
    }

}
