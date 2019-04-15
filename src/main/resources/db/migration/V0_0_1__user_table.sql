create sequence seq_user start 1 increment 50;


create table t_user (
  id            bigint       not null constraint pk_user primary key,
  first_name    varchar(100) not null,
  last_name     varchar(100) not null,
  user_name     varchar(100) not null,
  email_address varchar(100) not null,
  password      varchar(20)  not null,
  category_id   bigint,
  created       timestamp    not null,
  updated       timestamp    not null,
  deleted       timestamp
);
