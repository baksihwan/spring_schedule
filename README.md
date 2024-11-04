1. API 명세서


![image](https://github.com/user-attachments/assets/6eede3fd-2b19-4283-a4e5-ffe019dd1586)

*postman 링크 : https://web.postman.co/workspace/My-Workspace~a34c49aa-e55c-407b-85fa-64f423e55123/documentation/39423685-56abdab5-cc75-4cfe-a04e-e662f380c539

2.ERD 


![image](https://github.com/user-attachments/assets/1c0a2802-fe66-4653-9437-7dd423729d29)





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
