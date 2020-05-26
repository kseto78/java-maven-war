import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/oficinatecnica", (req, res) -> "Demo para casa desde la habitación 26/05/2020 16:50");
	}
}
