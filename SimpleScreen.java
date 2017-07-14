import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextField;

public class SimpleScreen extends JFrame
{
	/*
	 * Everyone in the group worked on this class so I put the name above the creators of methods and such 
	 * I used //{ to mark who did what 
	 * I said two names if it was a combined effort
	 * variables and buttons and such were created by the user	 
	 */
	
	private JButton twoJButton,threeJButton,fourJButton,fiveJButton,sixJButton,sevenJButton,eightJButton,nineJButton,tenJButton,elevenJButton,twelveJButton,thirteenJButton,backJButton,searchJButton,playPreviewJButton,playFullVideoJButton,imageJButton,playFullMusicJButton;
	private JTextField searchJTextField;
	private JLabel artistNameJLabel,trackNameJLabel,collectionNameJLabel,explicitJLabel,countryJLabel,currencyJLabel,genreJLabel,priceJLabel,timeJLabel,artistIDJLabel,collectionIDJLabel,trackIDJLabel;
	private JTextField twoJTextField,threeJTextField,fourJTextField,fiveJTextField,sixJTextField,sevenJTextField,eightJTextField,nineJTextField,tenJTextField,elevenJTextField,twelveJTextField,thirteenJTextField;
	private Container contentPane;
	private ArrayList<Song> listOfSongs = new ArrayList<Song>();

	
	int bot = 0;
	
	private String artistName,songName = "";
	Random rand = new Random();
	//lel fun ints
	int firstCount = 0;
	int secondCount = 0;
	int thirdCount = 0;
	int fourthCount = 0;
	int fifthCount = 0;
	int sixthCount = 0;
	int seventhCount = 0;
	int eighthCount = 0;
	int ninthCount = 0;
	int tenthCount = 0;
	int eleventhCount = 0;
	int twelthCount = 0;

	boolean part2 = false;
	boolean part3 = false;
	boolean part4= false;
	boolean part5= false;
	boolean part6 = false;
	boolean part7= false;
	boolean part8= false;
	boolean part9= false;
	boolean part10 = false;
	boolean part11= false;
	boolean part12= false;
	int a = rand.nextInt(400);
	int aDos = rand.nextInt(400);
	int aTres = rand.nextInt(400);
	int aCuatro = rand.nextInt(400);
	int b = rand.nextInt(400)+400;
	int bDos = rand.nextInt(400)+400;
	int bTres = rand.nextInt(400)+400;
	int bCuatro = rand.nextInt(400)+400;
	int c = rand.nextInt(800)+400;
	int cDos = rand.nextInt(800)+400;
	int cTres = rand.nextInt(800)+400;
	int cCuatro = rand.nextInt(800)+400;
	int wait1part2 = rand.nextInt(200)+200;
	int wait1part3 = rand.nextInt(400)+200;
	int wait1part4 = rand.nextInt(600)+200;
	int wait2part1 = rand.nextInt(1)+50;
	int wait2part2 = rand.nextInt(250)+200;
	int wait2part3 = rand.nextInt(450)+200;
	int wait2part4 = rand.nextInt(650)+200;
	int wait3part1 = rand.nextInt(1)+100;
	int wait3part2 = rand.nextInt(300)+200;
	int wait3part3 = rand.nextInt(500)+200;
	int wait3part4 = rand.nextInt(700)+200;
	
	
	public SimpleScreen()
	{
		
		JavaUrlConnectionReader reader = 
				new JavaUrlConnectionReader("https://itunes.apple.com/search?term=pop");
		listOfSongs = reader.parseSongData();
		
		
		artistName = listOfSongs.get(0).getArtistName();

		createScreen();
		
	}
	
	
	private void createScreen()

	{
	
		
		contentPane = this.getContentPane(); //inherited method
		contentPane.setLayout(null);
		contentPane.setBackground(Color.black);
		
		//nick
		//{
		
		searchJTextField = new JTextField();
		searchJTextField.setVisible(true);
		searchJTextField.setBounds(400,200,500,100);
		contentPane.add(searchJTextField);
		
		
		searchJButton = new JButton("Search");
		searchJButton.setVisible(true);
		searchJButton.setBounds(400,600,500,100);
		contentPane.add(searchJButton);
		
		searchJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				//run the method to set the buttons
	    				
	    				twoJButton.setVisible(true);
	    				threeJButton.setVisible(true);
	    				fourJButton.setVisible(true);
	    				fiveJButton.setVisible(true);
	    				sixJButton.setVisible(true);
	    				sevenJButton.setVisible(true);
	    				eightJButton.setVisible(true);
	    				nineJButton.setVisible(true);
	    				tenJButton.setVisible(true);
	    				elevenJButton.setVisible(true);
	    				twelveJButton.setVisible(true);
	    				thirteenJButton.setVisible(true);
	    				
	    				twoJTextField.setVisible(true);
	    				threeJTextField.setVisible(true);
	    				fourJTextField.setVisible(true);
	    				fiveJTextField.setVisible(true);
	    				sixJTextField.setVisible(true);
	    				sevenJTextField.setVisible(true);
	    				eightJTextField.setVisible(true);
	    				nineJTextField.setVisible(true);
	    				tenJTextField.setVisible(true);
	    				elevenJTextField.setVisible(true);
	    				twelveJTextField.setVisible(true);
	    				thirteenJTextField.setVisible(true);
	    				
	    				String x = searchJTextField.getText();
	    				
	    				String y = x.replaceAll("\\s", "");
	    				System.out.println(y);
	    				JavaUrlConnectionReader reader = 
	    						new JavaUrlConnectionReader("https://itunes.apple.com/search?term="+y);
	    				
	    				listOfSongs = reader.parseSongData();
	    				
	    				
	    				
	    				twoJButton.setIcon(listOfSongs.get(1).getIcon1());
	    				threeJButton.setIcon(listOfSongs.get(2).getIcon1());
	    				fourJButton.setIcon(listOfSongs.get(3).getIcon1());
	    				fiveJButton.setIcon(listOfSongs.get(4).getIcon1());
	    				sixJButton.setIcon(listOfSongs.get(5).getIcon1());
	    				sevenJButton.setIcon(listOfSongs.get(6).getIcon1());
	    				eightJButton.setIcon(listOfSongs.get(7).getIcon1());
	    				nineJButton.setIcon(listOfSongs.get(8).getIcon1());
	    				tenJButton.setIcon(listOfSongs.get(9).getIcon1());
	    				elevenJButton.setIcon(listOfSongs.get(10).getIcon1());
	    				twelveJButton.setIcon(listOfSongs.get(11).getIcon1());
	    				thirteenJButton.setIcon(listOfSongs.get(12).getIcon1());
	    				
	    				twoJTextField.setText(listOfSongs.get(1).getTrackName());
	    				threeJTextField.setText(listOfSongs.get(2).getTrackName());
	    				fourJTextField.setText(listOfSongs.get(3).getTrackName());
	    				fiveJTextField.setText(listOfSongs.get(4).getTrackName());
	    				sixJTextField.setText(listOfSongs.get(5).getTrackName());
	    				sevenJTextField.setText(listOfSongs.get(6).getTrackName());
	    				eightJTextField.setText(listOfSongs.get(7).getTrackName());
	    				nineJTextField.setText(listOfSongs.get(8).getTrackName());
	    				tenJTextField.setText(listOfSongs.get(9).getTrackName());
	    				elevenJTextField.setText(listOfSongs.get(10).getTrackName());
	    				twelveJTextField.setText(listOfSongs.get(11).getTrackName());
	    				thirteenJTextField.setText(listOfSongs.get(12).getTrackName());
	    				
	    				}
	    			}
	    			
	    		
	    			
	    			
	   );
		
		backJButton = new JButton("back");
		backJButton.setVisible(false);
		backJButton.setBounds(1000,100,200,100);
		contentPane.add(backJButton);
		backJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToSongs();
	    				
	    			}
	    			
	    		}
	    			
	   );
		//}
		//emmett/nick
	//{
		
		playPreviewJButton = new JButton("Play Preview");
		playPreviewJButton.setVisible(false);
		playPreviewJButton.setBounds(1000,200,200,100);
		contentPane.add(playPreviewJButton);
		playPreviewJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				try {
	    					  Desktop desktop = java.awt.Desktop.getDesktop();
	    					  URI oURL = new URI(listOfSongs.get(bot).getPreviewURL());
	    					  desktop.browse(oURL);
	    					} catch (Exception e) {
	    					  e.printStackTrace();
	    					}
	    				
	    			}
	    			
	    		}
	    			
	   );
		
		playFullVideoJButton = new JButton("Play Full Video(youtube link)");
		playFullVideoJButton.setVisible(false);
		playFullVideoJButton.setBounds(1000,300,200,100);
		contentPane.add(playFullVideoJButton);
		playFullVideoJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				try {
	    					
	    					String s = listOfSongs.get(bot).getTrackName();
	    					String y = s.replaceAll("\\s", "");
	    					
	    					  Desktop desktop = java.awt.Desktop.getDesktop();
	    					  URI oURL = new URI("https://www.youtube.com/results?search_query="+ y);
	    					  desktop.browse(oURL);
	    					} catch (Exception e) {
	    					  e.printStackTrace();
	    					}
	    				
	    			}
	    			
	    		}
	    			
	   );
		
		
		playFullMusicJButton = new JButton("Play Music(soundcloud link)");
		playFullMusicJButton.setVisible(false);
		playFullMusicJButton.setBounds(1000,400,200,100);
		contentPane.add(playFullMusicJButton);
		playFullMusicJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				try {
	    					
	    					String s = listOfSongs.get(bot).getTrackName();
	    					String t = listOfSongs.get(bot).getArtistName();
	    					String y = s.replaceAll("\\s", "");
	    					String x = t.replaceAll("\\s", "");
	    					
	    					  Desktop desktop = java.awt.Desktop.getDesktop();
	    					  URI oURL = new URI("https://soundcloud.com/" + x + "/" + y);
	    					  desktop.browse(oURL);
	    					} catch (Exception e) {
	    					  e.printStackTrace();
	    					}
	    				
	    			}
	    			
	    		}
	    			
	   );
		
		
		
		imageJButton = new JButton();
		imageJButton.setVisible(false);
		imageJButton.setBounds(500,500,200,200);
		contentPane.add(imageJButton);
					
	
		
		//the info stuff
		
		artistNameJLabel = new JLabel();
		artistNameJLabel.setVisible(false);
		artistNameJLabel.setBounds(100,50,500,100);
		contentPane.add(artistNameJLabel);
		
		trackNameJLabel = new JLabel();
		trackNameJLabel.setVisible(false);
		trackNameJLabel.setBounds(100,100,500,100);
		contentPane.add(trackNameJLabel);
		
		collectionNameJLabel = new JLabel();
		collectionNameJLabel.setVisible(false);
		collectionNameJLabel.setBounds(100,150,500,100);
		contentPane.add(collectionNameJLabel);
		
		explicitJLabel = new JLabel();
		explicitJLabel.setVisible(false);
		explicitJLabel.setBounds(100,200,500,100);
		contentPane.add(explicitJLabel);
		
		countryJLabel = new JLabel();
		countryJLabel.setVisible(false);
		countryJLabel.setBounds(100,300,500,100);
		contentPane.add(countryJLabel);
		
		currencyJLabel = new JLabel();
		currencyJLabel.setVisible(false);
		currencyJLabel.setBounds(100,350,500,100);
		contentPane.add(currencyJLabel);
		
		genreJLabel = new JLabel();
		genreJLabel.setVisible(false);
		genreJLabel.setBounds(100,400,500,100);
		contentPane.add(genreJLabel);
		
		priceJLabel = new JLabel();
		priceJLabel.setVisible(false);
		priceJLabel.setBounds(100,450,500,100);
		contentPane.add(priceJLabel);
		
		timeJLabel = new JLabel();
		timeJLabel.setVisible(false);
		timeJLabel.setBounds(100,500,500,100);
		contentPane.add(timeJLabel);
		
		artistIDJLabel = new JLabel();
		artistIDJLabel.setVisible(false);
		artistIDJLabel.setBounds(100,550,500,100);
		contentPane.add(artistIDJLabel);
		
		collectionIDJLabel = new JLabel();
		collectionIDJLabel.setVisible(false);
		collectionIDJLabel.setBounds(100,600,500,100);
		contentPane.add(collectionIDJLabel);
		
		trackIDJLabel = new JLabel();
		trackIDJLabel.setVisible(false);
		trackIDJLabel.setBounds(100,650,500,100);
		contentPane.add(trackIDJLabel);
		
	
		//the rain stuff
		twoJTextField = new JTextField(listOfSongs.get(1).getTrackName());
		twoJTextField.setVisible(false);
		contentPane.add(twoJTextField);
		
		twoJButton = new JButton(listOfSongs.get(1).getIcon1());
		twoJButton.setVisible(false);
		twoJTextField.setEnabled(false);
		contentPane.add(twoJButton);
		twoJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(1);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );

		threeJTextField = new JTextField(listOfSongs.get(2).getTrackName());
		threeJTextField.setVisible(false);
		threeJTextField.setEnabled(false);
		contentPane.add(threeJTextField);
		

		threeJButton = new JButton(listOfSongs.get(2).getIcon());
		threeJButton.setVisible(false);
		contentPane.add(threeJButton);
		threeJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(2);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		fourJTextField = new JTextField(listOfSongs.get(3).getTrackName());
		fourJTextField.setVisible(false);
		fourJTextField.setEnabled(false);
		contentPane.add(fourJTextField);
		
		fourJButton = new JButton(listOfSongs.get(3).getIcon());
		fourJButton.setVisible(false);
		contentPane.add(fourJButton);
		fourJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(3);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		fiveJTextField = new JTextField(listOfSongs.get(4).getTrackName());
		fiveJTextField.setVisible(false);
		fiveJTextField.setEnabled(false);
		contentPane.add(fiveJTextField);
		
		fiveJButton = new JButton(listOfSongs.get(4).getIcon());
		fiveJButton.setVisible(false);
		contentPane.add(fiveJButton);
		fiveJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(4);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		sixJTextField = new JTextField(listOfSongs.get(5).getTrackName());
		sixJTextField.setVisible(false);
		sixJTextField.setEnabled(false);
		contentPane.add(sixJTextField);
		
		sixJButton = new JButton(listOfSongs.get(5).getIcon());
		sixJButton.setVisible(false);
		contentPane.add(sixJButton);
		sixJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(5);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		sevenJTextField = new JTextField(listOfSongs.get(6).getTrackName());
		sevenJTextField.setVisible(false);
		sevenJTextField.setEnabled(false);
		contentPane.add(sevenJTextField);
		
		sevenJButton = new JButton(listOfSongs.get(6).getIcon());
		sevenJButton.setVisible(false);
		contentPane.add(sevenJButton);
		sevenJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(6);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		eightJTextField = new JTextField(listOfSongs.get(7).getTrackName());
		eightJTextField.setVisible(false);
		eightJTextField.setEnabled(false);
		contentPane.add(eightJTextField);
		
		eightJButton = new JButton(listOfSongs.get(7).getIcon());
		eightJButton.setVisible(false);
		contentPane.add(eightJButton);
		eightJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(7);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		nineJTextField = new JTextField(listOfSongs.get(8).getTrackName());
		nineJTextField.setVisible(false);
		nineJTextField.setEnabled(false);
		contentPane.add(nineJTextField);
		
		nineJButton = new JButton(listOfSongs.get(8).getIcon());
		nineJButton.setVisible(false);
		contentPane.add(nineJButton);
		nineJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(8);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		tenJTextField = new JTextField(listOfSongs.get(9).getTrackName());
		tenJTextField.setVisible(false);
		tenJTextField.setEnabled(false);
		contentPane.add(tenJTextField);
		
		tenJButton = new JButton(listOfSongs.get(9).getIcon());
		tenJButton.setVisible(false);
		contentPane.add(tenJButton);	
		tenJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(9);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		elevenJTextField = new JTextField(listOfSongs.get(10).getTrackName());
		elevenJTextField.setVisible(false);
		elevenJTextField.setEnabled(false);
		contentPane.add(elevenJTextField);
		
		elevenJButton = new JButton(listOfSongs.get(10).getIcon());
		elevenJButton.setVisible(false);
		contentPane.add(elevenJButton);
		elevenJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(10);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		twelveJTextField = new JTextField(listOfSongs.get(11).getTrackName());
		twelveJTextField.setVisible(false);
		twelveJTextField.setEnabled(false);
		contentPane.add(twelveJTextField);
		
		twelveJButton = new JButton(listOfSongs.get(11).getIcon());
		twelveJButton.setVisible(false);
		contentPane.add(twelveJButton);
		twelveJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(11);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		
		thirteenJTextField = new JTextField(listOfSongs.get(12).getTrackName());
		thirteenJTextField.setVisible(false);
		thirteenJTextField.setEnabled(false);
		contentPane.add(thirteenJTextField);
		
		thirteenJButton = new JButton(listOfSongs.get(12).getIcon());
		thirteenJButton.setVisible(false);
		contentPane.add(thirteenJButton);
		thirteenJButton.addActionListener(
	    		
	    		new ActionListener()
	    		{
	    			public void actionPerformed(ActionEvent event)
	    			{
	    				
	    				switchToInfo(12);
	    			
	    			}
	    			
	    		}
	    			
	    			
	   );
		//}
		
		//Alex
		//{
		searchJTextField.setBackground(Color.ORANGE);
		searchJButton.setForeground(Color.ORANGE);
		
		searchJTextField.setBackground(new Color(255, 255, 255, 128));
		searchJTextField.setForeground(Color.orange);
		searchJTextField.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.orange));
		searchJTextField.setOpaque(false);    
		
		searchJButton.setBackground(new Color(255, 255, 255, 128));
		searchJButton.setForeground(Color.orange);
		searchJButton.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.orange));
		searchJButton.setOpaque(false);
	
		
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		searchJTextField.setFont(font1);
		searchJTextField.setHorizontalAlignment(JTextField.CENTER);
		//}
		setTitle("Music");	
		setVisible(true);
		setSize(1440, 860);
		
		

		//Emmett/Alex
		//{
		
		while(true)
		{
		
		
		rain(twoJButton,threeJButton,fourJButton,fiveJButton,sixJButton,sevenJButton,eightJButton,nineJButton,tenJButton,elevenJButton,twelveJButton,thirteenJButton);
		llueve(twoJTextField,threeJTextField,fourJTextField,fiveJTextField,sixJTextField,sevenJTextField,eightJTextField,nineJTextField,tenJTextField,elevenJTextField,twelveJTextField,thirteenJTextField);
	
		}
		
	}
	
	public void switchToInfo(int x)
	
	{
		bot = x;
		searchJTextField.setVisible(false);
		searchJButton.setVisible(false);
		twoJButton.setVisible(false);
		threeJButton.setVisible(false);
		fourJButton.setVisible(false);
		fiveJButton.setVisible(false);
		sixJButton.setVisible(false);
		sevenJButton.setVisible(false);
		eightJButton.setVisible(false);
		nineJButton.setVisible(false);
		tenJButton.setVisible(false);
		elevenJButton.setVisible(false);
		twelveJButton.setVisible(false);
		thirteenJButton.setVisible(false);
		
		twoJTextField.setVisible(false);
		threeJTextField.setVisible(false);
		fourJTextField.setVisible(false);
		fiveJTextField.setVisible(false);
		sixJTextField.setVisible(false);
		sevenJTextField.setVisible(false);
		eightJTextField.setVisible(false);
		nineJTextField.setVisible(false);
		tenJTextField.setVisible(false);
		elevenJTextField.setVisible(false);
		twelveJTextField.setVisible(false);
		thirteenJTextField.setVisible(false);
		
		
		artistNameJLabel.setVisible(true);
		trackNameJLabel.setVisible(true);
		collectionNameJLabel.setVisible(true);
		explicitJLabel.setVisible(true);
		countryJLabel.setVisible(true);
		currencyJLabel.setVisible(true);
		genreJLabel.setVisible(true);
		priceJLabel.setVisible(true);
		timeJLabel.setVisible(true);
		artistIDJLabel.setVisible(true);
		collectionIDJLabel.setVisible(true);
		trackIDJLabel.setVisible(true);
		
		imageJButton.setVisible(true);
		
		playPreviewJButton.setVisible(true);
		playFullVideoJButton.setVisible(true);
		playFullMusicJButton.setVisible(true);
		
		backJButton.setVisible(true);
		
		artistNameJLabel.setText("Artist Name: " + listOfSongs.get(x).getArtistName());
		trackNameJLabel.setText("Track Name: " + listOfSongs.get(x).getTrackName());
		collectionNameJLabel.setText("Collection Name: " + listOfSongs.get(x).getCollectionName());
		explicitJLabel.setText("Explicit: " + listOfSongs.get(x).getTrackExplicitness());
		countryJLabel.setText("Country: " + listOfSongs.get(x).getCountry());
		currencyJLabel.setText("Currency: " + listOfSongs.get(x).getCurrency());
		genreJLabel.setText("Genre: " +listOfSongs.get(x).getGenre());
		priceJLabel.setText("Price: " + String.valueOf(listOfSongs.get(x).getTrackPrice()) + "$");
		timeJLabel.setText("Time: " + String.valueOf(((listOfSongs.get(x).getTrackTime())/1000)/100) + "." + String.valueOf(((listOfSongs.get(x).getTrackTime())/1000)%100) + " minutes");
		artistIDJLabel.setText("Artist ID: " + listOfSongs.get(x).getArtistID());
		collectionIDJLabel.setText("Collection ID: " + listOfSongs.get(x).getCollectionID());
		trackIDJLabel.setText("Track ID : " + listOfSongs.get(x).getTrackID());
		
		imageJButton.setIcon(listOfSongs.get(x).getIcon1());
		
		
		artistNameJLabel.setForeground(Color.orange);
		trackNameJLabel.setForeground(Color.orange);
		collectionNameJLabel.setForeground(Color.orange);
		explicitJLabel.setForeground(Color.orange);
		countryJLabel.setForeground(Color.orange);
		currencyJLabel.setForeground(Color.orange);
		genreJLabel.setForeground(Color.orange);
		priceJLabel.setForeground(Color.orange);
		timeJLabel.setForeground(Color.orange);
		artistIDJLabel.setForeground(Color.orange);
		collectionIDJLabel.setForeground(Color.orange);
		trackIDJLabel.setForeground(Color.orange);
		
	}
	
	public void switchToSongs()
	
	{
		imageJButton.setVisible(false);
		searchJTextField.setVisible(true);
		searchJButton.setVisible(true);
		twoJButton.setVisible(true);
		threeJButton.setVisible(true);
		fourJButton.setVisible(true);
		fiveJButton.setVisible(true);
		sixJButton.setVisible(true);
		sevenJButton.setVisible(true);
		eightJButton.setVisible(true);
		nineJButton.setVisible(true);
		tenJButton.setVisible(true);
		elevenJButton.setVisible(true);
		twelveJButton.setVisible(true);
		thirteenJButton.setVisible(true);
		twoJTextField.setVisible(true);
		threeJTextField.setVisible(true);
		fourJTextField.setVisible(true);
		fiveJTextField.setVisible(true);
		sixJTextField.setVisible(true);
		sevenJTextField.setVisible(true);
		eightJTextField.setVisible(true);
		nineJTextField.setVisible(true);
		tenJTextField.setVisible(true);
		elevenJTextField.setVisible(true);
		twelveJTextField.setVisible(true);
		thirteenJTextField.setVisible(true);
		backJButton.setVisible(false);
		
		artistNameJLabel.setVisible(false);
		trackNameJLabel.setVisible(false);
		collectionNameJLabel.setVisible(false);
		explicitJLabel.setVisible(false);
		countryJLabel.setVisible(false);
		currencyJLabel.setVisible(false);
		genreJLabel.setVisible(false);
		priceJLabel.setVisible(false);
		timeJLabel.setVisible(false);
		
		artistIDJLabel.setVisible(false);
		collectionIDJLabel.setVisible(false);
		trackIDJLabel.setVisible(false);
		
		playPreviewJButton.setVisible(false);
		playFullVideoJButton.setVisible(false);
		playFullMusicJButton.setVisible(false);
		
	}
	
	//}
	
	//Emmett - this is all the rain methods and it goes all the way down to the bottom
	//{
	//this is the rain for the picture buttons
	
public void rain(JButton uno,JButton dos,JButton tres,JButton quatro,JButton cinco,JButton sies,JButton siete,JButton ocho,JButton nueve,JButton diez,JButton once,JButton doce)
	
	{
		
		
		
	
		
		//start of first part 2
		if(firstCount==wait1part2)
			
		{
			
			part3 = true;
			
			
			
		}
		
		if(part3== true)
			
		{
			
			tres.setBounds(aDos,thirdCount,200,200);
			thirdCount++;
			
		}
		//end
		
		//start of first part 3
		if(firstCount==wait1part3)
				
		{
					
			part4 = true;
			
					
					
		}
				
			if(part4== true)
					
		{
					
			quatro.setBounds(aTres,fourthCount,200,200);
			fourthCount++;
			
		}
		//end
			
		//start of first part 4
		if(firstCount==wait1part4)
					
		{
						
			part5 = true;
			
				
						
		}
					
			if(part5== true)
						
		{
						
			cinco.setBounds(aCuatro,fifthCount,200,200);
			fifthCount++;
				
		}
		//end
		
		//start of second part 1
		if(firstCount==wait2part1)
			
		{
			
			part2 = true;
			
			
		}
		
		if(part2 == true)
			
		{
			
			
			dos.setBounds(b,secondCount,200,200);
			secondCount++;
			
		}
		//end of the second part 1
		
		//start of second part 2
		if(firstCount==wait2part2)
					
		{
					
			part6 = true;
			
					
					
		}
				
		if(part6== true)
					
		{
					
			sies.setBounds(bDos,sixthCount,200,200);
			sixthCount++;
					
		}
		//end
				
		//start of first part 3
		if(firstCount==wait2part3)
						
		{
							
			part7 = true;
			
							
							
		}
						
			if(part7== true)
							
		{
							
			siete.setBounds(bTres,seventhCount,200,200);
			seventhCount++;
					
		}
		//end
					
		//start of first part 4
		if(firstCount==wait2part4)
							
		{
								
			part8 = true;
			
						
								
		}
							
			if(part8== true)
								
		{
								
			ocho.setBounds(bCuatro,eighthCount,200,200);
			eighthCount++;
						
		}
		//end
			
		//start of third part 1
		if(firstCount==wait3part1)
				
		{
				
			part9 = true;
	
				
		}
			
		if(part9 == true)
				
		{
				
				
			nueve.setBounds(c,ninthCount,200,200);
			ninthCount++;
				
		}
		//end of the third part 1
			
		//start of third part 2
		if(firstCount==wait3part2)
						
		{
						
			part10 = true;
		
										
		}
					
		if(part10== true)
						
		{
						
			diez.setBounds(cDos,tenthCount,200,200);
			tenthCount++;
						
		}
		//end
					
		//start of third part 3
		if(firstCount==wait2part3)
							
		{
							
			part11 = true;
						
								
		}
							
			if(part11== true)
								
		{
								
			once.setBounds(cTres,eleventhCount,200,200);
			eleventhCount++;
						
		}
		//end
						
		//start of third part 4
		if(firstCount==wait3part4)
								
		{
									
			part12 = true;
		
							
									
		}
								
			if(part12== true)
									
		{
									
			doce.setBounds(cCuatro,twelthCount,200,200);
			twelthCount++;
							
		}
		//end
		
		//this is for the first
		uno.setBounds(a,firstCount,200,200);	
		firstCount++;
		//end
		 
		//the wait that occurs
		try {
			TimeUnit.MICROSECONDS.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//end of wait
			
		//start of first part 1 base
		if(firstCount==860)
			
		{
			
			firstCount=0;
			a = rand.nextInt(400);
			
		}
		//end
		
		//start of first part 2 base
		if(thirdCount==860)
			
		{
			
			thirdCount=0;
			aDos = rand.nextInt(400);
			wait1part2 = rand.nextInt(200)+200;
			
		}
		
		//start of first part 3 base
		if(fourthCount==860)
					
		{
					
			fourthCount=0;
			aTres = rand.nextInt(400);
			wait1part3 = rand.nextInt(400)+200;
					
		}
		
		//start of first part 4 base
		if(fifthCount==860)
					
		{
					
			fifthCount=0;
			aCuatro = rand.nextInt(400);
			wait1part4 = rand.nextInt(600)+200;
					
		}
				
		//start of second part 1 base
		if(secondCount == 860)
			
		{
			
			secondCount = 0;
			b = rand.nextInt(400)+400;
			wait2part1 = rand.nextInt(1)+50;
			
		}
			
		//end
		
		//start of second part 2 base
		if(sixthCount==860)
					
		{
					
			sixthCount=0;
			bDos = rand.nextInt(400)+400;
			wait2part2 = rand.nextInt(250)+200;
					
		}
				
		//start of first part 3 base
		if(sixthCount==860)
							
		{
							
			sixthCount=0;
			bTres = rand.nextInt(400)+400;
			wait2part3 = rand.nextInt(450)+200;
							
		}
				
		//start of first part 4 base
		if(eighthCount==860)
							
		{
							
			eighthCount=0;
			bCuatro = rand.nextInt(400)+400;
			wait2part4 = rand.nextInt(650)+200;
							
		}
		
		//start of third part 1 base
		if(ninthCount == 860)
			
		{
			
			ninthCount = 0;
			c = rand.nextInt(800)+400;
			wait3part1 = rand.nextInt(1)+100;
			
		}
			
		//end
		
		//start of third part 2 base
		if(tenthCount==860)
					
		{
					
			tenthCount=0;
			cDos = rand.nextInt(800)+400;
			wait3part2 = rand.nextInt(300)+200;
					
		}
				
		//start of third part 3 base
		if(eleventhCount==860)
							
		{
							
			eleventhCount=0;
			cTres = rand.nextInt(400)+400;
			wait3part3 = rand.nextInt(800)+200;
							
		}
				
		//start of third part 4 base
		if(twelthCount==860)
							
		{
							
			twelthCount=0;
			cCuatro = rand.nextInt(800)+400;
			wait3part4 = rand.nextInt(700)+200;
							
		}
		
		
		
		
		
		
		
		
	}
	

////////vhsdfouhaeorguhepriughapirugharogjaoij    VERY IMPORTANT THAT WE KNOW THIS IS A DIVIDER rughaeroghaishfgaosdufhaosidugfhasogjasofhgasogasodh

//this is the rain for the song names

public void llueve(JTextField uno,JTextField dos,JTextField tres,JTextField quatro,JTextField cinco,JTextField sies,JTextField siete,JTextField ocho,JTextField nueve,JTextField diez,JTextField once,JTextField doce)

{
	
	
	

	
	//start of first part 2
	if(firstCount==wait1part2)
		
	{
		
		part3 = true;
		
		
		
	}
	
	if(part3== true)
		
	{
		
		tres.setBounds(aDos,thirdCount+200,200,50);
		thirdCount++;
		
	}
	//end
	
	//start of first part 3
	if(firstCount==wait1part3)
			
	{
				
		part4 = true;
		
				
				
	}
			
		if(part4== true)
				
	{
				
		quatro.setBounds(aTres,fourthCount+200,200,50);
		fourthCount++;
		
	}
	//end
		
	//start of first part 4
	if(firstCount==wait1part4)
				
	{
					
		part5 = true;
		
			
					
	}
				
		if(part5== true)
					
	{
					
		cinco.setBounds(aCuatro,fifthCount+200,200,50);
		fifthCount++;
			
	}
	//end
	
	//start of second part 1
	if(firstCount==wait2part1)
		
	{
		
		part2 = true;
		
		
	}
	
	if(part2 == true)
		
	{
		
		
		dos.setBounds(b,secondCount+200,200,50);
		secondCount++;
		
	}
	//end of the second part 1
	
	//start of second part 2
	if(firstCount==wait2part2)
				
	{
				
		part6 = true;
		
				
				
	}
			
	if(part6== true)
				
	{
				
		sies.setBounds(bDos,sixthCount+200,200,50);
		sixthCount++;
				
	}
	//end
			
	//start of first part 3
	if(firstCount==wait2part3)
					
	{
						
		part7 = true;
		
						
						
	}
					
		if(part7== true)
						
	{
						
		siete.setBounds(bTres,seventhCount+200,200,50);
		seventhCount++;
				
	}
	//end
				
	//start of first part 4
	if(firstCount==wait2part4)
						
	{
							
		part8 = true;
		
					
							
	}
						
		if(part8== true)
							
	{
							
		ocho.setBounds(bCuatro,eighthCount+200,200,50);
		eighthCount++;
					
	}
	//end
		
	//start of third part 1
	if(firstCount==wait3part1)
			
	{
			
		part9 = true;

			
	}
		
	if(part9 == true)
			
	{
			
			
		nueve.setBounds(c,ninthCount+200,200,50);
		ninthCount++;
			
	}
	//end of the third part 1
		
	//start of third part 2
	if(firstCount==wait3part2)
					
	{
					
		part10 = true;
	
									
	}
				
	if(part10== true)
					
	{
					
		diez.setBounds(cDos,tenthCount+200,200,50);
		tenthCount++;
					
	}
	//end
				
	//start of third part 3
	if(firstCount==wait2part3)
						
	{
						
		part11 = true;
					
							
	}
						
		if(part11== true)
							
	{
							
		once.setBounds(cTres,eleventhCount+200,200,50);
		eleventhCount++;
					
	}
	//end
					
	//start of third part 4
	if(firstCount==wait3part4)
							
	{
								
		part12 = true;
	
						
								
	}
							
		if(part12== true)
								
	{
								
		doce.setBounds(cCuatro,twelthCount+200,200,50);
		twelthCount++;
						
	}
	//end
	
	//this is for the first
	uno.setBounds(a,firstCount+200,200,50);	
	firstCount++;
	//end
	 
	//the wait that occurs
	try {
		TimeUnit.MICROSECONDS.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	//end of wait
		
	//start of first part 1 base
	if(firstCount==860)
		
	{
		
		firstCount=0;
		a = rand.nextInt(400);
		
	}
	//end
	
	//start of first part 2 base
	if(thirdCount==860)
		
	{
		
		thirdCount=0;
		aDos = rand.nextInt(400);
		wait1part2 = rand.nextInt(200)+200;
		
	}
	
	//start of first part 3 base
	if(fourthCount==860)
				
	{
				
		fourthCount=0;
		aTres = rand.nextInt(400);
		wait1part3 = rand.nextInt(400)+200;
				
	}
	
	//start of first part 4 base
	if(fifthCount==860)
				
	{
				
		fifthCount=0;
		aCuatro = rand.nextInt(400);
		wait1part4 = rand.nextInt(600)+200;
				
	}
			
	//start of second part 1 base
	if(secondCount == 860)
		
	{
		
		secondCount = 0;
		b = rand.nextInt(400)+400;
		wait2part1 = rand.nextInt(1)+50;
		
	}
		
	//end
	
	//start of second part 2 base
	if(sixthCount==860)
				
	{
				
		sixthCount=0;
		bDos = rand.nextInt(400)+400;
		wait2part2 = rand.nextInt(250)+200;
				
	}
			
	//start of first part 3 base
	if(sixthCount==860)
						
	{
						
		sixthCount=0;
		bTres = rand.nextInt(400)+400;
		wait2part3 = rand.nextInt(450)+200;
						
	}
			
	//start of first part 4 base
	if(eighthCount==860)
						
	{
						
		eighthCount=0;
		bCuatro = rand.nextInt(400)+400;
		wait2part4 = rand.nextInt(650)+200;
						
	}
	
	//start of third part 1 base
	if(ninthCount == 860)
		
	{
		
		ninthCount = 0;
		c = rand.nextInt(800)+400;
		wait3part1 = rand.nextInt(1)+100;
		
	}
		
	//end
	
	//start of third part 2 base
	if(tenthCount==860)
				
	{
				
		tenthCount=0;
		cDos = rand.nextInt(800)+400;
		wait3part2 = rand.nextInt(300)+200;
				
	}
			
	//start of third part 3 base
	if(eleventhCount==860)
						
	{
						
		eleventhCount=0;
		cTres = rand.nextInt(400)+400;
		wait3part3 = rand.nextInt(800)+200;
						
	}
			
	//start of third part 4 base
	if(twelthCount==860)
						
	{
						
		twelthCount=0;
		cCuatro = rand.nextInt(800)+400;
		wait3part4 = rand.nextInt(700)+200;
						
	}
	
}

	public static void main(String[] args) 
	{
		
		SimpleScreen screen = new SimpleScreen();
		screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

//}
