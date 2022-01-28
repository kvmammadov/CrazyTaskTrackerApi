package may.code.crazytasktrackerapi.store.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDto {


    private Long id;


    private String name;


    @JsonProperty("created_at")
    private Instant createdAt;

    private String description;
}
