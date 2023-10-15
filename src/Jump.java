public class Jump implements Command{

    @Override
    public void execute(String[] cmd) {
        Main.pc=Main.labels.get(cmd[1])-1;
    }
}
