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
public class TaskStateDto {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Long ordinal;

    @NotNull
    @JsonProperty("created_at")
    private Instant createdAt;
}
