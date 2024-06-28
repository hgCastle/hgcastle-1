DROP TABLE IF EXISTS `tbl_member` CASCADE;

CREATE TABLE `tbl_member`
(
    `member_id`        VARCHAR(20) NOT NULL UNIQUE COMMENT '아이디',
    `member_password`  VARCHAR(50) NOT NULL COMMENT '비밀번호',
    `member_no`        INTEGER AUTO_INCREMENT COMMENT '회원번호',
    `member_name`      VARCHAR(20) NOT NULL COMMENT '이름',
    `member_nickname`  VARCHAR(20) NOT NULL UNIQUE COMMENT '닉네임',
    `member_hobby`     VARCHAR(20) NOT NULL COMMENT '취미',
    `member_phone`     VARCHAR(12) NOT NULL UNIQUE COMMENT '연락처',
    `member_email`     VARCHAR(50) COMMENT '이메일',
    `member_rrn`       VARCHAR(14) NOT NULL UNIQUE COMMENT '주민등록번호',
    `member_address`   VARCHAR(255) COMMENT '주소',
    `member_entDate`   DATE        NOT NULL COMMENT '가입일',
    `member_warnCount` INTEGER DEFAULT '0' COMMENT '경고누적횟수',
    `member_banDate`   DATE COMMENT '제재기간',
    `member_quitDate`  DATE COMMENT '탈퇴일',
    PRIMARY KEY (`member_no`)
) COMMENT = '회원';

INSERT INTO `tbl_member`
VALUES ('wdh970616', 'wdh970616', 1, '위성민', '위위', '게임', '01095407674', 'wdh970616@naver.com', '970101-1234567','제주시', '2024-03-25', 0, NULL, NULL),
       ('lks9616', 'lks9616', 2, '이규섭', '규섭', '독서', '01025263948', 'lks9616@naver.com', '961116-1234567', '서울시', '2024-02-28', 0, NULL, NULL),
       ('parkhayarn', 'parkhayarn', 3, '박하얀', '하얀', '영화', '01049219295', 'yagamiryuk@naver.com', '920224-2234567',  '서울시', '2024-06-25', 0, NULL, NULL),
       ('minsukim89', 'minsukim89', 4, '김민수', '민수찡', '축구', '01012345678', 'minsukim89@naver.com', '890315-1111111','서울시', '2024-05-23', 0, NULL, NULL),
       ('jiypark92', 'jiypark92', 5, '박지연', '지연이', '독서', '01023456789', 'jiypark92@naver.com', '920721-2222222','서울시', '2024-05-23', 0, NULL, NULL),
       ('jhlee87', 'jhlee87', 6, '이준호', '주노', '음악감상', '01034567890', 'jhlee87@naver.com', '871202-1211111', '서울시','2024-05-23', 0, NULL, NULL),
       ('yjchung95', 'yjchung95', 7, '정유진', '유지니', '요가', '01045678901', 'yjchung95@naver.com', '950617-2122222','서울시', '2024-05-23', 0, NULL, NULL),
       ('minhochoi88', 'minhochoi88', 8, '최민호', '블링이즈민호', '등산', '01056789012', 'minhochoi88@naver.com','880430-1311111', '서울시', '2024-05-23', 0, NULL, NULL),
       ('suhyunkim91', 'suhyunkim91', 9, '김수현', '수혀니', '드라마감상', '01067890123', 'suhyunkim91@naver.com','911108-2322222', '서울시', '2024-05-23', 0, NULL, NULL),
       ('hjjang86', 'hjjang86', 10, '장혁진', '혁신진', '영화감상', '01078901234', 'hjjang86@naver.com', '860522-1411111','서울시', '2024-05-23', 0, NULL, NULL),
       ('jiminlee93', 'jiminlee93', 11, '김지민', '지민짱', '요리', '01089012345', 'jiminlee93@naver.com', '930910-2422222','서울시', '2024-05-23', 0, NULL, NULL),
       ('sjpark90', 'sjpark90', 12, '박성준', '성준임', '사진촬영', '01090123456', 'sjpark90@naver.com', '900127-1511111','서울시', '2024-05-23', 0, NULL, NULL),
       ('hjlee94', 'hjlee94', 13, '이현정', '현정헌정', '춤', '01001234567', 'hjlee94@naver.com', '940815-2522222', '서울시','2024-05-23', 0, NULL, NULL),
       ('dohyeonyoon85', 'dohyeonyoon85', 14, '윤도현', '밴드아님', '기타연주', '01012345679', 'dohyeonyoon85@naver.com','850210-1611111', '서울시', '2024-05-23', 0, NULL, NULL),
       ('jiuhan96', 'jiuhan96', 15, '한지우', '포켓몬마스터', '여행', '01023456780', 'jiuhan96@naver.com', '960525-2622222','서울시', '2024-05-23', 0, NULL, NULL),
       ('jhoonoh88', 'jhoonoh88', 16, '오지훈', '지훈남', '자전거타기', '01034567891', 'jhoonoh88@naver.com', '881014-1711111','서울시', '2024-05-23', 0, NULL, NULL),
       ('sujinbae92', 'sujinbae92', 17, '배수진', '배수진쳐라', '그림', '01045678902', 'sujinbae92@naver.com', '920329-2722222','서울시', '2024-05-27', 0, NULL, NULL),
       ('daehyunkim87', 'daehyunkim87', 18, '김대현', '대혀니다', '게임', '01056789013', 'daehyunkim87@naver.com','871111-1811111', '서울시', '2024-05-27', 0, NULL, NULL),
       ('seoyeonlee91', 'seoyeonlee91', 19, '이서연', '없서연', '꽃꽂이', '01067890124', 'seoyeonlee91@naver.com','910604-2822222', '서울시', '2024-05-27', 0, NULL, NULL),
       ('jinwoopark90', 'jinwoopark90', 20, '박진우', '지누션', '캠핑', '01078901235', 'jinwoopark90@naver.com','901220-1911111', '서울시', '2024-05-27', 0, NULL, NULL),
       ('nayeonkim93', 'nayeonkim93', 21, '김나연', '트와이스나연', '베이킹', '01089012346', 'nayeonkim93@naver.com','930108-2922222', '서울시', '2024-05-27', 0, NULL, NULL),
       ('minhoshin89', 'minhoshin89', 22, '신민호', '미노이', '요트타기', '01090123457', 'minhoshin89@naver.com','890919-1011111', '서울시', '2024-06-12', 0, NULL, NULL),
       ('sujinoh91', 'sujinoh91', 23, '오수진', '허락해줌', '산책', '01041234568', 'sujinoh91@naver.com', '910713-2022222','서울시', '2024-06-12', 0, NULL, NULL),
       ('dohoonlee92', 'dohoonlee92', 24, '이도훈', '도훈도훈', '마술', '01012345670', 'dohoonlee92@naver.com', '920228-1101111','서울시', '2024-06-12', 0, NULL, NULL),
       ('seoyoungkim95', 'seoyoungkim95', 25, '김서영', '서영해', '천채관측', '01023456781', 'seoyoungkim95@naver.com','951205-2202222', '서울시', '2024-06-12', 0, NULL, NULL),
       ('hyunsupark86', 'hyunsupark86', 26, '박현수', '현수막', '격투기', '01034567892', 'hyunsupark86@naver.com','860322-1121111', '서울시', '2024-06-12', 0, NULL, NULL),
       ('yerinchoi94', 'yerinchoi94', 27, '최예린', '예린해', '기타연주', '010475678903', 'yerinchoi94@naver.com','941117-2212222', '서울시', '2024-06-16', 0, NULL, NULL),
       ('sungwoohan90', 'sungwoohan90', 28, '한성우', '성우지망생', '산책', '01056789014', 'sungwoohan90@naver.com','900611-1131111', '서울시', '2024-06-16', 0, NULL, NULL),
       ('sujeonglee89', 'sujeonglee89', 29, '이수정', '크리스탈', '서예', '01067890125', 'sujeonglee89@naver.com','890823-2232222', '서울시', '2024-06-16', 0, NULL, NULL),
       ('youngminchoi93', 'youngminchoi93', 30, '최영민', '진구라이벌', '요리', '01078901236', 'youngminchoi93@naver.com','930405-1141111', '서울시', '2024-06-16', 0, NULL, NULL),
       ('yujinseo96', 'yujinseo96', 31, '서유진', '유진쓰', '그림', '01089012347', 'yujinseo96@naver.com', '960922-2242222','서울시', '2024-06-16', 0, NULL, NULL),
       ('junghomoon87', 'junghomoon87', 32, '문정호', '정호얌', '등산', '01090123458', 'junghomoon87@naver.com','890114-1151111', '서울시', '2024-06-16', 0, NULL, NULL),
       ('miraeyoon91', 'miraeyoon91', 33, '윤미래', '미래지향', '서예', '01001234569', 'miraeyoon91@naver.com', '911009-2252222','서울시', '2024-06-25', 0, NULL, NULL);

commit;
