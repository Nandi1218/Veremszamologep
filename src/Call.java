import java.util.HashMap;

public class Call implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.frame.push(Main.pc);
        Main.memstack.push(new HashMap<>());
        Main.pc=Main.functions.get(cmd[1])-1;
    }
}
