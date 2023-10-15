/**
 * Meghívja a System.exit(0) metódust.
 */
public class Exit implements Command {
    @Override
    public void execute(String[] cmd) {
        System.exit(0);
    }
}
