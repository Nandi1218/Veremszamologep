/**
 * Beolvas egy egész számot a szabványos bemenetről és a verem tetejére
 * teszi.
 * Tipp: a beolvasáshoz használjuk ugyanazt a Scanner objektumot, amivel
 * a parancsokat is olvassuk!
 */
public class Read implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.stack.push(Integer.parseInt(Main.scanner.nextLine()));
    }
}
