package PracticeMvnParameters;

import org.testng.annotations.Test;

public class ReadDataFromCmdlineTest {
	
	@Test
	
	public void readTheData()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		
	}

}
