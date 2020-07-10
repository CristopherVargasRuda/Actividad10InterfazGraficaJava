package app.client.components.artists;


public class ArtistsComponent {
    private ArtistsTemplate artistsTemplate;
    

    public ArtistsComponent() {
        this.artistsTemplate = new ArtistsTemplate(this);  
    }
    
    
    public ArtistsTemplate getArtistsTemplate() {
        return this.artistsTemplate;
    }
}
