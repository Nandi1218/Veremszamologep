public class OnNegative implements Command{
    @Override
    public void execute(String[] cmd) {
        if(Main.stack.pop()<0)
            Main.pc= Main.labels.get(cmd[1])-1;
    }
}
