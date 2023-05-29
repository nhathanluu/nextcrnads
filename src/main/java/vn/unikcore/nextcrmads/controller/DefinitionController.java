package vn.unikcore.nextcrmads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.unikcore.nextcrmads.pojo.definition.GetSourceDefinitionResponse;
import vn.unikcore.nextcrmads.service.definition.FindAllSourceDefinition;

@RestController
@RequestMapping("/api/definition")
public class DefinitionController {
    @Autowired
    private FindAllSourceDefinition findAllSourceDefinition;

    @GetMapping("/source")
    public GetSourceDefinitionResponse findAllSourceDefinition (@RequestParam String workspaceId) {
        GetSourceDefinitionResponse response = findAllSourceDefinition.execute(workspaceId);
        
        return response;
    }
}
