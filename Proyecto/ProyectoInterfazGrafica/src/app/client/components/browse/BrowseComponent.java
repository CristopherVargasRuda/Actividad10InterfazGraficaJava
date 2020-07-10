package app.client.components.browse;


public class BrowseComponent {
    private BrowseTemplate browseTemplate;
    

    public BrowseComponent() {
        this.browseTemplate = new BrowseTemplate(this);
        
    }
    
    
    public BrowseTemplate getBrowseTemplate() {
        return this.browseTemplate;
    }
}
