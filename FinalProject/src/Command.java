/*
    Author: Simone Charles
    Purpose: An interface for the concrete commands to follow
 */

public interface Command {
    // all commands will call the execute method
    void execute();
}
