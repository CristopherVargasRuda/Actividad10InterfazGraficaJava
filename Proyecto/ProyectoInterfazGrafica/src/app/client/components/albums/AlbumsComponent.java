package app.client.components.albums;


public class AlbumsComponent {
    private AlbumsTemplate albumsTemplate;
    

    public AlbumsComponent() {
        this.albumsTemplate = new AlbumsTemplate(this);
        
    }
    
    
    public AlbumsTemplate getAlbumsTemplate() {
        return this.albumsTemplate;
    }
}
