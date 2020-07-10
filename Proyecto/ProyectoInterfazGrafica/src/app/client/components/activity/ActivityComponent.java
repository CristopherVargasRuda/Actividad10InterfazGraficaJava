package app.client.components.activity;


public class ActivityComponent {
    private ActivityTemplate activityTemplate;
    

    public ActivityComponent() {
        this.activityTemplate = new ActivityTemplate(this);
        
    }
    
    
    public ActivityTemplate getActivityTemplate() {
        return this.activityTemplate;
    }
}
