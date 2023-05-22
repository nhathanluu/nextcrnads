package vn.unikcore.nextcrmads.services.workspaces;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import vn.unikcore.nextcrmads.commons.dtos.workspaces.GetWorkspaceResponse;
import vn.unikcore.nextcrmads.commons.helpers.HttpHelper;
import vn.unikcore.nextcrmads.commons.interfaces.IFindService;
import vn.unikcore.nextcrmads.config.AppConfig;

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
