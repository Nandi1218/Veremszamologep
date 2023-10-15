/**
 * A verem tetején levő 2 számot leveszi a veremről és a szorzatukat teszi a
 * verem tetejére.
 * Pl. ha a verem tartalma ez: [4;3;2], akkor a művelet után ez lesz: [4;6].
 */
public class Mult implements Command{
    @Override
    public void execute(String[] cmd) {
        int x,y;
        x=Main.stack.pop();
        y=Main.stack.pop();
        Main.stack.push(x*y);
    }
}
