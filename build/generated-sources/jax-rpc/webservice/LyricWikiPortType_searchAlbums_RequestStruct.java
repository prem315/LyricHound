// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricWikiPortType_searchAlbums_RequestStruct {
    protected java.lang.String artist;
    protected java.lang.String album;
    protected int year;
    
    public LyricWikiPortType_searchAlbums_RequestStruct() {
    }
    
    public LyricWikiPortType_searchAlbums_RequestStruct(java.lang.String artist, java.lang.String album, int year) {
        this.artist = artist;
        this.album = album;
        this.year = year;
    }
    
    public java.lang.String getArtist() {
        return artist;
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public java.lang.String getAlbum() {
        return album;
    }
    
    public void setAlbum(java.lang.String album) {
        this.album = album;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
}
