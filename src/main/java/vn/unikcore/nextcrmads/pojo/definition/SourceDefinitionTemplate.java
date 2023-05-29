package vn.unikcore.nextcrmads.pojo.definition;

public class SourceDefinitionTemplate {
    public String getSourceDefinitionId() {
        return sourceDefinitionId;
    }
    public void setSourceDefinitionId(String sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDockerRepository() {
        return dockerRepository;
    }
    public void setDockerRepository(String dockerRepository) {
        this.dockerRepository = dockerRepository;
    }
    public String getDockerImageTag() {
        return dockerImageTag;
    }
    public void setDockerImageTag(String dockerImageTag) {
        this.dockerImageTag = dockerImageTag;
    }
    public String getDocumentationUrl() {
        return documentationUrl;
    }
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getProtocolVersion() {
        return protocolVersion;
    }
    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }
    public String getReleaseStage() {
        return releaseStage;
    }
    public void setReleaseStage(String releaseStage) {
        this.releaseStage = releaseStage;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getSourceType() {
        return sourceType;
    }
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    private String sourceDefinitionId;
    private String name;
    private String dockerRepository;
    private String dockerImageTag;
    private String documentationUrl;
    private String icon;
    private String protocolVersion;
    private String releaseStage;
    private String releaseDate;
    private String sourceType;
}
