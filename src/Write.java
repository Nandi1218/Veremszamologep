/**
 * A verem tetején levő számot leveszi és kiírja a szabványos kimenetre.
 */
public class Write implements Command{
    @Override
    public void execute(String[] cmd) {
        System.out.println(Main.stack.pop());
    }
}
