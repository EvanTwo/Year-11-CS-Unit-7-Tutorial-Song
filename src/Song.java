import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    ArrayList<String> newList = new ArrayList<>();
    private int counter;
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners){
        counter = 0;
        for(int i =0;i< listeners.size();i++){
            listeners.add(listeners.get(0).toLowerCase());
            listeners.remove(0);
        }


        for(int i = 0; i<listeners.size();i++){
            if(!newList.contains(listeners.get(i))){
                newList.add(listeners.get(i));
                counter++;
            }
        }
        return counter;
    }
}
