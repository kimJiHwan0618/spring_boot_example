SELECT *
FROM article;

/* INSERT 두가지 방법 */
/* 1 */
INSERT INTO article SET regDate = NOW(), title = '테스트', body = '테스트';
/* 2 */
INSERT INTO article (regDate, title, body)
VALUES (NOW(),'하하하하하하','하하하하하');

DELETE FROM article
WHERE title='asd';demodemo