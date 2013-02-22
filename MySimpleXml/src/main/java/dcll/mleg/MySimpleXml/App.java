package dcll.mleg.MySimpleXml;

import java.io.IOException;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)
    {
    	try {
    		  Builder parser = new Builder();
    		  Document doc = parser.build("http://www.cafeconleche.org/");
    		}
    		catch (ParsingException ex) {
    		  System.err.println("Cafe con Leche is malformed today. How embarrassing!");
    		}
    		catch (IOException ex) {
    		  System.err.println("Could not connect to Cafe con Leche. The site may be down.");
    		}
        System.out.println("Hello World!");
    }
}
