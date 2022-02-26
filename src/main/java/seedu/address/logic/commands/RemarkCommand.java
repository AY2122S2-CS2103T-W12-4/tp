package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Sets the remark for exiting contacts in Reache.
 */
public class RemarkCommand extends Command {

    public static final String COMMAND_WORD = "remark";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult("Hello from remark command");
    }
}
