/**
 * A verem tetején levő 2 számot leveszi a veremről és a hányadosukat
 * teszi a verem tetejére.
 * Pl. ha a verem tartalma ez: [4;2;6], akkor a művelet után ez lesz: [4;3].
 */
public class Div implements Command{
    @Override
    public void execute(String[] cmd) {
        int x,y;
        x=Main.stack.pop();
        y=Main.stack.pop();
        Main.stack.push(x/y);
    }
}
