public class Put implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.memstack.peek().put(cmd[1],Main.stack.pop());
    }
}
