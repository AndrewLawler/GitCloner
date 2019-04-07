import java.io.IOException;

public class GitScript implements Git {

    public void call(String GitHub, String Name) throws IOException {

        Process a = Runtime.getRuntime().exec("git add .");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        Process b = Runtime.getRuntime().exec("git commit -m GitScript");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        Process c = Runtime.getRuntime().exec("git push");

    }

}
