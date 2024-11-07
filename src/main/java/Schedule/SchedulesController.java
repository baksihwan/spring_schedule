package Schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ScheduleController {
    private final ScheduleRepository scheduleRepository; //Controller<=>Repository
    @Autowired
    public ScheduleController(ScheduleRepository scheduleRepository){ //리포지터리 생성자
        this.scheduleRepository=scheduleRepository;
    }
    //일정 등록(POST 맵핑)
    @PostMapping("/schedules")
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto){
        Schedule schedule=new Schedule(requestDto); //Entity -> requestDto 객체 생성
        scheduleRepository.save(schedule); //리포지터리(저장소) 저장
        ScheduleResponseDto scheduleResponseDto=new ScheduleResponseDto(schedule); //Entity -> responseDto 객체 생성
        return scheduleResponseDto;
    }
}
