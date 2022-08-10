package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdTime;
    private String type;
    private String ownerId;
}
