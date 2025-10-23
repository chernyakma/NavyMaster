package com.vaadin.testbenchexample;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.PasswordFieldElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.HasStringValueProperty;
import com.vaadin.testbench.IPAddress;
import com.vaadin.testbench.Parameters;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.TestBenchTestCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class BaseLoginTest extends TestBenchTestCase {


		@After
	public void tearDown() throws Exception {
			getDriver().quit();
	}

	@Before
	public void setUp() {
		// Set up the download directory using the current working directory
		String downloadFilepath = System.getProperty("user.dir") + File.separator + "downloadFiles";

		// Ensure the download directory exists
		File downloadDir = new File(downloadFilepath);
		if (!downloadDir.exists()) {
			boolean created = downloadDir.mkdirs();
			if (created) {
				System.out.println("Created download directory: " + downloadFilepath);
			} else {
				System.err.println("Failed to create download directory: " + downloadFilepath);
			}
		} else {
			System.out.println("Download directory already exists: " + downloadFilepath);
		}

		// Configure Chrome preferences for file download
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("download.default_directory", downloadFilepath); // Set the download directory
		prefs.put("download.prompt_for_download", false); // Disable download prompts
		prefs.put("safebrowsing.enabled", true); // Disable safety warnings for downloads

	// Set Chrome options
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	WebDriverManager.chromedriver().setup();


	 options.addArguments("--headless", "--disable-gpu");
	 setDriver(new ChromeDriver(options));
	performLogin();

	Parameters.setScreenshotReferenceDirectory("src/test/screenshots");
	Parameters.setScreenshotComparisonTolerance(1.0);
	driver.manage().window().setSize(new Dimension(1024, 768));
	Parameters.setScreenshotRetryDelay(10);
	Parameters.setScreenshotComparisonCursorDetection(true);
}



	private void performLogin() {
	//	getDriver().get("http://localhost:8080/navy_webui/");
	//	getDriver().get( "http://" + IPAddress.findSiteLocalAddress() + ":8080/navy_webui/");
	//	getDriver().get("https://navy1.testbed.calcfocus.net/achieve/login");

	//	$( TextFieldElement.class).first().setValue( "jBond");
	//	$( PasswordFieldElement.class).first().setValue( "JBond007");
	//	$( ButtonElement.class).first().click();
	//	getDriver().get("https://test.navymutual.calcfocus.net/policyadmin/oauth2/login/cognito");
		getDriver().get("https://master.navymutual.calcfocus.net/policyadmin");

	//	WebElement usernameFieldElement = findElement( By.id( "vaadinLoginUsername" ));


		WebElement usernameFieldElement = findElement( By.id( "signInFormUsername" ));
		usernameFieldElement.click();
		usernameFieldElement.sendKeys( "helpdesk" );
		WebElement passwordFieldElement = findElement( By.id( "signInFormPassword" ));
		passwordFieldElement.click();
		passwordFieldElement.sendKeys( "JBond007$" );

	//	WebElement buttonElement = findElement( By.id( "signInSubmitButton" ));
		TestBenchElement loginButton = ( TestBenchElement )findElement( By.name( "signInSubmitButton" ));
		loginButton.click();





	}
}

