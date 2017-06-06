import static spark.Spark.*;

/**
 * Created by vishal on 6/6/17.
 */
public class Main {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world");


    }
}
