package constants;

public class RuntimeCommands {
    public static final String DISPLAY_TURN_OFF = "vcgencmd display_power 0";
    public static final String DISPLAY_TURN_ON = "vcgencmd display_power 1";
    public static final String BLOCK_BLUETOOTH = "rfkill block bluetooth";
    public static final String UNBLOCK_BLUETOOTH = "rfkill unblock bluetooth";
    public static final String BLOCK_WIFI = "rfkill block wifi";
    public static final String UNBLOCK_WIFI = "rfkill unblock wifi";
}
