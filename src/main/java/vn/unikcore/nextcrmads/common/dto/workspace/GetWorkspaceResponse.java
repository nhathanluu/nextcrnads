package vn.unikcore.nextcrmads.common.dto.workspace;

public class GetWorkspaceResponse {
    private WorkspaceTemplate[] workspaces;

    public WorkspaceTemplate[] getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(WorkspaceTemplate[] workspaces) {
        this.workspaces = workspaces;
    }
}
