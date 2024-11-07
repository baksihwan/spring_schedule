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
INSERT INTO SCHEDULE(id, title, content, user, createdAt, updatedAt, password, todo)
VALUES(1,'3주차 강의 복습','3주차 강의내용을 보충하자', 'HWAN',
       '2024-11-05', '2024-11-05', '1234', '지금 당장 실행!');

SELECT * FROM SCHEDULE;    --전체 일정 조회
SELECT * FROM SCHEDULE WHERE id= 1;   --선택 일정 조회
UPDATE schedule SET password= '2930' WHERE id = 1 ;  --선택 일정 수정
DELETE FROM schedule WHERE id = 1 ;  --선택 일정 삭제

