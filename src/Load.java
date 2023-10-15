public class Load implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.stack.push(Main.vars.get(cmd[1]));
    }
}
