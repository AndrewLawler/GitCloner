import java.io.IOException;

public class GitClone implements Git {

    public void call(String GitHub, String Name) throws IOException {
        String clone = "git clone https://github.com/" + GitHub + "/" + Name + ".git";
        Process a = Runtime.getRuntime().exec(clone);
    }

}
