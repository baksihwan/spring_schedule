1. API 명세서


![image](https://github.com/user-attachments/assets/6eede3fd-2b19-4283-a4e5-ffe019dd1586)

*postman 링크 : https://web.postman.co/workspace/My-Workspace~a34c49aa-e55c-407b-85fa-64f423e55123/documentation/39423685-56abdab5-cc75-4cfe-a04e-e662f380c539

2.ERD 


![image](https://github.com/user-attachments/assets/f951abb4-4bc9-4990-af9b-ebdd27fb3cf0)







ERD URL : https://www.erdcloud.com/d/34CmYvz4KxvnDzCLG


3.SQL


1. 테이블 생성

CREATE TABLE SCHEDULE
(
    id int,
    title varchar(50),
    content varchar(200),
    user varchar(50),
    createdAt Datetime,
    updatedAt Datetime,
    password String,
    todo String
);
2. 테이블 값 삽입

Insert into SCHEDULE(id, title, content, user, createdAt, updatedAt, password, todo)
values(1,'3주차 강의 복습','3주차 강의내용을 보충하자', 'HWAN',
       '2024-11-05', '2024-11-05', '1234', '지금 당장 실행!');
                               
   2.전체 일정 조회

   
   select * from schedule;

   
   3. 선택 일정 조회

   select * from schedule where id = 1;

   
   4. 선택 일정 수정

   
  update schedule set password= '2930' where id = 1 ;

   
   5. 선택 일정 삭제

    
  delete from schedule where id =1 ;
