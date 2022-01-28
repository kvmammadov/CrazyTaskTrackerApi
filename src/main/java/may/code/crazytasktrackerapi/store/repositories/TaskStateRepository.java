package may.code.crazytasktrackerapi.store.repositories;

import may.code.crazytasktrackerapi.store.entities.TaskEntity;
import may.code.crazytasktrackerapi.store.entities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
