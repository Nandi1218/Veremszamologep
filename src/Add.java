/**
 * A verem tetején levő 2 számot leveszi a veremről és az összegüket teszi a
 * verem tetejére.
 * Pl. ha a verem tartalma (2 az utoljára betett érték): [4;3;2], akkor a
 * művelet után ez lesz: [4;5].
 */
public class Add implements Command{
    @Override
    public void execute(String[] cmd) {
        int x,y;
        x=Main.stack.pop();
        y=Main.stack.pop();
        Main.stack.push(x+y);
    }
}
