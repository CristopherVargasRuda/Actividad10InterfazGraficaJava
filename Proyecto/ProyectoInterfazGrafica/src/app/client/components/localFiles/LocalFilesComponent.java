package app.client.components.localFiles;


public class LocalFilesComponent {
    private LocalFilesTemplate localFilesTemplate;
    

    public LocalFilesComponent() {
        this.localFilesTemplate = new LocalFilesTemplate(this);
        
    }
    
    
    public LocalFilesTemplate getLocalFilesTemplate() {
        return this.localFilesTemplate;
    }
}
