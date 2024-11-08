package Schedule;

import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private Long id;   //스케줄 내 컬럼(필드) 생성
    private String title;
    private String content;
    private String user;
    private String createdAt;
    private String updatedAt;
    private String todo;



    public ScheduleResponseDto(Long id, String title, String content, String user, String createdAt, String updatedAt
            , String todo) {  //ResponseDto 생성자 매서드
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.todo = todo;
    }
}

