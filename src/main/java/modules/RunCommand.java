package modules;

import java.io.IOException;
import java.io.OutputStream;

public class RunCommand {

    public static void runCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }

    public static OutputStream runCommandWithOutput(String command) throws IOException {
        return Runtime.getRuntime().exec(command).getOutputStream();
    }

}
