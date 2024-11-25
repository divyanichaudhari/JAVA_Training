package coll3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {
	private Set<String> songSet = new HashSet<>();
	 
    public void addSong(String songDetails) {
        songSet.add(songDetails);
    }
 
    public int findTheViewsForGivenSongTitle(String songTitle) {
        for (String songDetail : songSet) {
            String[] details = songDetail.split(":");
            if (details[0].equals(songTitle)) {
                return Integer.parseInt(details[1]);
            }
        }
        return -1; 
    }
    
     public List<String> findTheSongsWithHighestViews() {
    	int maxViews= -1;
		List<String> highestview = new ArrayList<>();
		
        for (String songDetail : songSet) {
        	String[] details = songDetail.split(":");
        	int views = Integer.parseInt(details[1]);
        	
        	if(views> maxViews) {
        		maxViews = views;
        		highestview.clear();
        		highestview.add(details[0]);
        	}
        	else if (views == maxViews) {
                highestview.add(details[0]);
            }
        	
        }
    	 return highestview;
    	 
     }

}
