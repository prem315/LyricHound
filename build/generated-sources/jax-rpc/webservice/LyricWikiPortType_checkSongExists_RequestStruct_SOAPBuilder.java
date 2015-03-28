// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package webservice;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.util.exception.LocalizableExceptionAdapter;

public class LyricWikiPortType_checkSongExists_RequestStruct_SOAPBuilder implements SOAPInstanceBuilder {
    private webservice.LyricWikiPortType_checkSongExists_RequestStruct _instance;
    private java.lang.String artist;
    private java.lang.String song;
    private static final int myARTIST_INDEX = 0;
    private static final int mySONG_INDEX = 1;
    
    public LyricWikiPortType_checkSongExists_RequestStruct_SOAPBuilder() {
    }
    
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }
    
    public void setSong(java.lang.String song) {
        this.song = song;
    }
    
    public int memberGateType(int memberIndex) {
        switch (memberIndex) {
            case myARTIST_INDEX:
                return GATES_INITIALIZATION | REQUIRES_CREATION;
            case mySONG_INDEX:
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
        _instance = (webservice.LyricWikiPortType_checkSongExists_RequestStruct)instance;
    }
    
    public java.lang.Object getInstance() {
        return _instance;
    }
}
