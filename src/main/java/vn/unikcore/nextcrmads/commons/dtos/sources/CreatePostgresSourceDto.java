package vn.unikcore.nextcrmads.commons.dtos.sources;

public class CreatePostgresSourceDto {
    private String workspaceId;
    private String name;
    private String sourceDefinitionId;
    private PostgresConfiguration connectionConfiguration;
    
    public String getWorkspaceId() {
        return workspaceId;
    }
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSourceDefinitionId() {
        return sourceDefinitionId;
    }
    public void setSourceDefinitionId(String sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
    }
    public PostgresConfiguration getConnectionConfiguration() {
        return connectionConfiguration;
    }
    public void setConnectionConfiguration(PostgresConfiguration connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }
}
