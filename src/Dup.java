/**
 * A verem tetején levő elemet megduplázza. Ha a verem tartalma az
 * alábbi (jobbra a később berakott): [3;2;1], akkor a parancs után a verem
 * tartalma ez lesz: [3;2;1;1]
 */
public class Dup implements Command{
    @Override
    public void execute(String[] cmd) {
        if (Main.stack.isEmpty())
            return;
        else
            Main.stack.push(Main.stack.peek());
    }
}
