package may.code.crazytasktrackerapi.store.api.factories;

import lombok.RequiredArgsConstructor;
import may.code.crazytasktrackerapi.store.api.dto.ProjectDto;
import may.code.crazytasktrackerapi.store.api.dto.TaskDto;
import may.code.crazytasktrackerapi.store.api.dto.TaskStateDto;
import may.code.crazytasktrackerapi.store.entities.ProjectEntity;
import may.code.crazytasktrackerapi.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity entity) {

        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
