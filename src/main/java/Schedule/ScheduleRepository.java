package Schedule;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ScheduleRepository {
    private static final Map<Long,Schedule> scheduleList=new HashMap<>();  //스케줄 리스트 형성
    private static long sequence=0L; // 정수(sequence)를 초기값 0으로 설정
    public void save(Schedule schedule){
        schedule.setId(++sequence);
        scheduleList.put(schedule.getId(),schedule);
    }
    public Schedule findById(Long id){  //id값 호출
        return scheduleList.get(id);
    }
    public List<Schedule> findAll(){
        return new ArrayList<>(scheduleList.values());
    }
}