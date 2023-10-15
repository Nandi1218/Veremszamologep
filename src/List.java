/**
 * Kiírja a verem tartalmát a szabványos kimenetre. Ne feledjük, hogy a
 * verem a Main.stack változónévvel érhető el.
 */
public class List implements Command{
    @Override
    public void execute(String[] cmd) {
        System.out.println(Main.stack.toString());
    }
}
