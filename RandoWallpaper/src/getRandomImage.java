import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class getRandomImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			URL url = new URL("//http://en.wikipedia.org/w/api.json?action=query&titles=Al-Farabi&prop=pageimages&format=json&pithumbsize=100");
			//http://en.wikipedia.org/w/api.json?action=query&titles=Al-Farabi&prop=pageimages&format=json&pithumbsize=100
		URLConnection connection = url.openConnection();
		
		String line; 
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		while((line = reader.readLine()) != null){
			builder.append(line);
		}
		
		JSONObject json = new JSONObject(builder.toString());j
		}
	}
		
	//get a random image from wikipedia
	
	
	//set random image as wallpaper
	
	
}
