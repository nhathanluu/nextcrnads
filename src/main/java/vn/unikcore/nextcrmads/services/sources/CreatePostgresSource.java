package vn.unikcore.nextcrmads.services.sources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.unikcore.nextcrmads.commons.dtos.sources.CreatePostgresSourceDto;
import vn.unikcore.nextcrmads.commons.dtos.sources.CreateSourceResponse;
import vn.unikcore.nextcrmads.commons.helpers.HttpHelper;
import vn.unikcore.nextcrmads.commons.interfaces.ICreateService;
import vn.unikcore.nextcrmads.config.AppConfig;

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
