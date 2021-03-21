#学生表
drop table if exists t_students;
create table t_students(
                           id bigint not null primary key auto_increment,
                           username varchar(50) not null ,
                           password varchar(50) not null ,
                           phone varchar(11) not null ,
                           name varchar(50) not null,
                           cls_id bigint not null primary key ,
                           constraint foreign key (cls_id) references t_cls(id)
);

#班级表
drop table if exists t_cls;
create table t_cls(
                      id bigint not null primary key auto_increment,
                      name varchar(50) not null
);

#通知表
drop table if exists t_message;
create table t_message(
                          id bigint not null primary key auto_increment,
                          createTime datetime not null on update current_timestamp,
                          title varchar(50) not null ,
                          content text not null ,
                          cls_id bigint not null references t_cls(id)
);

#学生通知点评
drop table if exists t_discuss_detail;
create table t_discuss_detail(
                                 stu_id bigint not null references t_students(id) primary key ,
                                 message_id bigint not null references t_message(id) primary key ,
                                 discuss text ,
                                 create_time datetime not null on update current_timestamp
);

#admin
drop table if exists t_admin;
create table t_admin(
                        id bigint not null primary key auto_increment,
                        username varchar(50) not null ,
                        password varchar(50) not null ,
                        phone varchar(11) not null ,
                        name varchar(50) not null,
                        super tinyint not null default 0
);

#班级管理员中间表
drop table if exists t_cls_admin;
create table t_cls_admin(
                            cls_id bigint not null references t_cls(id) primary key ,
                            manager_id bigint not null references t_admin(id) primary key
);

#签到表
drop table if exists t_sign_in;
create table t_sign_in(
                          id bigint not null primary key auto_increment,
                          create_time datetime not null on update current_timestamp,
                          cls_id bigint not null references t_cls(id)
);

#事务投票表
drop table if exists t_vote;
create table t_vote(
                       id bigint not null primary key auto_increment,
                       create_time datetime not null on update current_timestamp,
                       end_time datetime ,
                       title varchar(50) not null ,
                       content text not null ,
                       selection text not null,
                       cls_id bigint not null references t_cls(id)
);

#学生投票详情
drop table if exists t_vote_detail;
create table t_vote_detail(
                              stu_id bigint not null references t_students(id) primary key ,
                              vote_id bigint not null references t_vote(id) primary key ,
                              select_index tinyint not null ,
                              discuss text ,
                              vote_time datetime not null on update current_timestamp
);



