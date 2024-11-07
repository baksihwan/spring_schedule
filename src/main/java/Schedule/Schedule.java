package Schedule;

import lombok.Data;

@Data
public class Schedule {
    private Long id;
    private String title;
    private String content;
    private String user;
    private String createdAt;
    private String updatedAt;
    private String password;
    private String todo;

    public Schedule(ScheduleRequestDto scheduleRequestDto){
        this.title=scheduleRequestDto.getTitle();
        this.content=scheduleRequestDto.getContent();
        this.user=scheduleRequestDto.getUser();
        this.createdAt=scheduleRequestDto.getCreatedAt();
        this.updatedAt=scheduleRequestDto.getUpdatedAt();
        this.password=scheduleRequestDto.getPassword();
        this.todo=scheduleRequestDto.getTodo();
    }
}