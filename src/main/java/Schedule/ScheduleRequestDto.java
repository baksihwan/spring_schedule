package Schedule;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;  //스케줄 내 컬럼(필드) 생성
    private String content;
    private String user;
    private String createdAt;
    private String updatedAt;
    private String password;
    private String todo;
}
