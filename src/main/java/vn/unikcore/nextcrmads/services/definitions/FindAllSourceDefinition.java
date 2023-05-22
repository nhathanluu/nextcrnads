package vn.unikcore.nextcrmads.services.definitions;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.commons.dtos.definitions.GetSourceDefinitionResponse;
import vn.unikcore.nextcrmads.commons.helpers.HttpHelper;
import vn.unikcore.nextcrmads.commons.interfaces.IFindService;
import vn.unikcore.nextcrmads.config.AppConfig;

@Service
public class FindAllSourceDefinition implements IFindService<GetSourceDefinitionResponse, String> {
    @Autowired
    private AppConfig appConfig;

    @Override
    public GetSourceDefinitionResponse execute(String workspaceId) {
        String url = appConfig.airbyte_host + "/v1/source_definitions/list_for_workspace";
        HashMap<String, String> body = new HashMap<String, String>();
        body.put("workspaceId", workspaceId);

        GetSourceDefinitionResponse data = HttpHelper.post(url, body, GetSourceDefinitionResponse.class);

        return data;
    }
}
