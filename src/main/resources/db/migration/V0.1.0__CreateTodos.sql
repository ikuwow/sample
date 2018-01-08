create table todos (
    id serial primary key,
    content varchar(255) not null,
    deadline datetime default null,
    created_at datetime not null default current_timestamp
);
