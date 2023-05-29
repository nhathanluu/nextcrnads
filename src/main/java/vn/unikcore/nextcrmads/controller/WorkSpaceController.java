package vn.unikcore.nextcrmads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.unikcore.nextcrmads.common.helper.ApiResponse;
import vn.unikcore.nextcrmads.predicate.workspace.GetWorkspaceResponse;
import vn.unikcore.nextcrmads.service.workspace.FindAllWorkspace;

@RestController
@RequestMapping("/api/workspace")
public class WorkSpaceController {
    @Autowired
    private FindAllWorkspace findAllWorkspace;

    @GetMapping("")
    
    public ResponseEntity<Object> getAll() {
        GetWorkspaceResponse data = findAllWorkspace.execute();

        return ApiResponse.generateResponse(HttpStatus.OK, false, "ok", data);
    }
}
