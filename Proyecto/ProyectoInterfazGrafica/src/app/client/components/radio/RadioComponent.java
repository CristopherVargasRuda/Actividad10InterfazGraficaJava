package app.client.components.radio;


public class RadioComponent {
    private RadioTemplate radioTemplate;
    

    public RadioComponent() {
        this.radioTemplate = new RadioTemplate(this);
        
    }
    
    
    public RadioTemplate getRadioTemplate() {
        return this.radioTemplate;
    }
}
