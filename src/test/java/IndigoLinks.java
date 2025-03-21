
import java.util.*;

public class IndigoLinks {

	public static void main(String[] args) {
//		System.setProperty()
		List<WebElement> links= driver.findElements(By.xpath("//div[@class='accordion d-flex flex-column flex-md-row justify-content-md-between']/div/div/following::div/ul/li/a"));
        links.addAll(links)

        String mainWindowHandle = driver.getWindowHandle();
        ListIterator<WebElement> lstItr = new  ListIterator(links);
        
        for (ListIterator lstItr:links)
        {
        	while (lstItr.hasNext())
        	{
        		lstItr.next();
        		System.out.println("Link Text:"+lstItr.getText());
        		lstItr.click();
        		driver.switchTo(2);
        		driver.close();
        	}
        }
        
	}

}
