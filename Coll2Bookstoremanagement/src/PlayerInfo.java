import java.util.Collection;
import java.util.HashMap;
import java.util.*;

public class PlayerInfo {
		private Map<String, Float> PlayerInfoMap = new HashMap<String, Float >();
		
		public Map<String, Float> getPlayerInfo(){
			return PlayerInfoMap;
		}
		
		public void setPlayerInfo(Map<String, Float> PlayerInfoMap) {
			this.PlayerInfoMap = PlayerInfoMap;
		}
		
		public void addPlayerRating(String playerName, float rating) {
			this.PlayerInfoMap.put(playerName, rating);
		}
		
		public float findPlayerRating(String playerName) {
			Float rating = PlayerInfoMap.get(playerName);
			
			if(playerName != null) {
				return rating;
			}
		
		return -1.0f;

		}
		
		 public List<String> findTopFivePlayers() {
		        List<Map.Entry<String, Float>> entries = new ArrayList<>(PlayerInfoMap.entrySet());
		        // Sort in descending order based on ratings
		        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
		        
		        List<String> topPlayers = new ArrayList<>();
		        for (int i = 0; i < Math.min(5, entries.size()); i++) {
		            topPlayers.add(entries.get(i).getKey());
		        }
		        return topPlayers;
		    }
		}

