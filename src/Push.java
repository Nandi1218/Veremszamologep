/**
 * A cmd[1] egész értékét a veremre teszi.
 */
public class Push implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.stack.push(Integer.parseInt(cmd[1]));
    }
}
