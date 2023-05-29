package vn.unikcore.nextcrmads.service.workspace;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.unikcore.nextcrmads.common.helper.HttpHelper;
import vn.unikcore.nextcrmads.common.interfaces.IFindService;
import vn.unikcore.nextcrmads.config.AppConfig;
import vn.unikcore.nextcrmads.pojo.workspace.GetWorkspaceResponse;

@Service
public class FindAllWorkspace implements IFindService<GetWorkspaceResponse, String> {
    @Autowired
    private AppConfig appConfig;

    @Override
    public GetWorkspaceResponse execute(String data) {
        return new GetWorkspaceResponse();
    }

    public GetWorkspaceResponse execute() {
        String url = appConfig.airbyte_host + "/v1/workspaces/list";

        GetWorkspaceResponse data = HttpHelper.post(url, new HashMap<>(), GetWorkspaceResponse.class);

        return data;
    }
}
