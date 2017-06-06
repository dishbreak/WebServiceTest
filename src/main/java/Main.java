import com.dishbreak.background.BackgroundTask;

import static com.dishbreak.util.JsonUtil.json;
import static spark.Spark.*;

/**
 * Created by vishal on 6/6/17.
 */
public class Main {

    private static final BackgroundTask bgTask = new BackgroundTask();
    private static final Runnable shutdownHook = () -> { bgTask.stop(); };

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook));

        bgTask.start();
        get("/hello", (req, res) -> "Hello world");
        get("/data", (req, res) -> bgTask.getData(), json());
    }

}
