use cinema;

-- movies inserts --
select *from Movie;

insert into Movie (flg2D, flg3D, flgVR, Title, Description, MovieTime)
			values (1, 1, 0, 'Pi�kna i bestia', 'Wspania�y film animowany o dw�ch przeciwie�stwach', '1:23:00')
insert into Movie (flg2D, flg3D, flgVR, Title, Description, MovieTime)
			values (1, 1, 1, 'Kung fu Konrad', 'Konrad na parkiecie', '1:34:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 0, 0, 2, 'Mistrz Niewiadom', 'Java 1.2 winkelriedem programist�w - tylko w 2D bo to stabilna techonologia', '3:12:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 1, 0, 1, 'Smoli kontratakuje', 'Sysopy edycja 2020 - tylko w kinie "fedora"', '2:19:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 0, 0, 2, 'Put nie dzia�a', 'Najwi�ksza zmora student�w IOAD ju� w kinach!', '1:52:00')

insert into Movie (flg2D, flg3D, flgVR, Title, Description, MovieTime)
			values (1, 1, 0, '�mier� na FTIMSie', 'Historia o ludziach, kt�rzy pracowali studiuj�c i studiowali pracuj�c', '2:00:00')
insert into Movie (flg2D, flg3D, flgVR, Title, Description, MovieTime)
			values (0, 1, 1, 'S�d ostateczny', 'Czyli jak wygl�da dywnik u Ewki', '2:15:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 0, 0, 1, 'rand()', 'egzamin z elektroniki', '2:39:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 1, 0, 2, 'Analiza danych', 'Czyli jak stowrzy� przydatny przedmiot', '1:46:00')
insert into Movie (flg2D, flg3D, flgVR, MovieStateId, Title, Description, MovieTime)
			values (1, 0, 0, 1, 'Kobiety na FTIMSie', 'Pot�ne i niebezpieczne - kogo warto unika�?', '1:22:00')

-- very important line! --
update Movie set MovieStateId+=1 


-- movie states inserts --
select *from DICTMovieState

insert into DICTMovieState (Name) values ('wasPlaying')
insert into DICTMovieState (Name) values ('isPlaying')
insert into DICTMovieState (Name) values ('willBePlaying')

-- checking results --
select *from Movie;
select *from DICTMovieState