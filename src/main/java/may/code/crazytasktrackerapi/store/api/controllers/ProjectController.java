package may.code.crazytasktrackerapi.store.api.controllers;

import lombok.RequiredArgsConstructor;
import may.code.crazytasktrackerapi.store.api.dto.ProjectDto;
import may.code.crazytasktrackerapi.store.api.exceptions.BadRequestException;
import may.code.crazytasktrackerapi.store.api.factories.ProjectDtoFactory;
import may.code.crazytasktrackerapi.store.entities.ProjectEntity;
import may.code.crazytasktrackerapi.store.repositories.ProjectRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Transactional
@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectDtoFactory projectDtoFactory;
    private final ProjectRepository projectRepository;

    public static final String CREATE_PROJECT = "/api/projects";

    @PostMapping(CREATE_PROJECT)
    public ProjectDto createProject(
            @RequestParam String name) {

        projectRepository
                .findByName(name)
                .ifPresent(project -> {
                    throw new BadRequestException("Project already exists");
                });

        ProjectEntity project = projectRepository.save(
                ProjectEntity.builder()
                        .name(name)
                        .build()
        );

        return projectDtoFactory.makeProjectDto(project);
    }
}
