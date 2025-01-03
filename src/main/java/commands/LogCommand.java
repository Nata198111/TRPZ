package commands;

public class LogCommand implements Command {
    private final String message;

    public LogCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Log: " + message);
    }

    @Override
    public void undo() {
        System.out.println("Undo not applicable for log operation.");
    }
}

