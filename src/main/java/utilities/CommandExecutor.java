package utilities;


import java.util.List;

public class CommandExecutor {
    public static void execute(String command) {
        System.out.println("Executing command: " + command);
        // Add logic for actual command execution if needed
    }

    public static void batchExecute(List<String> commands) {
        for (String command : commands) {
            execute(command);
        }
    }
}
