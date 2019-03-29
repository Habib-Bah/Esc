INSERT INTO public.app_role (role_id, role_name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO public.app_role (role_id, role_name) VALUES (2, 'ROLE_USER');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (4, 1, '123', 'ROLE_ADMIN', 'habib');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (6, 1, '12345', 'ROLE_ADMIN', 'kristelle');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (7, 1, '12345', 'ROLE_ADMIN', 'amelia');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (8, 1, '54321', 'ROLE_ADMIN', 'fauchet');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (9, 1, '2468', 'ROLE_ADMIN', 'murielle');
INSERT INTO public.app_user (user_id, enabled, encryted_password, role, user_name) VALUES (40, 1, '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'ROLE_ADMIN', 'aurelie');
INSERT INTO public.commentaire (id, nomutilisateur, texte) VALUES (10, 'habib', 'Expérience magnifique.  Je recommande');
INSERT INTO public.commentaire (id, nomutilisateur, texte) VALUES (11, 'zappelini', 'Escalade en famille sur le site su Stark. A refaire sans hésitation.  ');
INSERT INTO public.commentaire (id, nomutilisateur, texte) VALUES (12, 'zappelini', 'Escalade en famille sur le site su Stark. A refaire sans hésitation.  ');
INSERT INTO public.reservation (id, datedebut, datefin, nomsite, nomutilisateur, site) VALUES (32, '10/01/2019', '11/01/2019', 'site du Lannister', 'habib', null);
INSERT INTO public.reservation (id, datedebut, datefin, nomsite, nomutilisateur, site) VALUES (33, '15/01/2019', '17/01/2019', 'Site River', 'kristelle', null);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (13, '8C', true, '130m', 'France', 18, 11, 'Site Lanister', 16);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (15, '6A', false, '120m', 'Espagne', 15, 10, 'Site Phenix', 8);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (16, '8C', true, '330m', 'Allemagne', 19, 14, 'Site de Coop', 14);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (17, '7C', true, '110m', 'Italie', 11, 10, 'Site le BT2', 9);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (18, '9A', true, '770m', 'France', 20, 22, 'Site Alpine', 19);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (19, '8C', false, '130m', 'Espagne', 18, 11, 'Site Roja', 16);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (20, '7B', true, '190m', 'Italie', 15, 11, 'Site TKK', 14);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (21, '8A', true, '290m', 'France', 23, 11, 'Site B42', 16);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (22, '6B', true, '130m', 'Espagne', 18, 9, 'Site NKM', 16);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (23, '8A', true, '220m', 'France', 19, 19, 'Site Marwn', 19);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (24, '7A', true, '150m', 'Allemagne', 18, 10, 'Site Loop', 12);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (25, '6A', false, '170m', 'Italie', 15, 11, 'Site Mixte', 10);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (26, '9C', true, '220m', 'Espagne', 17, 16, 'Site The QQR', 17);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (27, '8A', true, '590m', 'France', 27, 19, 'Site PatCoq', 16);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (28, '9A', true, '730m', 'France', 22, 26, 'Site Marwell', 20);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (29, '7A', true, '190m', 'Espagne', 19, 17, 'Site CDN', 17);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (30, '8C', true, '330m', 'Allemagne', 18, 21, 'Site PONG', 20);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (31, '6A', true, '160m', 'France', 120, 14, 'Site ICNI', 14);
INSERT INTO public.topos (id, cotation, disponibilite, hauteur, localisation, nombredepoint, nombredevoie, nomsite, secteur) VALUES (14, '7C', false, '230m', 'Espagne', 19, 15, 'Site River', 18);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (1, 1, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (2, 1, 2);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (3, 2, 2);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (5, 5, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (6, 6, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (7, 7, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (8, 8, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (9, 9, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (10, 10, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (11, 11, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (12, 12, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (13, 13, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (14, 14, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (15, 15, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (16, 16, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (17, 17, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (18, 18, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (19, 19, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (20, 20, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (21, 21, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (22, 22, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (23, 23, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (24, 24, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (25, 25, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (26, 26, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (27, 27, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (28, 28, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (29, 29, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (30, 30, 1);
INSERT INTO public.user_role (id, user_id, role_id) VALUES (40, 40, 2);
INSERT INTO public.utilisateur (id, email, enabled, motdepasse, nom, prenom, role) VALUES (1, 'habib@gmail.com', true, '123', 'Bah', 'habib', 'ROLE_ADMIN');
INSERT INTO public.utilisateur (id, email, enabled, motdepasse, nom, prenom, role) VALUES (2, 'thierno@gmail.com', true, '1234', 'Bah', 'thierno', 'ROLE_ADMIN');
INSERT INTO public.utilisateur (id, email, enabled, motdepasse, nom, prenom, role) VALUES (3, 'habib@gmail.com', true, '123', 'Bah', 'habib', 'ROLE_ADMIN');
INSERT INTO public.utilisateur (id, email, enabled, motdepasse, nom, prenom, role) VALUES (5, 'kristelle@hotmail.fr', true, '12345', 'zappelini', 'kristelle', 'ROLE_ADMIN');