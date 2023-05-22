package vn.unikcore.nextcrmads.common.dto.workspace;

public class WorkspaceTemplate {
    private String workspaceId;
    private String customerId;
    private String email;
    private String name;
    private String slug;
    private Boolean initialSetupComplete;
    private Boolean displaySetupWizard;
    private Boolean anonymousDataCollection;
    private Boolean news;
    private Boolean securityUpdates;
    private String defaultGeography;

    public String getWorkspaceId() {
        return workspaceId;
    }
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public Boolean getInitialSetupComplete() {
        return initialSetupComplete;
    }
    public void setInitialSetupComplete(Boolean initialSetupComplete) {
        this.initialSetupComplete = initialSetupComplete;
    }
    public Boolean getDisplaySetupWizard() {
        return displaySetupWizard;
    }
    public void setDisplaySetupWizard(Boolean displaySetupWizard) {
        this.displaySetupWizard = displaySetupWizard;
    }
    public Boolean getAnonymousDataCollection() {
        return anonymousDataCollection;
    }
    public void setAnonymousDataCollection(Boolean anonymousDataCollection) {
        this.anonymousDataCollection = anonymousDataCollection;
    }
    public Boolean getNews() {
        return news;
    }
    public void setNews(Boolean news) {
        this.news = news;
    }
    public Boolean getSecurityUpdates() {
        return securityUpdates;
    }
    public void setSecurityUpdates(Boolean securityUpdates) {
        this.securityUpdates = securityUpdates;
    }
    public String getDefaultGeography() {
        return defaultGeography;
    }
    public void setDefaultGeography(String defaultGeography) {
        this.defaultGeography = defaultGeography;
    }
}
