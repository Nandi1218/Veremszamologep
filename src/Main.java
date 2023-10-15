import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayDeque<Integer> stack = new ArrayDeque<>();
    public static ArrayDeque<Integer> frame = new ArrayDeque<>();
    public static HashMap<String, Integer> labels= new HashMap<>();
    public static HashMap<String,Integer> vars = new HashMap<>();
    public static HashMap<String,Integer> functions = new HashMap<>();
    public static ArrayDeque<HashMap<String,Integer>> memstack = new ArrayDeque<>();
    public static int pc = 0;
    public static void main(String[] args) {
        HashMap<String, Command> map = new HashMap<>();
        map.put("exit", new Exit());
        map.put("list", new List());
        map.put("push", new Push());
        map.put("pop", new Pop());
        map.put("dup", new Dup());
        map.put("read", new Read());
        map.put("write", new Write());
        map.put("add", new Add());
        map.put("sub", new Sub());
        map.put("mult", new Mult());
        map.put("div", new Div());
        map.put("jump", new Jump());
        map.put("onzero", new OnZero());
        map.put("onnonzero", new OnNonZero());
        map.put("onnegative", new OnNegative());
        map.put("store",new Store());
        map.put("load", new Load());
        map.put("return",new Return());
        map.put("call",new Call());
        map.put("put",new Put());
        map.put("get",new Get());


        Command c;
        if(args.length>0)
        {
            try {
                File f =  new File(args[0]);
                Scanner fs = new Scanner(f);
                LinkedList<String> lines = new LinkedList<>();
                while(fs.hasNextLine()) {
                    String line = fs.nextLine();
                    if(line.startsWith("#"))
                        labels.put(line,lines.size());
                    else if(line.startsWith("@"))
                        functions.put(line,lines.size());
                    else
                        lines.add(line);
                }
                while(pc<lines.size()){
                    String[] line = lines.get(pc).split(" ");
                    c = map.get(line[0]);
                    c.execute(line);
                    pc++;
                }
                c=map.get("exit");
                c.execute(null );
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        else
        {
            while (true) {
                String[] line = scanner.nextLine().split(" ");
                c = map.get(line[0]);
                c.execute(line);

            }
        }
    }
}