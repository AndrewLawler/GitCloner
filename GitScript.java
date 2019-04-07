import java.io.IOException;

public class GitScript implements Git {

    public void call(String GitHub, String Name) throws IOException {

        Process a = Runtime.getRuntime().exec("git add .");
        Process b = Runtime.getRuntime().exec("git commit -m 'GitScript'");
        Process c = Runtime.getRuntime().exec("git push");

    }

}
