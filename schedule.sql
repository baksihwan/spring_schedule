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
Insert into SCHEDULE(id, title, content, user, createdAt, updatedAt, password, todo)
values(1,'3주차 강의 복습','3주차 강의내용을 보충하자', 'HWAN',
       '2024-11-05', '2024-11-05', '1234', '지금 당장 실행!');

select * from SCHEDULE;    --전체 일정 조회
select * from SCHEDULE where id=1;   --선택 일정 조회
update schedule set password= '2930' where id = 1 ;  --선택 일정 수정
delete from schedule where id =1 ;  --선택 일정 삭제

