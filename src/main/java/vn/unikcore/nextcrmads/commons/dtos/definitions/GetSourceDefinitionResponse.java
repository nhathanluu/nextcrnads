package vn.unikcore.nextcrmads.commons.dtos.definitions;

public class GetSourceDefinitionResponse {
    private SourceDefinitionTemplate[] sourceDefinitions;

    public SourceDefinitionTemplate[] getSourceDefinitions() {
        return sourceDefinitions;
    }

    public void setSourceDefinitions(SourceDefinitionTemplate[] sourceDefinitions) {
        this.sourceDefinitions = sourceDefinitions;
    }
}
