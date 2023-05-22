package vn.unikcore.nextcrmads.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.unikcore.nextcrmads.commons.dtos.workspaces.GetWorkspaceResponse;
import vn.unikcore.nextcrmads.services.workspaces.FindAllWorkspace;

@RestController
@RequestMapping("/api/workspace")
public class WorkSpaceController {
    @Autowired
    private FindAllWorkspace findAllWorkspace;

    @GetMapping("")
    public GetWorkspaceResponse getAll() {
        GetWorkspaceResponse data = findAllWorkspace.execute();

        return data;
    }
}
