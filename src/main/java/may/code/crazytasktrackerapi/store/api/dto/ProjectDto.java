package may.code.crazytasktrackerapi.store.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.sun.istack.NotNull;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @JsonProperty("created_at")
    private Instant createdAt;

    @NotNull
    @JsonProperty("updated_at")
    private Instant updatedAt;
}
