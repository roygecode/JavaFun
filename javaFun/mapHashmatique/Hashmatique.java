import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Axwell", "dreamers will dream");
        trackList.put("Roger Subirana", "it comes raining down");
        trackList.put("Coldplay", "A sky full of stars");
        trackList.put("Avicii", "Making my way thorugh the darkness");

        System.out.println(trackList.get("Avicii"));

        for (String key: trackList.keySet()) {
            System.out.println("Title: "+key);
            System.out.println("Lyrics: "+trackList.get(key));
        }
    }

}