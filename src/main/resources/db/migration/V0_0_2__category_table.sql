create sequence seq_category start 1 increment 50;


create table t_category (
  id            bigint      not null constraint pk_category primary key,
  category_type varchar(50) not null,
  created       timestamp   not null,
  updated       timestamp   not null,
  deleted       timestamp
);

insert into t_category (id, category_type, created, updated, deleted)
values (50, 'MUSIC', current_timestamp, current_timestamp, null );

insert into t_category (id, category_type, created, updated, deleted)
values (150, 'SPORT', current_timestamp, current_timestamp, null );

insert into t_category (id, category_type, created, updated, deleted)
values (200, 'MOVIE', current_timestamp, current_timestamp, null );

insert into t_category (id, category_type, created, updated, deleted)
values (250, 'FASHION', current_timestamp, current_timestamp, null );