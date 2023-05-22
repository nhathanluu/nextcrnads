package vn.unikcore.nextcrmads.commons.dtos.workspaces;

public class GetWorkspaceResponse {
    private WorkspaceTemplate[] workspaces;

    public WorkspaceTemplate[] getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(WorkspaceTemplate[] workspaces) {
        this.workspaces = workspaces;
    }
}
