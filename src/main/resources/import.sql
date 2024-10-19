INSERT INTO tb_user (name, email, password) VALUES ('Pedro Almeida Carvalho','pedro@gmail.com', '1234567');
INSERT INTO tb_user (name, email, password) VALUES ('Josefa','josefa@gmail.com', '1234567');

INSERT INTO tb_role (authority) VALUES ('ROLE_GUEST');
INSERT INTO tb_role (authority) VALUES ('ROLE_USER');


INSERT INTO tb_user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_roles (user_id, role_id) VALUES (2, 1);





INSERT INTO tb_genre (name) VALUES ('Action');
INSERT INTO tb_genre (name) VALUES ('Horror');
INSERT INTO tb_genre (name) VALUES ('Thriller');
INSERT INTO tb_genre (name) VALUES ('Drama');
INSERT INTO tb_genre (name) VALUES ('Comedy');
INSERT INTO tb_genre (name) VALUES ('Historical');
INSERT INTO tb_genre (name) VALUES ('Kids');


INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Se7en', '', 1999, 'https://www.imdb.com/title/tt0114369/mediaviewer/rm3116368640/?ref_=tt_ov_i', 'Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his motives.', 3);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Jacob''s Ladder', 'A film by Adrian Lyne', 1990, 'https://www.imdb.com/title/tt0099871/mediaviewer/rm2882095360/?ref_=tt_ov_i', 'Mourning his dead child, a haunted Vietnam War veteran attempts to uncover his past while suffering from a severe case of dissociation. To do so, he must decipher reality and life from his own dreams, delusions, and perceptions of death.', 3);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('First Blood', 'Rambo', 1982, 'https://www.imdb.com/title/tt0083944/mediaviewer/rm3937735680/?ref_=tt_ov_i', 'A veteran Green Beret is forced by a cruel Sheriff and his deputies to flee into the mountains and wage an escalating one-man war against his pursuers.', 1);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Halloween', '', 1978, 'https://www.imdb.com/title/tt0077651/mediaviewer/rm650516224/?ref_=tt_ov_i', 'Fifteen years after murdering his sister on Halloween night 1963, Michael Myers escapes from a mental hospital and returns to the small town of Haddonfield, Illinois to kill again.', 2);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Requiem for a Dream', '', 2000, 'https://www.imdb.com/title/tt0077651/mediaviewer/rm650516224/?ref_=tt_ov_i', 'The drug-induced utopias of four Coney Island people are shattered when their addictions run deep.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Ace Ventura', 'Pet Detective', 1994, 'https://www.imdb.com/title/tt0077651/mediaviewer/rm650516224/?ref_=tt_ov_i', 'A goofy detective specializing in animals goes in search of the missing mascot of the Miami Dolphins.', 5);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Gladiator', '', 2000, 'https://www.imdb.com/title/tt0109040/mediaviewer/rm1962960640/?ref_=tt_ov_i', 'A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.', 6);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Tangled', '', 2010, 'https://www.imdb.com/title/tt0398286/mediaviewer/rm798852608/?ref_=tt_ov_i', 'The magically long-haired Rapunzel has spent her entire life in a tower, but now that a runaway thief has stumbled upon her, she is about to discover the world for the first time, and who she really is.', 7);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('The Godfather', 'Part I', 1972, 'https://www.imdb.com/title/tt0068646/mediaviewer/rm746868224/?ref_=tt_ov_i','The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Inception', '', 2010, 'https://www.imdb.com/title/tt1375666/mediaviewer/rm3426651392/?ref_=tt_ov_i','A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.', 1);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('The Shawshank Redemption', '', 1994, 'https://www.imdb.com/title/tt0111161/mediaviewer/rm10105600/?ref_=tt_ov_i','Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('The Dark Knight', '', 2008, 'https://www.imdb.com/title/tt0468569/mediaviewer/rm4023877632/?ref_=tt_ov_i','When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.', 1);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Forrest Gump', '', 1994, 'https://www.imdb.com/title/tt0109830/mediaviewer/rm1954749696/?ref_=tt_ov_i','The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('The Matrix', '', 1999, 'https://www.imdb.com/title/tt0133093/mediaviewer/rm10105600/?ref_=tt_ov_i','A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.', 1);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Pulp Fiction', '', 1994, 'https://www.imdb.com/title/tt0110912/mediaviewer/rm2585413120/?ref_=tt_ov_i','The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('The Lion King', '', 1994, 'https://www.imdb.com/title/tt0110357/mediaviewer/rm4065815296/?ref_=tt_ov_i','Lion prince Simba and his father are targeted by his bitter uncle, who wants to ascend the throne himself.', 7);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Fight Club', '', 1999, 'https://www.imdb.com/title/tt0137523/mediaviewer/rm10105600/?ref_=tt_ov_i','An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Saving Private Ryan', '', 1998, 'https://www.imdb.com/title/tt0120815/mediaviewer/rm2796018688/?ref_=tt_ov_i','Following the Normandy Landings, a group of U.S. soldiers go behind enemy lines to retrieve a paratrooper whose brothers have been killed in action.', 6);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Schindler''s List', '', 1993, 'https://www.imdb.com/title/tt0108052/mediaviewer/rm10105600/?ref_=tt_ov_i','In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.', 6);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('The Silence of the Lambs', '', 1991, 'https://www.imdb.com/title/tt0102926/mediaviewer/rm10105600/?ref_=tt_ov_i','A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer.', 2);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Titanic', '', 1997, 'https://www.imdb.com/title/tt0120338/mediaviewer/rm10105600/?ref_=tt_ov_i','A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.', 4);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('The Lord of the Rings: The Return of the King', '', 2003, 'https://www.imdb.com/title/tt0167260/mediaviewer/rm10105600/?ref_=tt_ov_i','Gandalf and Aragorn lead the World of Men against Sauron''s army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.', 1);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Interstellar', '', 2014, 'https://www.imdb.com/title/tt0816692/mediaviewer/rm10105600/?ref_=tt_ov_i','A team of explorers travel through a wormhole in space in an attempt to ensure humanity''s survival.', 6);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES('Back to the Future', '', 1985, 'https://www.imdb.com/title/tt0088763/mediaviewer/rm10105600/?ref_=tt_ov_i','Marty McFly, a teenager, is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, eccentric scientist Doc Brown.', 5);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Jaws', '', 1975, 'https://www.imdb.com/title/tt0073195/mediaviewer/rm10105600/?ref_=tt_ov_i','When a killer shark unleashes chaos on a beach community, it''s up to a local sheriff, a marine biologist, and an old seafarer to hunt the beast down.', 2);
INSERT INTO tb_movie (title, sub_title, movie_year, img_url, synopsis, genre_id) VALUES ('Casablanca', '', 1942, 'https://www.imdb.com/title/tt0034583/mediaviewer/rm10105600/?ref_=tt_ov_i','A cynical expatriate American cafe owner struggles to decide whether or not to help his former lover and her fugitive husband escape the Nazis in French Morocco.', 4);



INSERT INTO tb_review (text, user_id, movie_id) VALUES ('Eu gostei muito desse filme, nota 10!', 1, 2);
