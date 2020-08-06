DROP TABLE IF EXISTS todoitem;
CREATE TABLE todoitem (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  content VARCHAR(100),
  status VARCHAR(10)
);
insert into todoitem values(1,'hahahahaha' , 'false') , (2,'hahahahaha1' , 'true');