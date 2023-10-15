public class Return implements Command{
    @Override
    public void execute(String[] cmd) {
        Main.memstack.pop();
        Main.pc=Main.frame.pop();
    }
}
