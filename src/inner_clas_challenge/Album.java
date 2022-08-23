/*
 Description:

For this exercise you will need your Album and Song classes from Coding Exercise 46: Playlist. The Playlist class will be modified to use an inner class called SongList which will replace the ArrayList that was used to hold the list of songs for an album.

The SongList class will use an ArrayList to hold the track list for the album. To do this a member variable called songs will need to be declared and a constructor will need to be implemented to initialize the field.

In addition, the inner class will need three(3) methods:

1) add - accepts a parameter of type Song. This method returns a boolean value which will be false if the song is found to already be in the songs list. If not, the song will be added to the list and a value of true will be returned.

2) findSong - accepts the title of a song as its only parameter. If the song with that title is found in the list then the song is returned from the method. If not, a value of null is returned.

3) findSong - overridden method which accepts a track number for a song. The track number is of type int. If a song is found with that track number the song is returned, otherwise null is returned.

The member variable, constructor and all methods may be marked with private access.

***IMPORTANT*** - If you are using an IDE to write this code you may have your inner class marked with private access. However, for the purposes of this code evaluation please mark the class itself public static.
*
*
 */
package inner_clas_challenge;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name, artist;
    private SongList songs;
    
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    
    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }
    
    public boolean addToPlayList(int track,LinkedList<Song> playlist){
        Song checkSong = songs.findSong(track);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public boolean addToPlayList(String title,LinkedList<Song> playlist){
        Song checkSong = songs.findSong(title);
        if(checkSong != null){
            playlist.add(checkSong);
            return true;
        }
        return false;
    }
    
    public static class SongList{
        private ArrayList<Song> songs;
        
        
        private SongList(){
            songs = new ArrayList<Song>();
        }
        
        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            songs.add(song);
            return true;
        }
        
        private Song findSong(String title){
            for(int i=0;i<songs.size();i++){
                Song song = songs.get(i);
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
        
        private Song findSong(int track){
            int count = track -1;
            if(count>0 && count<songs.size()){
                return songs.get(count);
            }
            return null;
        }
        
    }
    
}