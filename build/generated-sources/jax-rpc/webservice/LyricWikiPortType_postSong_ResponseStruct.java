// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricWikiPortType_postSong_ResponseStruct {
    protected java.lang.String artist;
    protected java.lang.String song;
    protected boolean dataUsed;
    protected java.lang.String message;
    
    public LyricWikiPortType_postSong_ResponseStruct() {
    }
    
    public LyricWikiPortType_postSong_ResponseStruct(java.lang.String artist, java.lang.String song, boolean dataUsed, java.lang.String message) {
        this.artist = artist;
        this.song = song;
        this.dataUsed = dataUsed;
        this.message = message;
    }
    
    public java.lang.String getArtist() {
        return artist;
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public java.lang.String getSong() {
        return song;
    }
    
    public void setSong(java.lang.String song) {
        this.song = song;
    }
    
    public boolean isDataUsed() {
        return dataUsed;
    }
    
    public void setDataUsed(boolean dataUsed) {
        this.dataUsed = dataUsed;
    }
    
    public java.lang.String getMessage() {
        return message;
    }
    
    public void setMessage(java.lang.String message) {
        this.message = message;
    }
}
