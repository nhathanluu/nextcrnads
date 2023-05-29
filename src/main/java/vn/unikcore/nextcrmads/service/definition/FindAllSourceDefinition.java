package vn.unikcore.nextcrmads.service.definition;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.unikcore.nextcrmads.common.helper.HttpHelper;
import vn.unikcore.nextcrmads.common.interfaces.IFindService;
import vn.unikcore.nextcrmads.config.AppConfig;
import vn.unikcore.nextcrmads.predicate.definition.GetSourceDefinitionResponse;

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
