package modules;

import constants.RuntimeCommands;

/**
 * Wifi module processing is done here
 */
public class WiFiModule {

    public void turnOn() {
        try {
            RunCommand.runCommand(RuntimeCommands.UNBLOCK_WIFI);
        } catch (Exception ex) {
            System.out.println("Fatal :" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void turnOff() {
        try {
            RunCommand.runCommand(RuntimeCommands.BLOCK_WIFI);
        } catch (Exception ex) {
            System.out.println("Fatal :" + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
