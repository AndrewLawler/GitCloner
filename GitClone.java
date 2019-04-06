import java.io.IOException;

public class GitClone {

    public void call(String GitHub, String Name) throws IOException {
        String clone = "git clone https://github.com/" + GitHub + "/" + Name + ".git";
        Process b = Runtime.getRuntime().exec(clone);
    }

}
