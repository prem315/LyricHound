// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;


public class LyricWikiPortType_postAlbum_RequestStruct {
    protected boolean overwriteIfExists;
    protected java.lang.String artist;
    protected java.lang.String album;
    protected int year;
    protected java.lang.String asin;
    protected java.lang.String[] songs;
    
    public LyricWikiPortType_postAlbum_RequestStruct() {
    }
    
    public LyricWikiPortType_postAlbum_RequestStruct(boolean overwriteIfExists, java.lang.String artist, java.lang.String album, int year, java.lang.String asin, java.lang.String[] songs) {
        this.overwriteIfExists = overwriteIfExists;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.asin = asin;
        this.songs = songs;
    }
    
    public boolean isOverwriteIfExists() {
        return overwriteIfExists;
    }
    
    public void setOverwriteIfExists(boolean overwriteIfExists) {
        this.overwriteIfExists = overwriteIfExists;
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
    
    public java.lang.String getAsin() {
        return asin;
    }
    
    public void setAsin(java.lang.String asin) {
        this.asin = asin;
    }
    
    public java.lang.String[] getSongs() {
        return songs;
    }
    
    public void setSongs(java.lang.String[] songs) {
        this.songs = songs;
    }
}
