public class Get implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.stack.push(Main.memstack.peek().get(cmd[1]));
    }
}
