# manager
博客项目
java 1.8
mysql 5.7.17

基本功能有：
  最新发布的文章
  热门文章
  评论
  登录/注册，登录ajax验证
  

      CREATE TABLE b_banner
    (
      id  INT          NOT NULL
        PRIMARY KEY,
      img VARCHAR(255) NOT NULL,
      url VARCHAR(255) NOT NULL
    )
      ENGINE = InnoDB;
 
    CREATE TABLE b_comment
    (
      id         INT AUTO_INCREMENT
        PRIMARY KEY,
      comment    VARCHAR(500) NOT NULL
      COMMENT '评论内容',
      time       VARCHAR(20)  NOT NULL
      COMMENT '评论的时间',
      expression VARCHAR(255) NULL
      COMMENT '评论时插入的表情',
      userid     INT          NOT NULL,
      articleid  INT          NULL,
      CONSTRAINT userid
      FOREIGN KEY (userid) REFERENCES b_user (uid)
        ON UPDATE CASCADE
        ON DELETE CASCADE
    )
      ENGINE = InnoDB;

    CREATE INDEX userid
      ON b_comment (userid);
      
 -- auto-generated definition
CREATE TABLE b_lastpush
(
  id      INT(10)      NOT NULL,
  title   VARCHAR(255) NOT NULL,
  col     INT(6)       NOT NULL
  COMMENT ' 栏目,1前端，2后端',
  time    VARCHAR(20)  NOT NULL,
  count   INT(100)     NOT NULL
  COMMENT '查看人数',
  noview  INT(255)     NOT NULL,
  `desc`  VARCHAR(255) NOT NULL
  COMMENT '简单描述',
  content VARCHAR(500) NOT NULL
  COMMENT '内容',
  url     VARCHAR(255) NOT NULL,
  img     VARCHAR(255) NOT NULL,
  hot     INT(5)       NOT NULL,
  `from`  VARCHAR(255) NOT NULL
  COMMENT '来源',
  flag    VARCHAR(255) NOT NULL
  COMMENT '哪种技术',
  banner  VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_nav
(
  id       INT          NOT NULL
    PRIMARY KEY,
  nav_name VARCHAR(255) NOT NULL,
  tar_url  VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_notice
(
  id      INT          NOT NULL
    PRIMARY KEY,
  time    VARCHAR(255) NOT NULL,
  content VARCHAR(255) NOT NULL,
  url     VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_tody
(
  id      INT AUTO_INCREMENT
    PRIMARY KEY,
  title   VARCHAR(255) NOT NULL,
  content VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_top
(
  id    INT          NOT NULL
    PRIMARY KEY,
  `dec` VARCHAR(255) NOT NULL,
  img   VARCHAR(255) NOT NULL,
  time  VARCHAR(255) NOT NULL,
  count INT(100)     NOT NULL,
  url   VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_user
(
  uid       INT AUTO_INCREMENT
    PRIMARY KEY,
  user_name VARCHAR(255) NOT NULL,
  password  VARCHAR(255) NOT NULL,
  addr      VARCHAR(255) NULL,
  regtime   VARCHAR(20)  NULL,
  headimg   VARCHAR(255) NULL
)
  ENGINE = InnoDB;

-- auto-generated definition
CREATE TABLE b_word
(
  id         INT          NOT NULL
    PRIMARY KEY,
  time       VARCHAR(255) NOT NULL,
  english    VARCHAR(255) NOT NULL,
  transition VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

     

      
      
  
