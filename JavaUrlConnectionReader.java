import java.awt.Image;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.swing.ImageIcon;

//Emmett and Alex 
public class JavaUrlConnectionReader
{
	private String URL;
	
	
	public JavaUrlConnectionReader(String url)
	{
		URL = url;
	}
	
	
	//Complete the parser to create all the song objects
    public ArrayList<Song> parseSongData()
    {
    	ArrayList <Song> list = new ArrayList<Song>();
		JSONParser parser = new JSONParser();
		JSONObject jsonObject;
		
		
    	
		try 
		{
			
			jsonObject = (JSONObject)parser.parse(this.getAllSongs());
			
			
			
			JSONArray array =  (JSONArray) jsonObject.get("results");
			
		
			for(int i=0; i<13;i++)
			{
				JSONObject o = (JSONObject) array.get(i);
				String artistName=(String)o.get("artistName");
				String trackName= (String)o.get("trackName");

				String urlString = (String)o.get("artworkUrl60");
				URL url = new URL(urlString);
				ImageIcon icon = new ImageIcon(url);

				String collectionName = (String)o.get("collectionName");
				String previewURL = (String)o.get("previewUrl");
				String urlString1 = (String)o.get("artworkUrl100");
				URL url1 = new URL(urlString1);
				ImageIcon icon1 = new ImageIcon(url1);
				double trackPrice = (Double)o.get("trackPrice");
				String trackExplicitness = (String)o.get("trackExplicitness");
				long trackTime = (Long)o.get("trackTimeMillis");
				String country = (String)o.get("country");
				String currency = (String)o.get("currency");
				String genre = (String)o.get("primaryGenreName");
				Long artistID = (Long)o.get("artistId");
				Long collectionID = (Long)o.get("collectionId");
				Long trackID = (Long)o.get("trackId");
				
				Image image = icon1.getImage(); // transform it 
				Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
				icon1 = new ImageIcon(newimg);  // transform it back
				
				
				Song s = new Song(artistName, trackName, icon, collectionName, previewURL, icon1, trackPrice, trackExplicitness, trackTime,
						country, currency, genre,artistID,collectionID,trackID);
				list.add(s);
			}
			
			
		}
		catch(ParseException e)
		{
			System.out.print("ERROR: " ); 
			e.printStackTrace();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		return list;
		
    }
	
	
	//Returns all songs based on the URL fetch
	//The string returned is a JSON file
	public String getAllSongs()
	{
		
		 StringBuilder content = new StringBuilder();
		 
		    try
		    {
		      // create a URL object
		      //This URL returns all the possible currencies 
		      URL url = new URL(URL);
		 
		      // create a URL connection object
		      URLConnection urlConnection = url.openConnection();
		 
		    
		      // wrap the URL connection in a buffered reader
		      BufferedReader bufferedReader = new BufferedReader(
		    		  new InputStreamReader(urlConnection.getInputStream()));
		 
		      String line;
		 
		      // read from the URL connection via the buffered reader
		      while ((line = bufferedReader.readLine()) != null)
		      {
		        content.append(line + "\n");
		      }
		      
		      bufferedReader.close();
		    }//end try
		    catch(Exception e)
		    {
		         e.printStackTrace();
		    }
		  
		return content.toString();
	}
	
	
	
 
}