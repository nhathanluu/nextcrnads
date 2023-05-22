package vn.unikcore.nextcrmads.common.dto.definition;

public class GetSourceDefinitionResponse {
    private SourceDefinitionTemplate[] sourceDefinitions;

    public SourceDefinitionTemplate[] getSourceDefinitions() {
        return sourceDefinitions;
    }

    public void setSourceDefinitions(SourceDefinitionTemplate[] sourceDefinitions) {
        this.sourceDefinitions = sourceDefinitions;
    }
}
