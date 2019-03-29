create table if not exists app_role
(
	role_id bigint not null
		constraint app_role_pk
			primary key,
	role_name varchar(30) not null
		constraint app_role_uk
			unique
);

alter table app_role owner to habib;

create table if not exists user_role
(
	id bigint not null
		constraint user_role_pk
			primary key,
	user_id bigint not null,
	role_id bigint not null
		constraint user_role_fk2
			references app_role,
	constraint user_role_uk
		unique (user_id, role_id)
);

alter table user_role owner to habib;

create table if not exists persistent_logins
(
	username varchar(64) not null,
	series varchar(64) not null
		constraint persistent_logins_pkey
			primary key,
	token varchar(64) not null,
	last_used timestamp not null
);

alter table persistent_logins owner to habib;

create table if not exists app_user
(
	user_id bigint not null
		constraint app_user_pkey
			primary key,
	enabled integer not null,
	encryted_password varchar(255) not null,
	role varchar(255) not null,
	user_name varchar(10) not null
);

alter table app_user owner to habib;

create table if not exists commentaire
(
	id bigint not null
		constraint commentaire_pkey
			primary key,
	nomutilisateur varchar(10) not null,
	texte varchar(100) not null
);

alter table commentaire owner to habib;

create table if not exists site
(
	id bigint not null
		constraint site_pkey
			primary key,
	adresse varchar(255),
	localisation varchar(255),
	nombredespits varchar(255),
	nombredevoie integer,
	nomsite varchar(255)
);

alter table site owner to habib;

create table if not exists topos
(
	id bigint not null
		constraint topos_pkey
			primary key,
	cotation varchar(255),
	disponibilite boolean,
	hauteur varchar(255),
	localisation varchar(255),
	nombredepoint integer,
	nombredevoie integer,
	nomsite varchar(255),
	secteur integer
);

alter table topos owner to habib;

create table if not exists utilisateur
(
	id bigint not null
		constraint utilisateur_pkey
			primary key,
	email varchar(20) not null,
	enabled boolean not null,
	motdepasse varchar(255) not null,
	nom varchar(10) not null,
	prenom varchar(255) not null,
	role varchar(255) not null
);

alter table utilisateur owner to habib;

create table if not exists voie
(
	id bigint not null
		constraint voie_pkey
			primary key,
	cotation varchar(255),
	longueur integer,
	nomsite varchar(255),
	nomvoie varchar(255)
);

alter table voie owner to habib;

create table if not exists reservation
(
	id bigint not null
		constraint reservation_pkey
			primary key,
	datedebut varchar(255),
	datefin varchar(255),
	nomsite varchar(255),
	nomutilisateur varchar(255),
	site bytea
);

alter table reservation owner to habib;

