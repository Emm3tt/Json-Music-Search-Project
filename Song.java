import java.net.URL;

import javax.swing.ImageIcon;

public class Song 
{
	//Emmett and Nick
	//create an instance variable for every data field that you need
	//Then make a constructor that initializes all of the data to make a song
	
	
	private String artistName,trackName, collectionName,previewURL,trackExplicitness,country, currency, genre;
	private Double trackPrice;
	private Long trackTime,artistID,trackID,collectionID;
	private ImageIcon icon,icon1;
	
	Song(String aName, String trackNames, ImageIcon icons, String collectionNames, String previewURLs, ImageIcon icon1s, Double trackPrices, String trackExplicitnesss, Long trackTimes,
			String countrys, String currencys, String genres, Long artistIDs,Long collectionIDs,Long trackIDs)
	{
		artistName = aName;
		trackName = trackNames;
		icon = icons;
		collectionName = collectionNames;
		previewURL = previewURLs;
		icon1 = icon1s;
		trackExplicitness = trackExplicitnesss;
		country = countrys;
		currency = currencys;
		genre = genres;
		trackPrice = trackPrices;
		trackTime = trackTimes;
		artistID = artistIDs;
		trackID = trackIDs;
		collectionID = collectionIDs;
	}
	
	public String getArtistName()
	{
		return artistName;
		
	}
	

	
	public String getTrackName()
	{
		return trackName;
		
	}
	
	public ImageIcon getIcon()
	{
		return icon;
		
	}
	public String getCollectionName()
	{
		return collectionName;
		
	}
	
	public String getPreviewURL()
	{
		return previewURL;
		
	}
	public ImageIcon getIcon1()
	{
		return icon1;
		
	}
	public String getTrackExplicitness()
	{
		return trackExplicitness;
		
	}
	
	public String getCountry()
	{
		return country;
		
	}
	
	public String getCurrency()
	{
		return currency;
		
	}
	
	public String getGenre()
	{
		return genre;
		
	}
	
	public Long getArtistID()
	{
		return artistID;
		
	}
	
	public Long getTrackID()
	{
		return trackID;
		
	}
	
	public Long getCollectionID()
	{
		return collectionID;
		
	}
	
	public Double getTrackPrice()
	{
		return trackPrice;
		
	}
	
	public Long getTrackTime()
	{
		return trackTime;
		
	}

}
