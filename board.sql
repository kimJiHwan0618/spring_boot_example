SELECT *
FROM article;

/* INSERT 두가지 방법 */
/* 1 */
INSERT INTO article SET regDate = NOW(), title = '테스트', body = '테스트';
/* 2 */
INSERT INTO article (regDate, title, body)
VALUES (NOW(),'하하하하하하','하하하하하');

DELETE FROM article
WHERE title='asd';

UPDATE article
SET title = '업데이트테스트',
body = '업데이트테스트',
WHERE id = 2

UPDATE article
SET hit = hit + 1
WHERE id = 6


ALTER TABLE article ADD hit INT(10) UNSIGNED NOT NULL DEFAULT '0' 
