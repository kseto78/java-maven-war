import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/oficinatecnica", (req, res) -> "Demo en tiempo real 04/07/2020 19:00");
	}
}
