package modules;

import constants.RuntimeCommands;

public class BluetoothModule {

    public void turnOn() {
        try {
            RunCommand.runCommand(RuntimeCommands.UNBLOCK_BLUETOOTH);
        } catch (Exception ex) {
            System.out.println("Fatal :" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void turnOff() {
        try {
            RunCommand.runCommand(RuntimeCommands.BLOCK_BLUETOOTH);
        } catch (Exception ex) {
            System.out.println("Fatal :" + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
