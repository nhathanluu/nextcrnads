package vn.unikcore.nextcrmads.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.unikcore.nextcrmads.commons.dtos.sources.CreatePostgresSourceDto;
import vn.unikcore.nextcrmads.commons.dtos.sources.CreateSourceResponse;
import vn.unikcore.nextcrmads.services.sources.CreatePostgresSource;

@RestController
@RequestMapping("api/source")
public class SourceController {
    @Autowired
    private CreatePostgresSource createPostgresSource;

    @PostMapping("")
    public CreateSourceResponse createSource (@RequestBody CreatePostgresSourceDto createPostgresSourceDto) {
        CreateSourceResponse response = createPostgresSource.execute(createPostgresSourceDto);

        return response;
    }
}
