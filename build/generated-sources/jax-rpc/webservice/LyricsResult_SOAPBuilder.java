// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class LyricsResult_SOAPBuilder implements SOAPInstanceBuilder {
    private webservice.LyricsResult _instance;
    private java.lang.String artist;
    private java.lang.String song;
    private java.lang.String lyrics;
    private java.lang.String url;
    private static final int myARTIST_INDEX = 0;
    private static final int mySONG_INDEX = 1;
    private static final int myLYRICS_INDEX = 2;
    private static final int myURL_INDEX = 3;
    
    public LyricsResult_SOAPBuilder() {
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public void setSong(java.lang.String song) {
        this.song = song;
    }
    
    public void setLyrics(java.lang.String lyrics) {
        this.lyrics = lyrics;
    }
    
    public void setUrl(java.lang.String url) {
        this.url = url;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myARTIST_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case mySONG_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myLYRICS_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case myURL_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public void construct() {
    }
    
    public void setMember(int index, java.lang.Object memberValue) {
        try {
            switch(index) {
                case myARTIST_INDEX:
                    _instance.setArtist((java.lang.String)memberValue);
                    break;
                case mySONG_INDEX:
                    _instance.setSong((java.lang.String)memberValue);
                    break;
                case myLYRICS_INDEX:
                    _instance.setLyrics((java.lang.String)memberValue);
                    break;
                case myURL_INDEX:
                    _instance.setUrl((java.lang.String)memberValue);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        catch (java.lang.RuntimeException e) {
            throw e;
        }
        catch (java.lang.Exception e) {
            throw new DeserializationException(new LocalizableExceptionAdapter(e));
        }
    }
    
    public void initialize() {
    }
    
    public void setInstance(java.lang.Object instance) {
        _instance = (webservice.LyricsResult)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
