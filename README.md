1. API 명세서


![image](https://github.com/user-attachments/assets/6eede3fd-2b19-4283-a4e5-ffe019dd1586)



2.ERD 


![image](https://github.com/user-attachments/assets/f97ba596-399e-45e4-86a0-6101f40b7189)



ERD URL : https://www.erdcloud.com/d/34CmYvz4KxvnDzCLG


3.SQL


1. 테이블 생성

 CREATE TABLE SCHEDULE(contents_no,
                               title,
                               content,
                               schedules_date,
                               user_id
                               );

                               
   2.전체 일정 조회

   
   select * from schedule;

   
   3. 선택 일정 조회

   select * from schedule where contents_no;

   
   4. 선택 일정 수정

   
   update schedule set             where contents_no =   ;

   
   5. 선택 일정 삭제

    
  delete from schedule where contents_no =  ;