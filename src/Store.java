public class Store implements Command{
    @Override
    public void execute(String[] cmd) {
            Main.vars.put(cmd[1],Main.stack.pop());
    }
}
