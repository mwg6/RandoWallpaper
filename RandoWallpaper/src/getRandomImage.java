import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class getRandomImage {

	public static void main(String[] args) {
		
	getImageURL();
	
	}

	//get a random image from imgur
	
public static void getImageURL(){
	//code block to generate random seven character sequence to append to the end of the imgur link
	URL imgURL = null;
	try {
	/*
		 * The imgur ending is composed of seven characters, upper and lower case as well as 0-9
		 */
		char[] choice = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		String append = "";
		Random rand = new Random();
		
		for(int i=0;i<7;i++){	
			int n = rand.nextInt(61);
			append = append + choice[n];
		}
		
		System.out.println(append);
		//test if the url generated is valid
		
	    imgURL = new URL("https://i.imgur.com/" + append + ".jpg");
	    
File wallpaper = new File("wallpaper.jpg");
		
		try{
		FileUtils.copyURLToFile(imgURL, wallpaper);
		
		while(wallpaper.length() == 503){
			getImageURL();
		}
		FileUtils.copyURLToFile(imgURL, wallpaper);
		}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} 
	catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	
		
}

}
	//set random image as wallpaper
	
	

