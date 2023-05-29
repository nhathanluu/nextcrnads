package vn.unikcore.nextcrmads.service.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.unikcore.nextcrmads.common.helper.HttpHelper;
import vn.unikcore.nextcrmads.common.interfaces.ICreateService;
import vn.unikcore.nextcrmads.config.AppConfig;
import vn.unikcore.nextcrmads.predicate.source.CreatePostgresSourceDto;
import vn.unikcore.nextcrmads.predicate.source.CreateSourceResponse;

@Service
public class CreatePostgresSource implements ICreateService<CreateSourceResponse, CreatePostgresSourceDto> {
    @Autowired
    private AppConfig appConfig;

    @Override
    public CreateSourceResponse execute(CreatePostgresSourceDto data) {
        String url = appConfig.airbyte_host + "/v1/sources/create";
        
        CreateSourceResponse response = HttpHelper.post(url, data, CreateSourceResponse.class);

        return response;
    }
}
