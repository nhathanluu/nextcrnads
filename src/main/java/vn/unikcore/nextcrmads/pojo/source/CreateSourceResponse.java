package vn.unikcore.nextcrmads.pojo.source;

public class CreateSourceResponse {
    private String sourceDefinitionId;
    private String sourceId;
    private String workspaceId;
    private PostgresConfiguration connectionConfiguration;
    private String name;
    private String sourceName;
    private String icon;
    
    public String getSourceDefinitionId() {
        return sourceDefinitionId;
    }
    public void setSourceDefinitionId(String sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
    }
    public String getSourceId() {
        return sourceId;
    }
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
    public String getWorkspaceId() {
        return workspaceId;
    }
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    public PostgresConfiguration getConnectionConfiguration() {
        return connectionConfiguration;
    }
    public void setConnectionConfiguration(PostgresConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSourceName() {
        return sourceName;
    }
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
