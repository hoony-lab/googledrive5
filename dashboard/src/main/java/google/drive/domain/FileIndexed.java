package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
}
