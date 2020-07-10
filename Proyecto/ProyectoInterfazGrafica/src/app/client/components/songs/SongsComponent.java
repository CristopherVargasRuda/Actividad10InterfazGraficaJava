package app.client.components.songs;


public class SongsComponent {
    private SongsTemplate songsTemplate;
    

    public SongsComponent() {
        this.songsTemplate = new SongsTemplate(this);
        
    }
    
    
    public SongsTemplate getSongsTemplate() {
        return this.songsTemplate;
    }
}
