package may.code.crazytasktrackerapi.store.api.factories;

import lombok.RequiredArgsConstructor;
import may.code.crazytasktrackerapi.store.api.dto.ProjectDto;
import may.code.crazytasktrackerapi.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity) {

        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
