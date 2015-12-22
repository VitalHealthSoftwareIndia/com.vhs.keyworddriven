package utility;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import executionEngine.MobileApplicationTest;
public class StartAndStopAppium 
{
	AndroidDriver driver;
	private static Process process;

	private static String APPIUMSERVERSTART = MobileApplicationTest.sPlatformAppiumServerPath;

	public static void startAppiumServer() throws IOException, InterruptedException {

	Runtime runtime = Runtime.getRuntime();

	process = runtime.exec(APPIUMSERVERSTART);

	Thread.sleep(5000);

	if (process != null) {

	System.out.println("Appium server started");

	}

	}

	public static void stopAppiumServer() throws IOException {

	if (process != null) {

	process.destroy();

	}

	System.out.println("Appium server stopped");

	}

}
